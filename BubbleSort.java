public class BubbleSort{
  public static void main(String[] args){
    if (args.length <= 1) {
      System.out.println("DAAAH!");
      return;
    }
    int[] arr = new int[args.length];

    // init
    for(int x = 0; x < arr.length; x++) {
      arr[x] = Integer.parseInt(args[x]);
    }

    for(int x = 0; x < arr.length-1; x++) {
      // sorting
      for(int y = 0; y < arr.length-x-1; y++) {
        if(arr[y]>arr[y+1]) {
          swap(arr, y, y+1);
        }
      }
    }
    // print answer
    for(int i=0; i< arr.length; i++) {
      System.out.print(arr[i] +" ");
    }
  }
  public static void swap(int[]arr, int x, int y) {
    int temp = 0;
    temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }
}
