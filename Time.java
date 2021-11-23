package converter;

import java.util.Scanner;

public class Time {
	public static double convertHoursToMinutes(double hours) {
		return hours * 60;
	}

	public static double convertHoursToSeconds(double hours) {
		return hours * 60 * 60;
	}

	public static double convertMinutesToHours(double minutes) {
		return minutes / 60;
	}

	public static double convertSecondsToHours(double seconds) {
		return seconds / 60 / 60;
	}
	
	public static void userChoice(){
    	Scanner input = new Scanner(System.in);
        int time_choice = 0;
        double time = 0;
        while(time_choice != 5){
        	System.out.println("\nTime Converter");
        	System.out.println("-----------------");
        	System.out.println("1. HOURS to MINUTES\n2. HOURS to SECONDS\n"
        					 + "3. MINUTES to HOURS\n4. SECONDS to HOURS\n"
        					 + "5.Exit\n\nEnter Your Choice");
        	time_choice = input.nextInt();
        	switch(time_choice){
        	case 1:
        		System.out.println("Enter in HOURS");
        		time = input.nextDouble();
        		System.out.println(time+" HOURS is equal to "+Time.convertHoursToMinutes(time)+" MINUTES");
        		break;
        	case 2:
        		System.out.println("Enter in HOURS");
        		time = input.nextDouble();
        		System.out.println(time+" HOURS is equal to "+Time.convertHoursToSeconds(time)+" SECONDS");
        		break;
        	case 3:
        		System.out.println("Enter in MINUTES");
        		time = input.nextDouble();
        		System.out.println(time+" MINUTES is equal to "+Time.convertMinutesToHours(time)+" HOURS");
        		break;
        	case 4:
        		System.out.println("Enter in SECONDS");
        		time = input.nextDouble();
        		System.out.println(time+" SECONDS is equal to "+Time.convertSecondsToHours(time)+" HOURS");
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