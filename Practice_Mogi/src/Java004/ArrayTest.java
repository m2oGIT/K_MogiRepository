/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java004;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author EIS�Ζ� <br />
 *         ArrayTest <br />
 *         �W�����͂��琮����5���ǂݍ��݁A�ő�̂��̂�\������B <br />
 *         �X�V���� 2015/12/22 EIS�Ζ؁F�V�K�쐬 <br />
 */
public class ArrayTest {

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

      // �又���̎��O�����i�ϐ��̐錾�E�������j
      String inputLine = null; // �W�����͂�����͂��ꂽ�s
      int inputNum = 0; // �W�����͂𐮐��l�������l
      int maxNum = 0; // ���͂��ꂽ�����̂����̍ő�l

      // �W�����͂��當�����5���ǂݍ���
      for ( int i = 1; i <= 5; i++ ) {
        System.out.print( "��������́i" + i + "�j�F" ); // �v�����v���̕\��
        inputLine = bufferedStdin.readLine(); // �o�b�t�@�[���[�_�[���g�p���Ĉ�s�ǂݍ���

        inputNum = Integer.parseInt( inputLine ); // ���͂�����s�𐮐��l���i���s�����ꍇ�͗�O�����ցj

        // ���͒l����̍ő�l�̔���
        if ( i == 1 ) {

          // ����̓��͂̏ꍇ�͍ő�l�Ƃ��Đݒ�
          maxNum = inputNum;

        } else if ( maxNum < inputNum ) {

          // �ۊǂ��ꂽ�ő�l���傫���ꍇ�͓���ւ�
          maxNum = inputNum;
        }
      }

      // �ő�l���R���\�[���֏o��
      System.out.println( "�ő�l�F" + maxNum );

    } catch ( Exception e ) {
      // ��O�����m�����ꍇ
      System.out.println( "��O�����m�B�������I������B" + e );
    }
  }
}
