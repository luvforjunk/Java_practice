import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int a;
    a = scan.nextInt();

    if (89 < a){
      System.out.println("A");
    } else if (79 < a){
      System.out.println("B");
    } else if (69 < a){
      System.out.println("C"); 
    } else if (59 < a){
      System.out.println("D");
    } else {
      System.out.println("F");
    }
  }
}