/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java008;

import Java007.Member;

/**
 * @author EIS�Ζ� <br />
 *         ProgramAfter3 <br />
 *         �Ј����N���X��getter/setter���g�p�������� <br />
 *         �X�V���� 2016/01/16 EIS�Ζ؁F�V�K�쐬 <br />
 */
public class ProgramAfter3 {

  /**
   * main <br />
   * �又�� <br />
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {
    // �Ј��N���X
    Member member1 = new Member( "00001", "��Y", "���" );

    // �Ј�����\��
    member1.showInfo();

    // ���O��\��
    System.out.println( "���O�A�ύX�O:" + member1.getFirstName() );
    // ���O��ύX
    member1.setFirstName( "�Ԏq" );
    // ���O��\��
    System.out.println( "���O�A�ύX��:" + member1.getFirstName() );
    System.out.println();

    // �Ј�����\��
    member1.showInfo();

  }

}
