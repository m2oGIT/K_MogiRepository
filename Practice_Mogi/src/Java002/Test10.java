/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author EIS�Ζ� <br />
 *         Test10 <br />
 *         �n���ꂽ2��ނ̐����̊Ԃ̐���S�č��v���ĕԂ��B <br />
 *         �N���X���Ƀ��\�b�h���쐬���Amain���\�b�h����Ăяo���B<br/>
 *         �X�V���� 2015/11/30 EIS�Ζ؁F�V�K�쐬 <br />
 */
public class Test10 {

  /**
   * �Q�̕�����Ԃ̐��l�����v����B <br />
   * �����Ƃ��ēn���ꂽ��̕�����𐮐������A <br />
   * �P�Ԗڂ̈�������Q�Ԗڂ̈����̊Ԃ̐��������ׂĉ��Z����B�i�����Ƃ��ēn���ꂽ�������܂ށj<br/>
   * 
   * @param fromInt ���Z�̊J�n�l�i���s�������̂P�ԖڂƂ��ēn����镶����j
   * @param toInt ���Z�̏I���l�i���s�������̂Q�ԖڂƂ��ēn����镶����j
   * @return fromInt����toInt�܂ł̉��Z�l�B�ifromInt�AtoInt�̒l���܂ށj
   * @throws NumberFormatException �����񂩂琮���l�ւ̕Ԋ҂̍ۂɔ�������\������B
   */
  private static int sumFromTo( String fromInt, String toInt ) throws NumberFormatException {

    int fromValue = Integer.parseInt( fromInt ); // ���Z�J�n�l�i�����𐮐�������j
    int toValue = Integer.parseInt( toInt ); // ���Z�I���l�i�����𐮐�������j
    int sum = 0; // ���Z����

    // �Q�̐����Ԃ̑召�֌W�𒲂ׁAfromValue,toValue�̐����֐�����������Ȃ����B
    if ( fromValue > toValue ) {
      // �召�֌W���t�̏ꍇ�A����ւ���B
      int work = fromValue;
      fromValue = toValue;
      toValue = work;
    }
    // �Q�̐����Ԃ̐��l�����ׂč��v
    for ( int i = fromValue; i <= toValue; i++ ) {
      sum = sum + i;
    }

    // ���ʂ�ԋp
    return sum;
  }

  /**
   * main <br />
   * ���C�����\�b�h <br />
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {
    
    // ���\�b�hsumFromTo���Ăяo���A���̌��ʂ��R���\�[���ɏo�͂���B
    System.out.println( "�Q�̐����Ԃ̒l�̍��v�F" + sumFromTo( args[0], args[1] ) );
    
  }
}
