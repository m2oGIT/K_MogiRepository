/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author EIS茂木 <br />
 *         Test07 <br />
 *         1-100までの数字を加算（ループを使用） <br />
 *         更新履歴 2015/11/23 EIS茂木：新規作成 <br />
 */
public class Test07 {

  /**
   * Test07 <br />
   * （説明） <br />
   * 
   * @param args コマンドライン引数
   */
  /**
   * Test07 <br />
   * 1-100までの数字を加算（ループを使用） <br />
   * ３つのループの方法をそれぞれ使用する。 <br />
   * 
   * @param args コマンドライン引数
   */
  public static void main( String[] args ) {
    // forを使用したループ
    int sumFor = 0;
    for ( int i = 0; i < 100; i++ ) {
      sumFor = sumFor + 1;
    }
    System.out.println( "加算結果(for  )  ：" + sumFor );

    // whileを使用したループ
    int j = 0, sumWhile = 0;
    while ( j < 100 ) {
      sumWhile = sumWhile + 1;
      j++;
    }
    System.out.println( "加算結果(while)  ：" + sumWhile );

    // do-whileを使用したループ
    int k = 0, sumDoWhile = 0;
    do {
      sumDoWhile = sumDoWhile + 1;
      k++;
    } while ( k < 100 );
    System.out.println( "加算結果(do-while):" + sumDoWhile );
  }

}
