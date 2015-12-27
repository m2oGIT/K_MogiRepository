/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java006;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * @author EIS茂木 <br />
 *         ConsolelnTest <br />
 *         標準入力から文字列行を「end」が出現するまで読み込み、それらを結合してコンソールへ出力する。 <br />
 *         更新履歴 2015/12/26 EIS茂木：新規作成 <br />
 */
public class ConsolelnTest {

  /**
   * main <br />
   * 主処理 <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    try {

      // 標準入力からの読み込み準備

      // 標準入力のバイトストリームを生成
      InputStreamReader inputStreamStdin = new InputStreamReader( System.in );
      // 標準入力バイトストリームから、バッファーリーダーを生成
      BufferedReader bufferedStdin = new BufferedReader( inputStreamStdin );

      // 標準入力から文字列を5件読み込み、整数に変換してArrayLintへ格納する。
      ArrayList<String> strList = new ArrayList<String>();

      // 標準入力から文字列読み込むループ（「end」が入力されるまでループする）
      while ( true ) {
        // バッファーリーダーを使用して一行読み込む。
        String inputStr = bufferedStdin.readLine();

        // 「end」が入力された場合はループを終了する。
        if ( inputStr.equals( "end" ) ) {
          break;
        }
        // ArrayListへ格納
        strList.add( inputStr );
      }

      // 主処理の事前準備（変数の宣言・初期化）
      String strConcat = ""; // 結合した文字列

      // ArrayList(strList)に格納した文字列を結合する。
      for ( String value : strList ) {
        strConcat = strConcat + value;

      }

      // 最大値をコンソールへ出力
      System.out.println( "貯めた文字列を出力します。" + strConcat );

    } catch ( Exception e ) {
      // 例外を検知した場合
      System.out.println( "例外を検知。処理を終了する。" + e );
    }
  }
}
