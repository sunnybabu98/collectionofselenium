package CollecionList;

import java.util.ArrayList;
import java.util.List;

public class Sublistclass {

	public static void main(String[] args) {
List<String> aa1 = new ArrayList<String>();
		
		aa1.add("sachin");//0
		aa1.add("dravid");//1
		aa1.add("Ganguly");//2
		aa1.add("DHONI");//3
		aa1.add("RAINA");//4
		aa1.add("Ifran");//5
		System.out.println(aa1);
		
		System.out.println(aa1.subList(2, 6));

	}

}
