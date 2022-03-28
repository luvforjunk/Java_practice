import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int H, M;
    H = scan.nextInt();
    M = scan.nextInt();

    if (M < 45){
      if(H == 0)
      System.out.println("23" +" "+ ((M-45)+60)); 
      else 
      System.out.println((H-1) +" "+ ((M-45)+60));
    } else if (M == 45) {
      System.out.println(H +" "+ 00);
    } else if (M > 45){
      System.out.println(H +" "+(M-45));
    }
  } 
}