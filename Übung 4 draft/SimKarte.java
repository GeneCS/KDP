
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
    private String [] telefonbuch = new String [5];
    private int zaehler=0; //zaehlvariable des telefonbuchs
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
    public void fuegeEin(String Rufnummer)
    {
        if (zaehler>4)
            {
                Out.print("Das Telefonbuch ist voll.");
            }
            else{
                telefonbuch[zaehler]=Rufnummer;
                zaehler++;
            }
        
    }
    public void gibAus()
    {
        Out.println(provider);
        for (int i=0;i<zaehler;i++)
            {
                Out.println(telefonbuch[i]);
            }       
}
}
