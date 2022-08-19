class Car{
    
    String carDesc;
    double fuelCap;
    double fuel;
    double fuelConsum;
    double maxRange; 
    double drivenKM;
    
    Car(String carDesc, double fuelCap, double fuel, double fuelConsum, double drivenKM){
        this.carDesc = carDesc;
        this.fuelCap = fuelCap;
        this.fuel = fuel;
        this.fuelConsum = fuelConsum;
        maxRange = (fuel/(fuelConsum/100));
        this.drivenKM = drivenKM;
    }
    
    public void drive(int distance){
        if(fuel>0){        
            fuel -= (distance*(fuelConsum/100));
            maxRange = (fuel/(fuelConsum/100));
            drivenKM += distance;
        }
    }
    
    public String toString(){
        String Daten = "Car:" + carDesc + "Fuel capacity:" + fuelCap + "fuel consumption:" + fuelConsum + "Current fuel:" + fuel + "Max. range:" + maxRange + "Recently driven km:" + drivenKM;
        return Daten;
    }
}