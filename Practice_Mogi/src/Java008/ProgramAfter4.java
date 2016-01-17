/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java008;

import java.util.ArrayList;

import Java007.Member;

/**
 * @author EIS�Ζ� <br />
 *         ProgramAfter4 <br />
 *         �Ј�����z����g�p���Đ������� <br />
 *         �X�V���� 2016/01/16 EIS�Ζ؁F�V�K�쐬 <br />
 */
public class ProgramAfter4 {

  /**
   * main <br />
   * �又�� <br />
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {
    // �Ј����
    String[][] array = {
        {
            "001", "��Y", "���"
        },
        {
            "002", "��Y", "���"
        },
        {
            "003", "�O�Y", "���"
        }
    };

    // �Ј���񃊃X�g
    ArrayList<Member> list = new ArrayList<Member>();

    // ���X�g�ɒǉ�
    for ( int i = 0; i < array.length; i++ ) {
      list.add( new Member( array[i][0], array[i][1], array[i][2] ) );
    }

    // ���X�g�ɐݒ肵������\��
    for ( Member value : list ) {
      value.showInfo();
    }

  }
}
