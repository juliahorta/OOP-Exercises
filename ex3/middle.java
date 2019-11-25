import java.util.Arrays;
class middle {

private static double type;

public static void main(String[] args) {
    if (args.length == 3) {
          double [] numbers = new double [3];
          
          numbers[0] = Double.valueOf(args[0]);
          numbers[1] = Double.valueOf(args[1]);
          numbers[2] = Double.valueOf(args[2]);
          
          middle(numbers); 
      }
      else {
          System.out.println("error");
      }
}

public static void middle(double [] numbers) {
    Arrays.sort(numbers);
    System.out.println( numbers[1] + " is between " + numbers[0] + " and " + numbers[2]);
    
}
}
