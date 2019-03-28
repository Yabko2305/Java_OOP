package Lab_2;

import java.util.ArrayList;
import java.lang.Iterable;
import java.util.Iterator;
import java.io.Serializable;



public class Container implements Iterable<String> , Serializable{
	private static final long serialVersionUID = 1L;
	ArrayList<String> mainList = new ArrayList<String>();
	
	Container()
	{
		
	}
	Container(String input)
	{
		String[] inputArr = input.split(" ");
		for(int i = 0 ; i < inputArr.length; i++)
		{
			mainList.add(inputArr[i]);
		}
	}
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		for(int i = 0 ; i< mainList.size(); i++)
		{
			if(i == 0)
				builder.append(mainList.get(i));
			else
			builder.append(" ").append(mainList.get(i));

		}
		
		return builder.toString();
	}
	
	public String get(int possition)
	{
		return mainList.get(possition);
	}
	public void add(String string)
	{
		mainList.add(string);
	}
	
	public void clear()
	{
		mainList = new ArrayList<String>();
	}
	
	boolean remove(String string)
	{
		for(int i = 0 ; i < mainList.size(); i++)
		{
			if(mainList.get(i).equals(string))
			{
				mainList.remove(i);
				return true;
			}
		}
		return false;
	}
	
	Object[] toArray()
	{
		String[] string = new String[mainList.size()];
		for(int i = 0 ; i < mainList.size(); i++)
			string[i] = mainList.get(i);
		
		return string;
	}
	
	int size()
	{
		return mainList.size();
	}
	
	boolean contains(String string)
	{
		for(int i = 0 ; i < mainList.size(); i++)
		{
			if(mainList.get(i).equals(string))
			{
				return true;
			}
		}
		return false;
	}
	
	boolean ContainsAll(Container cont)
	{
		if(cont.mainList.size() == mainList.size())
		{
			for(int i = 0 ; i < mainList.size(); i++)
			{
			if(!cont.mainList.get(i).equals(mainList.get(i)))
					{
					return false;
					}
			}

		}
		return false;
	}
	
	    @Override
	    public Iterator<String> iterator() {
	        Iterator<String> it = new Iterator<String>() {

	            private int currentIndex = 0;

	            @Override
	            public boolean hasNext() {
	                return currentIndex < mainList.size();
	            }

	            @Override
	            public String next() {
	            	currentIndex++;
	                return mainList.get(currentIndex-1);
	            }

	            @Override
	            public void remove() {
	                throw new UnsupportedOperationException();
	            }
	        };
	        return it;
	    }
	
	
}	

	