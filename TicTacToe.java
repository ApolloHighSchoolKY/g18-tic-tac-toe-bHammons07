//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[3][3];
		mat[0][0] = 'X';
		mat[0][1] = 'O';
		mat[0][2] = 'O';
		mat[1][0] = 'X';
		mat[1][1] = 'O';
		mat[1][2] = 'X';
		mat[2][0] = 'X';
		mat[2][1] = 'X';
		mat[2][2] = 'O';
		


	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		int pos = 0;
		char spot = ' ';
		//Row major order happens here
		
		for(int row = 0; row < mat.length; row++)
		{
			for(int col = 0; col < mat[row].length; col++)
			{
				if(game.charAt(pos) == 'X')
				{
					spot = 'X';
					mat[row][col]=spot;
				}
				else
				{
					spot = 'O';
					mat[row][col]=spot;
				}
				//mat[row][col]=spot;
				pos++;
			}
		}
	
		
	}

	public String getWinner(String game)
	{
		String victor = "";
		// 8 normal outcomes
		//X X X
		//Tranitive property a=b and b=c then a=c
		//letter if transitive propery is true
		//9 level if-statement
		
		if(game.charAt(0)==(game.charAt(1))&&(game.charAt(1)==(game.charAt(2))))
		{
			victor = game.charAt(0) + " wins Horizontally";
		}
		else if(game.charAt(3)==(game.charAt(4))&&(game.charAt(4)==(game.charAt(5))))
		{
			victor = game.charAt(3) + " wins Horizontally";
		}
		else if(game.charAt(6)==(game.charAt(7))&&(game.charAt(7)==(game.charAt(8))))
		{
			victor = game.charAt(6) + " wins Horizontally";
		}
		else if(game.charAt(0)==(game.charAt(3))&&(game.charAt(3)==(game.charAt(6))))
		{
			victor = game.charAt(0) + " wins Vertically";
		}
		else if(game.charAt(1)==(game.charAt(4))&&(game.charAt(4)==(game.charAt(7))))
		{
			victor = game.charAt(1) + " wins Vertically";
		}
		else if(game.charAt(2)==(game.charAt(5))&&(game.charAt(5)==(game.charAt(8))))
		{
			victor = game.charAt(2) + " wins Vertically";
		}
		else if(game.charAt(0)==(game.charAt(4))&&(game.charAt(4)==(game.charAt(8))))
		{
			victor = game.charAt(0) + " wins Diagonally";
		}
		else if(game.charAt(2)==(game.charAt(4))&&(game.charAt(4)==(game.charAt(6))))
		{
			victor = game.charAt(2) + " wins Diagonally";
		}
		else
			victor = "cat's game - no winner!";
		//victor = "X wins Horizontally";

		//X X X O O X X O O
		//0 1 2 3 4 5 6 7 8
		

		return "" + victor;
	}

	public String toString()
	{
		String output="";

		for(int row = 0; row < mat.length; row++)
		{
			for(int col = 0; col < mat[row].length; col++)
			{
				output+=mat[row][col];
				
			}
			output+="\n";
		}
		
		output+=TicTacToe.getWinner();
		//output+="\n";
		

		return output+"\n\n";
	}
}