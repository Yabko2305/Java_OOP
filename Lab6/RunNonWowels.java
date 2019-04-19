package Lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RunNonWowels extends Thread{
	public int nonvowels(String check)
	{   int result = 0;
		for(char i : check.toUpperCase().toCharArray())
		{ 
			if(i != 'A' && i != 'O' && i != 'E' && i != 'Y' && i != 'I' && i != 'U')
			{
				result ++;
			}
		} return result;
	}
	
	@Override
	public void run()
	{ 
		String result = "D";
		try {
			sleep(500);
			
			try {
				Scanner in = new Scanner(new File("C:\\Users\\Yabko\\Desktop\\words2.txt"));
				while(in.hasNext())
				{ 	
					String temp = in.nextLine();
					if(nonvowels(temp) <= nonvowels(result))
						result = temp;
				}
					
				System.out.println("The biggest word without non-vowels is a word : "+result);
				in.close();
			}
				catch(FileNotFoundException e)
				{
					
					e.printStackTrace();
				}
		}
		catch(InterruptedException e) {
			System.out.println("The biggest word without non-vowels is a word : "+result);
		}
		
	}
}
