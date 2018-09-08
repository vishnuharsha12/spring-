package co.vishnu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class DBstore{


	private List<ProductDetails>pd = new ArrayList<>();
	@Autowired
	public DBstore() {
		pd.add(new ProductDetails(1,"biscuts",10,5));
		pd.add(new ProductDetails(2,"choclates",15,6));

	}
	public ProductDetails  productDetails() {
		for(ProductDetails product: pd) {
			System.out.println(product);
			return product;


		}
		return null;
	}
	public List<ProductDetails> getPd() {
		return pd;
	}

	public void setPd(List<ProductDetails> pd) {
		this.pd = pd;
	}
}
//public Order productDetails() {
//	// TODO Auto-generated method stub
//	return null;
//}
//
//
//
//}


