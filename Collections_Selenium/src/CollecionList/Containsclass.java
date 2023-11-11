package CollecionList;

import java.util.ArrayList;
import java.util.List;

public class Containsclass {

	public static void main(String[] args) {
		
		
List<String> aa1 = new ArrayList<String>();
		
		aa1.add("Sachin");//0
		aa1.add("Dravid");//1
		aa1.add("Ganguly");//2
		aa1.add("Dhoni");//3
		aa1.add("Raina");//4
		aa1.add("Ifran");//5
		aa1.add("Raina");//6
		aa1.add("Jadeja");//7
		aa1.add("Raina");//8
		aa1.add("Raina");//9
		aa1.add("Raina");//10
		aa1.add("Raina");//11
		
		
		System.out.println(aa1.contains("Ifran1"));
		System.out.println(aa1.indexOf("Raina"));
		System.out.println(aa1.lastIndexOf("Raina"));
	}

}
