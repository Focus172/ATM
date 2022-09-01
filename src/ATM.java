import java.math.BigDecimal;
import java.util.*;


//a program to run a simple highly unrealistic ATM machine
//my fraying sanity has not effect me in any way
public class ATM {
	
	//map that stores IDs as long and uses the account class for convenience
	HashMap<Long, Account> idMap = new HashMap<Long, Account>();
	
	//long allows for storage of nessisary amount of accounts but int does not allow all to be input
	//big decimal eliminates rounder error bug
	//GTA infinite money glitch no scam 100% thug approved. Download online limited time free profit passive income
	
	public void openAccount (Integer id) {
		
		if (id == null) { return; }
		
		if (idMap.containsKey(Long.valueOf(id.longValue()))) { return; }
		idMap.put(Long.valueOf(id.longValue()), new Account(Long.valueOf(id.longValue())));
	}
	
	//needs to check if account already exists
	public void openAccount (Integer id, double balence) {
		
		if (id == null) { return; }
		
		if (idMap.containsKey(Long.valueOf(id.longValue()))) { return; }
		idMap.put(Long.valueOf(id.longValue()), new Account(Long.valueOf(id.longValue()), balence));
	}
	
	//if acocunt is empty closes it
	public void closeAccount (Integer id) {
		
		if (id == null) { return; }
		
		Account temp = (Account)idMap.get(Long.valueOf(id.longValue()));
		
		//when the user program simplly does nothing beacus thats what they deserve
		if (temp != null && temp.balence.compareTo(BigDecimal.valueOf(0.0)) <= 0) {
			idMap.remove(Long.valueOf(id.longValue()));
		}
	}
	
	//mail box spoofer to look and see what people have. Not a honey pot (yet).
	//returns 0.0 when things get bad and 'puter gets scared 
	public double checkBalance (Integer id) {
		
		if (id == null) { return 0.0; }
		
		Account temp = (Account)idMap.get(Long.valueOf(id.longValue()));
		if (temp == null) { return 0.0; }
		else { return temp.balence.doubleValue();}
		
	}
	
	//no permisions on the function that gives people money beacuse why would you need those
	public boolean depositMoney (Integer id, double dep) {
		
		if (id == null) { return false; }
		
		Account temp = (Account)idMap.get(Long.valueOf(id.longValue()));
		
		//when the user is dumb tells them sternly by returning false
		if (temp == null) { return false; }
		else {
			
			temp.setBalence(temp.balence.add(BigDecimal.valueOf(dep)));
			
			idMap.replace(Long.valueOf(id.longValue()), temp);
			return true;
		}
	}
	
	//if you cant rob them at least delete all their money
	public boolean withdrawMoney (Integer id, double with) {
		
		if (id == null) { return false; }
		
		Account temp = (Account)idMap.get(Long.valueOf(id.longValue()));
		
		//when the user is dumb tells them sternly by returning false
		if (temp == null) { return false; }
		else {
			if (with < 0.0 || with > temp.balence.doubleValue()) {return false;}
			
			temp.setBalence(temp.balence.subtract(BigDecimal.valueOf(with)));
			
			idMap.replace(Long.valueOf(id.longValue()), temp);
			return true;
		}
		
	}
	
	//produced by the one and only idiote
	
}
