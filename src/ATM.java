import java.util.*;

public class ATM {
	
	HashMap idMap = new HashMap<Integer, Account>();
	
	public void openAccount (Integer id) {
		idMap.put(id, new Account(id));
	}
	
	//needs to check if account already exists
	public void openAccount (Integer id, double balence) throws stupidWrongIdExceptionForDumbPeople {
		
		if (idMap.containsKey(id)) { throw new stupidWrongIdExceptionForDumbPeople(); }
		
		idMap.put(id, new Account(id, balence));
	}
	
	public void closeAccount (Integer id) throws stupidWrongIdExceptionForDumbPeople {
		Account temp = (Account)idMap.get(id);
		
		//when the user is dumb tells them sternly
		if (temp == null) { throw new stupidWrongIdExceptionForDumbPeople(); }
		
		if (temp.balence <= 0.0) {
			idMap.remove(id);
		}
	}
	
	public double checkBalence (int id) {
		Account temp = (Account)idMap.get((Integer)id);
		if (temp == null) { return 0.0; }
		else { return temp.balence;}
		
	}
	
	public boolean depositMoney (Integer id, double dep) {
		Account temp = (Account)idMap.get(id);
		
		//when the user is dumb tells them sternly by returning false
		if (temp == null) { return false; }
		else {
			temp.setBalence(dep + temp.balence);
			idMap.replace(id, temp);
			return true;
		}
		
		//need to account for double trolling for infinat GTA money glitch
	}
	
	public boolean withdrawMoney (Integer id, double with) {
		Account temp = (Account)idMap.get(id);
		
		//when the user is dumb tells them sternly by returning false
		if (temp == null) { return false; }
		else {
			if (with < 0.0 || with > temp.balence) {return 0;}
			
			temp.setBalence(temp.balence - with);
			idMap.replace(id, temp);
			return true;
		}
		
		//need to account for double trolling for infinat GTA money glitch
	}
}
