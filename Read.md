# Javaのプログラムの構成

---
## プログラムの構成
- Javaのプログラムは**クラス**の集まり。
- クラス名とファイル名は合わせる
- クラスの内容を { から }の間（**ブロック**）に書く
- 処理のまとまりを**メソッド**と呼び、Javaは**mainメソッド**から実行される
- 処理文は;（セミコロン）で終わる

`System.out.println()`は()内のデータを表示する

```
class クラス名 {
	public static void main (String args[] {
		処理文
	})
}
```

---
## わかりやすいプログラムを書く3つのポイント
1. **コメント**: プログラム内のメモ書き

` // コメント` → 1行のコメント

` /* コメント */ ` → 複数のコメント

2. **フォーマット**: プログラムの体裁
- プロックの開始・終了や処理文ごとに改行する
- タブや半角スペースで字下げ（インデント）する

3. **命名ルール**: 名付けの慣習
- １文字目
  - クラス・インターフェース：**大文字**からスタート
  - 変数・メソッド・パッケージ：**小文字**
からスタート

- ２つ目以降の単語は**大文字**からスタート

## 変数とは
- 変数はデータの**入れ物**
- 変数名のルール
  - 1文字目→英字(a~z, A~Z)._,$
  - ２文字目以降は数字可能
  - キーワードは使えない(public, static, voidなど)

## 変数の使い方
1. **宣言する**: 変数を作る
```
データ型 変数名, 変数名, ...;
( int age;)
```
2. **代入する**: 値を入れる
```
変数名 = 値;
(age = 20;)
```
3. **参照する**: 値を見る
4. 1 + 2: **初期化する**
```
int age = 20;
```

## データ型
データ型：データの種類
Javaのデータ型は約3000種類もある
1. 基本データ型
  - 整数 byte, short, int, long
  - 小数 float, double
  - 文字 char
  - 真偽値 boolean

数値はデフォルトでintとdouble

→float型の小数にはf(F)を、long型の整数にはl(L)をつける

→文字のデータは'で囲む

2. 参照型
	- 文字列
	- 配列

文字列(String型)
```
String name = "竹山";
(Sは大文字)
```
- データ自体はメモリ上の別の場所に置かれてそのアドレスの値（参照値）が変数に入る

---
## 配列
- 配列は同じデータ型のデータ型の変数を複数まとめて管理するもの
- 配列の生成にはnewを使う。生成時にデフォルト初期値が設定される
	```
	データ型[] 配列名 = new データ型[要素数];
	int[] score = new int[3];
	score[0] = 80;
	添字（[]内の数字）は0からスタート
	```
- 配列の初期化
  ```
	データ型[] 配列名 = {値1, 値2, ...}
	```
- 配列名.lengthで配列の要素数を取得できる

---
## 演算子
1. 算術演算子
	```
	7/2 → 3
	7%2 → 1
	```
2. 代入・複合代入演算子
	```
	a += b →aにbを加えてaに代入
	a = a + bと同じ
	```
3. インクリメント・デクリメント演算子
	```
	a++ → aに1を加える
	a = a + 1, a += 1と同じ
	```
4. 関係演算子
	2つの値の大小関係を調べる演算子
	```
	a >= 0 → aが0以上ならtrue
	(結果は必ずtrueかfalse)
	```
5. 論理演算子
  ```
	(a>=0) && (b>=0)
	→aが0以上かつbが0以上ならtrue
	```

- Integer.parseInt(): 文字列型をint型に変換
```
int a = Integer.parseInt(args[0]);
```

---
## 基本データ型の型変換
- 数値同士の演算や代入をするときに、データ型の変換が
	- 自動で行われるとき: 表現できる値の幅が小→大
	- キャストで明示するとき: 表現できる値の幅が→小

	```
	↓自動 ↑明示
	byte
	short（char）
	int
	long
	float
	double
	(boolean型は変換できない)
	```

	```
	int i; // iは32ビットの入れ物
	double d; // dは64ビットの入れ物

	d = i;
	i = (int) d;  ←キャスト（変換後の型）が必要
	```

---
## 構造化プログラミング
下の３つの構造を組み合わせてプログラムを書くこと。プログラムがわかりやすくなる
1. 順次進行
- 上から順番に処理されていくこと
2. 分岐
- ある条件で処理を分ける
(if, while)
3. 繰り返し
- ある条件が満たされている間は同じ処理を繰り返す
(while, for)

---
## if文
```
if(条件式) {
	処理1
} else {
	処理2
}
```

- どちらかの処理しか実行されない
- else以降は省略可
- 処理が一つの時は{}を省略可

---
## else-if文
```
if(条件式1) {
	処理1
} else if(条件式2) {
	処理2
} else {
	処理3
}
```

- 条件式は上から順に判定

---
## switch文
```
switch(式) {
	case 値1:
		処理1
		break;
	case 値2:
		処理2
		break;
	default:
		処理3;
}
```

- 式はbyte型、short型、int型、char型のみ
- 式の値によって処理の開始位置が決まる
- breakは{}を抜ける

---
## while文
ある条件式が満たす間同じ処理を繰り返す
```
while(条件式) {
	処理
}
```

---
## for文
繰り返し処理で何回か決まっているときに同じ処理を繰り返す
```
for (式1; 条件式; 式2) {
	処理
}
式1ではカウンタ変数の準備
式2ではカウンタ変数のインクリメント
```
