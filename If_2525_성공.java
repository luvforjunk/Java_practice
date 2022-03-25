import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int A, B, C;
    A = scan.nextInt();
    B = scan.nextInt();
    C = scan.nextInt();

    if ((B+C)< 60) {
      System.out.println(A +" "+ (B+C));
    } else {
      A += (B+C)/60;
      if(A > 23)
      System.out.println((A-24) +" "+ (B+C)%60);  
      else
      System.out.println(A +" "+ (B+C)%60);
    }
  } 
}