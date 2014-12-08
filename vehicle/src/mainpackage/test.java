package mainpackage;

public class test {
     public static void main(String[] args){
    	 
    	 Person a = new Person();
    	 a.setFirstName("a");
    	 
    	vehicle new_car= new vehicle();
    	 new_car.Owner= a;
    	 new_car.setNumberOfDoors(4);
    	 System.out.println(new_car.Owner.getFirstName());

    	 truck new_truck= new truck();
    	 new_truck.Owner=a;
    	 new_truck.setNumberOfAxels(2);
    	 System.out.println(new_truck.Owner.getFirstName());

    	 Person b= new Person();
    	 b.setFirstName("b");
    	 new_truck.Owner=b;

 
    	 
    	 
    	 bike new_bike= new bike();
    	 new_bike.setHasSideCar(false);
    
    	 System.out.println(new_truck.Owner.getFirstName());
    	 System.out.println(new_car.getNumberOfDoors());
    	 System.out.println(new_bike.isHasSideCar());

    	 
     }

}
