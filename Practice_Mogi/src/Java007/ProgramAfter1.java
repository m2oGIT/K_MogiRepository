/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java007;

/**
 * @author EIS茂木 <br />
 *         ProgramAfter1 <br />
 *         社員情報の表示、同姓同名チェックをメソッド化 <br />
 *         更新履歴 2016/01/11 EIS茂木：新規作成 <br />
 */
public class ProgramAfter1 {
  /**
   * showInfo <br />
   * 引数で渡された要素を標準出力へ出力する。 <br />
   * 
   * @param id 社員No
   * @param firstName 姓
   * @param secondName 名
   */
  public static void showInfo( String id, String firstName, String secondName ) {
    System.out.println( "社員No:" + id );
    System.out.println( "姓       :" + secondName );
    System.out.println( "名       :" + firstName );
    System.out.println( "姓名    :" + secondName + "" + firstName );
    System.out.println( "" );
  }

  /**
   * checkName <br />
   * 同姓同名チェック <br />
   * パラメータで渡された社員１と社員２の姓および名を比較し、 <br/>
   * その結果を標準出力へ出力する。
   * 
   * @param id1 社員No1
   * @param firstName1 姓１
   * @param secondName1 名１
   * @param id2 社員No2
   * @param firstName2 姓２
   * @param secondName2 名２
   */
  public static void checkName( String id1, String firstName1, String secondName1, String id2,
      String firstName2, String secondName2 ) {
    if ( secondName1.equals( secondName2 ) && firstName1.equals( firstName2 ) ) {
      System.out.println( "社員No=[" + id1 + "]と、社員No=[" + id2 + "]は同姓同名です" );
    } else {
      System.out.println( "社員No=[" + id1 + "]と、社員No=[" + id2 + "]は同姓同名ではありません" );
    }

  }

  /**
   * main <br />
   * 主処理 <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    // 社員No
    String id1 = "00001";
    // 名
    String firstName1 = "一郎";
    // 姓
    String secondName1 = "鈴木";

    // 社員No
    String id2 = "00002";
    // 名
    String firstName2 = "一郎";
    // 姓
    String secondName2 = "鈴木";

    // 社員No
    String id3 = "00003";
    // 名
    String firstName3 = "三郎";
    // 姓
    String secondName3 = "鈴木";

    // 社員情報を表示(-人目)
    showInfo( id1, firstName1, secondName1 );
    // 社員情報を表示(二人目)
    showInfo( id2, firstName2, secondName2 );
    // 社員情報を表示(三人目)
    showInfo( id3, firstName3, secondName3 );

    // 同姓同名チェック(一人目と二人目)
    checkName( id1, firstName1, secondName1, id2, firstName2, secondName2 );
    // 同姓同名チェック(一人目と三人目)
    checkName( id1, firstName1, secondName1, id3, firstName3, secondName3 );
    // 同姓同名チェック(二人目と三人目)
    checkName( id2, firstName2, secondName2, id3, firstName3, secondName3 );


  }

}
