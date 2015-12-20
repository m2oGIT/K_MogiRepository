/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java003;

/**
 * @author EIS茂木 <br />
 *         Test13 <br />
 *         アスタリスクで階段を表示する。 <br />
 *         更新履歴 2015/12/20 EIS茂木：EIS茂木 <br />
 */
public class Test13 {

  /**
   * main <br />
   * アスタリスクで会談を表示する。 <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    for ( int i = 0; i < 10; i++ ) {

      for ( int j = 0; j < i; j++ ) {
        System.out.print( "*" );
      }

      System.out.println( "" );
    }

  }

}
