class ScoreArray{
  public static void main(String[] args){
    // 配列の生成
    int[] data = new int[4];

    //配列に値を代入
    data[0] = 90;
    data[1] = 80;
    data[2] = 100;
    data[3] = 90;
    // int[] data = { 90, 80, 100, 90 };

    // 値を代入
    for (int i = 0; i < data.length; i++) {
      System.out.println((i + 1) + "人目は" + data[i] + "点");
    }
  }
}
