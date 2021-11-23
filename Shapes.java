import java.util.Scanner;
import java.util.Scanner;

abstract class Shape {
	double length = 0.0;
	double hight = 0.0;

	public abstract void printArea();
}

class Rectangle extends Shape {
	double area = 0.0;

	@Override
	public void printArea() {
		System.out.println("\nRectangle");
		System.out.println("---------\n");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Length of Rectangle : ");
		this.length = input.nextDouble();
		System.out.println("Enter Breadth of Rectangle : ");
		this.hight = input.nextDouble();
		this.area = this.length * this.hight;
		System.out.println("Area of the Rectangle is : " + this.area);
	}
}

class Triangle extends Shape {
	double area = 0.0;

	@Override
	public void printArea() {
		System.out.println("\nTriangle");
		System.out.println("---------\n");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Length of Triangle : ");
		this.length = input.nextDouble();
		System.out.println("Enter Hight of Triangle : ");
		this.hight = input.nextDouble();
		this.area = 0.5 * this.length * this.hight;
		System.out.println("Area of the Triangle is : " + this.area);
	}
}

class Circle extends Shape {
	double area = 0.0;

	@Override
	public void printArea() {
		System.out.println("\nCircle");
		System.out.println("-------\n");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Radius of Circle : ");
		this.length = input.nextDouble();
		this.area = Math.PI * this.length * this.length;
		System.out.println("Area of the Circle is : " + this.area);
	}
}

public class Shapes {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("Finding Area");
			System.out.println("************");
			System.out.println(
					"\n1. Rectangle" + "\n2. Triangle" + "\n3. Circle" + "\n4. Exit" + "\n\nEnter your choice: ");
			choice = userInput.nextInt();
			switch (choice) {
			case 1:
				Shape rt = new Rectangle();
				rt.printArea();
				break;
			case 2:
				Shape tr = new Triangle();
				tr.printArea();
				break;
			case 3:
				Shape cr = new Circle();
				cr.printArea();
				break;
			case 4:
				System.out.println("\n\nThank You !!!");
				userInput.close();
				break;
			default:
				System.out.println("Please enter valid input");
				break;
			}
		} while (choice != 4);
	}

}
