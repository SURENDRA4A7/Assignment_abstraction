import java.util.Scanner;

class Rectangular extends Shapes {
	
	double b;
	double l;
	void collect_data() {
				Scanner sc=new Scanner(System.in);
				System.out.print("enter the rectangular >>bredth:");
				b=sc.nextDouble();
				System.out.print("enter the rectangle >>length:");
				l=sc.nextDouble();
	}
	void calculate_data() {
		area=l*b;
	}
	void display_data() {
		System.out.println("area of rectangular is: "+area);
	}
}