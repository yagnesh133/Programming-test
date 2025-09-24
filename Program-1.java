
import java.util.*;


public class Calculator {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String op = sc.next();
        switch (op.toLowerCase()) {
        case "add":
            System.out.println(a+b);
            break;
        case "subtract":
        	System.out.println(a-b);
        	break;
        case "multiply":
        	System.out.println(a*b);
        	break;
        case "divide":
        	System.out.println(a/b);
        	break;
        default:
        	System.out.println("Invalid Operation");
        }
	
	}
}
