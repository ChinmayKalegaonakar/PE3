package stackroute;

import java.util.Scanner;

public class Exercise_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		Exercise_3 ex3 = new Exercise_3();
		while(true) {
			ex3.drawMenu();
			n = sc.nextInt();
			ex3.selector(n);
		}
		
	}
	public void selector(int input) {
		Scanner sc = new Scanner(System.in);
		String inputString="";
		int n=0,m=0,count=0;
		long l =0;
		int[] intArray = null;
		String[] stringArray = null;
		switch(input) {
		
		case 1:System.out.print("Enter number of students");
				n = sc.nextInt();
				m = n;
				while(n-->0) {
					System.out.print("Enter marks of student "+n+1);
					intArray[n] = sc.nextInt();
				}
					
				StudentMarks question1 = new StudentMarks(m,intArray);
				System.out.println("number of students = "+m);
				break;
		case 2:System.out.println("Enter rows of matrix ");
				n = sc.nextInt();
				System.out.println("Enter cols of matrix ");
				m = sc.nextInt();
				System.out.println("Enter first matrix ");
				inputString = sc.nextLine();
				String[] s = inputString.split(" ");
				for(String item:s) {
					intArray[count++] = Integer.parseInt(item);
				}
				Matrix A = new Matrix(n,m,intArray);
				count = 0;
				System.out.println("Enter second matrix ");
				inputString = sc.nextLine();
				s = inputString.split(" ");
				for(String item:s) {
					intArray[count++] = Integer.parseInt(item);
				}
				Matrix B = new Matrix(n,m,intArray);
				
				Matrix C = Matrix.addMatrix(A,B);
				for(int i = 0;i < C.n_cols; i++) {
					for(int j = 0;j < C.n_rows; j++) {
						System.out.print(C.matrix[i][j]+" ");
					}
					System.out.println("");
				}
				break;
		case 3:break;
		case 4:System.out.println("Enter each input in new line -1 to stop");
				while(sc.hasNext()) {
					stringArray[count++] = sc.nextLine();
				}
				String[] cuts = Vowels.removeVowels(stringArray);
				for(String st:cuts)
					System.out.print(st);
				break;
		case 5: System.out.print("Enter size of chessboard : ");
				n = sc.nextInt();
				String[][] board = ChessBoard.makeChessBoard(n);
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						System.out.print(board[i][j]);
					}
					System.out.println("");
				}
				break;
		case 6: System.out.println("Enter 7 digits seperated by commas: ");
				inputString = sc.nextLine();
				System.out.println(inputString+" are consecutive numbers? "+Consecutive7.isConsecutive7(inputString));break;
		case 7:
			 try {
				 Exceptions ex = new Exceptions("exception");
			 }catch(Exception e) {
				 System.out.print("Exception :"+e.toString()+" was caught");
			 }finally {
				 System.out.print(" finally was executed");
			 }
			break;
		case 8:  try {
			 Exceptions2 ex = new Exceptions2();
		 
		 }catch(NegativeArraySizeException na){
			 System.out.print("Exception :"+na.toString()+" was caught");
			 Exceptions2.index();
		 }catch(IndexOutOfBoundsException na){
			 System.out.print("Exception :"+na.toString()+" was caught");
			 Exceptions2.nullp();
		 }catch(NullPointerException na){
			 System.out.print("Exception :"+na.toString()+" was caught");
		 }catch(Exception e) {
			 System.out.print("Exception :"+e.toString()+" was caught");
		 }finally {
			 System.out.print(" finally was executed");
		 }break;
		case 9:
		default:System.out.println("Wrong input ------- exiting");break;
		}
	}
	public void drawMenu() {
		System.out.println("---------EXERCISE 2------------");
		System.out.println("| 1 - Question 1 Student mark |");
		System.out.println("| 2 - Question 2 matrix opera |");
		System.out.println("| 3 - Question 3 date not done|");
		System.out.println("| 4 - Question 4 chessboard   |");
		System.out.println("| 5 - Question 5 consecutiv e |");
		System.out.println("| 6 - Question 6 exception 1  |");
		System.out.println("| 7 - Question 7 exception 2  |");
		System.out.println("-------------------------------");
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("| ENTER YOUR CHOICE           |");
		System.out.println("-------------------------------");
	}

}
