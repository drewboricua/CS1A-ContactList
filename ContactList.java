/**
 * Builds a list of contacts as an array, and then exports it to a file - SS
 */
import java.util.ArrayList;

public class ContactList {
	
	private ArrayList contact_list = new ArrayList(); //an array of contacts
	
	/**
	 * Constructs a new ContactList. - SS
	 */
	
	public ContactList(){
		contact_list = null;
	}

	
	/**
	 * adds a contact to contact_list - SS
	 * @param contact
	 */
	public void addContact(Contact contact){
		
	}
	
	/**
	 * returns the contact with that UID - SS
	 * @param uid
	 * @return
	 */
	public Contact retrieveContact (int uid){
		//dummy code, won't actually create a new Contact instance
		Contact contact = new Contact();
		return contact;
	}
	
	/**
	 * retrieves a contact by zip code (if matches a zip code regex) or last name - SS
	 * @param str
	 * @return
	 */
	public Contact retrieveContact(String str){
		//dummy code, won't actually create a new Contact instance
		Contact contact = new Contact();
		return contact;		
	}
	
	/**
	 * returns all contacts with matching first and last name - SS
	 * @param first_name
	 * @param last_name
	 * @return
	 */
	public Contact retrieveContact (String first_name, String last_name){
		//dummy code, won't actually create a new Contact instance
		Contact contact = new Contact();
		return contact;
	}
	
	/**
	 * converts the entire list to a string for display in the UI - SS
	 * @param contact
	 * @return
	 */
	public String toString(){
		return "The contact list is now a string!";
	}

}
