/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author EIS茂木 <br />
 *         Test12 <br />
 *         実行日付を表示する <br />
 *         更新履歴 2015/12/20 EIS茂木：新規作成 <br />
 */
public class Test12 {

  /**
   * main <br />
   * 実行日付を表示する。 <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    SimpleDateFormat formattedDate = new SimpleDateFormat( "yyyy/MM/dd HH;mm;ss" ); // 書式を指定
    Date date = new Date(); // Dateオブジェクトを引数なしで生成（現在時刻）
    System.out.println( "現在の時刻は" + formattedDate.format( date ) + "です。" ); // 書式に則り表示する。

  }
}
