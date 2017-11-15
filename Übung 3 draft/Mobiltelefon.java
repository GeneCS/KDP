 
/**
 * Die Klasse Mobiltelefon bekommt ein privates Objektfeld sim von Klasse Simkarte.
 * Im Konstruktor bekommt Mobiltelefon eine Simkartenobjekt s übergeben. Die Werte von sim sollen die 
 * Werte der übergebenen Simkarte s bekommen und werden in pirvaten Objektfeldern gespeichert.
 * 
 * @author Lukas Mueller, Yevgeniy Vaysman, Jonas Wiegand 
 * @version 15.11.2017
 */
public class Mobiltelefon
{ 
 private SimKarte sim;
 public Mobiltelefon (SimKarte s)
 {
     
     this.sim = s;
     
 }
 /*
  * Der Name des Providers wird ausgegeben, indem auf die Methode gibProvider der Klasse Simkarte 
  * zugegriffen wird.
  */
 public void einschalten()
 {
     Out.println(sim.gibProvider());
 }
 /*
  * Hier wird eine Rufnummer übergeben, dann auf der Konsole ausgegeben und schließlich in sim gespeichert
  * mithilfe eines Methodenaufrufs.
  */
 public void waehlen(String Rufnummer)
 {
     Out.println(Rufnummer);
     sim.setzeRufnummer(Rufnummer);
 }
 /*
  * Die derzeit gespeicherte letze Rufnummer von sim wird ausgelesen mithilfe Methode gibRufnummer der
  * Klasse Simkarte . Dann wird die Methode waehlen ausgeführt.
  */
 public void wahlWiederholung()
 {
     waehlen(sim.gibRufnummer());
 }   
}
