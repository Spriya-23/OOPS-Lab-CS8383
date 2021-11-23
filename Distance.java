package converter;

import java.util.Scanner;

public class Distance {
	public static double convertMeterToKiloMeter(double meter) {
		return meter / 1000;
	}

	public static double convertMilesToKiloMeter(double miles) {
		return miles * 1.60934;
	}

	public static double convertKiloMetertoMeter(double kilometer) {
		return kilometer * 1000;
	}

	public static double convertKiloMeterToMiles(double kilometer) {
		return kilometer / 1.60934;
	}
	
	public static void userChoice(){
    	Scanner input = new Scanner(System.in);
        int distance_choice = 0;
        double distance = 0;
        while(distance_choice != 5){
        	System.out.println("\nDistance Converter");
        	System.out.println("------------------");
        	System.out.println("1. METER to KILOMETER\n2. MILES to KILOMETER\n"
        					 + "3. KILOMETER to METER\n4. KILOMETER to MILES\n"
        					 + "5.Exit\n\nEnter Your Choice");
        	distance_choice = input.nextInt();
        	switch(distance_choice){
        	case 1:
        		System.out.println("Enter in METERS");
        		distance = input.nextDouble();
        		System.out.println(distance+" METERS is equal to "+Distance.convertMeterToKiloMeter(distance)+" KILOMETER");
        		break;
        	case 2:
        		System.out.println("Enter in MILES");
        		distance = input.nextDouble();
        		System.out.println(distance+" MILES is equal to "+Distance.convertMilesToKiloMeter(distance)+" KILOMETER");
        		break;
        	case 3:
        		System.out.println("Enter in KILOMETER");
        		distance = input.nextDouble();
        		System.out.println(distance+" KILOMETER is equal to "+Distance.convertKiloMetertoMeter(distance)+" METER");
        		break;
        	case 4:
        		System.out.println("Enter in KILOMETER");
        		distance = input.nextDouble();
        		System.out.println(distance+" KILOMETER is equal to "+Distance.convertKiloMeterToMiles(distance)+" MILES");
        		break;
        	case 5:
        		break;
        	default:
        		System.out.println("Please choose valid option");
        		break;
        	}
        }
    }
}