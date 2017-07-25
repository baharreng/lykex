package tr.org.linux.kamp.garbage;

public class DoubleArray {
	
	
		
		public static void main(String[] args) {
			int[][] board= new int[4][3];
			int counter=0;
			
			System.out.println("Board'un length'i " + board.length);
			
			//elemanları tanımladık 
			for(int k=0;k<board.length;k++) {
				for(int j=0;j<board[k].length;j++) {
					board[k][j]=counter;
					counter++;
				}
			}
			
			//elemanları ekrana bastırdık 
			for(int j=0;j<board.length;j++) {
				for(int k=0;k<board[j].length;k++) {
					System.out.print(board[j][k]+" ");
					counter++;
				}
			}
			
		}
	}


