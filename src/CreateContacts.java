
public class CreateContacts {

	public static void main(String[] args) {
				//instantiate contact class
				Contact con1 = new Contact();
				     //reference or object reference
				
				//print the default values
				
				  System.out.println(con1.contactId);
			      System.out.println(con1.firstName);
			      System.out.println(con1.mobileNo);
			      System.out.println(con1.email);
			      System.out.println(con1.company);
			      
				//initializing the data members
				
			    con1.contactId=1;
				con1.firstName="Sravya";
				con1.mobileNo=1234567890L;
				con1.email="sravya1234@gmail.com";
				con1.company="mindtree";
				
				//access the data members or read the data
		    
			  System.out.println(con1.contactId);
		      System.out.println(con1.firstName);
		      System.out.println(con1.mobileNo);
		      System.out.println(con1.email);
		      System.out.println(con1.company);
		      		     
		}


	}


