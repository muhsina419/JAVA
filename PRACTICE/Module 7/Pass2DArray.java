import java.util.Scanner;

public class Pass2DArray {
    public static void main(String[] args) {
        int[][] m =getArray();

        System.out.println("\nSum of all elements is "+sum(m));
    }

    public static int [][] getArray(){
        Scanner in = new Scanner(System.in);

        int [][] m = new int [3][4];
        System.out.println("Enter "+m.length+"rows and "+m[0].length+"coloumns ");
        for (int i =0 ; i<m.length;i++){
            for(int j=0; j<m[i].length;j++){
                m[i][j] = in.nextInt();
            }
        }
        return m;
    }

    public static int sum(int[][] m){
        int total =0;
        for (int row=0;row<m.length;row++){
            for(int coloumns=0;coloumns<m[row].length;coloumns++){
                total+=m[row][coloumns];
            }
        }
        return total;
    }
}
