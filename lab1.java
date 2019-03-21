import java.util.Scanner;

public class lab1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner on = new Scanner(System.in);
		String input= null;
		int lng = 0;
		char[] result = null;
		boolean help = false;
		boolean debug = false;
		while(true)
		{
			if(args!= null)
			{
			for(String s : args)
			{
				if(s.equals("-help"))
					help = true;
				
				if(s.equals("-debug"))
					debug = true;
				
			}
			if(help == true)
			{
				System.out.println("Author : Yaroslav Zhyhailo");
				System.out.println("Remover all words with the defined length and ñoncontant letters at the beginning");
				System.out.println("There are several work mods :");
				System.out.println("1. insert the string");
				System.out.println("User can insert his string in");
				System.out.println("2. print the string");
				System.out.println("String , inserted by user will be printed out");
				System.out.println("3. calculate");
				System.out.println("The program will calculate the result");
				System.out.println("4. show the result");
				System.out.println("The result will be printed out");
				System.out.println("5. close the program");
				System.out.println("The program will close");
				System.out.println("Do you want to continue? (print 'Yes' or 'No')");
				String kro = in.nextLine();
				if(kro.equals("Yes"))
				{
					args = null;
				}
				else
				{
					args = null ; 
					in.close();
					on.close();
					return;
				}
			}
			}
			System.out.println("Choose what to do");
			System.out.println("1. insert the string");
			System.out.println("2. print the string");
			System.out.println("3. calculate");
			System.out.println("4. show the result");
			System.out.println("5. close the program");
			int check = on.nextInt();
			if(check == 1) {
				System.out.println("Print the string :");
			input = in.nextLine();
			if(debug == true)
				System.out.println("String inserted : ' " + input +"'");
				System.out.println("Please insert the length of the words u wish to delete : ");
			
			lng = on.nextInt();
			if(debug == true)
				System.out.println("Length inserted : " + lng);
			}
			else if(check == 2) {
				if(debug == true)
			 System.out.println("Printing....");
				System.out.println(input);   }
			else if(check == 3)
			{   result = calc(input , lng , debug); 
				
			}
			else if(check == 4)
			{  
				if(debug == true)
				System.out.print("The result is : ");
				
				System.out.println(result);   }
			else
			{
				if(debug == true)
					System.out.println("Closing the program ...");
			in.close();
			on.close();
			return;
			}
			
		
		}
		
		
	}
	public static char[] calc(String input, int lng , boolean debug)
	{int chars = 0;
	
	for(int i = 0 ; i < input.length() ; i++)
	{
		if(input.charAt(i)==' ')
		{
			chars++;
			continue;
		}
		boolean ch =check(input , i , lng);
		if(ch == false)
		{
		 if(debug == true)
			 System.out.println("The word which starts at char ¹"+(i+1)+" will be deleted");
			while(i < input.length() && input.charAt(i) != ' ')
			{
				i++;
			}	
			i--;
		}
		else if(ch == true)
		{
			if(debug == true)
				 System.out.println("The word which starts at char ¹"+(i+1)+" will be saved");
			while(i < input.length() && input.charAt(i) != ' ')
			{
				i++;
				chars++;
			}	
			i--;
		}
	}
	if(debug == true)
		 System.out.println("The length of final string with ' ' symbols is : "+chars);
	char[] result = new char[chars];
	 for(int i = 0,j = 0 ; i < input.length(); i++)
	 {
		 if(input.charAt(i)==' ')
			{
				result[j] = input.charAt(i);
				j++;
				continue;
			}
			boolean ch =check(input , i , lng);
			if(ch == false)
			{
				while(i < input.length() && input.charAt(i) != ' ')
				{
					i++;
				}	
				i--;
			}
			else if(ch == true)
			{
				while(i < input.length() && input.charAt(i) != ' ')
				{
					
					result[j] = input.charAt(i);
					j++;
					i++;
				}	
				i--;
			}
			
		 
	 }
	 	int i = 0 ;
	 	int chr = chars;
		while(i < chars&&result[i]==' ')
		{
			i++;
			chr--;
		}
		for(int j = i  ; j < chars ; j++)
		{
			if(result[j]==' ' && result[j-1]== ' ')
				chr--;
		}
		char[] res2 = new char[chr];
		for(int j = i , k =0 ; j < chars ; j++)
		{
			if(result[j] == ' ' && result[j-1] ==' ')
			{
				
			}
			else
			{
				res2[k] = result[j];
				k++;
			}
		}
		if(debug == true)
			 System.out.println("The length of final string without symbols is : "+chr);
	 	
	 	return res2;
	}
	public static boolean check(String input ,int i , int lng)
	{
		
		if(!isWel(input.charAt(i)) ) {
			return true;}
		else
		{
			while(i < input.length() && input.charAt(i) != ' ')
			{
				lng--;
				i++;
			}
		}
		
		if(lng == 0)
			return false;
		
		return true;
	}
	public static boolean isWel(char i)
	{
		if(i == 'a'||i == 'A'||i == 'e'||i=='E'||i=='i'||i=='I'||i=='o'||i=='O'||i=='u'||i=='U')
			return false;
		else
			return true;
			
			
	}
}
