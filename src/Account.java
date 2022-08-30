
public class Account {

	Integer id;
	double balence;
	
	public Account (Integer id) {
		this.id = id;
		this.balence = 0.0;
	}
	
	public Account (Integer id, double balence) {
		this.id = id;
		this.balence = balence;
	}
	
	public void setBalence(double balence) {
		this.balence = balence;
	}
	
}
