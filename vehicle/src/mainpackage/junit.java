package mainpackage;
import static org.junit.Assert.*;

import org.junit.Test;

import mainpackage.car;
import mainpackage.bike;
import mainpackage.Person;
import mainpackage.truck;



@SuppressWarnings("unused")
public class junit {

	@Test
	public void test() {
		Person a = new Person();
		
   	 a.setFirstName("a");

   	 vehicle new_car= new vehicle();
   	 new_car.setOwner(a);
   	 new_car.setNumberOfDoors(4);
  	assertEquals("First name of the Person a","a",a.getFirstName());

  	
   	 truck new_truck= new truck();
   	 new_truck.setOwner(a);
   	 new_truck.setNumberOfAxels(2);
  	assertEquals("the new truck owned by person a","a",new_truck.getOwner().getFirstName());


   	 Person b= new Person();
   	 b.setFirstName("b");
   	 new_truck.setOwner(b);
   	assertEquals("the new truck owned by person b","b",new_truck.getOwner().getFirstName());


   	 
   	 
   	 bike new_motorcycle= new bike();
   	 new_motorcycle.setHasSideCar(false);
   
   	 
  	assertEquals("The car owned by person (a) has 4 doors",4,new_car.getNumberOfDoors());
  	assertEquals("The truch owned by person (a) has 2 axels",2,new_truck.getNumberOfAxels());

 	assertEquals("Motorcycle with no sidecar",false,new_motorcycle.isHasSideCar());

	}

}