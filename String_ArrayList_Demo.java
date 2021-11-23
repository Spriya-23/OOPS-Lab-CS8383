import java.util.ArrayList;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStream; 
import java.io.InputStreamReader; 
import java.util.Scanner;


class StringList {
	ArrayList<String> listOfStrings;

	public StringList() {
		listOfStrings = new ArrayList<String>();
	}

	public boolean addString(String aString) {
		boolean result = listOfStrings.add(aString);
		return result;
	}

	public void insertStringAt(int position, String aString) {
		int list_size = listOfStrings.size();
		int cur_pos = 0;
		ArrayList<String> templist = new ArrayList<String>();
		if (position > list_size)
			System.out.println("Sorry Position is not in the list limit");
		else {
			for (String elememt : listOfStrings) {
				if (cur_pos == position)
					templist.add(aString);
				templist.add(elememt);
				cur_pos++;
			}
		}
		listOfStrings = templist;
	}

	public void displayList() {
		int i = 0;
		for (String element : listOfStrings) {
			System.out.println(i + "." + element);
			i++;
		}
	}

	public void searchString(String aString) {
		int cur_pos = 0;
		int foundAt = -1;
		for (String element : listOfStrings) {
			if (element.equalsIgnoreCase(aString)) {
				foundAt = cur_pos;
				break;
			} else

				cur_pos++;
		}
		if (foundAt >= 0)
			System.out.println("Your string " + aString + " found at position " + cur_pos);
		else
			System.out.println("String not found in the list");
	}

	public void displayStringsBeginWith(String aLetter) {
		System.out.println("The String's Begins with Letter [" + aLetter + "]\n");
		for (String element : listOfStrings) {
			String firstLetter = String.valueOf(element.charAt(0));
			if (aLetter.equals(firstLetter))
				System.out.println(element);
		}
	}
}
	
public class String_ArrayList_Demo {
	public static void main(String[] args) {
		StringList stringList = new StringList();
		Scanner userInput = new Scanner(System.in);
		String aString = null;
		int choice = 0;
		int position = 0;
		while (choice != 6) {
			System.out.println("\nString List Operations");
			System.out.println("************************");
			System.out.println("1. Append a String\n" + "2. Insert a String at Position\n" + "3. Search a String\n"
					+ "4. List all Strings\n" + "5. Display String's Begins with a Letter\n" + "6.Exit");
			choice = userInput.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter a String: ");
				stringList.addString(userInput.next());
				break;
			case 2:
				System.out.println("Enter a String: ");
				aString = userInput.next();
				System.out.println("Enter a Position to Insert: ");
				position = userInput.nextInt();
				stringList.insertStringAt(position, aString);
				break;
			case 3:
				System.out.println("Enter a String to Be Searched: ");
				aString = userInput.next();
				stringList.searchString(aString);
				break;
			case 4:
				System.out.println("\nList Contains");
				System.out.println("-------------");
				stringList.displayList();
				break;
			case 5:
				System.out.println("Enter a letter");
				stringList.displayStringsBeginWith(userInput.next());
				break;
			case 6:
				System.out.println("\n\nThank You !!!");
				userInput.close();
				System.exit(0);
				break;
			default:
				System.out.println("Please enter valid input");
				break;
			}
		}
	}
}


