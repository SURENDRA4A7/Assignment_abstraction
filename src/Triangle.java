import java.util.Scanner;

class Triangle extends Shapes{
	double h=0.5;
	double b;
	double l;
	void collect_data() {
				Scanner sc=new Scanner(System.in);
				System.out.print("enter the triangle bredth:");
				b=sc.nextDouble();
				System.out.print("enter the triangle length:");
				l=sc.nextDouble();

	}
	void calculate_data() {
		area=h*b*l;
	}
	void display_data() {
		System.out.println(" area of the triangle is: "+area);
	}
}

