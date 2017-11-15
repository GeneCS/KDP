
/**
 * Die Klasse Simkarte hat private Variablen provider und Rufnummer.
 * Im Konstruktor wird ein provider übergeben. Dieser soll dann abgespeichert werden.
 * 
 * @author Mueller, Vaysman, Wiegand
 * @version (9.11.2017)
 */
public class SimKarte
{
    private String provider;
    private String Rufnummer;
    /*
     * sinnvoll privat ,da es ausserhalb der Klasse SimKarte nicht geändert werden sollte.
     * Jede Person hat eine andere Rufnummer, deswegen wird nicht mit static, also einem Klassenfeld, 
     * sondern mit einem Objektfeld gearbeitet.
      */
      
    public SimKarte(String provider)
    {
        this.provider = provider;  
    }
    /*
     * provider wird zurückgegeben, wichtig Zugriffe auf diese Variable außerhalb der Klasse Simkarte.
     */
    public String gibProvider() //provider wird zurückgegeben, wichtig Zugriffe auf diese Variable
    {
        return provider;   
    }
    /*
     * gleiche Prinzipien wie für provider.
     */
    public void setzeRufnummer(String Rufnummer)
    {
        this.Rufnummer = Rufnummer;  
    }
    public String gibRufnummer()
    {
        return Rufnummer;
    }
   

  
}
