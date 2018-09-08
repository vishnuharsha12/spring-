package co.vishnu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class OrderService {
	
	private List<Order>order =new ArrayList<>();
	
	@Autowired
	private DBstore dbStore;


	public List<Order> getOrder() {
		return order;
	}


	public void processOrder(Order o) {

		if(o.getProductid()==dbStore.productDetails().getId()&& o.getQuantity()<=dbStore.productDetails().getQuantity()) {
			System.out.println("orderis placed"+ o.getId());
			order.add(new Order(o.getId(), o.getQuantity(),o.getProductid()));
			// we need to update productdetails quantity list by productid.getQuantity-o.getQuantit
			dbStore.productDetails().setQuantity(dbStore.productDetails().getQuantity()-o.getQuantity());


		}
		else {
			System.out.println("there is no sufficient quantity of particular item"+dbStore.productDetails().getId());
		}

	}
}

