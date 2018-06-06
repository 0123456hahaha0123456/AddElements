import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;


public class insertTeamMember {
    public void printMessage(int key,PrintStream output){
        Random rand = new Random();
        int id = rand.nextInt(100000)+1;
        output.println("INSERT INTO \"D_TEAM_MEMBER\" VALUES (" +key+","+key+","+id+","+id+");");
    }
    public static void main(String[] args){
        insertTeamMember Duc = new insertTeamMember();
        try {
            PrintStream out = new PrintStream(new FileOutputStream("insertTeamMember.txt"));
            for (int i = 1; i < 100001; i++) Duc.printMessage(i,out);
            out.close();
        }catch (FileNotFoundException e1){
            System.out.println();
        }

    }
}