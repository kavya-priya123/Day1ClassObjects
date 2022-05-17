
public class CreateContacts2 {

	public static void main(String[] args) {
				//instantiate contact class
				Contact2 con1 = new Contact2();
				     //reference or object reference
				
				//print the default values
				
				  System.out.println(con1.getContactId());
			      System.out.println(con1.getFirstName());
			      System.out.println(con1.getMobileNo());
			      System.out.println(con1.getEmail());
			      System.out.println(con1.getCompany());
			      
				//initializing the data members
				
			    con1.setContactId(1);
				con1.setFirstName("Sravya");
				con1.setMobileNo(1234567890L);
				con1.setEmail("sravya1234@gmail.com");
				con1.setCompany("mindtree");
				
				//access the data members or read the data
		    
			  System.out.println(con1.getContactId());
		      System.out.println(con1.getFirstName());
		      System.out.println(con1.getMobileNo());
		      System.out.println(con1.getEmail());
		      System.out.println(con1.getCompany());
		      		     
		}


	}


