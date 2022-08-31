
public class Account {

	Long id;
	double balence;
	
	public Account (Long id) {
		this.id = id;
		this.balence = 0.0;
	}
	
	public Account (Long id, double balence) {
		this.id = id;
		this.balence = balence;
	}
	
	public void setBalence(double balence) {
		this.balence = balence;
	}
	 
}
