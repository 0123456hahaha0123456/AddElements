import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

public class insertAccount {
    private static ArrayList<String> username;
    private Map<String,String> account ;
    //final static ArrayList<String> user;
    //final Map<String,String> acc;
    public insertAccount(){
        username = new ArrayList<>();
        account = new HashMap<>();
        makeaccount();
    }

    public ArrayList<String> getUsername(){
        return this.username;
    }
    private void makeaccount(){
        username.add(null);
        account.put(null,null);
        for(int i=1;i<100001;i++){
            String user = "ductran"+i;
            username.add(user);
            account.put(user,makeString.getString(10));
        }
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

    public void printMessage(int key, PrintStream output){

        String date = getDate();
        output.println("INSERT INTO \"D_ACCOUNT\" VALUES (" + key + ",'" +username.get(key) +"','"+account.get(username.get(key))+"',"+date+");" );
    }
/*
    public static void main(String[] args){

        insertAccount Duc = new insertAccount();

        try {
            PrintStream out = new PrintStream(new FileOutputStream("insertAccount.txt"));
            for (int i = 1; i < 100001; i++) Duc.printMessage(i,out);
            out.close();
        }catch (FileNotFoundException e1){
            System.out.println();
        }
       // insertThread Duc = new insertThread();
       // Duc.main();
    }*/
}
