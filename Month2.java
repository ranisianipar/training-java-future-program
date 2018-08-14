public class Month2{
  public static void main(String[] args){
    if (args.length != 2) {
      System.out.println("DAAAH!");
      return;
    }
    int year = Integer.parseInt(args[0]);
    int month = Integer.parseInt(args[1]);
    int day = 0;

    switch(month){
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        System.out.println(31);
        break;
      case 4:
      case 6:
      case 9:
        System.out.println(30);
        break;
      case 2:
        if(year % 4 == 0) {
          System.out.println(28);
          return;
        }
        System.out.println(29);
    }
  }
}
