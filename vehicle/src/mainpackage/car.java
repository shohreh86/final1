package mainpackage;


public abstract class car {
	
	private String Name;
	private String Color;
	private double Weight;
	public  Person Owner;
	
	Person driver_vec = new Person();
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public double getWeight() {
		return Weight;
	}
	public void setWeight(double W) {
		Weight = W;
	}
	public Person getOwner() {
		return Owner;
	}
	public void setOwner(Person owner) {
		Owner = owner;
	}
	
	public void transferOwnerShip(Person newOwner){
		this.Owner = newOwner;
	}
	

}
