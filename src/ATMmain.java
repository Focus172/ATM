import java.util.*;

public class ATMmain {
	
	HashMap idMap = new HashMap<Integer, Account>();
	
	public void openAccount (Integer id) {
		idMap.put(id, new Account(id));
	}
	
	//needs to check if account already exists
	public void openAccount (Integer id, double balence) {
		idMap.put(id, new Account(id, balence));
	}
	
	public void closeAccount (Integer id) throws stupidWrongIdExceptionForDumbPeople {
		Account temp = (Account)idMap.get(id);
		
		if (temp == null) {
			throw new stupidWrongIdExceptionForDumbPeople();
		}
		
		if (temp.balence <= 0.0) {
			idMap.remove(id);
		}
	}
	
	public double checkBalence (Integer id) {
		Account temp = (Account)idMap.get(id);
		//returns all deposits
		return 0.0;
	}
	
	public boolean depositMoney (Integer id, double dep) {
		return false;
	}
	
	public boolean withdrawMoney (Integer id, double with) {
		return false;
	}
}
