package tr.org.linux.kamp.garbage;


	
	import java.util.Arrays;

	public class ComplexArray {
		public static void main(String[] args) {
			int[] intArray1= {4,8,15,36,23,42};
			int[] intArray2= {4,8,15,36,23,42};
			
			boolean result =Arrays.equals(intArray1, intArray2);
			
			System.out.println("Arrayler eşit mi? " + result);
		}
	}



