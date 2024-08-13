package java_test;

public class FlyableTest {
	
	    public static void main(String[] args) {
	        
	        SpaceCraft spacecraft = new SpaceCraft();
	        Flyable airplane = new Airoplane();
	        Flyable helicopter = new Helicopter();

	       
	        
	        spacecraft.fly_obj();
	        airplane.fly_obj();
	        helicopter.fly_obj();
	    }
	}

