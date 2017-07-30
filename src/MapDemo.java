import java.util.HashMap;
//Created a class MapDemo
public class MapDemo {
//Main method
	public static void main(String[] args) {
		//Creating HashMap
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		//using .put method to store key and values
		hm.put(001, "Jhon");
		hm.put(002, "Sham");
		hm.put(003, "Prienc");
		hm.put(004, "Raj");
		//Using for:each loop iterate over hashmap
		for (Integer key : hm.keySet()) {
		    System.out.println(key);
		    System.out.println(hm.get(key));
		}

	}

}
 