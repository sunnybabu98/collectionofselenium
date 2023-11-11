package CollecionList;

import java.util.ArrayList;
import java.util.List;

public class Addallclass {

	public static void main(String[] args) {
	
		
		List<String> aa1 = new ArrayList<String>();
		
		aa1.add("Sachin");//0
		aa1.add("Dravid");//1
		aa1.add("Ganguly");//2
		aa1.add("Dhoni");//3
		aa1.add("Raina");//4
		aa1.add("Ifran");//5
		System.out.println("Before adding any Player" +aa1);
		
		aa1.add(2, "Kholi");
		
		System.out.println("After adding any Player" +aa1);
		
			
		
		List<String> aa2 = new ArrayList<String>();
		
		aa2.add("Ricky");//0
		aa2.add("Tom");//1
		aa2.add("Hussey");//2
		aa2.add("Warner");//3
		aa2.add("Varan");//4
		
		System.out.println("Before Adding aa1 to aa2" +aa2);
		
		
		aa2.addAll(aa1);
		
		System.out.println("After Adding aa1 to aa2" +aa2);
		
		for (String a : aa2)
		{
			System.out.println(a);
		}
		
		aa2.add(2, "Clarke");
		
		System.out.println("---------------------------");
		
		
		for (String a : aa2)
		{
			System.out.println(a);
		}
		

		
		
		
		
		
		
		
		
		

	}

}
