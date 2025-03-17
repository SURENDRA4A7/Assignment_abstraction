import java.util.Scanner;

class Circle extends Shapes {

	double pi=3.147;
	double radius;
	void collect_data() {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the circle radius:");
		radius =sc.nextDouble();
		 	 
	}
	void calculate_data() {
		area=pi*radius*radius;
	}
	void display_data() {
		System.out.println("area of circle is: "+ area);
	}
}