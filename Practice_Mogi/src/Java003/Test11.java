/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.math.BigDecimal; //BigDecimal�^

/**
 * @author EIS�Ζ� <br />
 *         �����_���g�p�������Z <br />
 *         0.1���P�O����Z�������ʂ�10.0�Ƃ��ĕ\������B <br />
 *         �X�V���� 2015/12/20 EIS�Ζ؁F�V�K�쐬 <br />
 */
public class Test11 {

  /**
   * main <br />
   * ���C�����\�b�h <br />
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {

    // ���������_�^�idouble�j�ŁA0.1��10����Z�����ʂ��R���\�[���ɏo�͂���B
    double num = 0;
    for ( int i = 0; i < 10; i++ ) {
      num = num + 0.1;
    }
    System.out.println( "0.1��10����Z��������:" + num );

    // BigDecimal�^�ŁA0.1��10����Z�����ʂ��R���\�[���ɏo�͂���B
    BigDecimal numBigDecimal = new BigDecimal( "0.00" );
    for ( int i = 0; i < 10; i++ ) {
      numBigDecimal = numBigDecimal.add( new BigDecimal( "0.1" ) );
    }
    System.out.println( "BicDecimal�ɂ�錋��:" + numBigDecimal );

  }
}
