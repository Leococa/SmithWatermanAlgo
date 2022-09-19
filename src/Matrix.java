import java.lang.String;
import java.lang.*;

public class Matrix {
    int gap=-2;
    int score;
    int[][] mat;
    String sequence1;
    String sequence2;
    int size;

    public Matrix(){

    }

    public void initMat(String seqA, String seqB, int size) {

        this.mat= new int[size][size];
        this.size = size;
        this.sequence1=seqA;
        this.sequence2=seqB;
        int cpt1=0,cpt2;

        //Print the matrix
        //Initialize the matrix
        //Print the first sequence in row
        System.out.print("   ");
        for (int k = 0; k < size-1; k++) {
            System.out.print(" " + seqA.charAt(k));
        }
        System.out.print("\n");
        System.out.print("  0");
        for (int i = 0; i < size-1; i++) {
            System.out.print(" 0");
        }
        System.out.print("\n");

        //Print the second sequence in column
        for (int i = 0; i < size-1; i++) {
            System.out.print(seqB.charAt(i)+" " + "0 ");
            cpt2=0;

            //Compare the sequences
            for (int j = 0; j < size-1; j++) {
                if (seqA.charAt(j) != seqB.charAt(i)){
                    //System.out.print("0 ");
                    score=0;
                }
                else{
                    //System.out.print("1 ");
                    score=1;
                }
                cpt2++;

                //Fill the matrix with the score
                mat[i+1][j+1]=Math.max(Math.max(Math.max(mat[i][j]+score ,0),Math.max(mat[i+1][j]+gap,gap)), Math.max(mat[i][j+1]+gap,gap));
                System.out.print(mat[i+1][j+1]+" ");
            }
            cpt1++;

            System.out.println(" ");

        }
        //System.out.println("\n ");
        //printMat();

    }

    /*public void printMat(){
        int compt=0;
        System.out.print("   ");
        for (int k = 0; k < size-1; k++) {
            System.out.print(" " + sequence1.charAt(k));
        }
        System.out.println("");
        System.out.print("  ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(this.mat[i][j]+" ");
            }
            System.out.println("");
            if (compt<10) {
                System.out.print(sequence2.charAt(compt) + " "); // compt avec stop à 10
                compt++;
            }
        }
    }*/



}
