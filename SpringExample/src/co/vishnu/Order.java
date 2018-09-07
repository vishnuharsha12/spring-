package co.vishnu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Order {
	private int id;
   private int quantity;
 private int productid;
	

@Autowired
	public Order(int id, int quantity,int productid) {
		
		this.id = id;
		this.quantity = quantity;
		this.productid=productid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}

}
