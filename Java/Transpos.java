import java.io.*;

class Transpos{
  public static void main(String[] args) throws IOException
  { 
    //TODO Arraygröße muss Variabel definiert werden
    //BufferedReader klartext / anzahl buchstaben pro zeile von skyt; dann aufrunden
    char [][] skyt = new char [6][4];

    int counter = 0;

    BufferedReader fr = new BufferedReader(new FileReader("Klartext.txt"));
    BufferedWriter fw = new BufferedWriter(new FileWriter("Geheimtext.txt"));

    String klartext = fr.readLine();
    fr.close();

    System.out.println("-----Teil1-----");

    //Klartext in Array packen
    for (int i = 0; i<skyt.length; i++){
      for (int k = 0; k<skyt[i].length; k++){
        if(counter<klartext.length()){         
          skyt[i][k] = klartext.charAt(counter);
        }
        counter++;
      }
    }

    //Kontrollausgabe
    System.out.println("Check1: Skytarray erstellt");
    System.out.println("\n-----Teil2-----");
    
    //Array Spaltenweise in Datei schreiben
    for (int k = 0; k<skyt[0].length; k++){
      for (int i = 0; i<skyt.length; i++){
        if(skyt[i][k] != '\0'){
          fw.write(skyt[i][k]);
        }
      }
    }

    //Kontrollausgabe 
    System.out.println("Check2: Skytarray ausgelesen und in Geheimtext.txt gespeichert!!");
    System.out.println();

    //FileWriter schließen
    fw.close();
  }
} 