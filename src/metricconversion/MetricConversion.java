/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricconversion;
import java.util.Scanner;
/**
 *
 * @author Edward
 */
public class MetricConversion 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        MetricConversion test1 = new MetricConversion();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write a number.");
        double aNumber = scan.nextInt();
        double centimeters = test1.inchesToCentimeters(aNumber);
        System.out.println("There are " + centimeters + " centimeters in " + aNumber + " inches.");
        double liters = test1.gallonToLiters(aNumber);
        System.out.println("There are " + liters + " liters in " + aNumber + " gallons.");
        // TODO code application logic here
    }
    double inchesToCentimeters(double aNumber)
    {
        double centimeters = aNumber * 2.54;
        return centimeters;
    }
    double gallonToLiters(double aNumber)
    {
        double liters = aNumber * 3.7854;
        return liters;
    }
    
}
