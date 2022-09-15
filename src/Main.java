public class Main {
    public static void main(String[] args) {

        int x=2;
        int y=6;


        ReadFile file = new ReadFile();
        file.printSequences();
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