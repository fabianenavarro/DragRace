import java.util.Scanner;
 
public class DragRace { 
 
    public static void main(String[] args){
   
        CarFactory carFactory = new CarFactory(); //creating a car factory object.
         
        
        Car theCar = null; //car object
         
        Scanner userInput = new Scanner(System.in);
        //utilizing scanner to select car.
         
        System.out.print("Welcome to the Drag Race! select a car:"
        		+ "\n(M) Mustang \n(G) GTR \n(C) Camaro\n");//welcome message
         
        if (userInput.hasNextLine()){
             
            String typeOfCar = userInput.nextLine(); //getting the type of car
         
            theCar = carFactory.makeCar(typeOfCar); 
            //using the car factory class to select different cars in another class. 
            if(theCar != null){  //error message for 
                 
                race(theCar); //pass the car selected to the race function. 
                 
            } else System.out.print("Please enter a car selection next time.");            
        }
       
    }
     
    public static void race(Car theCar){
         
        theCar.displayCar(); 
         
        theCar.raceCar();  
         
        theCar.displayResults();
        
        System.out.println("\n\nEnd of Program");
         
    }
        
}