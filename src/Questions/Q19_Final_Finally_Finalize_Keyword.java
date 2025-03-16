package Questions;
/*
 * 1) final variable - Once the variable assigned, the value cann't be changed, it will remain constant.
   2) final method  - if a method declared as final, then that method cann't be overridden
   3) final class - we cann't use inheritance concept for final class
 */
public class Q19_Final_Finally_Finalize_Keyword {
	public static void main(String[] args) {
		//1) Final variable
		final int MARKS = 90;
		// MARKS = 100; //This will give compilation error
		System.out.println(MARKS);
		finally_Code();
	}
	// 2) Final method
	class A{
		public final void printMassage() {
			System.out.println("Welcome");
		}
	}
	
	class B extends A{
//		public void printMassage() {
//			System.out.println("Welcome_Class B");
//		} // compilation error
	}
	
	// 3) Final class
	final class x{
		public void massage() {
			System.out.println("Welcome_X");
		}
	}
	
//	class y extends x{ // This will give compilation error
//		
//	}
	
	// 4) Finally - this keyword used to create finally block after exception handling code, this block will execute every time irrespective of each time where it's execute try block or catch block
	public static void finally_Code(){
		try {
			System.out.println("Inside try block");
			throw new RuntimeException("Error");
		}
		catch(Exception e) {
			System.out.println("Inside catch block");
		}
		
		finally {
			System.out.println("Inside finally block");
		}
	}
	
	//Finalize - execute before collecting garbage(which objects are pointing to null)
}
