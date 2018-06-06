import java.io.*;
import java.security.SecureRandom;
import java.util.*;

public class insertDesProj {
    Map<Integer,String> name;
    private int key;
    private PrintStream output;

    public insertDesProj(){
        name = new HashMap<>();
        makeName();
    }

    public Map<Integer,String> getName(){
        return this.name;
    }

    public void makeName(){
        String tmp = "Tran Duc ";
        this.name.put(0,null);
        for(int i=1;i<100001;i++) this.name.put(i,tmp+i);
    }

    public String getDate(){
        Random rand = new Random();
        int yyyy = rand.nextInt(21)+1997;
        int mm = rand.nextInt(12)+1;
        int dd=1;
        switch (mm){
            case 1 : case 3 : case 5 : case 7:
            case 8 : case 10: case 12 : dd  = rand.nextInt(31)+1; break;

            case 2 : dd = rand.nextInt(28)+1; break;

            case 4 : case 6 : case 9 : case 11 : dd = rand.nextInt(30)+1;break;
        }
        String date = "'" + yyyy +"-" + mm + "-" + dd +"'";
        return date;
    }
    public void printMessage(int key, PrintStream output){
        String date = getDate();
        output.println("INSERT INTO \"D_DESCRIBE_PROJ\" VALUES (" + key + ",'" +name.get(key) +"'," + date + ",'" + makeString.getString(50)+"');" );
    }

    public static void main(String[] args){

        insertDesProj Duc = new insertDesProj();

        try {
            PrintStream out = new PrintStream(new FileOutputStream("insertDesProj.txt"));
            for (int i = 1; i < 100001; i++) Duc.printMessage(i,out);
            out.close();
        }catch (FileNotFoundException  e1){
            System.out.println();
        }

    }
}
