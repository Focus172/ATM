import java.math.BigDecimal;
import java.util.*;

public class ATM {
	
	HashMap<Long, Account> idMap = new HashMap<Long, Account>();
	
	public void openAccount (Integer id) {
		if (idMap.containsKey(Long.valueOf(id.longValue()))) { return; }
		idMap.put(Long.valueOf(id.longValue()), new Account(Long.valueOf(id.longValue())));
	}
	
	//needs to check if account already exists
	public void openAccount (Integer id, double balence) {
		if (idMap.containsKey(Long.valueOf(id.longValue()))) { return; }
		idMap.put(Long.valueOf(id.longValue()), new Account(Long.valueOf(id.longValue()), balence));
	}
	
	public void closeAccount (Integer id) {
		Account temp = (Account)idMap.get(Long.valueOf(id.longValue()));
		
		//when the user is dumb tells them sternly
		if (temp != null && temp.balence.compareTo(BigDecimal.valueOf(0.0)) <= 0) {
			idMap.remove(Long.valueOf(id.longValue()));
		}
	}
	
	public double checkBalance (Integer id) {
		Account temp = (Account)idMap.get(Long.valueOf(id.longValue()));
		if (temp == null) { return 0.0; }
		else { return temp.balence.doubleValue();}
		
	}
	
	public boolean depositMoney (Integer id, double dep) {
		Account temp = (Account)idMap.get(Long.valueOf(id.longValue()));
		
		//when the user is dumb tells them sternly by returning false
		if (temp == null) { return false; }
		else {
			//int money = (int)(temp.balence*100) + (int)(dep*100);
			//temp.setBalence((double)money/100);
			
			temp.setBalence(temp.balence.add(BigDecimal.valueOf(dep)));
			
			idMap.replace(Long.valueOf(id.longValue()), temp);
			return true;
		}
		
		//need to account for double trolling for infinat GTA money glitch
	}
	
	public boolean withdrawMoney (Integer id, double with) {
		Account temp = (Account)idMap.get(Long.valueOf(id.longValue()));
		
		//when the user is dumb tells them sternly by returning false
		if (temp == null) { return false; }
		else {
			if (with < 0.0 || with > temp.balence.doubleValue()) {return false;}
			
			//int money = (int)(temp.balence*100) - (int)(with*100);
			//temp.setBalence((double)money/100);
			
			temp.setBalence(temp.balence.subtract(BigDecimal.valueOf(with)));
			
			idMap.replace(Long.valueOf(id.longValue()), temp);
			return true;
		}
		
		//need to account for double trolling for GTA money glitch
	}
}
