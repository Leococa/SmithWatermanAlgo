//Project Smith-Waterman Algorithm by Hugo Trinh and Léo Cocatrix Group C Concordia
//Teacher Mohammed Shehab 2022

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.String;

public class ReadFile {
    String seq1="";
    String seq2="";
    public ReadFile() {

    }

    // Method to read the file and print all the sequences from it
    public void printSequences(){
        int cpt=1; // to get the number of the sequence
        try {
            File file = new File("DNA_data.txt"); // open the file "DNA_data.txt"
            Scanner myReader = new Scanner(file);   // scanner to read file
            System.out.println("The sequences in this file :");
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data != "" && data.indexOf(">") == 0) { // stops at the line with ">" at the start
                    System.out.println(cpt+" "+myReader.nextLine()); // read the next line with the sequence and print it (with the line number)
                    cpt++;
                }
            }
        }
        catch (FileNotFoundException e) {  // catch the exception if the file isn't found
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //method to get 2 sequences from the user
    public void getSequences(int line1, int line2) { // takes the 2 lines number from the user in the main method
        int cpt=1;
        try {
            File file = new File("DNA_data.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data != "" && data.indexOf(">") == 0){
                    String seq = myReader.nextLine();
                    if(cpt==line1){ // if the counter is equal to the line number, stores the sequence string in the object variable
                        this.seq1 = seq;

                    }
                    if (cpt==line2) { // does the same as the last if to store the second sequence in seq2
                        this.seq2 = seq;
                    }
                    cpt++;
                }

            }
            myReader.close();
        } catch (FileNotFoundException e) { // catch the file not found exception
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
