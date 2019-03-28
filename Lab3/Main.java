package Lab3;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import java.util.Scanner;
class Menu
	{
	int k;
	public int execute(Scanner in)
	{
		System.out.println("Choose what you want to do:");
		System.out.println("1. Create new user");
		System.out.println("2. Change gender of the user");
		System.out.println("3. Change number of the user");
		System.out.println("4. Change registration date");
		System.out.println("5. Change name");
		System.out.println("6. Change weight");
		System.out.println("7. get gender");
		System.out.println("8. get number");
		System.out.println("9. get registration date");
		System.out.println("10. get name");
		System.out.println("11. get weight");
		System.out.println("12. Print to the file");
		System.out.println("13. Get from the file");
		System.out.println("14. Change the user");
		System.out.println("15 . Close the program");
		k = in.nextInt();
		
		return k;
	}
	
	}
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<DomainClient> list = new ArrayList<DomainClient>();
		int user = 0;
		Scanner in = new Scanner(System.in);
		Scanner on = new Scanner(System.in);
		Menu main = new Menu();
		
		while(true)
		{
		int k = main.execute(in);
		
		switch (k)
		{
		case 1 :
			list.add(new DomainClient());
		break;
		
		case 2 :
			System.out.println("Type the gender pls: ");
				list.get(user).setGender(on.nextLine());	
		break;
		
		case 3 :
			System.out.println("Type the number pls: ");
			list.get(user).setNumber(in.nextInt());
		break;
		
		case 4 : 
			System.out.println("Type reg date pls: ");
			list.get(user).setRegDay(on.nextLine());
		break;
		
		case 5 :
			System.out.println("Type name pls: ");
			list.get(user).setName(on.nextLine());
		break;
		
		case 6 :
			System.out.println("Type weight pls: ");
			list.get(user).setWeight(in.nextInt());
		break;
		
		case 7: 
			System.out.println(list.get(user).getGender());
		break;
		
		case 8 : 
			System.out.println((list.get(user).getNumber()));
		break;
		
		case 9 : 
			System.out.println(list.get(user).getRegDay());
		break;
		
		case 10 :
			System.out.println(list.get(user).getName());
		break;
		
		case 11 : 
			System.out.println(list.get(user).getWeight());
		break;
		case 12:
			XMLEncoder encoder;
			try {
				encoder = new XMLEncoder(
				           new BufferedOutputStream(
				           new FileOutputStream(PathGetter.getPath(in).toString())));
				encoder.writeObject(list);
				encoder.close(); 
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		break;
		case 13 :
			XMLDecoder decoder = new XMLDecoder(
				    new BufferedInputStream(
				    new FileInputStream(PathGetter.getPath(in).toString())));

				list =(ArrayList<DomainClient>) decoder.readObject();
				decoder.close();
				break;
		
		case 14 : 
			System.out.println("Choose the user from 0 to "+(list.size()-1));
			user = in.nextInt();
		break;
		case 15 : 
			in.close();
			on.close();
			return;
		
		}
		}
	
}}
