package packege5;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
    //1:
        try {
                FileOutputStream fos = new FileOutputStream("firstDoc.txt");
                PrintStream ps = new PrintStream(fos);
                ps.println("Рецепт салата: Нарежьте овощи кубиками, ");
                ps.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        try {
            FileOutputStream los = new FileOutputStream("secondDoc.txt");
            PrintStream gs = new PrintStream(los);
            gs.println("и заправьте майонезом и перемешайте.");
            gs.close();
            los.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


//2:
        StringBuilder sum = new StringBuilder("Рецепт салата: Нарежьте овощи кубиками, ");
        sum.append("заправьте майонезом и перемешайте.");
        String recept = sum.toString();
        System.out.println(recept);

//3:
        System.out.println("Есть ли в рецепте овощи?");
        String testWord = "овощи";
        String[] receptWords = recept.split(" ");
        for (int i = 0; i< receptWords.length; i++) {
            if (receptWords[i].equals(testWord)) {
                System.out.println("В рецепте есть такие ингридиенты.");
            }
        }


    }
}
