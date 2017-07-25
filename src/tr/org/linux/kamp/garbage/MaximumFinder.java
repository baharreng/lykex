package tr.org.linux.kamp.garbage;


	
	import java.util.Scanner;

	public class MaximumFinder {
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.println("Aralarında boşluk olucak biçimde 3 sayı giriniz: ");
			double num1=input.nextDouble();
			double num2=input.nextDouble();
			double num3=input.nextDouble();
			
			double result=maximum(num1,num2,num3);
			System.out.println("En büyük sayı: " + result);
			
		}
		
		public static double maximum(double x,double y,double z) {
			double maximumNumber=x;
			
			if(y>maximumNumber)
				maximumNumber=y;
			if(z>maximumNumber)
				maximumNumber=z;
			return maximumNumber;
		}
	}



