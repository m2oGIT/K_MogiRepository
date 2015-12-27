/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java005;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * @author EIS茂木 <br />
 *         ArrayToCollectionTest <br />
 *         標準入力から整数を5件読み込み、最大のものを表示する。（ArrayList版） <br />
 *         更新履歴 2015/12/22 EIS茂木：新規作成 <br />
 */
public class ArrayToCollectionTest {

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
      ArrayList<Integer> numList = new ArrayList<Integer>();

      // 標準入力から文字列を5件読み込む
      for ( int i = 1; i <= 5; i++ ) {
        // プロンプトの表示
        System.out.print( "整数を入力（" + i + "）：" );

        // バッファーリーダーを使用して一行読み込み、整数型へ変換してArrayListへ格納する。
        // 入力した一行を整数値化（失敗した場合は例外処理へ）
        numList.add( new Integer( bufferedStdin.readLine() ) );
      }

      // 入力された整数のうちの最大値
      // 初期値はnumListの先頭の値とする。
      int maxNum = numList.get( 0 ).intValue();

      // 主処理の事前準備（変数の宣言・初期化）
      int sumNum = 0; // 入力された整数の合計値

      // ArrayList(numList)に格納した要素全権に対しての処理
      for ( Integer value : numList ) {

        // 入力値からの最大値の判定
        if ( maxNum < value.intValue() ) {
          // 保管された最大値より大きい場合は入れ替え
          maxNum = value.intValue();
        }
        // 合計値の計算
        sumNum = sumNum + value.intValue();

      }

      // 最大値をコンソールへ出力
      System.out.println( "最大値：" + maxNum );
      System.out.println( "合計値；" + sumNum );

      // 平均値の計算、コンソールへの出力
      BigDecimal aveBD = new BigDecimal( sumNum ); // 合計値をBigDecimal型として生成
      System.out.println( "平均値：" + aveBD.divide( new BigDecimal( "5.0" ) ) ); // 平均値の計算

    } catch ( NumberFormatException e ) {
      // 整数への変換で例外を検知した場合
      System.out.println( "整数への変換で例外を検知。処理を終了する。" + e );
    } catch ( Exception e ) {
      // 例外を検知した場合
      System.out.println( "例外を検知。処理を終了する。" + e );
    }
  }
}
