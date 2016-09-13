package sample.simple.Provider;

import org.springframework.stereotype.Component;

@Component
public class Provider implements IProvider {

	public double getPrice() {
		return 555.33;
	}

	public void order() {
		// TODO Auto-generated method stub
		
	}

}
