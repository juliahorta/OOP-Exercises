class TestConsumption {
    
    public static void main(String[] args){
        
        SportCar Car1 = new SportCar(200,1500,220);
        SportCar Car2 = new SportCar(100,1000,170);
        SportCar Car3 = new SportCar(135,1100.2,173);
        
        Car1.FuelConsumption();
        Car2.FuelConsumption();
        Car3.FuelConsumption();
        
        System.out.println(Car1.getFuelConsumption());
        System.out.println(Car2.getFuelConsumption());
        System.out.println(Car3.getFuelConsumption());
        
        
        
        
    }
    
    
    
    
    
}