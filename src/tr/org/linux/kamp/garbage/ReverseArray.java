package tr.org.linux.kamp.garbage;


	import java.util.Arrays;

	public class ReverseArray {
		public static void main(String[] args) {
			int[] integerArray= {4,1,3,8,5,12,4,6};
			System.out.println(Arrays.toString(integerArray));
		
			for(int i=integerArray.length-1; i >= 0;i--) {
				System.out.print(" "+integerArray[i]);
			}
		}
	}



