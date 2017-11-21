/**
 * Aktualisierte Version von DoubleArrays. Methoden mit 2D Matrix.
 * @author Lukas Müller, Yevgeniy Vaysman, Jonas Wiegand 
 * @version 15.11.2017
 */


public class DoubleArrays
{
    public static void main (String []args) 
    {
        
        Out.println("Geben Sie die Länge des Arrays an");
        int anzahlZ = In.readInt();
        int anzahlS = In.readInt();
        double [][] array = erzeugeMatrix2D(anzahlZ,anzahlS);
        male2DMatrix(array);
        
    }
    
   public static int gibLaenge(double [] a)
    {
        return a.length;
    }
    public static double [] erzeugeArray(int laenge)
    {
        double [] b = new double[laenge];
        return b;
        
    }
    public static void fuelleArray(double [] c)
    {
        int werte = 0;
        ;
        while (werte<c.length)
        {
            Out.println("Geben Sie einen Wert ein");
            c[werte] =In.readDouble();
            werte++;
 
        }
    }
    public static double gibWert(double[] d, int pos)
    {
      if(pos <= d.length && pos > 0){
        Out.println("Der ausgegeben Wert lautet:" + d[pos-1]);
        return d[pos-1];
        }
        else{
            Out.println("Diese Position existiert nicht");
            return -1.0;
        }
      
    }
    /*
     * Zeilen und Spalten der 2D Matrix werden eingelesen, die Matrix wird erstellt, der Benutzer wird 
     * nach Werten gefragt und diese werden eingelesen.
     */
    public static double [][] erzeugeMatrix2D (int anzahlZeilen, int anzahlSpalten)
    {
        
        double [] [] matrix2D = new double [anzahlZeilen] [anzahlSpalten];
        Out.println("Geben sie die Werte ein");
        
        for(int i=0;i<matrix2D.length;i++){         //Schleife bis letztes äußeres Array
            for(int j=0;j<matrix2D[i].length;j++){  //Schleife bis inneres Array voll
                    matrix2D[i][j]=In.readDouble(); //Wert an Stelle [NRäußeresArray] [NRinneresArray]
            }  
        }   
        
        
        
        return matrix2D;
    }
    public static void male2DMatrix (double [][] matrix2D)
    {   
        for(int i=0;i<matrix2D.length;i++){
            for(int j=0;j<matrix2D[i].length;j++){
                
                System.out.print(matrix2D[i][j] + "\t"); //Array ausgegeben 
            }
            Out.println();
        }
        
    }
}
