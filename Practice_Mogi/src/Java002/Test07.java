/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author EIS�Ζ� <br />
 *         Test07 <br />
 *         1-100�܂ł̐��������Z�i���[�v���g�p�j <br />
 *         �X�V���� 2015/11/23 EIS�Ζ؁F�V�K�쐬 <br />
 */
public class Test07 {

  /**
   * Test07 <br />
   * �i�����j <br />
   * 
   * @param args �R�}���h���C������
   */
  /**
   * Test07 <br />
   * 1-100�܂ł̐��������Z�i���[�v���g�p�j <br />
   * �R�̃��[�v�̕��@�����ꂼ��g�p����B <br />
   * 
   * @param args �R�}���h���C������
   */
  public static void main( String[] args ) {
    // for���g�p�������[�v
    int sumFor = 0;
    for ( int i = 0; i < 100; i++ ) {
      sumFor = sumFor + 1;
    }
    System.out.println( "���Z����(for  )  �F" + sumFor );

    // while���g�p�������[�v
    int j = 0, sumWhile = 0;
    while ( j < 100 ) {
      sumWhile = sumWhile + 1;
      j++;
    }
    System.out.println( "���Z����(while)  �F" + sumWhile );

    // do-while���g�p�������[�v
    int k = 0, sumDoWhile = 0;
    do {
      sumDoWhile = sumDoWhile + 1;
      k++;
    } while ( k < 100 );
    System.out.println( "���Z����(do-while):" + sumDoWhile );
  }

}
