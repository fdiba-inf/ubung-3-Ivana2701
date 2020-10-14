package exercise3;
import java.util.Scanner;

public class NumberCounter{

      public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

          int number = input.nextInt();
          int counter1 = 0;
          int counter2 = 0;
          double sum = 0;

          while(number!=0){

            if (number>0){
                counter1++;
                sum = sum + number;
                number = input.nextInt();
            }

            else{
                counter2++;  
                sum = sum + number;  
                number = input.nextInt(); 
            }
          }
          
            double average = sum/(counter1+counter2); 

            System.out.println("Positive numbers: " + counter1);
            System.out.println("Negative numbers: " + counter2);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            
          

      }
    }