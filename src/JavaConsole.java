import com.sun.jdi.connect.Connector;

import java.util.Scanner;
public class JavaConsole {
    public static void main(String args[]) {

        int firstnumber;
        int secondnumber;
        int result;

       Scanner in = new Scanner(System.in);

        System.out.println("Please define two number and I will multiply it" );
        System.out.println("First number is?");
        firstnumber=in.nextInt();
        System.out.println("The second number is?");
        secondnumber=in.nextInt();


        result = firstnumber * secondnumber;
        System.out.println("The result is " + result);


    }

}
