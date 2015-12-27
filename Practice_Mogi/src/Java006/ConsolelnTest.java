/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java006;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * @author EIS�Ζ� <br />
 *         ConsolelnTest <br />
 *         �W�����͂��當����s���uend�v���o������܂œǂݍ��݁A�������������ăR���\�[���֏o�͂���B <br />
 *         �X�V���� 2015/12/26 EIS�Ζ؁F�V�K�쐬 <br />
 */
public class ConsolelnTest {

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
      ArrayList<String> strList = new ArrayList<String>();

      // �W�����͂��當����ǂݍ��ރ��[�v�i�uend�v�����͂����܂Ń��[�v����j
      while ( true ) {
        // �o�b�t�@�[���[�_�[���g�p���Ĉ�s�ǂݍ��ށB
        String inputStr = bufferedStdin.readLine();

        // �uend�v�����͂��ꂽ�ꍇ�̓��[�v���I������B
        if ( inputStr.equals( "end" ) ) {
          break;
        }
        // ArrayList�֊i�[
        strList.add( inputStr );
      }

      // �又���̎��O�����i�ϐ��̐錾�E�������j
      String strConcat = ""; // ��������������

      // ArrayList(strList)�Ɋi�[�������������������B
      for ( String value : strList ) {
        strConcat = strConcat + value;

      }

      // �ő�l���R���\�[���֏o��
      System.out.println( "���߂���������o�͂��܂��B" + strConcat );

    } catch ( Exception e ) {
      // ��O�����m�����ꍇ
      System.out.println( "��O�����m�B�������I������B" + e );
    }
  }
}
