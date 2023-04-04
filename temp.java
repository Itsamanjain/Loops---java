import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);// first we call a scanner 
        System.out.println("enter temp in c"); // now we r saying to enter the  value 
        float tempC = in.nextFloat(); // now we r saying the data type of our coming value
        float tempF = (tempC*9/5) +  32;
        System.out.println(tempF);

    }
}
