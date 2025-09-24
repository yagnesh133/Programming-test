
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int limit =0;
        if(a%2==0){
          limit=a-1;
        }else{
          limit=a;
        }
        for (int i = 1; i <= limit * 2 - 1; i += 2) {
            System.out.print(i + " ");
        }
    }
}
