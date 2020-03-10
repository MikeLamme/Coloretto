package domein;

public class Speler 
{
	public String naam;
	public static int idNummer;
	
	public Speler(String naam,int IdNummer)
	{
		this.idNummer = IdNummer;
		this.naam = naam;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) 
	{	
		if (naam == null)
			throw new IllegalArgumentException("Naam moet ingevuld zijn");
		else
		{
		this.naam = naam;
		}
	}

	public int getIdNummer() {
		
			return idNummer;
	}
	
	public void setIdNummer(int idNummer) 
	{	if(idNummer < 4 || idNummer > 5)
			throw new IllegalArgumentException("Het getal moet 4 of 5 zijn");
		else
		{
		this.idNummer = idNummer;
		}
	}
	
}
