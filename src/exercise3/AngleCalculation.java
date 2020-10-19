package exersice3;
import java.util.Scanner;
public class AngleCalculation{
  public static void main(String[] args){
    Scanner input = input.nextDouble();
    double angle = input.nextDouble();
    char type = input.next().charAt(0);
    do{
       if(type=='r'){
        double angle=180.0*value/Math.PI;
        System.out.print("Angle: "+angle+"d");
      }
      else{
        double angle=value*Math.PI/180.0;
        System.out.print("Angle: "+angle+"r");
      }
    }
    while(type == 'r' || 'd');
  }
}