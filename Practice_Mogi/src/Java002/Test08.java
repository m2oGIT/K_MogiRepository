/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author EIS�Ζ� <br />
 *         Test08 <br />
 *         1-100�̐����̂����A��̏ꍇ�̂݉��Z���A�R���\�[���ɏo�͂���B <br />
 *         �X�V���� 2015/11/23 EIS�Ζ؁F�V�K�쐬 <br />
 */
public class Test08 {

  /**
   * Test08 <br />
   * 1-100�̐����̂����A��̏ꍇ�̂݉��Z���A�R���\�[���ɏo�͂���B <br />
   * 
   * @param args �R�}���h���C������
   */
  public static void main( String[] args ) {

    // for���g�p�������[�v
    int sum = 0;
    for ( int i = 0; i < 100; i++ ) {
      // ��̏ꍇ�̂݉��Z����B
      if ( i % 2 != 0 ) {
        sum = sum + 1;
      }
    }
    System.out.println( "���Z����(��̏ꍇ�̂�)  �F" + sum );

  }

}
