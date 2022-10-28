package array;

public class NonPrimitiveString {

	public static void main(String[] args) {
		String n1="Gopika";
		String n2="Devi";
				
				//finding the no.of characters using length() function
				int l=n1.length();
		        System.out.println("No. of characters:"+l);
		        
		        //displaying each character
		        System.out.println("1st character is:"+n1.charAt(0));
		        System.out.println("last character:"+n1.charAt(5));
		        String fname=n1+" "+n2;
		        System.out.println("Full name:"+fname);
		        
		        //concat()
		        String fn=n1.concat(n2);
		        System.out.println("Full name is:"+fn);
		        
		        System.out.println("Uppercase :"+n1.toUpperCase());
		        System.out.println("Lowercase :"+n1.toLowerCase());
		        
		        //substring
		        System.out.println(n1.substring(2,4));
		        System.out.println(n1.substring(2));
		        
		        
		        
		

	}

}
