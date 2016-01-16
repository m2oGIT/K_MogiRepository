/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java007;

/**
 * @author EIS茂木 <br />
 *         Member <br />
 *         社員No、姓、名を管理するクラス。 <br />
 *         更新履歴 2016/01/11 EIS茂木：新規作成 <br />
 */
public class Member {
  // 社員No
  private String id;
  // 姓
  private String firstName;
  // 名
  private String secondName;

  /**
   * Member <br />
   * コンストラクタ <br />
   * 
   * @param id 社員No
   * @param firstName 姓
   * @param secondName 名
   */
  public Member( String id, String firstName, String secondName ) {
    this.id = id;
    this.firstName = firstName;
    this.secondName = secondName;
  }

  /**
   * showInfo <br />
   * 自オブジェクトの要素を標準出力へ出力する。 <br />
   */
  public void showInfo() {
    System.out.println( "社員No:" + this.id );
    System.out.println( "姓       :" + this.secondName );
    System.out.println( "名       :" + this.firstName );
    System.out.println( "姓名    :" + this.secondName + "" + this.firstName );
    System.out.println( "" );
  }

  /**
   * checkName <br />
   * 引数っとして渡されたMemberオブジェクトの姓・名と、 <br />
   * 自オブジェクトの姓・名を比較し、結果を標準出力へ出力する。<br/>
   * 
   * @param member 比較対象のMemberオブジェクト
   */
  public void checkName( Member member ) {
    if ( this.secondName.equals( member.secondName )
        && this.firstName.equals( member.firstName ) ) {
      System.out.println( "社員No=[" + this.id + "]と、社員No=[" + member.id + "]は同姓同名です" );
    } else {
      System.out.println( "社員No=[" + this.id + "]と、社員No=[" + member.id + "]は同姓同名ではありません" );
    }
  }
}
