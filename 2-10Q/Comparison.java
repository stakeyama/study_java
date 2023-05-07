class Comparison{
  public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    // 大きい方の値を表示
    if (a > b) {
      System.out.println("大きいのは" + a + "です");
    } else if (a < b) {
      System.out.println("大きいのは" + b + "です");
    } else {
      System.out.println("同じです");
    }
  }
}
