package persistentie;

import java.util.ArrayList;
import java.util.List;

import domein.Kaart;

public class ColorettoMapper 
{
	public List<Kaart> geefKleuren()
	{
		List<Kaart> lijst = new ArrayList<>();
		
		lijst.add(new Kaart("rood"));
		lijst.add(new Kaart("oranje"));
		lijst.add(new Kaart("blauw"));
		lijst.add(new Kaart("geel"));
		lijst.add(new Kaart("grijs"));
		lijst.add(new Kaart("groen"));
		return lijst;
	}
}
