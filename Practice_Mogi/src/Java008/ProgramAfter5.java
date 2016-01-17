/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import Java007.Member;

/**
 * @author EIS茂木 <br />
 *         ProgramAfter5 <br />
 *         1.入力ファイルから1行ずつ読み取り、ファイルの最後になるまで、リスト(List<Member>)に格納する。<br />
 *         2.リストに格納した社員情報を元に、出力ファイルに出力する。 <br />
 *         更新履歴 2015/1/17 EIS茂木：新規作成 <br />
 */
public class ProgramAfter5 {

  /**
   * Main <br />
   * 主処理 <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    // 読み込むファイルのパス（相対パス）
    String inputFileName = "run/file/input.txt";
    // ファイルオブジェクトの生成
    File inputFile = new File( inputFileName );
    // 入力ストリームのインスタンスを仮で生成
    BufferedReader br = null;

    // 書き込むファイルのパス（相対パス）
    String outputFileName = "run/file/output.txt";
    // PrintWriterの宣言
    PrintWriter pw = null;

    try {

      // 入力ストリームの生成
      br = new BufferedReader( new InputStreamReader( new FileInputStream( inputFile ) ) );

      // 出力ストリームの生成
      FileOutputStream fos = new FileOutputStream( outputFileName, false ); // 第二引数にfalse（上書き）
      pw = new PrintWriter( new OutputStreamWriter( fos ) );

      // MemberクラスのArrayListを生成
      ArrayList<Member> memberList = new ArrayList<Member>();

      // テキストファイルから1行ずつ読み込み、memberListへMemberオブジェクトを生成して格納する。
      String msg;
      while ( ( msg = br.readLine() ) != null ) {

        // 読み込んだ行を「,」で分割（Memberクラスのパラメータ数のあわせて3つに分割）
        String[] msgElm = msg.split( ",", 3 );

        // 分割した要素を使用してMemberクラスのArrayListへ格納
        memberList.add( new Member( msgElm[0], msgElm[2], msgElm[1] ) );

      }

      // membListから１要素ずつ取り出し、Memberオブジェクトのgetterを使用して整形し、出力ファイルへ書きだす。
      int i = 0; // 要素数のカウント用
      for ( Member mb : memberList ) {
        i++;
        pw.println( "行数:[" + i + "] 社員No.:[" + mb.getId() + "] 名前:[" + mb.getFirstName()
            + mb.getSecondName() + "]" );
      }

      // バッファのフラッシュ（メモリから実ファイルへの書き出し）
      pw.flush();

      // エラー時は、スタックトレースを出力
    } catch ( IOException e ) {
      e.printStackTrace();

    } finally {
      // finallyブロックに明示的なクローズ処理を記述する。
      try {
        br.close();
        pw.close();
      } catch ( IOException e ) {
        e.printStackTrace();
      }
    }
  }
}
