/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java006;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author EIS�Ζ� <br />
 *         FileReadWriteTest <br />
 *         �E/run/file/text.txt�Ɏ��s�����Ǝw�肳�ꂽ�������ǉ��������݂ŏ������ށB <br />
 *         �E�Ō�ɁA/run/file/text.txt�̓��e�����ׂĕ\������B<br />
 *         �X�V���� 2015/12/27 EIS�Ζ؁F�V�K�쐬 <br />
 */
public class FileReadWriteTest {
  /**
   * logWrite <br />
   * ���O�t�@�C���ւ̏������� <br />
   * 
   * @param path ���O�t�@�C���ւ̃p�X�E�t�@�C����
   * @param log ���O�t�@�C���ɏ������ޕ�����
   */
  private static void logWrite( String path, String log ) {

    // PrintWriter�̐錾
    PrintWriter pw = null;

    try {

      // �o�̓X�g���[���̐���
      FileOutputStream fos = new FileOutputStream( path, true ); // ��������true�i�ǉ��������݁j
      pw = new PrintWriter( new OutputStreamWriter( fos ) );

      // ���ݎ������擾
      SimpleDateFormat formattedDate = new SimpleDateFormat( "yyyy/MM/dd HH;mm;ss" ); // �������w��
      Date date = new Date(); // Date�I�u�W�F�N�g�������Ȃ��Ő����i���ݎ����j

      // �t�@�C���ւ̏������݁i���ݎ����Ǝw�肳�ꂽ������j
      pw.println( formattedDate.format( date ) + log );

      // �o�b�t�@�̃t���b�V���i������������t�@�C���ւ̏����o���j
      pw.flush();

    } catch ( IOException e ) {
      // ��O���m�����ꍇ�̓X�^�b�N�g���[�X��\��
      e.printStackTrace();

    } finally {
      // PrintWriter�𖾎��I��Close����B
      pw.close();
    }
  }

  /**
   * main <br />
   * �又�� <br />
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {
    // �������ރt�@�C���̃p�X�i���΃p�X�j
    String outputFileName = "run/file/text.txt";
    // ���O�t�@�C���ւ̏�������
    logWrite( outputFileName, "������" );

    // ���O�t�@�C�����R���\�[���֑S���o�͂���
    BufferedReader br = null;
    try {
      // BufferReader�̐���
      FileInputStream fis = new FileInputStream( outputFileName );
      br = new BufferedReader( new InputStreamReader( fis ) );

      // ���O�t�@�C����S���ǂݍ��݁A�R���\�[���֏o�͂���B
      String msg = "";
      while ( ( msg = br.readLine() ) != null ) {
        System.out.println( msg );
      }
    } catch ( FileNotFoundException e ) {
      // �t�@�C�������݂��Ȃ��ꍇ
      System.out.println( "�w�肳�ꂽ�t�@�C�������݂��܂���B" + e );

    } catch ( IOException e ) {
      // ���o�͂Ɋւ����O�����m�����ꍇ
      e.printStackTrace();

    } finally {
      // �I������
      try {
        // BufferReader��Close
        br.close();
      } catch ( IOException e ) {
        // ���o�͂Ɋւ����O�����m�����ꍇ�iClose�����j
        System.out.println( "�t�@�C����Close�Ɏ��s���܂����B" + e );
      }
    }
  }
}
