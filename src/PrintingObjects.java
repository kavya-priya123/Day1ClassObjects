
public class PrintingObjects {

	public static void main(String[] args) {
		
		Contact3 contact = new Contact3(2,"manavi",3864478295L,"manavi@gmail.com","nasdaq");
		 
		//Reflection API-->code which runs behind our code
		System.out.println(contact);
		System.out.println(contact.getClass().getTypeName());
		

	}

}
