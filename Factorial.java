public class Factorial{
  public static void main(String[] args){
    if (args.length != 1) {
      System.out.println("DAAAH!");
      return;
    }
    int numbre = Integer.parseInt(args[0]);
    int answer = 1;
    for(int i = 1; i < numbre+1 ; i++) {
      answer *= i;
    }
    System.out.println(answer);
  }
}
