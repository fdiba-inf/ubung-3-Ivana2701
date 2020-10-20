package exercise3;
import java.util.Scanner;
public class NumberSearch {
  public static void main(String[] args){
    int counter = 0;
    for(int num = 100; num<1000; num++){
      if(num%30==0){
        if(counter<9){
          counter++;
          System.out.print(num + " ");
          
        }
        else if(counter==9){
          System.out.print(num);
          System.out.print("\n");
          counter=0;
        }        
      }
    }
  }
}