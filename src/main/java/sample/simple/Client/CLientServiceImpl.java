package sample.simple.Client;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("ClientService")
@Transactional
public class CLientServiceImpl implements ClientService {
	
	private final ClientRepository clientRepository;
	

	public CLientServiceImpl(ClientRepository clientRepository) {
		super();
		this.clientRepository = clientRepository;
	}

	/*public Page<Client> findClients(CLientSearchCriteria criteria, Pageable pageable) {
		  
		
		
	}*/

	public Client getClient(int id,String adresse) {
		
		
		return clientRepository.findByIdAndAdresseAllIgnoringCase(id, adresse);
	}

	/*public void addClient(int refAr, double quantite, String adresse, int ncbanque) {
		clientRepository.addClient(refAr,quantite, adresse, ncbanque);
	
	}*/

	
}
