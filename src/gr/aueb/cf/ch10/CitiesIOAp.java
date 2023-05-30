package gr.aueb.cf.ch10;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/**
 * Διαβαζει απο ενα αρχειο με μορφη δεδομενων
 * country1 city1 city2 city3
 * country2 city1 city 2 city 3
 *
 * και γραφει καθε γραμμη σε διαγορετικο output
 * αρχειο
 *
 * Χρησιμοποιουμε το javaa.io
 *
 */
public class CitiesIOAp {

    public static void main(String[] args) {
        String line;
        String[] cities;
        File dir = new File("C:/tmp/CF23");

        if (!dir.exists()){
            if (!dir.mkdir()){
                System.err.println("Error in make dir");
                System.exit(1);
            }
        }

        try (BufferedReader bf = new BufferedReader(new FileReader("C:/tmp/cities.txt"))){
            while ((line = bf.readLine()) != null) {
                cities = line.split(" +");
                switch (cities[0]) {
                    case "Greece":
                        File grFile = new File(dir + "/" + cities[0].toLowerCase().substring(0, 2) + ".txt");
                        PrintStream gr = new PrintStream(grFile, StandardCharsets.UTF_8);
                         print(gr, "GR Cities");
                        print(gr, cities);
                        break;
                    case "USA":
                        File usaFile = new File(dir + "/" + cities[0].toLowerCase().substring(0, 2) + ".txt");
                        PrintStream usa = new PrintStream(usaFile, StandardCharsets.UTF_8);
                        print(usa, "USA Cities");
                        print(usa, cities);
                        break;
                    case "Germany":
                        File deFile = new File(dir + "/" + cities[0].toLowerCase().substring(0, 2) + ".txt");
                        PrintStream de = new PrintStream(deFile, StandardCharsets.UTF_8);
                        print(de, "DE Cities");
                        print(de, cities);
                        break;
                    default:
                        System.err.println("Error in cities");
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void print(PrintStream ps,String message) {
        ps.println(message);
    }

    public static void print(PrintStream ps, String[] tokens) {
        for (int i = 1; i < tokens.length; i++) {
            ps.print(tokens[i] + " ");
            //print(ps, tokens[i] + " ");
        }
    }

}
