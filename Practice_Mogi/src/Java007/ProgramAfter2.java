/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java007;

/**
 * @author EIS茂木 <br />
 *         ProgramAfter2 <br />
 *         社員情報クラスを使用した操作 <br />
 *         更新履歴 2016/01/11 EIS茂木：新規作成 <br />
 */
public class ProgramAfter2 {

  /**
   * main <br />
   * 主処理 <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    // １人目
    Member member1 = new Member( "00001", "一郎", "鈴木" );
    // ２人目
    Member member2 = new Member( "00002", "一郎", "鈴木" );
    // ３人目
    Member member3 = new Member( "00003", "三郎", "鈴木" );

    // 社員情報を表示(１人目)
    member1.showInfo();

    // 社員情報を表示(２人目)
    member2.showInfo();

    // 社員情報を表示(３人目)
    member3.showInfo();


    // 同姓同名チェック(１人目と２人目)
    member1.checkName( member2 );

    // 同姓同名チェック(１人目と３人目)
    member1.checkName( member3 );

    // 同姓同名チェック(２人目と３人目)
    member2.checkName( member3 );
  }

}
