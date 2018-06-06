import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.Random;

public class insertProj {
    Map<Integer,String> name;

    public insertProj(insertDesProj Duc){
        name = Duc.getName();
    }

    public void printMessage(int key,PrintStream output){
        Random rand = new Random();
        int level = rand.nextInt(5)+1;
        int size = rand.nextInt(10)+1;

        String kind = makeString.getString(10);
        String nameCre = "ductran"+ (rand.nextInt(100000)+1);
        output.println("INSERT INTO \"D_PROJECT\" VALUES (" + key +",'"+name.get(key) +"','"+nameCre +"','" + kind + "'," + level+","+size+","+key+");" );
    }

    public static void main(String[] args){
        insertDesProj Duc = new insertDesProj();
        insertProj tmp = new insertProj(Duc);

        try {
            PrintStream out = new PrintStream(new FileOutputStream("insertProj.txt"));
            for (int i = 1; i < 100001; i++) tmp.printMessage(i,out);
            out.close();
        }catch (FileNotFoundException e1){
            System.out.println();
        }
    }
}
