/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author EIS茂木 <br />
 *         Test08 <br />
 *         1-100の整数のうち、奇数の場合のみ加算し、コンソールに出力する。 <br />
 *         更新履歴 2015/11/23 EIS茂木：新規作成 <br />
 */
public class Test08 {

  /**
   * Test08 <br />
   * 1-100の整数のうち、奇数の場合のみ加算し、コンソールに出力する。 <br />
   * 
   * @param args コマンドライン引数
   */
  public static void main( String[] args ) {

    // forを使用したループ
    int sum = 0;
    for ( int i = 0; i < 100; i++ ) {
      // 奇数の場合のみ加算する。
      if ( i % 2 != 0 ) {
        sum = sum + 1;
      }
    }
    System.out.println( "加算結果(奇数の場合のみ)  ：" + sum );

  }

}
