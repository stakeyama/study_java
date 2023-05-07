class Triangle {
  public static void main(String[] args) {
    int height = Integer.parseInt(args[0]);
    int width = Integer.parseInt(args[1]);
    double area;

    // 面積の計算
    // 底辺 × 高さ / 2
    area = width * height / 2.0;

    // 高さ・幅・面積の表示
    System.out.println("高さ：" + height);
    System.out.println("幅：" + width);
    System.out.println("面積：" + area);
  }
}
