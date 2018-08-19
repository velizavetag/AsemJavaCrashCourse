
public class CalcThread extends Thread {
	private int id;
	private int times;

	CalcThread() {
		super("CalcThread");
	}

	CalcThread(int id) {
		this.id = id;
		times = 1;
	}
	
	CalcThread(int id, int times) {
		this.id = id;
		this.times = times;
	}

	@Override
	public void run() {
		// Создаём локальный вектор и выделяем 
		// ему память равную длине строки

		int[] row = new int[Main.array[id].length];
		
		// Повторяем подсчёт x times раз
		for (int i = 0; i < times; i++) {
			System.out.println("Thread [" + id + "] started calc(" + (i + 1) + ").");
			for (int j = 1; j < row.length - 1; ++j)
				row[j] = Main.array[id - 1][j - 1] + Main.array[id - 1][j] 
					   + Main.array[id - 1][j + 1] + Main.array[id][j - 1] 
					   + Main.array[id][j + 1] + Main.array[id + 1][j - 1] 
					   + Main.array[id + 1][j] + Main.array[id + 1][j + 1];
			System.out.println("Thread [" + id + "] finished calc(" + (i + 1) + ").");
			Main.pCount += 1;

			if (Main.pCount < Main.array.length - 2) {
				synchronized (Main.monitor) {
					try {
						Main.monitor.wait();
					} catch (InterruptedException e) {
					}
				}
			} else {
				synchronized (Main.monitor) {
					Main.monitor.notifyAll();
				}
			}
			
			System.out.println("Thread [" + id + "] started changing matrix(" + (i + 1) + ").");
			for (int j = 1; j < row.length - 1; ++j)
				Main.array[id][j] = row[j];
			System.out.println("Thread [" + id + "] finished changing matrix(" + (i + 1) + ").");
			Main.repCount += 1;
			
			if (Main.repCount % (Main.array.length - 2) != 0) {
				synchronized (Main.monitor) {
					try {
						Main.monitor.wait();
					} catch (InterruptedException e) {}
				}
			} else {
				synchronized (Main.monitor) {
					Main.printArray();
					Main.monitor.notifyAll();
				}
			}
		}
	}
}
