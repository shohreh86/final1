package mainpackage;


public  class truck extends car implements car_abs {

	public Person newOwner;
	
	private int NumberOfAxels;
	

	
	
	
	public truck(){
	}
	
	public truck(int NumberOfAxels, Person Owner){
		
		
		this.NumberOfAxels=NumberOfAxels;
		
		
		
		
		this.Owner= Owner;
		
	}
	
	
	
	
	
	public int getNumberOfAxels() {
		
		
		
		return NumberOfAxels;
	}

	
	
	public void setNumberOfAxels(int numberOfAxels) {
		
		
		
		NumberOfAxels = numberOfAxels;
	}
	
	
	
	
	
	
}
