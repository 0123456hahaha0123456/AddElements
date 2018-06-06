import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;

public class insertRole {


    public void printMessage(int key,PrintStream output){
        String[] role ={"Leader","Member"};
        Random rand = new Random();
        int pos = rand.nextInt(2);
        output.println("INSERT INTO \"D_ROLE\" VALUES (" +key+",'"+ role[pos]+ "'," +key+ ");");
    }
    public static void main(String[] args){
        insertRole Duc = new insertRole();
        try {
            PrintStream out = new PrintStream(new FileOutputStream("insertRole.txt"));
            for (int i = 1; i < 100001; i++) Duc.printMessage(i,out);
            out.close();
        }catch (FileNotFoundException e1){
            System.out.println();
        }

    }
}
