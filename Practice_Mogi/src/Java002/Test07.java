package Java002;

public class Test07 {

  public static void main( String[] args ) {
    // for���g�p�������[�v
    int sum = 0;
    for ( int i = 0; i < 100; i++ ) {
      sum = sum + 1;
    }
    System.out.println( "���Z����(for  )  �F" + sum );

    // while���g�p�������[�v
    int j = 0, sumWhile = 0;
    while ( j < 100 ) {
      sumWhile = sumWhile + 1;
      j++;
    }
    System.out.println( "���Z����(while)  �F" + sumWhile );

    // do-while���g�p�������[�v
    int k = 0, sumDoWhile = 0;
    do {
      sumDoWhile = sumDoWhile + 1;
      k++;
    } while ( k < 100 );
    System.out.println( "���Z����(do-while):" + sumDoWhile );
  }

}
