package exercise3;
import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int divider = 2;
        boolean prime = true;

        while (n>divider){
          if(num%divider==0){
            prime = false;
            break;
          }
          divider++;
          }

          System.out.println("Prime number: " + prime);
         

      
    }

}
