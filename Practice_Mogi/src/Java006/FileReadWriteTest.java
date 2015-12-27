/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java006;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author EIS茂木 <br />
 *         FileReadWriteTest <br />
 *         ・/run/file/text.txtに実行日時と指定された文字列を追加書き込みで書き込む。 <br />
 *         ・最後に、/run/file/text.txtの内容をすべて表示する。<br />
 *         更新履歴 2015/12/27 EIS茂木：新規作成 <br />
 */
public class FileReadWriteTest {
  /**
   * logWrite <br />
   * ログファイルへの書き込み <br />
   * 
   * @param path ログファイルへのパス・ファイル名
   * @param log ログファイルに書き込む文字列
   */
  private static void logWrite( String path, String log ) {

    // PrintWriterの宣言
    PrintWriter pw = null;

    try {

      // 出力ストリームの生成
      FileOutputStream fos = new FileOutputStream( path, true ); // 第二引数にtrue（追加書き込み）
      pw = new PrintWriter( new OutputStreamWriter( fos ) );

      // 現在時刻を取得
      SimpleDateFormat formattedDate = new SimpleDateFormat( "yyyy/MM/dd HH;mm;ss" ); // 書式を指定
      Date date = new Date(); // Dateオブジェクトを引数なしで生成（現在時刻）

      // ファイルへの書き込み（現在時刻と指定された文字列）
      pw.println( formattedDate.format( date ) + log );

      // バッファのフラッシュ（メモリから実ファイルへの書き出し）
      pw.flush();

    } catch ( IOException e ) {
      // 例外検知した場合はスタックトレースを表示
      e.printStackTrace();

    } finally {
      // PrintWriterを明示的にCloseする。
      pw.close();
    }
  }

  /**
   * main <br />
   * 主処理 <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    // 書き込むファイルのパス（相対パス）
    String outputFileName = "run/file/text.txt";
    // ログファイルへの書き込み
    logWrite( outputFileName, "あああ" );

    // ログファイルをコンソールへ全件出力する
    BufferedReader br = null;
    try {
      // BufferReaderの生成
      FileInputStream fis = new FileInputStream( outputFileName );
      br = new BufferedReader( new InputStreamReader( fis ) );

      // ログファイルを全件読み込み、コンソールへ出力する。
      String msg = "";
      while ( ( msg = br.readLine() ) != null ) {
        System.out.println( msg );
      }
    } catch ( FileNotFoundException e ) {
      // ファイルが存在しない場合
      System.out.println( "指定されたファイルが存在しません。" + e );

    } catch ( IOException e ) {
      // 入出力に関する例外を検知した場合
      e.printStackTrace();

    } finally {
      // 終了処理
      try {
        // BufferReaderのClose
        br.close();
      } catch ( IOException e ) {
        // 入出力に関する例外を検知した場合（Close処理）
        System.out.println( "ファイルのCloseに失敗しました。" + e );
      }
    }
  }
}
