import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner selectGene = new Scanner(System.in);
        int x,y;

        ReadFile file = new ReadFile();
        file.printSequences();
        System.out.print("\n");

        do {
            System.out.println("Hello user. Please select two sequences between 1 and 10.");

            x = selectGene.nextInt();
            y = selectGene.nextInt();
        }while (x>10 || x<1 || y>10 || y<1 );


        file.getSequences(x,y);

        System.out.println("The sequences "+x+" and "+y+" are :");
        System.out.println(file.seq1);
        System.out.println(file.seq2);
        String str1=file.seq1;
        String str2=file.seq2;
        System.out.println("\n");

        Matrix mat = new Matrix();
        mat.initMat(str1,str2,10);
    }
}