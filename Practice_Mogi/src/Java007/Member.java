/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java007;

/**
 * @author EIS�Ζ� <br />
 *         Member <br />
 *         �Ј�No�A���A�����Ǘ�����N���X�B <br />
 *         �X�V���� 2016/01/11 EIS�Ζ؁F�V�K�쐬 <br />
 */
public class Member {
  // �Ј�No
  private String id;
  // ��
  private String firstName;
  // ��
  private String secondName;

  /**
   * Member <br />
   * �R���X�g���N�^ <br />
   * 
   * @param id �Ј�No
   * @param firstName ��
   * @param secondName ��
   */
  public Member( String id, String firstName, String secondName ) {
    this.id = id;
    this.firstName = firstName;
    this.secondName = secondName;
  }

  /**
   * showInfo <br />
   * ���I�u�W�F�N�g�̗v�f��W���o�͂֏o�͂���B <br />
   */
  public void showInfo() {
    System.out.println( "�Ј�No:" + this.id );
    System.out.println( "��       :" + this.secondName );
    System.out.println( "��       :" + this.firstName );
    System.out.println( "����    :" + this.secondName + "" + this.firstName );
    System.out.println( "" );
  }

  /**
   * checkName <br />
   * �������Ƃ��ēn���ꂽMember�I�u�W�F�N�g�̐��E���ƁA <br />
   * ���I�u�W�F�N�g�̐��E�����r���A���ʂ�W���o�͂֏o�͂���B<br/>
   * 
   * @param member ��r�Ώۂ�Member�I�u�W�F�N�g
   */
  public void checkName( Member member ) {
    if ( this.secondName.equals( member.secondName )
        && this.firstName.equals( member.firstName ) ) {
      System.out.println( "�Ј�No=[" + this.id + "]�ƁA�Ј�No=[" + member.id + "]�͓��������ł�" );
    } else {
      System.out.println( "�Ј�No=[" + this.id + "]�ƁA�Ј�No=[" + member.id + "]�͓��������ł͂���܂���" );
    }
  }
}
