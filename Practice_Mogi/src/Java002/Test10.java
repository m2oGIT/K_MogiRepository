/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author EIS茂木 <br />
 *         Test10 <br />
 *         渡された2種類の整数の間の数を全て合計して返す。 <br />
 *         クラス内にメソッドを作成し、mainメソッドから呼び出す。<br/>
 *         更新履歴 2015/11/30 EIS茂木：新規作成 <br />
 */
public class Test10 {

  /**
   * ２つの文字列間の数値を合計する。 <br />
   * 引数として渡された二つの文字列を整数化し、 <br />
   * １番目の引数から２番目の引数の間の整数をすべて加算する。（引数として渡された数字を含む）<br/>
   * 
   * @param fromInt 加算の開始値（実行時引数の１番目として渡される文字列）
   * @param toInt 加算の終了値（実行時引数の２番目として渡される文字列）
   * @return fromIntからtoIntまでの加算値。（fromInt、toIntの値も含む）
   * @throws NumberFormatException 文字列から整数値への返還の際に発生する可能性あり。
   */
  private static int sumFromTo( String fromInt, String toInt ) throws NumberFormatException {

    int fromValue = Integer.parseInt( fromInt ); // 加算開始値（引数を整数化する）
    int toValue = Integer.parseInt( toInt ); // 加算終了値（引数を整数化する）
    int sum = 0; // 加算結果

    // ２つの整数間の大小関係を調べ、fromValue,toValueの整数へ正しく代入しなおす。
    if ( fromValue > toValue ) {
      // 大小関係が逆の場合、入れ替える。
      int work = fromValue;
      fromValue = toValue;
      toValue = work;
    }
    // ２つの整数間の数値をすべて合計
    for ( int i = fromValue; i <= toValue; i++ ) {
      sum = sum + i;
    }

    // 結果を返却
    return sum;
  }

  /**
   * main <br />
   * メインメソッド <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    
    // メソッドsumFromToを呼び出し、その結果をコンソールに出力する。
    System.out.println( "２つの整数間の値の合計：" + sumFromTo( args[0], args[1] ) );
    
  }
}
