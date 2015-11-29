/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author EIS茂木 <br />
 *         Test09 <br />
 *         １から実行時引数で与えられた値まで加算し、コンソールに出力する。 <br />
 *         更新履歴 2015/11/29 EIS茂木：新規作成 <br />
 */
public class Test09 {

  /**
   * Test09 <br />
   * １から実行時引数で与えられた値まで加算し、コンソールに出力する。 <br />
   * 
   * @param args コマンドライン引数（加算値の終了値）
   */
  public static void main( String[] args ) {

    // 引数の１番目で指定された整数まで加算する。
    // なお、引数の１番目を整数型へ変換する。その際に発生する可能性のある例外は無視する。
    int sum = 0;
    for ( int i = 0; i <= Integer.parseInt( args[0] ); i++ ) {
      sum = sum + i;
    }
    System.out.println( "加算結果：" + sum );
  }

}
