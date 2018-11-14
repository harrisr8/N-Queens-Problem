//Roneil Harris
//Assignment2

import java.util.Stack;
import java.util.Scanner;


public class Assignment2
{
	public static void main(String[] args)
	{
		Scanner keyboard  = new Scanner(System.in);
		System.out.println("***This is an N-Queens problem solver***");
		System.out.println("Please enter the number for N:");
		int n = keyboard.nextInt();
		
		//System.out.println("There are " +  + "ways to place " + n + " Queens on an" + n + "x" + n + "chessboard");
		NQueens(n);
		
	}
	public static void NQueens(int n)
	{
		int filled = 0;	
		char[][] arr = new char[n][n];
		Stack<Integer> stack = new Stack<>(); 
		
			for(int row = 0; row < arr.length; row++)
			{
				for(int column = 0; column < arr.length; column++)
				{
					if(goodSquare(row, column, filled, stack) == true)
					{
						arr[row][column] = 'Q';
						stack.push(column);
						filled++;	
					}
					else
						arr[row][column] = '-';
				}
			}
			
			for(int i = 0; i < arr.length; i++)
			{
				for(int j = 0; j < arr.length; j++)
					System.out.print(arr[i][j]);
				System.out.println("\n");
			}
			
				
		}
		
	public static boolean goodSquare(int row, int column, int filled, Stack<Integer> stack)
	{
	
		int rdiagonal;
		int ldiagonal;
		int vertical;
		boolean result = false;
		
		if(!(stack.isEmpty()))
		   if (stack.peek() == column)   //compare current column to last queen position;
				result = false;
		
//		else if (row == filled)
//			result = false;			// can't have two queens on same row
//		
//		else if(row != filled) //found diagonal
//		{
//				vertical = row - filled;
//				rdiagonal = stack.peek() + vertical;
//				ldiagonal = stack.peek() - vertical;
//				
//				if((column == rdiagonal) || (column == ldiagonal))
//					result = false;
//				
				
		   else result = true;	
		//}
			
		
		
		return result;
	}
}
