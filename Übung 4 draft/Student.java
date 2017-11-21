
/**
 * Student wird ein nachname und der erste Vorname übergeben. Vorname wird an die erste Stelle eines 4stelligen Arrays zugewiesen. 
 * Die Anzahl der Studenten steigt beim jedem Aufrufen des Konstruktor und der Wert wird als Matrikelnummer zugewiesen.
 * 
 * @author Mueller,Vaysman,Wiegand
 * @version 21.11.2017
 */
public class Student
{
    private String nachname;
    private String [] vorname = new String[4];
    /*
     * man braucht ein objektfeld anzahlstundenten damit es für die klasse eine fest anzahl gibt
     * mithilfe Objektfeld matrikelnummer wird jedem neuem student eine Nummer zugewiesen
     */
    private static int anzahlStudenten=0; 
    private int matrikelnummer;
    
    public  Student(String nachname, String erstername) //vorname 
    {
        nachname = this.nachname;
        vorname[0]=erstername;
        anzahlStudenten++; 
        matrikelnummer=anzahlStudenten;
       
    }
    
}
