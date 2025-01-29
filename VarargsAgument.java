public class VarargsArgument {
    public static void main(String[] args) {
		add(6,20,3,5,7);
	
	
	
    public static void add(int...numbers){
	    for(int number : numbers){
		    System.out.printf("%d%n",numbers);
	    }
    }
}
	
	
	
