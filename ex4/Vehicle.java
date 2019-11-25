class Vehicle {
    
    private double horsepower;
    private double aerodynamics;
    private double weight;
    
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
    
}