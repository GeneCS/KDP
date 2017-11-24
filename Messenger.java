
/**
 * Beschreiben Sie hier die Klasse Messenger.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Messenger
{
    enum MessengerStatus{
       present,busy,doNotDisturb,loggedOut
    }
    public static void main(String[] args)
    {
        /*boolean present = true;
        boolean busy = false;
        boolean doNotDisturb = false;
        boolean loggedOut = false;
        boolean accessable = present != loggedOut; //
        boolean working = busy == doNotDisturb;    // beides falsch macht kein sinn
        
         * + operator funktioniert nicht und messengerstatus kann nicht ausgebenwerden
         
        Out.println("Benutzer ist anwesend: " + present);
        Out.println("Benutzer ist beschäftigt: " + busy);
        Out.println("Benutzer will nicht gestört werden: " + doNotDisturb);
        Out.println("Benutzer ist erreichbar: " + accessable);
        Out.println("Benutzer arbeitet: " + working);
        */
       MessengerStatus schreibt = MessengerStatus.present;
       MessengerStatus online = MessengerStatus.present;
       MessengerStatus offline = MessengerStatus.loggedOut;
       boolean vergleich1 = online != offline;
       boolean vergleich2 = schreibt == online;
       
       Out.println(schreibt);
       Out.println(online);
       Out.println(offline);
       Out.println(vergleich1);
       Out.println(vergleich2);
      
       
}
}
