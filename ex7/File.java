import java.util.*;
import java.io.*;
public class File
{
    public static void main(String [] args) {
        ArrayList<Integer> populations = new ArrayList<>();
        String line;
        int amount = 0;
        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"));
            while (!((line = bufferedReader.readLine()) == null)){
                String [] readText = line.split(" ");
                populations.add(Integer.parseInt(readText[1]));
            }
        } catch (IOException e) {
            System.out.println("There seems to be a problem");
        }
        for(int i =0; i<populations.size(); i++) {
            if(populations.get(i) >= Integer.parseInt(args[0])) 
            {
                amount ++;
            }

        }
        System.out.println(amount);
    }  
}