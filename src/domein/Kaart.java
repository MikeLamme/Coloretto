package domein;
import java.util.List;
import java.util.Random;

import domein.Speler;

public class Kaart 
{
	Random random = new Random();
	String kleur;
	String soort;
	int specialeKaart;

	public Kaart(String kleur)
	{
		this.kleur = kleur;
		this.soort = soort;
	}

	public String getKleur() {
		return kleur;
	}

	public void setKleur(String kleur) {
		this.kleur = kleur;
	}


	public String getSoort() {
		return soort;
	}

	public void setSoort(String soort) {
		this.soort = soort;
	}
	public String kleuren(String kleur)
	{
		String[] kaart = {"oranje","blauw","rood","geel","Grijs","Groen","Roos"};
		Random kl = new Random();
		int randomKleur=kl.nextInt(kaart.length);
		String.format("De kleur is %s",kaart[randomKleur]);
		return kleur;
	}
	public double specialeKaart()
	{
		specialeKaart = 1+(random.nextInt(3));
		if(specialeKaart == 1)
		{
			String.format("de specialekaart is een +2 ");
			return specialeKaart;
		}
		else if(specialeKaart == 2)
		{
			String.format("De kaart is een joker");
			return specialeKaart;
		}
		else
		{
			String.format("De kaart is Last Round");
			return specialeKaart;
		}
	}
}
