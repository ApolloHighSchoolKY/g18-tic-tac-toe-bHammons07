//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));

		//Read how many times you should read
		int time = file.nextInt();
		//System.out.println(time);
		file.nextLine();
		
		//TicTacToe only wants file.nextLine()
		TicTacToe ttt;
		for(int i = 0; i < time; i++)
		{
			ttt = new TicTacToe(file.nextLine());
			System.out.println(ttt);
		}
		//TicTacToe ttt = 
		//System.out.println(file.nextLine());
		//System.out.println(ttt);

		//Print the game(TicTacToe)
		//System.out.println(ttt);



	}
}



