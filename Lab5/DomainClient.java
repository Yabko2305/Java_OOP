package Lab5;


public class DomainClient{

	private String gender;
	private String number;
	private String regDay;
	private String name;
	private String weight;

	
	public DomainClient(String name)
	{
		this.name = name;
	}
	public DomainClient()
	{
	gender = null;
	number = null;
	regDay = null;
	name = null;
	weight = null;
	}
	
	public void setGender(String gender)
	{
		if(MyMatcher.genderCheck(gender))
		this.gender = gender;
		else
			System.out.println("Wrong arguments!");
	}
	public void setNumber(String number) {
		if(MyMatcher.numberCheck(number))
	this.number = number;
		else
			System.out.println("Wrong arguments!");
		}
	
	public void setRegDay(String regDay)
	{
		if(MyMatcher.regDateCheck(regDay))
		this.regDay = regDay;
		else
		System.out.println("Wrong arguments!");
	}
	public void setName(String name)
	{
		if(MyMatcher.nameCheck(name))
		this.name = name;
		else
		System.out.println("Wrong arguments!");	
	}
	public void setWeight(String weight)
	 {
		if(MyMatcher.weightCheck(weight))
		 this.weight = weight;
		else
			System.out.println("Wrong arguments!");	
	 }
	
	 
	public String getGender()
	 {
		 return gender;
	 }
	 public String getNumber()
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
	 public String getWeight()
	 {
		 return weight;
	 }
}
