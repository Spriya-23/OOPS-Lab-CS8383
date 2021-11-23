import java.util.Scanner;

import converter.Currency;
import converter.Distance;
import converter.Time;

public class convert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        
        while(choice != 4){
        	System.out.println("Converters");
        	System.out.println("**********");
        	System.out.println("1. Currentcy\n2. Distance\n3. Time\n4. Exit\n\nEnter Your Choice");
        	choice = input.nextInt();
        	switch(choice){
        	case 1:
        		Currency.userChoice();
        		break;
        	case 2:
        		Distance.userChoice();
        		break;
        	case 3:
        		Time.userChoice();
        		break;
        	case 4:
        		break;
        	default:
        		System.out.println("Please choose valid option");
        		break;
        	}
        }
        System.out.println("Thank You !!!!");
    }
}