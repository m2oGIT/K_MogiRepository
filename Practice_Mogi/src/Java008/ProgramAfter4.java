/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java008;

import java.util.ArrayList;

import Java007.Member;

/**
 * @author EIS茂木 <br />
 *         ProgramAfter4 <br />
 *         社員情報を配列を使用して生成する <br />
 *         更新履歴 2016/01/16 EIS茂木：新規作成 <br />
 */
public class ProgramAfter4 {

  /**
   * main <br />
   * 主処理 <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    // 社員情報
    String[][] array = {
        {
            "001", "一郎", "鈴木"
        },
        {
            "002", "一郎", "鈴木"
        },
        {
            "003", "三郎", "鈴木"
        }
    };

    // 社員情報リスト
    ArrayList<Member> list = new ArrayList<Member>();

    // リストに追加
    for ( int i = 0; i < array.length; i++ ) {
      list.add( new Member( array[i][0], array[i][1], array[i][2] ) );
    }

    // リストに設定した情報を表示
    for ( Member value : list ) {
      value.showInfo();
    }

  }
}
