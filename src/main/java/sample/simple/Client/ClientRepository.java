package sample.simple.Client;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

interface ClientRepository extends Repository<Client, Long> {

	Page<Client> findAll(Pageable pageable);

	Page<Client> findByIdandAdresse(int id,String adresse, Pageable pageable);

	@Query("select c from client c")
	Client findByIdAndAdresseAllIgnoringCase(int id, String adresse);
	
	

}