/**
 * A text-based user interface for adding contacts, retrieving contacts, removing contacts, and modifying contacts - SS
 */
import java.util.Scanner;

public class ContactListUI {
	
	/**
	 * Main program logic - SS
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ContactList contact_list = new ContactList();
		Contact contact = new Contact();
		String user_input;
		
		System.out.println("Welcome message and instructions will go here...");
		
		while (true){ //in final program, the loop will run while user_input.equals("exit") is false
								
		}
		
	}
		
	
	/**
	 *Helper that determines what the user wants to do based on what number they type. For example, if the user types 1, then they will be prompted to
	 *input the new contact's info. If the user then types "Jeb Bushthen it will call the Contact.newContact method with the string newContact("Jeb","Bush"). - SS
	 */
	public void determineCommand(){

	}
	
}