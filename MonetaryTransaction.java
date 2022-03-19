
public class MonetaryTransaction extends Transaction {

	private double fundsTransferred;
	private String fundDestination;
	final private static int type = 0; //0 denotes that this is a MonetaryTransaction subclass of Transaction (should never change)
									   //this may be an unnecessary specification?
	
	//Constructor
	public MonetaryTransaction(String userIDNum, String transactionIDNum, String date, double funds, 
									String destination) {
		super(userIDNum, transactionIDNum, date, type);
		fundsTransferred = funds;
		fundDestination = destination;
	}

	//Function to withdraw/deposit money to increase/decrease account balance
	public void updateBalance(double funds, double destination, int type) {

	}

	//Getter functions
	public double getFundsTransferred() {
		return fundsTransferred;
	}

	public String getFundDestination() {
		return fundDestination;
	}

}
