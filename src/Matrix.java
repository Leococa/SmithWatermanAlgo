import java.lang.String;

public class Matrix {
    int gap=-2;
    int score;
    int[][] mat = new int[0][0];

    public Matrix(){

    }

    public void initMat(String seqa, String seqb, int size) {
        this.mat= new int[size][size];
        for (int i = 0; i < size; i++) {
            mat[0][i] = 1;
        }

        for (int j = 0; j < size; j++) {
            mat[j][0] = 2;
        }

        //print
        System.out.print(" ");
        for (int k = 0; k < size; k++) {
            System.out.print(" " + seqa.charAt(k));
        }
        System.out.println("");
        for (int i = 0; i < size; i++) {
            System.out.print(seqb.charAt(i)+" ");
            for (int j = 0; j < size; j++) {
                if (seqa.charAt(j) != seqb.charAt(i)){
                    System.out.print("0 ");
                    score=0;
                }
                else{
                    System.out.print("1 ");
                    score=1;
                }
            }

            System.out.println(" ");
        }


    }

    public void printMat(int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(this.mat[i][j]+" ");
            }
            System.out.println("\n");
        }
    }


}
