import java.util.Scanner;

class invertedRightTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            System.out.println("  ".repeat(i)+"* ".repeat(N-i));
        }
        sc.close();
    }
}
