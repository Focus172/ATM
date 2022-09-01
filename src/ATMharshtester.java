
public class ATMharshtester {

	public static void main (String [] aoujgbviabhiu) {
		
		ATM a = new ATM();
		
		a.openAccount(null);
		a.openAccount(1);
		a.openAccount(null, 10.0);
		a.openAccount(2, 56.0);
		
		System.out.println("Should be 0.0 : " + a.checkBalance(1));
		System.out.println("Should be 56.0 : " + a.checkBalance(2));
		System.out.println("Should be 0.0 : " + a.checkBalance(null));
		
		a.openAccount(1, 15.0);
		
		System.out.println("Should be 0.0 : " + a.checkBalance(1));
		
		a.closeAccount(1);
		a.closeAccount(2);
		a.openAccount(1, 20.0);
		
		System.out.println("Should be 20.0 : " + a.checkBalance(1));
		System.out.println("Should be 56.0 : " + a.checkBalance(2));
		
		//Integer biggie = Integer.valueOf(Long.MAX_VALUE);
		Integer cheese = Integer.MAX_VALUE;
		
		//System.out.println("should be around 9*10^18 : " + biggie);
		System.out.println("should be around 2*10^9 : " + cheese);
		//whoops can't acsess the highest values
		//thats a problem i will never fix
		
		a.openAccount(cheese, 2.45);
		a.depositMoney(1, 23.5);
		a.depositMoney(1, 0.02);
		a.depositMoney(2, -99.0);
		
		System.out.println("Should be 43.52 : " + a.checkBalance(1));
		System.out.println("Should be -43.0 : " + a.checkBalance(2)); //I assume this to be intended behavior because I make the wire box rules
		System.out.println("Should be 2.45 : " + a.checkBalance(cheese));
		
		a.withdrawMoney(cheese, 99999);
		a.withdrawMoney(1, 10.0);
		a.withdrawMoney(1, 0.001);
		a.withdrawMoney(2, -99.0);
		
		System.out.println("Should be 33.519 : " + a.checkBalance(1));
		System.out.println("Should be -43.0 : " + a.checkBalance(2));
		System.out.println("Should be 2.45 : " + a.checkBalance(cheese));
		
		//looks good can't wait to get an f
		//⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠴⢿⣧⣤⣄          
        //⠀⠀⠀  ⠀ ⠀⠀⠀⢀⣴⣿⣧⣆⣘⡄⢹⣿⣷⣆        
        //⠀⠀   ⠀ ⠀⠀⣴⣿⣿⣿⣿⣿⣿⣷⣾⣿⣿⣿⣷⡀      
        //   ⠀  ⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣴⣿⣿⣿⣿⡀     
        //    ⠀⢀⣀⡀⣾⡿⠀⠉⠉⠛⠋⠛⠛⠚⣿⣿⣿⣿⣿⣿⣷⣄  
        //   ⠀⢠⣍⠹⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⣿⣿⣿⡿  
        // ⠀⠀⠀⢿⣷⣾⣿⣿⠀⠀⠀⠀⠀⠀⢀⣴⣾⣿⣿⣿⣿⣿⣿⣷   
        //⠀⠀⠀⠀⠀⢹⣟⢻⣿⣄⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇   
        //⠀ ⠀⠀⠀⠻⠿⠟⠁⠑⢶⣤⣴⣿⣿⣿⣷⣶⣬⣿⣿⣿⡿      
        //        ⠀⠀⠈⠙⠛⠛⢛⣿⣿⣿⣿⡿⠛⠁      
        //                ⠻⢿⡿⠟         
	}
	
}
