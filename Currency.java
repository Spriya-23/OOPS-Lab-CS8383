package converter;

import java.util.Scanner;

public class Currency {

	public static double covertEUROtoINR(double EURO) {
		return EURO * 80;
	}

	public static double convertDOLLARtoINR(double DOLLAR) {
		return DOLLAR * 66.89;
	}

	public static double convertYENtoINR(double YEN) {
		return YEN * 0.61;
	}

	public static double covertINRtoEURO(double INR) {
		return INR * 0.013;
	}

	public static double convertINRtoDOLLAR(double DOLLAR) {
		return DOLLAR * 0.015;
	}

	public static double convertINRtoYEN(double YEN) {
		return YEN * 1.63;
	}
	
	public static void userChoice(){
    	Scanner input = new Scanner(System.in);
        int currency_choice = 0;
        double money = 0;
        while(currency_choice != 7){
        	System.out.println("\nCurrency Converter");
        	System.out.println("------------------");
        	System.out.println("1. DOLLOR to INR\n2. EURO to INR\n3. YEN to INR\n"
        					 + "4. INR to DOLLOR\n5. INR to EURO\n6. INR to YEN\n"
        					 + "7.Exit\n\nEnter Your Choice");
        	currency_choice = input.nextInt();
        	switch(currency_choice){
        	case 1:
        		System.out.println("Enter in DOLLER");
        		money = input.nextDouble();
        		System.out.println(money+" DOLLER is equal to "+Currency.convertDOLLARtoINR(money)+" INR");
        		break;
        	case 2:
        		System.out.println("Enter in EURO");
        		money = input.nextDouble();
        		System.out.println(money+" EURO is equal to "+Currency.covertEUROtoINR(money)+" INR");
        		break;
        	case 3:
        		System.out.println("Enter in YEN");
        		money = input.nextDouble();
        		System.out.println(money+" YEN is equal to "+Currency.convertYENtoINR(money)+" INR");
        		break;
        	case 4:
        		System.out.println("Enter in INR");
        		money = input.nextDouble();
        		System.out.println(money+" INR is equal to "+Currency.convertINRtoDOLLAR(money)+" DOLLORS");
        		break;
        	case 5:
        		System.out.println("Enter in INR");
        		money = input.nextDouble();
        		System.out.println(money+" INR is equal to "+Currency.covertINRtoEURO(money)+" EURO");
        		break;
        	case 6:
        		System.out.println("Enter in INR");
        		money = input.nextDouble();
        		System.out.println(money+" INR is equal to "+Currency.convertINRtoYEN(money)+" YEN");
        		break;
        	case 7:
        		break;
        	default:
        		System.out.println("Please choose valid option");
        		break;
        	}
        }
    }
}