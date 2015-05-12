import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;



public class PizzaToppings

{
	public int whichToppings(String[] menu, String[] favorites){
		Set<String> mySet = new HashSet<String>(Arrays.asList(menu));
		String[] newMenu = mySet.toArray(new String[mySet.size()]);
		ArrayList<String[]> newFaves = new ArrayList<String[]>();
		for(int i=0;i<favorites.length;i++){
			String[] temp = favorites[i].split(" ");newFaves.add(temp);
		}
		int count = 0;
		int retval = -1;
		for(String[] fave : newFaves){
			int counter = 0; 
			int checker = fave.length;
			for(String ingredient : fave){
				for(String choice : newMenu){
					if(ingredient.equals(choice)){
						counter+=1;}
				}
			}
			if(counter > count && counter >=checker){
				count = counter;retval = newFaves.indexOf(fave);
				return retval;}
		}
		return retval; 
	}

	public static void main(String[] args){
		PizzaToppings myTest = new PizzaToppings();
		System.out.println(myTest.whichToppings(new String[]{"ham", "cheese"},new String[]{"ham cheddar", "ham ham"}));

	}}

