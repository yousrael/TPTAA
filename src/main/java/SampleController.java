import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sample.simple.Client.ClientService;

@Controller
public class SampleController {

	@Autowired
	private ClientService clientService;

	@GetMapping("/")
	@ResponseBody
	@Transactional(readOnly = true)
	public int ClientNumberAccount() {
		return this.clientService.getClient(0,"Rue de la monnaie").getnCbanque();
	}

}

