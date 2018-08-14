public class Recursive{
  public static void main(String[] args){
    if (args.length != 1) {
      System.out.println("DAAAH!");
      return;
    }
    int numbre = Integer.parseInt(args[0]);
    System.out.println(factorial(numbre));
  }

  public static int factorial(int n) {
    if(n == 0) return 1;
    return n * factorial(n-1);
  }
}
