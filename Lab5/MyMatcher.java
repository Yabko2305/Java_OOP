package Lab5;

import java.util.regex.Pattern;

public class MyMatcher {
 
  static boolean genderCheck(String in)
  {
	 
	  if(Pattern.matches("Male" , in ) || Pattern.matches("Female" , in))
		  return true;
	  else return false;
  }
  static boolean numberCheck(String in)
  {
	  if(Pattern.matches("\\d{1,}" ,in))
	  return true;
	  else
		  return false;
  }
  static boolean regDateCheck(String in)
  {
	  if(Pattern.matches("^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$", in))
		  return true;
	  else
		  return false;
  }
  static boolean nameCheck(String in)
  {
	  if(Pattern.matches("^\\D{1,}$" , in))
			  return true;
	  else 
		  return false;
  }
  static boolean weightCheck(String in)
  {
	  if(Pattern.matches("^\\d{1,}$",in))
		  return true;
	  else
		  return false;
  }
}
