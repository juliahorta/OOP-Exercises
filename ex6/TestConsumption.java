class TestConsumption {
    
    public static void main(String[] args){
        SportCar Car1 = new SportCar(200,1500,220);
        SportCar Car2 = new SportCar(100,1000,170);
        SportCar Car3 = new SportCar(135,1100.2,173);
        Vehicle Van1 = new Van(100,0.9,3500,160.4); 
        
        System.out.println(Car1.acceleration());
        System.out.println(Car2.acceleration());
        System.out.println(Car3.acceleration());
        System.out.println(Van1.acceleration());
        
        
    }
    
    
    
    
    
}