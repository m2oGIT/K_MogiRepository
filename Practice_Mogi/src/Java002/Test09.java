/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author EIS�Ζ� <br />
 *         Test09 <br />
 *         �P������s�������ŗ^����ꂽ�l�܂ŉ��Z���A�R���\�[���ɏo�͂���B <br />
 *         �X�V���� 2015/11/29 EIS�Ζ؁F�V�K�쐬 <br />
 */
public class Test09 {

  /**
   * Test09 <br />
   * �P������s�������ŗ^����ꂽ�l�܂ŉ��Z���A�R���\�[���ɏo�͂���B <br />
   * 
   * @param args �R�}���h���C�������i���Z�l�̏I���l�j
   */
  public static void main( String[] args ) {

    // �����̂P�ԖڂŎw�肳�ꂽ�����܂ŉ��Z����B
    // �Ȃ��A�����̂P�Ԗڂ𐮐��^�֕ϊ�����B���̍ۂɔ�������\���̂����O�͖�������B
    int sum = 0;
    for ( int i = 0; i <= Integer.parseInt( args[0] ); i++ ) {
      sum = sum + i;
    }
    System.out.println( "���Z���ʁF" + sum );
  }

}
