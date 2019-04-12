package application;

import java.io.Serializable;

public class DomainClient implements Serializable {

	private static final long serialVersionUID = 1L;
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
	
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public void setNumber(String number) {
	this.number = number;}
	
	public void setRegDay(String regDay)
	{
		this.regDay = regDay;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setWeight(String weight)
	 {
		 this.weight = weight;
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