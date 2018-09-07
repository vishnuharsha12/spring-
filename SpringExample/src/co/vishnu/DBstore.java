package co.vishnu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class DBstore{
	
@Autowired
private List<ProductDetails>pd = new ArrayList<>();

public DBstore() {
	pd.add(new ProductDetails(1,"biscuts",10,5));
	pd.add(new ProductDetails(2,"choclates",15,6));
	
}

public List<ProductDetails> getPd() {
	return pd;
}

public void setPd(List<ProductDetails> pd) {
	this.pd = pd;
}



}


