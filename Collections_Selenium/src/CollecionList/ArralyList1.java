package CollecionList;

import java.util.ArrayList;
import java.util.List;

public class ArralyList1 {

	public static void main(String[] args) {
		List a1 = new ArrayList();
		
		a1.add(10);
		a1.add("Hello");
		a1.add(123.32);
		a1.add("Hyderabad");
		a1.add(true);
		a1.add("True");
		a1.add("Hello");
		a1.add("");
		a1.add(null);
		
		
		List<String> a12 = new ArrayList<String>();
		
		a12.add("RRR");
		a12.add("Ram Charan");
		a12.add("NTR");
		a12.add("Super Hit");
		
		
		//System.out.println(a1);
		
		//System.out.println(a12);
		
		//int sizeofstringarraylist = a12.size();
				
				//System.out.println(sizeofstringarraylist);
				
				for (int i =0; i<a12.size(); i++)
				{
					System.out.println(a12.get(i));
				}
				System.out.println("-------------------------------");
				for (String i :a12)
				{
					System.out.println(i);
				}
		
		
		
		
		
			
		
		
		
		

	}

}
