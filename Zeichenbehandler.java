
/**
 * Beschreiben Sie hier die Klasse Zeichenbehandler.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Zeichenbehandler
{

    public Zeichenbehandler()
    {

    }

    public static boolean  uebergabe(char buchstabe)
    {
        boolean probe=false;
        if(buchstabe >=65 && buchstabe <=90) 
            probe = true;
        return probe;
    }

    public static char verschluessle(char buchstabe, int schluessel)
    {

        if (uebergabe(buchstabe))
        {
            int summe = buchstabe + schluessel;
            if(summe>=91){
                buchstabe = (char) (64+(summe-90));
            }
            else {
                buchstabe=(char) (summe); 
            }
            return buchstabe;
        }
        else {
            Out.println("Geben sie einen Großbuchstaben ein");
            return '0';
        }
    }

    public static char[] verschluessleWort(int laengeWort, int schluessel)
    {
        char [] array = new char[laengeWort];
        for(int i=0;i<laengeWort;i++)
        {
            Out.println("Geben sie Buchstaben ein");
            char currentChar=In.readChar();
            uebergabe(currentChar);
            if(uebergabe(currentChar))
            {
                array[i]=verschluessle(currentChar,schluessel);
            }
            else{
                Out.println("Error");
                array[i]= (char) 48;
                return array;
            }

        }
        return array;
    }
}