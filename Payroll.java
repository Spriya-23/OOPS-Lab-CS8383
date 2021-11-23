import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
class EmployeeDetail {
	String emp_name;
	String emp_id;
	String emp_address;
	String emp_mail_id;
	String emp_mobile_no;
	int basic_pay;
	int per_day_pay;
	int current_basic_pay;
	int da, hra, pf, gross_pay;
	int net_pay;
	int no_of_days_in_current_month;
	int no_of_days_worked;
	Calendar cal;
	Scanner input;

	EmployeeDetail() {
		input = new Scanner(System.in);
		cal = new GregorianCalendar();
		no_of_days_in_current_month = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		getUserBasicDetails();
	}

	public void generatePaySlip() {
		this.da = (this.current_basic_pay / 100) * 97;
		this.hra = (this.current_basic_pay / 100) * 12;
		this.pf = (int) ((this.current_basic_pay / 100) * 0.1);
		this.gross_pay = this.current_basic_pay + da + hra + pf;
		this.net_pay = gross_pay - pf;
	}

	public void displayPaySlip() {
		System.out.println("Name: " + this.emp_name);
		System.out.println("ID: " + this.emp_id);
		System.out.println("Address: " + this.emp_address);
		System.out.println("MailID: " + this.emp_mail_id);
		System.out.println("Mobile No: " + this.emp_mobile_no);
		System.out.println("\nEarnings");
		System.out.println("--------");
		System.out.println("BASIC Pay: " + current_basic_pay + " Rs");
		System.out.println("DA : " + da + " Rs");
		System.out.println("HRA : " + hra + " Rs");
		System.out.println("\nDeductions");
		System.out.println("----------");
		System.out.println("PF : " + pf + " Rs");
		System.out.println("GROSS Pay: " + gross_pay + " Rs");
		System.out.println("NET Pay: " + net_pay + " Rs");
	}

	public void getUserBasicDetails() {
		System.out.println("Enter Details");
		System.out.println("Name: ");
		this.emp_name = input.next();
		System.out.println("ID: ");
		this.emp_id = input.next();
		System.out.println("Address: ");
		this.emp_address = input.next();
		System.out.println("MailID: ");
		this.emp_mail_id = input.next();
		System.out.println("Mobile No:");
		this.emp_mobile_no = input.next();
	}

	public void computeCurrentBasicPay(String empType) {
		this.per_day_pay = this.basic_pay / no_of_days_in_current_month;
		System.out.println("\nBasic Pay of " + empType + " " + this.basic_pay + " for "
				+ this.no_of_days_in_current_month + " days");
		System.out.println("This month this " + empType + " gets " + this.per_day_pay + " INR as basic pay per day");
		System.out.println("Enter no.of days worked by " + empType + " including CL, WH, FH and excluding LWP:");
		this.no_of_days_worked = input.nextInt();
		if (no_of_days_worked <= no_of_days_in_current_month) {
			this.current_basic_pay = this.per_day_pay * no_of_days_worked;
			System.out.println("Pay Slip");
			System.out.println("--------");
			generatePaySlip();
		} else {
			System.out.println("Sorry Please Enter Valid Days");
		}
	}

	protected void finalize() {
		input.close();
		System.exit(0);
	}
}
class Professor extends EmployeeDetail {
	public Professor() {
		super();
		computeProfessorPay();
	}

	public void computeProfessorPay() {
		System.out.println("Enter Basic pay of Professor [enter -1  for Default [BP = 70000]]:");
		this.basic_pay = input.nextInt();
		if (this.basic_pay == -1) {
			this.basic_pay = 70000;
			System.out.println("Default Pay Taken");
		}
		computeCurrentBasicPay("Professor");
		generatePaySlip();
		displayPaySlip();
	}
}

class Programmer extends EmployeeDetail {

	public Programmer() {
		super();
		computeProgrammerPay();

	}

	public void computeProgrammerPay() {
		System.out.println("Enter Basic pay of Programmer [enter -1  for Default [BP = 30000]]:");
		this.basic_pay = input.nextInt();
		if (this.basic_pay == -1) {
			this.basic_pay = 30000;
			System.out.println("Default Pay Taken");
		}
		computeCurrentBasicPay("Programmer");
		generatePaySlip();
		displayPaySlip();
	}

}
class AssistantProfessor extends EmployeeDetail {
	public AssistantProfessor() {
		super();
		computeAssistantProfessorPay();
	}

	public void computeAssistantProfessorPay() {
		System.out.println("Enter Basic pay of AssistantProfessor [enter -1  for Default [BP = 25000]]:");
		this.basic_pay = input.nextInt();
		if (this.basic_pay == -1) {
			this.basic_pay = 25000;
			System.out.println("Default Pay Taken");
		}
		computeCurrentBasicPay("AssistantProfessor");
		generatePaySlip();
		displayPaySlip();
	}
}
class AssociateProfessor extends EmployeeDetail {
	public AssociateProfessor() {
		super();
		computeAssociateProfessorPay();
	}

	public void computeAssociateProfessorPay() {
		System.out.println("Enter Basic pay of AssociateProfessor [enter -1  for Default [BP = 40000]]:");
		this.basic_pay = input.nextInt();
		if (this.basic_pay == -1) {
			this.basic_pay = 40000;
			System.out.println("Default Pay Taken");
		}

		computeCurrentBasicPay("AssociateProfessor");
		generatePaySlip();
		displayPaySlip();
	}
}
public class Payroll {

	public static void main(String[] args) throws IOException {
		Programmer aProgrammer;
		AssistantProfessor aAssistantProfessor;
		AssociateProfessor aAssociateProfessor;
		Professor aProfessor;
		String choice;
		int n_choice = 0;
		Scanner userInput = new Scanner("System.in");

		while (n_choice != 5) {
			System.out.println("\n\nEmployee Payroll System");
			System.out.println("***********************\n");
			System.out.println("1. Programmer\n2. Assistant Professor\n" + "3. Associate Professor\n4. Professor\n"
					+ "5. Exit\n\nEnter Your Choice");
			choice = new BufferedReader(new InputStreamReader(System.in)).readLine();
			n_choice = Integer.parseInt(choice);
			switch (n_choice) {
			case 1:
				System.out.println("Programmer Selected");
				aProgrammer = new Programmer();
				break;
			case 2:
				System.out.println("AssistantProfessor Selected");
				aAssistantProfessor = new AssistantProfessor();
				break;
			case 3:
				System.out.println("AssociateProfessor Selected");
				aAssociateProfessor = new AssociateProfessor();
				break;
			case 4:
				System.out.println("Professor Selected");
				aProfessor = new Professor();
			case 5:
				System.out.println("Thank You !!!");
				userInput.close();
				break;
			default:
				System.out.println("Enter valid choice !!!");
				break;
			}
		}
	}

}