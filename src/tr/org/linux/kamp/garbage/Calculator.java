package tr.org.linux.kamp.garbage;


	import java.util.Scanner;

	public class Calculator {
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			
			boolean count=true;
			
			while(count){
				System.out.println("Enter a number: ");
				double number1=input.nextDouble();
				
				System.out.print("Choose an operation: ");
				String operation=input.next();
				
				double result=0;
				double number2=0;
				
				switch(operation) {
				case  "+" :
					System.out.print("Enter another number");
					number2=input.nextDouble();
					result=number1+number2;
					System.out.print(result);
					break;
					
				case "-":
					System.out.print("Enter another number");
					number2=input.nextDouble();
					result=number1-number2;
					System.out.print(result);
					break;
					
				case "*":
					System.out.print("Enter a number: ");
					number2=input.nextDouble();
					result=number1*number2;
					System.out.print(result);
					break;
					
				case "/":
					System.out.print("Enter a number");
					number2=input.nextDouble();
					System.out.print(result);
					break;
					
				default:
					System.out.println("Lütfen +,-,*,/ işlemlerinden birini yapın");
				}
				
			}
		}
	}
	


