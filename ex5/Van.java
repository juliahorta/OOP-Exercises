class Van extends Vehicle {
    
    private double topspeed;
    private double fuelconsumption;
    private double carryweight;
    
    public Van(double hp, double ad, double w, double cw){
        super(hp,ad,w);
        carryweight = cw; 
        
        
 
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
    
     public double getCarryWeight()
    {
        return carryweight;
    }
    
    public double acceleration()
    {
        return(100/getHorsepower())*(getAerodynamics()/2)*(getWeight()/100);
    }
    
    
    
    
}
