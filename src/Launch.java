
public class Launch {

	public static void main(String[] args) {
		// circle area
		Circle c=new Circle();
		c.collect_data();
		c.calculate_data();
		c.display_data();
		
		//area of triangle
		Triangle t=new Triangle();
		t.collect_data();
		t.calculate_data();
		t.display_data();
		
		//area of rectangular
		Rectangular r=new Rectangular();
		r.collect_data();
		r.calculate_data();
		r.display_data();
		
		
	}

}
