package CollecionList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iteratorclass {

	public static void main(String[] args) {
		
		List<String> ipl = new ArrayList<String>();
		
		ipl.add("CSK");
		ipl.add("RCB");
		ipl.add("KKR");
		ipl.add("MI");
		
		//System.out.println(ipl);
		
		System.out.println("Iterator with Forward Direction");
		
		ListIterator<String> sitr = ipl.listIterator();
		
		while(sitr.hasNext())
		{
			
			System.out.println(sitr.next());
		}
		
		/*int i = 30;
		
		while(i>20)  //condition
		{
			System.out.println(i);
		
		i--;
		
		}*/
		
		System.out.println("Iterator with Backward Direction");
		
		while(sitr.hasPrevious())
		{
			
			System.out.println(sitr.previous());
		}
		
		
		
		
	}

}
