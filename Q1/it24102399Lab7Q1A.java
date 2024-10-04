import java.util.Scanner;
public class it24102399Lab7Q1A{
	public static void main (String[] args){
	Scanner input = new Scanner (System.in);
	int sub1,sub2,sub3,sub4;
	
	double average;
	
	System.out.println ("Enter marks for four numbers");
	
	System.out.print ("Enter Subject Mark 1: ");
	sub1=input.nextInt();
	
	System.out.print ("Enter Subject Mark 2: ");
	sub2=input.nextInt();
	
	System.out.print ("Enter Subject Mark 3: ");
	sub3=input.nextInt();
	
	System.out.print ("Enter Subject Mark 4: ");
	sub4=input.nextInt();
	
	average=(sub1+sub2+sub3+sub4)/4;
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
	}
}
	
	
	
	
	
	
	