import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;

public class insertTag {
    public void printMessage(int key, PrintStream output){
        Random rand = new Random();
        String source = "http://google.com.vn/"+ makeString.getString(4)+key;
        String name = makeString.getString(5)+key;
        int id_des = rand.nextInt(100000)+1;
        output.println("INSERT INTO \"D_TAG\" VALUES (" + key + ",'" +name +"','"+source+"',"+id_des+");" );
    }

    public static void main(String[] args){
        insertTag Duc = new insertTag();
        try {
            PrintStream out = new PrintStream(new FileOutputStream("insertTag.txt"));
            for (int i = 1; i < 100001; i++) Duc.printMessage(i,out);
            out.close();
        }catch (FileNotFoundException e1){
            System.out.println();
        }
    }
}