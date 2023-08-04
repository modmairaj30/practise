package practise;

public class RandomNumber {
	public static void main( String args[] )   
	{  
	int min = 200;  
	int max = 400;  
	//Generate random double value from 200 to 400   
	System.out.println("Random value of type double between "+min+" to "+max+ ":");  
	double a = Math.random()*(max-min+1)+min;   
	System.out.println(a);  
	//Generate random int value from 200 to 400   
	System.out.println("Random value of type int between "+min+" to "+max+ ":");  
	int b = (int)(Math.random()*(10-1+1)+1);  
	System.out.println(b);  
	}  
}
