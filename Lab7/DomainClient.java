package Lab7;

import java.io.Serializable;
import java.util.Comparator;

public class DomainClient implements Serializable {

	private static final long serialVersionUID = 1L;
	private String gender;
	private int number;
	private String regDay;
	private String name;
	private int weight;
	
	
	
	public DomainClient(String name)
	{
		this.name = name;
	}
	public DomainClient()
	{
	
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public void setNumber(int number) {
	this.number = number;}
	
	public void setRegDay(String regDay)
	{
		this.regDay = regDay;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setWeight(int weight)
	 {
		 this.weight = weight;
	 }
	
	 
	public String getGender()
	 {
		 return gender;
	 }
	 public int getNumber()
	 {
		 return number;
	 }
	 
	 public String getRegDay()
	 {
		return regDay;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public int getWeight()
	 {
		 return weight;
	 }
	 
	 public static Comparator<DomainClient> CompareNumber = new Comparator<DomainClient>()
			 {
		 		@Override
		 		public int compare(DomainClient o1 ,DomainClient o2)
		 		{
		 			return o1.number > o2.number ? +1 : o1.number < o2.number ? -1 : 0;
		 		}
			 };

			 public static Comparator<DomainClient> CompareName = new Comparator<DomainClient>()
			 {
		 		@Override
		 		public int compare(DomainClient o1 ,DomainClient o2)
		 		{
		 			return o1.name.compareTo(o2.name);
		 		}
			 };
			 
			 public static Comparator<DomainClient> CompareWeight = new Comparator<DomainClient>()
			 {
		 		@Override
		 		public int compare(DomainClient o1 ,DomainClient o2)
		 		{
		 			return o1.weight > o2.weight ? +1 : o1.weight < o2.weight ? -1 : 0;
		 		}
			 };
			 
}