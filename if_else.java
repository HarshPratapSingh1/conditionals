
public class if_else {
  public static void main (String []args)
  {
	  int a = 10;
	  int b = 14;
	  int c = 18;
	  
	  boolean result = a==b||b<=c||a>c; //false+true+false=true
	  boolean result2 = a<b&&b>c&&c>a;  //true+false+true=false
	 
	  
	  System.out.println(result);
	  System.out.println(result2);
	  System.out.println(!true);
	  
  }
}
