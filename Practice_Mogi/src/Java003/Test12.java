/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author EIS�Ζ� <br />
 *         Test12 <br />
 *         ���s���t��\������ <br />
 *         �X�V���� 2015/12/20 EIS�Ζ؁F�V�K�쐬 <br />
 */
public class Test12 {

  /**
   * main <br />
   * ���s���t��\������B <br />
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {

    SimpleDateFormat formattedDate = new SimpleDateFormat( "yyyy/MM/dd HH;mm;ss" ); // �������w��
    Date date = new Date(); // Date�I�u�W�F�N�g�������Ȃ��Ő����i���ݎ����j
    System.out.println( "���݂̎�����" + formattedDate.format( date ) + "�ł��B" ); // �����ɑ���\������B

  }
}
