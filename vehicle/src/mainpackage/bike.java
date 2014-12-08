package mainpackage;


public  class bike extends car implements car_abs {
	private boolean hasSideCar;
	
	public bike(){
	}
	
	public bike(boolean hasSideCar){
		this.hasSideCar=hasSideCar;
	}

	public boolean isHasSideCar() {
		return hasSideCar;
	}

	public void setHasSideCar(boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}

	
}
