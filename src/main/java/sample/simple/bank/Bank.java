package sample.simple.bank;

import org.springframework.stereotype.Component;

@Component
public class Bank implements IBank{

	public void transfert() {
	System.out.println("transfert effectué");
		
	}

}
