package sample.simple.Client;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sample.simple.Store.IFastLane;
import sample.simple.Store.IJustHaveALook;
import sample.simple.Store.ILane;

@Entity
@Component
public class Client implements IRun,IClient {
	@Id
	@GeneratedValue
	private int id;
	private int refArticle;
	private double quantite;
	private String adresse;
	private int nCbanque;
	@Autowired
	IFastLane ifastlane;
	@Autowired
	IJustHaveALook ijusthavealook;
	@Autowired
	ILane ilane;
	public void run() {
		ijusthavealook.getPrice();
		ilane.pay();
		
	}
	public int getRefArticle() {
		return refArticle;
	}
	public void setRefArticle(int refArticle) {
		this.refArticle = refArticle;
	}
	public double getQuantite() {
		return quantite;
	}
	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getnCbanque() {
		return nCbanque;
	}
	public void setnCbanque(int nCbanque) {
		this.nCbanque = nCbanque;
	}
	
	
	

}
