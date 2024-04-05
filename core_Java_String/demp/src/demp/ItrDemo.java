package demp;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ItrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List l=new ArrayList();
		
		l.add(10);
		l.add("depak");
		l.add("rahul");
		
		ListIterator li=l.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
System.out.println("----------------------");
		

while(li.hasPrevious())
{
	System.out.println(li.previous());
	
}

//li.add(100);
//System.out.println(l);

li.set(100);
System.out.println(l);


		
	}

}
