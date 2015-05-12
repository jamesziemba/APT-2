import java.util.HashMap;
import java.util.Map;


public class BigWord {
      public String most(String[] sentences) {
    	  Map<String, Integer> myMap = new HashMap<String, Integer> ();
    	  for(String value : sentences){
    		  String[] temp = value.toLowerCase().split(" ");
    		  for(String val : temp){
    			 if(myMap.get(val)== null){
    			  myMap.put(val, 0);}
    			 else{myMap.put(val, myMap.get(val) + 1);}}}
    	  int max = 0;
    	  String retval = "";
    	  for (Map.Entry<String, Integer> entry : myMap.entrySet())
    	  { 
    	     if(entry.getValue() > max){max = entry.getValue();retval = entry.getKey();}
    	  }
    	  return retval;
	 
    				 
    			 }
    		  

    		  
    	  }
      
  