public abstract class Car { 
	
	private String name; //creating name , quarter mile, and place variables for car class. 
	private double QMile;
	private String place;
	
	public String getName() { // set and get for each of 3 Variables for car class.
		return name; 
		}
	public void setName(String newName) {
		name = newName; 
		}
	
	public double getQMile() { 
		return QMile; 
		}
	public void setQMile(double	newQMile) { 
		QMile = newQMile; 
		}
	
	public String getPlace() {
		return place; 
		}
	public void setPlace(String newPlace) {
		place = newPlace; 
		}
	//creating display, race, and display results functions for the car class
	public void displayCar() {
		System.out.println("You have selected the " + getName() + ".");
		//utilizing the getName() function to get name of each type of car. 
	}
	
	public void raceCar() {
		
		System.out.println("The car selected is now racing.");
		
	}
		
	public void displayResults() {
		System.out.println("The " + getName() + " has finished the quartermile in " + getQMile() + 
				" seconds and has finished in " + getPlace() + " place.");
		//utilizing the getName() and getPlace() function to get name and place of each type of car.
	}
	

	
}