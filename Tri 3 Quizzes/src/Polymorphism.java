
public class Polymorphism {

	public static void main(String[] args) {
		
		Vehicle x = new Vehicle();
	    x.displaySpeed();



	   Vehicle y = new Car();
	    y.displaySpeed();



	    Bicycle z = new Bicycle();
	    z.ringBell();



	    Vehicle a = new Bicycle();
//	    a.ringBell();



	    Vehicle b = new Bicycle();
	    b.displaySpeed();




//	    Car c = new Vehicle()
//	    c.displaySpeed();

		
	}
}
