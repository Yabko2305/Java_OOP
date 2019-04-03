package Lab4;


public class DomainClient{

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
	gender = null;
	number = 0;
	regDay = null;
	name = null;
	weight = 0;
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
}
