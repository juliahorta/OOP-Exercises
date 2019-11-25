class SportCar extends Vehicle {
    
    private double topspeed;
    private double fuelconsumption;
    
    public SportCar(double hp, double w, double ts){
        super(hp,0.5,w);
        topspeed = ts;
 
    }
    
    public double getTopSpeed()
    {
        return topspeed;
    }
    
    public void FuelConsumption()
    {
        fuelconsumption = (1000+(super.getWeight()/5))*(getTopSpeed()/100)*(0.5*super.getHorsepower()/10000);
    }
    
     public double getFuelConsumption()
    {
        return fuelconsumption;
    }
    
    
    
    
    
    
}
