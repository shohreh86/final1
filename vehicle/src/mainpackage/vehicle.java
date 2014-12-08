package mainpackage;



public  class vehicle extends car implements car_abs  {
	
	
	
	private int NumberOfDoors;
	
	
	
	
	public vehicle(){
		
	}
	
	
	
	
	public vehicle(int NumberOfDoors){
		
		
		
		this.NumberOfDoors= NumberOfDoors;
	}
	
	
	
	public int getNumberOfDoors() {
		
		
		
		return NumberOfDoors;
	}
	
	
	
	public void setNumberOfDoors(int numberOfDoors) {
		
		
		
		NumberOfDoors = numberOfDoors;
	}
	
	
	@Override
	public void transferOwnerShip(Person newOwner){
		
		
		Owner = newOwner;
	}
	

}
