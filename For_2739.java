import java.util.*;

class Main {
  public static void main(String[] args){ 
    
    Scanner scan = new Scanner(System.in);

    int n;
    int j;

    n = scan.nextInt();

    for(j=1; j<=9; j++){

      System.out.println(n + " * " + j + " = " + (n*j));
    }
  }  
}