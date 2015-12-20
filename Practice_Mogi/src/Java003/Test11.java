/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.math.BigDecimal; //BigDecimal型

/**
 * @author EIS茂木 <br />
 *         小数点を使用した演算 <br />
 *         0.1を１０回加算した結果を10.0として表示する。 <br />
 *         更新履歴 2015/12/20 EIS茂木：新規作成 <br />
 */
public class Test11 {

  /**
   * main <br />
   * メインメソッド <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    // 浮動小数点型（double）で、0.1を10回加算し結果をコンソールに出力する。
    double num = 0;
    for ( int i = 0; i < 10; i++ ) {
      num = num + 0.1;
    }
    System.out.println( "0.1を10回加算した結果:" + num );

    // BigDecimal型で、0.1を10回加算し結果をコンソールに出力する。
    BigDecimal numBigDecimal = new BigDecimal( "0.00" );
    for ( int i = 0; i < 10; i++ ) {
      numBigDecimal = numBigDecimal.add( new BigDecimal( "0.1" ) );
    }
    System.out.println( "BicDecimalによる結果:" + numBigDecimal );

  }
}
