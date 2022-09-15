import java.lang.String;

public class Matrix {
    int gap=-2;
    int score;
    int[][] mat = new int[0][0];
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

        //print
        System.out.print(" ");
        for (int k = 0; k < size-1; k++) {
            System.out.print(" " + seqa.charAt(k));
        }
        System.out.println("");
        for (int i = 0; i < size-1; i++) {
            System.out.print(seqb.charAt(i)+" ");
            for (int j = 0; j < size-1; j++) {
                if (seqa.charAt(j) != seqb.charAt(i)){
                    System.out.print("0 ");
                    score=0;
                    mat[i+1][j+1]=score;
                }
                else{
                    System.out.print("1 ");
                    score=1;
                    mat[i+1][j+1]=score;
                }
            }

            System.out.println(" ");
        }


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
