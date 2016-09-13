package sample.simple.Store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sample.simple.Provider.IProvider;
import sample.simple.bank.IBank;

@Component
public class Store implements IFastLane,IJustHaveALook,ILane {
	@Autowired
   IBank ibank;
	@Autowired
   IProvider iprovider;
public void addItemToCart() {
   System.out.println("item ajouté");
	
}
public void pay() {
	ibank.transfert();
	
}
public double getPrice() {
	System.out.println("le prix est 1000 euro");
	
return 0;
}
public boolean isAvailaible() {
	
	return false;
}
public void oneShotOrder() {
	
	
}

}
