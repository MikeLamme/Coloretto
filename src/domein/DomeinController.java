package domein;

import java.util.List;

import persistentie.ColorettoMapper;

public class DomeinController 
{
	private ColorettoMapper deKleur;
	
	public DomeinController()
	{
		deKleur = new ColorettoMapper();
		
	}
	public List<Kaart> geefKleuren(){
		return deKleur.geefkleuren();
	}
}
