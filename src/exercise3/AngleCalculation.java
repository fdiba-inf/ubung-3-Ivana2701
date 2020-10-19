package exersice3;
import java.util.Scanner;
public class AngleCalculation{
  public static void main(String[] args){
    Scanner input = input.nextDouble();
    double angle = input.nextDouble();
    char type = input.next().charAt(0);
    do{
       if(type=='r'){
        double a=180.0*value/Math.PI;
        System.out.print("Angle: "+a+"d");
      }
      else{
        double a=value*Math.PI/180.0;
        System.out.print("Angle: "+a+"r");
      }
    }
    while(type == 'r' || 'd');
  }
}