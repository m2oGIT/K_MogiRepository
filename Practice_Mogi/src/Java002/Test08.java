public class Test08 {

  public static void main( String[] args ) {

    // for���g�p�������[�v
    int sum = 0;
    for ( int i = 0; i < 100; i++ ) {
      //��̏ꍇ�̂݉��Z����B
      if ( i % 2 != 0 ) {
        sum = sum + 1;
      }
    }
    System.out.println( "���Z����(��̏ꍇ�̂�)  �F" + sum );

  }

}
