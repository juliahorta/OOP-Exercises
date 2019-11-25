class Vehicle {
    
    private double horsepower;
    private double aerodynamics;
    private double weight;
    private double accel;
    
    public Vehicle(double hp, double ad, double w){
        horsepower = hp;
        aerodynamics = ad;
        weight = w;
    }
    
    public double getHorsepower()
    {
        return horsepower;
    }
   
    public double getAerodynamics()
    {
        return aerodynamics;
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public double acceleration()
    {
        accel = (100/horsepower)*(getAerodynamics())*(getWeight()/100);
        return accel;
    }
    
    
}