import java.util.Scanner;

public class IT24102399Lab7Q3 {
    public static void main(String[] args) {
        
		int count  ;
		char modePayment;
		double discountVlue , amountToPaid, billAmount ;
		
		final double discount = 5.0/100;
		
		Scanner input = new Scanner(System.in);
		
		count = 1;
		
		while (count <= 5){
			
			System.out.println();
			System.out.println("Customer "+count);
			
			System.out.print("Enter total bill amount: ");
			billAmount = input.nextInt();
			
			System.out.print("Enter mode of payment (C for cash , O for other): ");
			modePayment = input.next().toUpperCase().charAt(0);
			
			discountVlue = billAmount*discount;
			
			switch (modePayment){
				case 'C' : System.out.println("Discount is :"+discountVlue);
							amountToPaid = billAmount - discountVlue;
							System.out.println("Amount to be paid: "+amountToPaid);
							count++;
							continue;
							
				case 'O' : System.out.println("No discount applicable");
							System.out.println("Amount to be paid: "+billAmount);
							count++;
							continue;
							
				default : System.out.println("Payment Mode is Not Valid");
							count++;
							continue;				
			}
			
						
			
		}
		
       
    }
}
