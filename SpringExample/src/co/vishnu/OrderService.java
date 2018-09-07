package co.vishnu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class OrderService {
	@Autowired
	private ProductDetails product;
	
	private List<Order>order =new ArrayList<>();
	
	
	public List<Order> getOrder() {
		return order;
	}


	public void processOrder(Order o) {
		
if(o.getProductid()==product.getId()&& o.getQuantity()<=product.getQuantity()) {
	System.out.println("orderis placed"+ o.getId());
	order.add(new Order(o.getId(), o.getQuantity(),o.getProductid()));
	// we need to update productdetails quantity list by productid.getQuantity-o.getQuantit
	product.setQuantity(product.getQuantity()-o.getQuantity());
	
	
}
else {
	System.out.println("there is no sufficient quantity of particular item"+product.getId());
}
    	
    }
}

