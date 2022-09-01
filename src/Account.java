import java.math.BigDecimal;

public class Account {

	Long id;
	BigDecimal balence;
	
	public Account (Long id) {
		this.id = id;
		this.balence = BigDecimal.valueOf(0.0);
	}
	
	public Account (Long id, double balence) {
		this.id = id;
		this.balence = BigDecimal.valueOf(balence);
	}
	
	public void setBalence(BigDecimal balence) {
		this.balence = balence;
	}
	 
}
