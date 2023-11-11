package CollecionList;

import java.util.ArrayList;
import java.util.List;

public class Equalsclass {

	public static void main(String[] args) {
		
		
List<String> aa1 = new ArrayList<String>();
		
		aa1.add("Sachin");//0
		aa1.add("Dravid");//1
		aa1.add("Ganguly");//2
		aa1.add("Dhoni");//3
		aa1.add("Raina");//4
		aa1.add("Ifran");//5
		
		
		System.out.println(aa1);
		
List<String> aa2 = new ArrayList<String>();
		
		aa2.add("Sachin");//0
		aa2.add("Dravid");//1
		aa2.add("Ganguly");//2
		aa2.add("Dhoni");//3
		aa2.add("Raina");//4
		aa2.add("Ifran");//5
		aa2.add("Jadeja");//5
		
		System.out.println(aa2);
		
		System.out.println(aa1.equals(aa2));

	}

}
