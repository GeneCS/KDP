
/**
 * Beschreiben Sie hier die Klasse Main.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Main
{
   public static void main(String[] args)
   {
       Out.println("Geben Sie den gewunschten Schluessel ein:");
       int schluessel = In.readInt();
       Out.println("Geben Sie jetzt die Laenge des zu verschluesselnden Wortes ein:");
       int laenge = In.readInt();
       
       char[] array = Zeichenbehandler.verschluessleWort(laenge,schluessel);
       
       for(int i=0;i<laenge;i++)
       {
           Out.print(array[i]);
        }
       
       
   }
}
