import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class insertUser {
    public void printMessage(int key,PrintStream output){
        output.println("INSERT INTO \"D_USERS\" VALUES (" +key+",'"+makeString.getString(15)
                +"','"+makeString.getString(50)
                +"','"+makeString.getString(50)
                +"','"+makeString.getString(10)
                +"',"+key+ ");");
    }

    public static void main(String[] args){
        insertUser Duc = new insertUser();
        try {
            PrintStream out = new PrintStream(new FileOutputStream("insertUser.txt"));
            for (int i = 1; i < 100001; i++) Duc.printMessage(i,out);
            out.close();
        }catch (FileNotFoundException e1){
            System.out.println();
        }

    }
}
