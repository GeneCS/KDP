
/**
 * Ein neue Simkarte mit anbieter "schleichwerbung" wird erstellt.
 * Es werden 5 Nummern eingelesen und in das Telefonbuch geschrieben.
 * Der provider und der Inhalt des Telefonbuchs werden ausgegeben.
 * Eine weitere Nummer ergibt eine Ausgabe.
 * Anschließend wird ein neues Objekt der Klasse Handy erstellt und eingeschalten.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Main
{
   public static void main(String[] args)
   {
       SimKarte simMain= new SimKarte("Schleichwerbung");
       Out.println("Geben Sie 5 Nummern ein.");
       
       for (int i=0;i<5;i++)
       {
           simMain.fuegeEin(In.readString());
       }
       Out.println("Telefonbuchinhalt:"); 
       simMain.gibAus();
       simMain.fuegeEin(In.readString()); //zaehler>4,deswegen entsprechende Ausgabe
       Mobiltelefon handy1 = new Mobiltelefon (simMain);
       handy1.einschalten();
   }
}
