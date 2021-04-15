
public class ConstrutorTest {

	private String sendername;
	private double walletbalance;
	private String receivername;
	
	
	public String getSendername() {
		return sendername;
	}
	public void setSendername(String sendername) {
		this.sendername = sendername;
	}
	public double getWalletbalance() {
		return walletbalance;
	}
	public void setWalletbalance(double walletbalance) {
		this.walletbalance = walletbalance;
	}
	public String getReceivername() {
		return receivername;
	}
	public void setReceivername(String receivername) {
		this.receivername = receivername;
	}
	public void AddmoneyMethod(double AddMoney) {
		this.walletbalance +=AddMoney;
		System.out.println("Added money"+AddMoney+" "+"Successfully Added"+this.walletbalance);
	}
	public void SendMoney(int Sendmoney) {
		if(this.walletbalance-Sendmoney<=0) {
			System.out.println("insufficient Balance"+Sendmoney);
		}else {
			this.walletbalance -=Sendmoney;
System.out.println("Sent money is"+Sendmoney+" "+"Current Balance is"+this.walletbalance);

		}
	}
}
