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

    public void initMat(String seqa, String seqb, int size) {
        this.mat= new int[size][size];
        this.size = size;
        this.sequence1=seqa;
        this.sequence2=seqb;
        int cpt1=0,cpt2=0;

        //print
        System.out.print("   ");
        for (int k = 0; k < size-1; k++) {
            System.out.print(" " + seqa.charAt(k));
        }
        System.out.println("");
        System.out.print("  0");
        for (int i = 0; i < size-1; i++) {
            System.out.print(" 0");
        }
        System.out.println("");
        for (int i = 1; i < size; i++) {
            System.out.print(seqb.charAt(cpt1)+" " + "0 ");
            cpt2=0;
            for (int j = 1; j < size; j++) {
                if (seqa.charAt(cpt2) != seqb.charAt(cpt1)){
                    //System.out.print("0 ");
                    score=0;
                    //mat[i+1][j+1]=score;
                }
                else{
                    //System.out.print("1 ");
                    score=1;
                    //mat[i+1][j+1]=score;
                }
                cpt2++;
                mat[i][j]=Math.max(Math.max(Math.max(mat[i-1][j-1]+score ,0),Math.max(mat[i][j-1]+gap,gap)), Math.max(mat[i-1][j]+gap,gap));
                System.out.print(mat[i][j]+" ");
            }
            cpt1++;

            System.out.println(" ");

        }

        //printMat();

    }

    public void printMat(){
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
    }



}
