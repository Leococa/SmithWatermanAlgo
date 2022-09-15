import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.String;

public class ReadFile {
    String seq1="";
    String seq2="";
    public ReadFile() {

    }

    public void printSequences(){
        int cpt=1;
        try {
            File file = new File("DNA_data.txt");
            Scanner myReader = new Scanner(file);
            System.out.println("The sequences in this file :");
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data != "" && data.indexOf(">") == 0) {
                    System.out.println(cpt+" "+myReader.nextLine());
                    cpt++;
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void getSequences(int line1, int line2) {
        int cpt=1;
        try {
            File file = new File("DNA_data.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data != "" && data.indexOf(">") == 0){
                    String seq = myReader.nextLine();
                    if(cpt==line1){
                        this.seq1 = seq;

                    }
                    if (cpt==line2) {
                        this.seq2 = seq;
                    }
                    cpt++;
                }

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
