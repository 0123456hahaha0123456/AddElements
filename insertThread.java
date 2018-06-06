import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

public class insertThread {
    public void printMessage(int key, PrintStream output, insertAccount tmp){
        Random rand = new Random();
        int index = rand.nextInt(100000)+1;
        String name = makeString.getString(25)+key;

        output.println("INSERT INTO \"D_THREAD\" VALUES (" + key + ",'" +name +"',"+getDate()+",'"+getWhoCreated(index,tmp)+"','"+makeString.getString(30)+"',"+index+");" );
    }
    public String getDate(){
        Random rand = new Random();
        int yyyy = rand.nextInt(21)+1997;
        int mm = rand.nextInt(12)+1;
        int dd=1;
        switch (mm){
            case 1 : case 3 : case 5 : case 7:
            case 8 : case 10: case 12 : dd  = rand.nextInt(31)+1;break;

            case 2 : dd = rand.nextInt(28)+1;break;

            case 4 : case 6 : case 9 : case 11 : dd = rand.nextInt(30)+1;break;
        }
        String date = "'" + yyyy +"-" + mm + "-" + dd +"'";
        return date;
    }
    public String getWhoCreated(int index,insertAccount tmp){
        ArrayList<String> arr = tmp.getUsername();
        String whoCreated = arr.get(index);
        return whoCreated;
    }
    public static void main(String[] args){
        insertAccount Duc = new insertAccount();
        insertThread Duc_ = new insertThread();
        try {
            PrintStream out = new PrintStream(new FileOutputStream("insertAccount.txt"));
            PrintStream out_ = new PrintStream(new FileOutputStream("insertThread.txt"));
            for (int i = 1; i < 100001; i++)
            {
                Duc.printMessage(i,out);
                Duc_.printMessage(i,out_,Duc);
            }

            out.close();
            out_.close();
        }catch (FileNotFoundException e1){
            System.out.println();
        }
    }
}