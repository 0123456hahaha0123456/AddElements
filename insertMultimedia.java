import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;

public class insertMultimedia {
    public void printMessage(int key, PrintStream output){
        Random rand = new Random();
        String source = "http://google.com.vn/"+ makeString.getString(4)+key;
        String name = makeString.getString(10);
        int id_des = rand.nextInt(100000)+1;
        output.println("INSERT INTO \"D_MULTIMEDIA\" VALUES (" + key + ",'" +name +"','"+source+"',"+id_des+");" );
    }

    public static void main(String[] args){
        insertMultimedia Duc = new insertMultimedia();
        try {
            PrintStream out = new PrintStream(new FileOutputStream("insertMulti.txt"));
            for (int i = 1; i < 100001; i++) Duc.printMessage(i,out);
            out.close();
        }catch (FileNotFoundException e1){
            System.out.println();
        }
    }
}
