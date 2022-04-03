import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int T = scan.nextInt();
    int arr[] = new int[T];
    
      for(int i=0; i<T; i++){
        
      int a = scan.nextInt();
      int b = scan.nextInt();
        
        arr[i] = a+b;
        
      }
      for(int w : arr){
      
      System.out.println(w);
    }
  } 
}