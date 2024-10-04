import java.util.Scanner;
public class it24102399Lab7Q1B{
	public static void main (String[] args){
	Scanner input = new Scanner (System.in);
	int sub1,sub2,sub3,sub4;
	double average;
	int count=1;
	
	while (count < 4){
	System.out.print("Enter marks: ");
	
	sub1=input.nextInt();
	sub2=input.nextInt();
	sub3=input.nextInt();
	sub4=input.nextInt();
	
	average=(sub1+sub2+sub3+sub4)/4.0;
	System.out.println ("Average is: "+average);
	
	if (average >=75 && average <=100) {
		System.out.println ("overall grade is:Distinction ");
	}
	else if (average >=50 && average <=74){
		System.out.println ("Overall grade is:Credit ");
	}
	else if (average >=0 && average <=49){
		System.out.println ("Overall grade is:Fail");
	}
	else{
		System.out.println ("invalid input");
	}
	System.out.println();
	
	count++;
	}
	
	}
}
	
	
	
	
	
	
	