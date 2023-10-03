package mapping;
import java.util.HashMap;
import java.util.HashSet;
public class Hashmap  { 
      public static void main(String[]args) {
    	  //Hashmap
    	  HashMap<String,String> country = new HashMap<String,String>();
    	  country.put("Japan", "Tokyo");
    	  country.put("France", "Paris");
    	  country.put("England", "London");
    	  System.out.println(country);
    	  System.out.println(country.get("France"));
    	  
    	  //HashSet
    	  HashSet<String>city = new HashSet<String>();
    	  city.add("Chennai");
    	  city.add("Hyderabad");
    	  city.add("Mumbai");
    	  System.out.println(city.contains("Chennai"));
      }
}
