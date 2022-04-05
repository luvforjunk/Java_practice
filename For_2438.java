import java.util.*;

class Main {
  public static void main(String[] args){ 

    Scanner scan = new Scanner(System.in);

    int i;
    int j;
    int n = scan.nextInt();
    
    for(i=1; i<=n; i++){

      for(j=0; j<i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}