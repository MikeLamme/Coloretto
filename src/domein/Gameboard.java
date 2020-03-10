package domein;

public class Gameboard
{
	private String kaart;
	private int totaalAantalKaarten;
	private int stapel1;
	private int stapel2;
	private int stapel3;
	private int stapel4;
	private int stapel5;
	int keuze;
	
	private Gameboard[] Deck = new Gameboard[63];
	
	public Gameboard(String kaart,int totaalAantalKaarten,int Deck)
	{
		this.kaart = "";
		this.totaalAantalKaarten = 0;
	}
	public void DeckOfards() {
		
		int[] Stapels = {stapel1,stapel2,stapel3,stapel4,stapel5};
		String[] kaart = {"oranje","blauw","rood","geel","Grijs","Groen","Roos"};
		
		for (int count = 0; count < Deck.length; count++) 
		{
			Deck[count]= new Gameboard(kaart[count / 7],totaalAantalKaarten, count);
		}
	}
	public int maakEenKeuze()
	{
		do {
			System.out.print("Welke keuze pak je 1:Kaart leggen op Stapel of 2: pak Stapel");
			
			return keuze;
		}while(Stapels()>Speler.idNummer);
	}
	
	public int trekKaartEnLegAf()
	{
		for (totaalAantalKaarten = 0; totaalAantalKaarten < 1; totaalAantalKaarten=totaalAantalKaarten+1)
		{
			totaalAantalKaarten--;
			if (stapel1 < 3)
			{
				stapel1 = stapel1 + 1;
				return stapel1;
			}else if(stapel1 == 3)
			{
				stapel2 = stapel2 + 1;
				return stapel2;
			}else if(stapel1 == 3 && stapel2 == 3)
			{
				stapel3 = stapel3 + 1;
				return stapel3;
			}else if (stapel1 == 3 && stapel2 == 3 && stapel3 == 3)
			{
				stapel4 = stapel4 + 1;
				return stapel4;
			}else if (stapel1 == 3 && stapel2 == 3 && stapel3 == 3 && stapel4 == 3)
			{
				stapel5 = stapel5 + 1;
				return stapel5;
			}else
			{
				throw new IllegalArgumentException("De stapels liggen vol, pak een Stapel");
			}
			
		}
	return Stapels();
		
		
	}
	public int Stapels()
	{
		if(stapel1 == 3)
		{
			return stapel1;
		}
		else if(stapel1 == 3)
		{
			return stapel2;
		}
		else if(stapel1 == 3 && stapel2 == 3)
		{
			return stapel3;
		}
		else if (stapel1 == 3 && stapel2 == 3 && stapel3==3)
		{
			return stapel4;
		}
		else if (stapel1 == 3 && stapel2 == 3 && stapel3 == 3 && stapel4 == 3)
		{
			return stapel5;
		}
		else
		{
			throw new IllegalArgumentException("De stapels liggen vol, pak een Stapel");
		}
	}
}