/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import Java007.Member;

/**
 * @author EIS�Ζ� <br />
 *         ProgramAfter5 <br />
 *         1.���̓t�@�C������1�s���ǂݎ��A�t�@�C���̍Ō�ɂȂ�܂ŁA���X�g(List<Member>)�Ɋi�[����B<br />
 *         2.���X�g�Ɋi�[�����Ј��������ɁA�o�̓t�@�C���ɏo�͂���B <br />
 *         �X�V���� 2015/1/17 EIS�Ζ؁F�V�K�쐬 <br />
 */
public class ProgramAfter5 {

  /**
   * Main <br />
   * �又�� <br />
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {

    // �ǂݍ��ރt�@�C���̃p�X�i���΃p�X�j
    String inputFileName = "run/file/input.txt";
    // �t�@�C���I�u�W�F�N�g�̐���
    File inputFile = new File( inputFileName );
    // ���̓X�g���[���̃C���X�^���X�����Ő���
    BufferedReader br = null;

    // �������ރt�@�C���̃p�X�i���΃p�X�j
    String outputFileName = "run/file/output.txt";
    // PrintWriter�̐錾
    PrintWriter pw = null;

    try {

      // ���̓X�g���[���̐���
      br = new BufferedReader( new InputStreamReader( new FileInputStream( inputFile ) ) );

      // �o�̓X�g���[���̐���
      FileOutputStream fos = new FileOutputStream( outputFileName, false ); // ��������false�i�㏑���j
      pw = new PrintWriter( new OutputStreamWriter( fos ) );

      // Member�N���X��ArrayList�𐶐�
      ArrayList<Member> memberList = new ArrayList<Member>();

      // �e�L�X�g�t�@�C������1�s���ǂݍ��݁AmemberList��Member�I�u�W�F�N�g�𐶐����Ċi�[����B
      String msg;
      while ( ( msg = br.readLine() ) != null ) {

        // �ǂݍ��񂾍s���u,�v�ŕ����iMember�N���X�̃p�����[�^���̂��킹��3�ɕ����j
        String[] msgElm = msg.split( ",", 3 );

        // ���������v�f���g�p����Member�N���X��ArrayList�֊i�[
        memberList.add( new Member( msgElm[0], msgElm[2], msgElm[1] ) );

      }

      // membList����P�v�f�����o���AMember�I�u�W�F�N�g��getter���g�p���Đ��`���A�o�̓t�@�C���֏��������B
      int i = 0; // �v�f���̃J�E���g�p
      for ( Member mb : memberList ) {
        i++;
        pw.println( "�s��:[" + i + "] �Ј�No.:[" + mb.getId() + "] ���O:[" + mb.getFirstName()
            + mb.getSecondName() + "]" );
      }

      // �o�b�t�@�̃t���b�V���i������������t�@�C���ւ̏����o���j
      pw.flush();

      // �G���[���́A�X�^�b�N�g���[�X���o��
    } catch ( IOException e ) {
      e.printStackTrace();

    } finally {
      // finally�u���b�N�ɖ����I�ȃN���[�Y�������L�q����B
      try {
        br.close();
        pw.close();
      } catch ( IOException e ) {
        e.printStackTrace();
      }
    }
  }
}
