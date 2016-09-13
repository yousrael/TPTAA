package sample.simple.Client;
import java.io.Serializable;

import org.springframework.util.Assert;

public class CLientSearchCriteria implements Serializable {
	
	

		private static final long serialVersionUID = 1L;

		private String name;

		public CLientSearchCriteria() {
		}

		public CLientSearchCriteria(String name) {
			Assert.notNull(name, "adresse must not be null");
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	

}
