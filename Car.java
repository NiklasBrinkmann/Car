public class Car{
    private String carDesc;
    private double fuelCap;
    private double fuel;
    private double fuelConsum;
    private double maxRange; 
    private double drivenKM;
    
    public Car(String carDesc, double fuelCap, double fuel, double fuelConsum, double drivenKM){
        this.carDesc = carDesc;
        this.fuelCap = fuelCap;
        this.fuel = fuel;
        this.fuelConsum = fuelConsum;
        maxRange = (fuel/fuelConsum*100);
        this.drivenKM = drivenKM;
    }
    
    public void drive(int distance){
        if(fuel < 0){
           fuel -= distance*fuelConsum*0.01;
            maxRange = fuel/fuelConsum*100;
            drivenKM += distance;
 
        } 
    }
    
    public String toString(){
        String Daten = "Car:" + carDesc + "\n" + "Fuel capacity:" + fuelCap + "\n" + "fuel consumption:" + fuelConsum + "\n" + "Current fuel:" + fuel + "\n" + "Max. range:" + maxRange + "\n" + "Recently driven km:" + drivenKM;
        return Daten;
    }
}