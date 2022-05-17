
public class ComparingObjects {

	public static void main(String[] args) {
	//compare an apple with an apple
		
		Contact2 contact1 = new Contact2();
		//JVM has two memory locations Heap(Objects&Threads) and Stack(Method Calls&Local/Auto Variables)
		Contact2 contact2 = new Contact2();
		//== is equals operator which is used for checking object references in memory
		boolean result = (contact1 == contact2);
		System.out.println(result);
		
		result = (contact1.hashCode() == contact2.hashCode());
		System.out.println(result);
			
		Contact2 contact3 = contact1;
		
		result = (contact1 == contact3);
		System.out.println(result);
		
		result = (contact3.hashCode() == contact1.hashCode());
		System.out.println(result);
		
	}
	
}	
		
		
		
		
	

