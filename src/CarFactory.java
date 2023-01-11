 
public class CarFactory{ // factory class used from encapsulating the car creation.
          
    public Car makeCar(String newCarType){ // make car function to make the selected car. 
         
        
        if (newCarType.equals("G")||newCarType.contentEquals("g")){ // used to accept both caps and non caps.
             
            return new GTR(); //returning newCarType of GTR. 
             
        } else
         
        if (newCarType.equals("M")||newCarType.contentEquals("m")){
             
            return new Mustang();
             
        } else
         
        if (newCarType.equals("C")||newCarType.contentEquals("c")){
             
            return new Camaro();
             
        } else return null; //returning null argument if nothing is selected. 
         
    }
     
}