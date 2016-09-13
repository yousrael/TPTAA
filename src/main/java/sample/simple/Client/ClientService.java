package sample.simple.Client;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClientService {
	
	//Page<Client> findClients(CLientSearchCriteria criteria, Pageable pageable);

	public Client getClient(int id,String adresse);
	
	//public void addClient(int refAr,double quantite,String adresse,int ncbanque);
	

}
