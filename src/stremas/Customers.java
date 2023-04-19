package stremas;
public class Customers {

	private long cusId;
	private String cusName;
	private long orderId;
	private Integer orderTotal;
	private String cusLoc;

	public Customers() {
		super();
	}

	public Customers(long cusId, String cusName, long orderId, Integer orderTotal, String cusLoc) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.orderId = orderId;
		this.orderTotal = orderTotal;
		this.cusLoc = cusLoc;
	}

	public long getCusId() {
		return cusId;
	}

	public void setCusId(long cusId) {
		this.cusId = cusId;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public int getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(Integer orderTotal) {
		this.orderTotal = orderTotal;
	}

	public String getCusLoc() {
		return cusLoc;
	}

	public void setCusLoc(String cusLoc) {
		this.cusLoc = cusLoc;
	}

	@Override
	public String toString() {
		return "Customers [cusId=" + cusId + ", cusName=" + cusName + ", orderId=" + orderId + ", orderTotal="
				+ orderTotal + ", cusLoc=" + cusLoc + "]";
	}

}