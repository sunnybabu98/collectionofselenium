package CollecionList;

import java.util.ArrayList;
import java.util.List;

public class Replaceclass {

	public static void main(String[] args) {
List<String> aa1 = new ArrayList<String>();
		
		aa1.add("Sachin");//0
		aa1.add("Dravid");//1
		aa1.add("Ganguly");//2
		aa1.add("Dhoni");//3
		aa1.add("Raina");//4
		aa1.add("Ifran");//5
		aa1.add("Raina1");//6
		
		System.out.println(aa1);
		
		aa1.set(5, "Patan");
		
		System.out.println(aa1);
		
		

	}

}
