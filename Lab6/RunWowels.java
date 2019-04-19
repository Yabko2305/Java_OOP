package Lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RunWowels extends Thread{
	public int vowels(String check)
	{   int result = 0;
		for(char i : check.toUpperCase().toCharArray())
		{ 
			if(i == 'A' || i == 'O' || i == 'E' || i == 'Y' || i == 'I' || i == 'U')
			{
				result ++;
			}
		} return result;
	}
	
	@Override
	public void run()
	{ 
		String result = "";
		try {
			sleep(500);
			
			try {
				Scanner in = new Scanner(new File("C:\\Users\\Yabko\\Desktop\\words2.txt"));
				while(in.hasNext())
				{ 	
					String temp = in.nextLine();
					if(vowels(temp) >= vowels(result))
						result = temp;
				}
					
				System.out.println("The biggest num of vowels is in a word : "+result);
				in.close();
			}
				catch(FileNotFoundException e)
				{
					e.printStackTrace();
				}
		}
		catch(InterruptedException e) 
		{
			System.out.println("The biggest num of vowels is in a word : "+result);
		}
		
	}
}
