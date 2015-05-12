import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Thesaurus {
	public Set<String> listToSet(ArrayList<String> list){
		Set<String> set = new HashSet<String>();
		for(String s : list){set.add(s);}
		return set;
	}
	public HashSet<String> intersection(HashSet<String> setA, Set<String> setB) {
	    HashSet<String> tmp = new HashSet<String>();
	    for (String x : setA)
	      if (setB.contains(x))
	        tmp.add(x);
	    return tmp;
	  }
	public HashSet<String> union1(HashSet<String> seti, HashSet<String> setj) {
	    HashSet<String> tmp = new HashSet<String>(seti);
	    tmp.addAll(setj);
	    return tmp;
	  }
	public HashSet<String> union(HashSet<String> seti, HashSet<String> setj){
		HashSet<String> retval = new HashSet<String>();
		for(String i : seti){retval.add(i);}
		for(String j : setj){retval.add(j);}
		return retval;
	
	}
	public String stringMaker(ArrayList<String> words){
		String retval = "";
		for(String word:words){
			if(words.indexOf(word)!=words.size()-1){retval += word + " ";}
			else{retval+=word;}
			}
		return retval;	
		}
	
    public boolean combine_entries(ArrayList<ArrayList<String>> listed){
    	for(ArrayList<String> i : listed){
    		int idex = listed.indexOf(i);
    		HashSet<String> seti = new HashSet<String>(listToSet(i));
    		for(ArrayList<String> j : listed){if(i!=j){
    			HashSet<String> setj = new HashSet<String>(listToSet(j));
    			int jdex = listed.indexOf(j);
    			Set<String> intersection = new HashSet<String>(intersection(seti,setj));
    			if(intersection.size()>=2){
    				HashSet<String> temporary = new HashSet<String>(union1(seti,setj));
    				listed.remove(i);
    				listed.remove(j);
    				ArrayList<String> addval = new ArrayList<String>(temporary);
    				Collections.sort(addval);
    				listed.add(addval);
    				return true;
    			}
    		}
    		}
    	}
    return false;
    }
	public String[] edit(String[] entry) {
          ArrayList<ArrayList<String>> listed = new ArrayList<ArrayList<String>>();
          for(String i : entry){
        	  ArrayList<String> addval = new ArrayList<String>(Arrays.asList(i.split(" ")));
        	  listed.add(addval);}
          int counter = 0;
          for(ArrayList<String> i : listed){
        	  if(i.size() < 2){counter+=1;}}
          if(counter==listed.size()){return entry;}
          boolean combined = true;
          while(combined==true){
        	  combined = combine_entries(listed);}
        	  for(ArrayList<String> i : listed){
        		  Collections.sort(i);}
        	  HashSet<String> set1 = new HashSet<String>();
        	  for(ArrayList<String> i : listed){
        		  String j = stringMaker(i);
        		  set1.add(j);}
        	  ArrayList<String> retval = new ArrayList<String>();
        	  for(String s : set1){
        		  retval.add(s);}
        	  Collections.sort(retval);
        	  String[] returnvalue = new String[retval.size()];
        	  returnvalue = retval.toArray(returnvalue);
        	  return returnvalue;
        		  
        	  
        	  
        		 
        	  }
	}
      
  