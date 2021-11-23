import java.util.Scanner;
class EBConsumer {

int consumer_number;
String consumer_name;
int previous_month_reading;
int current_month_reading;
int units_consumed;
boolean isDomestic = false;
double bill_ammount;
public void displayDomesticFares(){
    System.out.println("Domestic Fare Details");
    System.out.println("*********************");
    System.out.println("First 100 units - Rs. 1 per unit");
    System.out.println("101-200 units - Rs. 2.50 per unit");
    System.out.println("201 -500 units - Rs. 4 per unit");
    System.out.println("> 501 units - Rs. 6 per unit");
}

public void displayCommercialFare() {
    System.out.println("Commercial Fare Details");
    System.out.println("***********************");
    System.out.println("First 100 units - Rs. 2 per unit");
    System.out.println("101-200 units - Rs. 4.50 per unit");
    System.out.println("201 -500 units - Rs. 6 per unit");
    System.out.println("> 501 units - Rs. 7 per unit");
}

public void getDetails() {
    Scanner inputs = new Scanner(System.in);
    System.out.println("Welcome To EB Calculater\n\n");
    System.out.println("Please Enter Your Name : ");
    this.consumer_name = inputs.next();
    System.out.println("Please Enter Your Consumer Number : ");
    this.consumer_number = inputs.nextInt();
    System.out.println("Please Enter Your Previous Month Reading : ");
    this.previous_month_reading = inputs.nextInt();
    System.out.println("Please Enter Your Current Month Reading : ");
    this.current_month_reading = inputs.nextInt();
    System.out.println("Is this domestic Connection (yes/no) : ");
    if(inputs.next().equals("yes"))
        this.isDomestic = true;
}
public void generateBill(){
    int number_of_units_consumed = this.current_month_reading - this.previous_month_reading;
    this.units_consumed = number_of_units_consumed;
    double sum = 0;
    if(isDomestic == true) {
        for (int i = 0; i <= number_of_units_consumed; i++) {
            if (i <= 100)
                sum = sum + 1;
            else if (i > 100 && i <= 200)
                sum = sum + 2.5;
            else if (i > 200 && i <= 500)
                sum = sum + 4;
            else
                sum = sum + 6;
        }

    }
    else {
        for (int i = 0; i <= number_of_units_consumed; i++) {
            if (i <= 100)
                sum = sum + 2;
            else if (i > 100 && i <= 200)
                sum = sum + 4.5;
            else if (i > 200 && i <= 500)
                sum = sum + 6;
            else
                sum = sum + 7;
        }
    }
    this.bill_ammount = sum;
}
public void displayBill() {
    generateBill();
    System.out.println("The EB Bill Details");
    System.out.println("*******************");
    System.out.println("Consumer Number : "+this.consumer_number);
    System.out.println("Consumer Name : "+this.consumer_name);
    System.out.println("Consumer Units Consumed:"+this.units_consumed);
    if(this.isDomestic == true){
        System.out.println("Your are an Domestic Consumer\n\nFare Details ...");
        displayDomesticFares();
    }
    else{
        System.out.println("You are a Commercial Consumer\n\nFare Details ...");
        displayCommercialFare();
    }
    System.out.println("\nAmount Payable is \u20B9: "+this.bill_ammount);
}
}
public class EBBill {

    public static void main(String[] args) {
        EBConsumer consumer = new EBConsumer();
        consumer.getDetails();
        consumer.displayBill();
    }
}
