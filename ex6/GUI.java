import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GUI extends JFrame {
    
    public GUI() {
     
    }
    
    public static void main(String[] args) {
        JFrame F = new JFrame();
        F.setSize(800,800);
        F.setLayout(null);
        F.setVisible(true);
        
        JButton b1 = new JButton("NEW SPORT CAR");
        TextArea txtcar = new TextArea();
        txtcar.setSize(300,150);
        txtcar.setLocation(151,0);
        b1.setSize(150,74);
        F.add(b1);
        F.add(txtcar);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent evt){
                SportCar newCar = new SportCar(200,1500,220);
                txtcar.append("NEWS SPORTS CAR GENERATED: \n");
                txtcar.append("This car's acceleration is: " + newCar.acceleration() + "\n");
                txtcar.append("This car's fuel consumption is: " + newCar.getFuelConsumption() + "\n");
                txtcar.append("This car's aerodynmics is: " + newCar.getAerodynamics() + "\n");
                txtcar.append("This car's top speed is: " + newCar.getTopSpeed() + "\n");
                txtcar.append("This car's horsepower is: " + newCar.getHorsepower() + "\n");
                txtcar.append("This car's weight is: " + newCar.getWeight() + "\n");
            } 
        });
        b1.setVisible(true);
        
        JButton b2 = new JButton("NEW VAN");
        TextArea txtvan = new TextArea();
        txtvan.setSize(300,150);
        txtvan.setLocation(151,151);
        b2.setSize(150,74);
        b2.setLocation(0,76);
        F.add(b2);
        F.add(txtvan);
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent evt){
                Vehicle newVan = new Van(100,0.9,3500,160.4);
                txtvan.append("NEWS VAN GENERATED: \n");
                txtvan.append("This van's acceleration is: " + newVan.acceleration() + "\n");
                txtvan.append("This van's aerodynmics is: " + newVan.getAerodynamics() + "\n");
                txtvan.append("This van's horsepower is: " + newVan.getHorsepower() + "\n");
                txtvan.append("This van's weight is: " + newVan.getWeight() + "\n");
            } 
        });
        b2.setVisible(true);
        
        
        
        
        
        
        
    }
    
    
  
    
}
