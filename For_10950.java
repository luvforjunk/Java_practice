import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int T;

    T = scan.nextInt();

    int a, b, i;
    
      for(i=0; i<T; i++){
        
      a = scan.nextInt();
      b = scan.nextInt();
                  
      System.out.println(a+b);
    }
  } 
}