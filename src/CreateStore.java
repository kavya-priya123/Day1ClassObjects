
public class CreateStore {

	public static void main(String[] args) {
		
		StoreContacts store = new StoreContacts();
		
		Contact3 con1 = new Contact3(1,"Mounika",8384737893L,"mounika345@ghostmail.com","virtusa");
		Contact3 con2 = new Contact3(2,"Harika",3894843483L,"harika123@gmail.com","dream");
		Contact3 con3 = new Contact3(3,"Mika",4590847938L,"mika45@gmail.com","visa");
		
		Contact3 contact3Array[] = new Contact3[3];
		
		contact3Array[0] = con1;
		contact3Array[1] = con2;
		contact3Array[2] = con3;
		
		store.setContacts(contact3Array);
		System.out.println(store);
		
		Contact3 contacts[] = store.getContacts();
		
		for(Contact3 contact:contacts) {
			
			System.out.println(contact);
			
		}

	}

}
