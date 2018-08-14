public class Person{
  public static void main(String[] args){
    if (args.length != 1){
      System.out.println("Ga ada");
      return;
    }
    int score = Integer.parseInt(args[0]);
    if (score <= 20) {
      System.out.println('E');
    } else if (score > 20 && score <= 40) {
       System.out.println('D');
    } else if (score > 40 && score <= 60) {
      System.out.println('C');
    } else if (score > 60 && score <= 80) {
      System.out.println('B');
    } else {
      System.out.println('A');
    }
  }
}
