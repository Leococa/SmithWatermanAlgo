import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner selectGene = new Scanner(System.in);
        int x,y;

        //Show to the user the different sequences that he can choose
        ReadFile file = new ReadFile();
        file.printSequences();
        System.out.print("\n");

        //Ask the user 2 sequences to choose
        do {
            System.out.println("Hello user, please select two sequences between 1 and 10 :");

            x = selectGene.nextInt();
            y = selectGene.nextInt();
        }while (x>10 || x<1 || y>10 || y<1 );

        //Get the selected sequences in the file text
        file.getSequences(x,y);

        //Print the selected sequences
        System.out.println("The sequences "+x+" and "+y+" are :");
        System.out.println(file.seq1);
        System.out.println(file.seq2);
        String str1=file.seq1;
        String str2=file.seq2;
        System.out.println("\n");

        //Create the matrix for the Smith-Waterman algorithm
        Matrix mat = new Matrix();
        mat.initMat(str1,str2,11);

    }
}