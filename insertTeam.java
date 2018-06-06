import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class insertTeam {


    public void printMessage(int key,PrintStream output){
        output.println("INSERT INTO \"D_TEAM\" VALUES (" +key
                +",'"+ makeString.getString(50)+"'"
                +",'"+ makeString.getString(50)+"',"
                +null+","
                +null+","
                +key+ ");");
    }
    public static void main(String[] args){
        insertTeam Duc = new insertTeam();
        try {
            PrintStream out = new PrintStream(new FileOutputStream("insertTeam.txt"));
            for (int i = 1; i < 100001; i++) Duc.printMessage(i,out);
            out.close();
        }catch (FileNotFoundException e1){
            System.out.println();
        }

    }
}