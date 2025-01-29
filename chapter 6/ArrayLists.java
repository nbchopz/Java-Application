import java.util.ArrayList;

public class ArrayLists{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("john");
		list.add("chopz");
		list.add("puff puff");
		list.add("ogu");
		list.add("thief");
		
		list.add(2,"Clinton");
		
		list.set(3,"peter");
		
		for(String name : list){
			
		
				System.out.printf(list.get(3));
				
				for(String name : list){
					System.out.printf("%s%n",name);
			}		
		}
	}
}