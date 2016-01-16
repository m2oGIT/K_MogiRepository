/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java007;

/**
 * @author EIS�Ζ� <br />
 *         ProgramAfter1 <br />
 *         �Ј����̕\���A���������`�F�b�N�����\�b�h�� <br />
 *         �X�V���� 2016/01/11 EIS�Ζ؁F�V�K�쐬 <br />
 */
public class ProgramAfter1 {
  /**
   * showInfo <br />
   * �����œn���ꂽ�v�f��W���o�͂֏o�͂���B <br />
   * 
   * @param id �Ј�No
   * @param firstName ��
   * @param secondName ��
   */
  public static void showInfo( String id, String firstName, String secondName ) {
    System.out.println( "�Ј�No:" + id );
    System.out.println( "��       :" + secondName );
    System.out.println( "��       :" + firstName );
    System.out.println( "����    :" + secondName + "" + firstName );
    System.out.println( "" );
  }

  /**
   * checkName <br />
   * ���������`�F�b�N <br />
   * �p�����[�^�œn���ꂽ�Ј��P�ƎЈ��Q�̐�����і����r���A <br/>
   * ���̌��ʂ�W���o�͂֏o�͂���B
   * 
   * @param id1 �Ј�No1
   * @param firstName1 ���P
   * @param secondName1 ���P
   * @param id2 �Ј�No2
   * @param firstName2 ���Q
   * @param secondName2 ���Q
   */
  public static void checkName( String id1, String firstName1, String secondName1, String id2,
      String firstName2, String secondName2 ) {
    if ( secondName1.equals( secondName2 ) && firstName1.equals( firstName2 ) ) {
      System.out.println( "�Ј�No=[" + id1 + "]�ƁA�Ј�No=[" + id2 + "]�͓��������ł�" );
    } else {
      System.out.println( "�Ј�No=[" + id1 + "]�ƁA�Ј�No=[" + id2 + "]�͓��������ł͂���܂���" );
    }

  }

  /**
   * main <br />
   * �又�� <br />
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {
    // �Ј�No
    String id1 = "00001";
    // ��
    String firstName1 = "��Y";
    // ��
    String secondName1 = "���";

    // �Ј�No
    String id2 = "00002";
    // ��
    String firstName2 = "��Y";
    // ��
    String secondName2 = "���";

    // �Ј�No
    String id3 = "00003";
    // ��
    String firstName3 = "�O�Y";
    // ��
    String secondName3 = "���";

    // �Ј�����\��(-�l��)
    showInfo( id1, firstName1, secondName1 );
    // �Ј�����\��(��l��)
    showInfo( id2, firstName2, secondName2 );
    // �Ј�����\��(�O�l��)
    showInfo( id3, firstName3, secondName3 );

    // ���������`�F�b�N(��l�ڂƓ�l��)
    checkName( id1, firstName1, secondName1, id2, firstName2, secondName2 );
    // ���������`�F�b�N(��l�ڂƎO�l��)
    checkName( id1, firstName1, secondName1, id3, firstName3, secondName3 );
    // ���������`�F�b�N(��l�ڂƎO�l��)
    checkName( id2, firstName2, secondName2, id3, firstName3, secondName3 );


  }

}
