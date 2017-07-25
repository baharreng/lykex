package tr.org.linux.kamp.garbage;


	import java.util.Scanner;

	public class Triangle {
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.print("Enter a number");
			int number=input.nextInt();
			
			for(int i=number;i>=1;i--) {
				for(int j=i; j>=1;j--) {
					System.out.print(j + "");
				}
				for(int k=2;k<=i;k++) {
					System.out.print(k+ "");
				}
				System.out.println("");
			}
		}
		
	}

