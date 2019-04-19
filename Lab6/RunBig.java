package Lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RunBig extends Thread {
	String result= "";
	
		@Override
		public void run()
		{
			try {
				sleep(500);
				try {
					Scanner in = new Scanner(new File("C:\\Users\\Yabko\\Desktop\\words.txt"));
					while(in.hasNext())
					{ 	
						String temp = in.nextLine();
						if(temp.length() > result.length())
							result = temp;
					}
						
					System.out.println("The biggest word is : "+result);
					in.close();
				}
					catch(FileNotFoundException e)
					{
						e.printStackTrace();
					}
			}
			catch(InterruptedException e) {
				System.out.println("The biggest word is : "+result);
			}
			
		
		}
	

}
