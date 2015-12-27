/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java005;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * @author EIS�Ζ� <br />
 *         ArrayToCollectionTest <br />
 *         �W�����͂��琮����5���ǂݍ��݁A�ő�̂��̂�\������B�iArrayList�Łj <br />
 *         �X�V���� 2015/12/22 EIS�Ζ؁F�V�K�쐬 <br />
 */
public class ArrayToCollectionTest {

  /**
   * main <br />
   * �又�� <br />
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {

    try {

      // �W�����͂���̓ǂݍ��ݏ���

      // �W�����͂̃o�C�g�X�g���[���𐶐�
      InputStreamReader inputStreamStdin = new InputStreamReader( System.in );
      // �W�����̓o�C�g�X�g���[������A�o�b�t�@�[���[�_�[�𐶐�
      BufferedReader bufferedStdin = new BufferedReader( inputStreamStdin );

      // �W�����͂��當�����5���ǂݍ��݁A�����ɕϊ�����ArrayLint�֊i�[����B
      ArrayList<Integer> numList = new ArrayList<Integer>();

      // �W�����͂��當�����5���ǂݍ���
      for ( int i = 1; i <= 5; i++ ) {
        // �v�����v�g�̕\��
        System.out.print( "��������́i" + i + "�j�F" );

        // �o�b�t�@�[���[�_�[���g�p���Ĉ�s�ǂݍ��݁A�����^�֕ϊ�����ArrayList�֊i�[����B
        // ���͂�����s�𐮐��l���i���s�����ꍇ�͗�O�����ցj
        numList.add( new Integer( bufferedStdin.readLine() ) );
      }

      // ���͂��ꂽ�����̂����̍ő�l
      // �����l��numList�̐擪�̒l�Ƃ���B
      int maxNum = numList.get( 0 ).intValue();

      // �又���̎��O�����i�ϐ��̐錾�E�������j
      int sumNum = 0; // ���͂��ꂽ�����̍��v�l

      // ArrayList(numList)�Ɋi�[�����v�f�S���ɑ΂��Ă̏���
      for ( Integer value : numList ) {

        // ���͒l����̍ő�l�̔���
        if ( maxNum < value.intValue() ) {
          // �ۊǂ��ꂽ�ő�l���傫���ꍇ�͓���ւ�
          maxNum = value.intValue();
        }
        // ���v�l�̌v�Z
        sumNum = sumNum + value.intValue();

      }

      // �ő�l���R���\�[���֏o��
      System.out.println( "�ő�l�F" + maxNum );
      System.out.println( "���v�l�G" + sumNum );

      // ���ϒl�̌v�Z�A�R���\�[���ւ̏o��
      BigDecimal aveBD = new BigDecimal( sumNum ); // ���v�l��BigDecimal�^�Ƃ��Đ���
      System.out.println( "���ϒl�F" + aveBD.divide( new BigDecimal( "5.0" ) ) ); // ���ϒl�̌v�Z

    } catch ( NumberFormatException e ) {
      // �����ւ̕ϊ��ŗ�O�����m�����ꍇ
      System.out.println( "�����ւ̕ϊ��ŗ�O�����m�B�������I������B" + e );
    } catch ( Exception e ) {
      // ��O�����m�����ꍇ
      System.out.println( "��O�����m�B�������I������B" + e );
    }
  }
}
