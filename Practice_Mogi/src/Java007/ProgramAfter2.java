/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java007;

/**
 * @author EIS�Ζ� <br />
 *         ProgramAfter2 <br />
 *         �Ј����N���X���g�p�������� <br />
 *         �X�V���� 2016/01/11 EIS�Ζ؁F�V�K�쐬 <br />
 */
public class ProgramAfter2 {

  /**
   * main <br />
   * �又�� <br />
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {
    // �P�l��
    Member member1 = new Member( "00001", "��Y", "���" );
    // �Q�l��
    Member member2 = new Member( "00002", "��Y", "���" );
    // �R�l��
    Member member3 = new Member( "00003", "�O�Y", "���" );

    // �Ј�����\��(�P�l��)
    member1.showInfo();

    // �Ј�����\��(�Q�l��)
    member2.showInfo();

    // �Ј�����\��(�R�l��)
    member3.showInfo();


    // ���������`�F�b�N(�P�l�ڂƂQ�l��)
    member1.checkName( member2 );

    // ���������`�F�b�N(�P�l�ڂƂR�l��)
    member1.checkName( member3 );

    // ���������`�F�b�N(�Q�l�ڂƂR�l��)
    member2.checkName( member3 );
  }

}
