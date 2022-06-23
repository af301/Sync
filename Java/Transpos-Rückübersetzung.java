import java.io.*;

class Rücktranspos{
  public static void main(String[] args) throws IOException
  { 
    
    //BufferedReader klartext / anzahl buchstaben pro zeile von skyt; dann aufrunden
    char [][] skyt = new char [4][6];

    int counter = 0;
    int leerzeichen = 0; 
    String geheimtext;

    BufferedReader fr = new BufferedReader(new FileReader("Geheimtext.txt"));
    BufferedWriter fw = new BufferedWriter(new FileWriter("Klartext1.txt"));

    geheimtext = fr.readLine();
    fr.close();

    leerzeichen = geheimtext.length() % 4;

    System.out.println("Anzahl der leeren Stellen: " + leerzeichen);

    System.out.println("Geheimtext: " + geheimtext);
    System.out.println();
    System.out.println("-----Teil1-----");

    //Klartext in Array packen
    for (int i = 0; i<skyt.length; i++){
      for (int k = 0; k<skyt[i].length; k++){
        if(counter<geheimtext.length()){
          if (i == skyt.length - leerzeichen && k == 6-1){
            skyt[i][k] = '\0';
          }
          else{
            skyt[i][k] = geheimtext.charAt(counter);
            System.out.print(skyt[i][k]);
            counter++;
          }      
        }
      }
      System.out.println();
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
    System.out.println("Check2: Skytarray ausgelesen und in Klartext1.txt gespeichert!!");
    System.out.println();

    //FileWriter schließen
    fw.close();
  }
} 