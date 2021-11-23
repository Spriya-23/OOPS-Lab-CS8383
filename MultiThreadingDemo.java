import java.util.Random;

class RandomNumberThread extends Thread {
	Random num = new Random();
	int value;

	@Override
	public void run() {
		while (true) {
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
			}
			value = num.nextInt(1000);
			System.out.println("RandomNumberThread generated a number " + value);
			if (value % 2 == 0)
				new SquareGenThread(value).start();
			else
				new CubeGenThread(value).start();
		}
	}
}

class SquareGenThread extends Thread {
	int number;
	int squre;

	public SquareGenThread(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		try {
			this.sleep(3000);
		} catch (InterruptedException e) {
		}
		this.squre = this.number * this.number;
		System.out.println("SquareGenThread--> Square of " + number + " is " + squre);
	}
}

class CubeGenThread extends Thread {
	int number;
	int squre;

	public CubeGenThread(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		try {
			this.sleep(2000);
		} catch (InterruptedException e) {
		}
		this.squre = this.number * this.number * this.number;
		System.out.println("CubeGenThread--> Square of " + number + " is " + squre);
	}
}

public class MultiThreadingDemo {
	public static void main(String[] args) {
		new RandomNumberThread().start();
	}

}
