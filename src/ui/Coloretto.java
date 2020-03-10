package ui;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domein.Colorettodom;
import domein.DomeinController;
import domein.Gameboard;
import domein.Kaart;
import domein.Speler;

public class Coloretto {

	public static void main(String[] args)
		
	{	
        String[] namen;
        String naam = null;
		int spelers;
		int teller = 0;
		int stapelen = 0;
		int keuze = 0;
		int keuzeStapel=0;
		
		Kaart kaarten = new Kaart(naam);
		Gameboard Stapels = new Gameboard(naam, stapelen, teller);		
		Scanner invoer = new Scanner (System.in);
		String[] kaart = {"oranje","blauw","rood","geel","Grijs","Groen","Roos"};

		do {
			System.out.print("Hoeveel spelers spelen er ? ");
			spelers = invoer.nextInt();
			naam = invoer.nextLine();
			}while(spelers < 4 || spelers > 5);
		
        namen = new String[spelers];
        
      		do {
      		System.out.printf("Geef de naam in ");
   		 	namen[teller] = invoer.nextLine();
   		 	teller++;
      		}while(teller < namen.length); 
     
      			for (int i = 0; i < namen.length; i++) {
      				
      				System.out.printf("%s%n", namen[i]);
      				
      				System.out.printf("%s krijgt de kleur %s%n", namen[i],kaart[i]);
      				
      				System.out.printf("Wat wil je doen? %n 1: Kaart trekken en afleggen %n 2:Stapel Pakken");
      				keuze = invoer.nextInt();
      				
      				if(keuze == 1) {
      				System.out.print("Op welke stapel leg je iets?");
      				keuzeStapel = invoer.nextInt();
      				System.out.printf("de stapel is %s", keuzeStapel);
      				}
      				else {
      				System.out.print("Welke Stapel pak je?");
      				stapelen = invoer.nextInt();
      				stapelen = Stapels.trekKaartEnLegAf();
      				if (stapelen == kaarten.specialeKaart())
      				{
      					if(kaarten.specialeKaart()==1)
      					{
      						System.out.println("Je krijgt een +2");
      						kaarten.specialeKaart();
      					}
      					else if(kaarten.specialeKaart()==2)
      					{
      						System.out.println("Je krijgt een Joker");
      						kaarten.specialeKaart();
      					}
      					else
          				{
          					System.out.println("Dit is een speciale kaart, de laaste ronde begint nu!");
          					kaarten.specialeKaart();
          				}
      				}
      				
      				if (stapelen == 1)
      				{
      					System.out.printf("%s krijgt %s kaarten %n",namen[i],stapelen);
      				}
      				else if(stapelen == 2)
      				{
      					System.out.printf("%s krijgt %s kaarten %n",namen[i],stapelen);
      				}
      				else if(stapelen == 3)
      				{
      					System.out.printf("%s krijgt %s kaarten %n",namen[i],stapelen);
      				}
      				else if (stapelen == 4)
      				{
      					System.out.printf("%s krijgt %s kaarten %n",namen[i],stapelen);
      				}
      				else
      				{
      					System.out.printf("%s krijgt %s kaarten %n",namen[i],stapelen);
      				}
      				}
      				
       		}
      			
		}
	}

