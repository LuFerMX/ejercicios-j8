package mx.com.bq.java.examples.se;

public class TestString {
    
    public static void main(String[] args) {
        String str1 = "beginnersbook";
        String str2 = new String("beginnersbook");
		
	/* The Java String intern() method searches the string "beginnersbook"  
	 * in the memory pool and returns the reference of it.
	 */
	String str3 = new String("beginnersbook").intern(); 
	String str4 = "beginnersbook".intern(); 
	//prints true 
	System.out.println("str1==str2: "+(str1==str2));
	System.out.println("str1==str3: "+(str1==str3));
	System.out.println("str2==str3: "+(str2==str3));
	System.out.println("str1==str4: "+(str1==str4));
	System.out.println("str3==str4: "+(str3==str4));
	System.out.println("str2==str4: "+(str2==str4));
    }
    
}
