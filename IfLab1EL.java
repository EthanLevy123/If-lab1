import java.util.Scanner;

public class IfLab1EL {
// Ethan Levy
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner kb= new Scanner(System.in);
		
		System.out.println("input a number:");
		int number = kb.nextInt();
		
		kb.nextLine();
		
		System.out.println("input an another number:");
		int number1 = kb.nextInt();
		
		if(number > number1)
		{
				System.out.println("greater");
		}		
		if(number < number1)
		{
			System.out.println("smaller");
		}
		if(number == number1)
		{
			System.out.println("the same");
		}
				
		
		/*
1.
input a number:
100
input an another number:
10001
smaller

2.
input a number:
538
input an another number:
49
greater

3.
input a number:
58
input an another number:
58
the same

			*/
		
		
		
		
	}

}
