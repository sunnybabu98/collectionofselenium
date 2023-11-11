package CollecionList;

import java.util.ArrayList;
import java.util.List;

public class Clearclass {

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
		
		aa1.clear();
		System.out.println(aa1);
		
		aa1.add("Sachin");//0
		
		System.out.println(aa1);
		
		
		
		
		
		
		
	}

}
