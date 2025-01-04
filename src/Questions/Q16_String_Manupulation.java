package Questions;

public class Q16_String_Manupulation {
	public static void main(String[] args) {
		String str  = "The rain have started here";
		String str1  = "The Rain Have Started Here";
		
		//Printing the length of the string
		System.out.println("The string length is : "+str.length());
		
		//Printing the 5'th index character 
		System.out.println("5'th index character : "+str.charAt(5));
		
		//Printing the index of the 's' character 
		System.out.println("Index of 1st occurence of s is : "+str.indexOf('s'));
		
		//Printing the index of the 2nd 's' character
		System.out.println("Index of 2nd pccurence of s : "+str.indexOf('s',str.indexOf('s')+1));
		
		//String comparison
		System.out.println(str.equals(str1)); //false
		System.out.println(str.contentEquals(str1)); //true
		
		//Substring
		System.out.println("Substring : "+str.substring(0,8));
		
		//trim
		String s  =" Hello World ";
		System.out.println("Trim : "+s.trim());
	
		//Replace 
		String date = "12-01-2025";
		System.out.println("After replace : "+date.replace("-","/"));
		
		//Split
		String text = "Hello_world_Test_Selenium";
		System.out.println("After Split 0'th element: "+text.split("_")[0]);
		
		//concat
		String s1 = "Hello";
		String s2 = " world";
		System.out.println("After concat : "+s1.concat(s2));
		int x = 100;
		int y = 200;
		System.out.println("s1+s2 :"+s1+s2);
		System.out.println("x+y : "+x+y);
		System.out.println("s1+s2+x+y : "+s1+s2+x+y);
		System.out.println("x+y+s1+s2 : "+x+y+s1+s2);
		System.out.println("s1+s2+(x+y) : "+s1+s2+(x+y));
		
	}
}
