package Java002;

public class Test07 {

  public static void main( String[] args ) {
    // forを使用したループ
    int sum = 0;
    for ( int i = 0; i < 100; i++ ) {
      sum = sum + 1;
    }
    System.out.println( "加算結果(for  )  ：" + sum );

    // whileを使用したループ
    int j = 0, sumWhile = 0;
    while ( j < 100 ) {
      sumWhile = sumWhile + 1;
      j++;
    }
    System.out.println( "加算結果(while)  ：" + sumWhile );

    // do-whileを使用したループ
    int k = 0, sumDoWhile = 0;
    do {
      sumDoWhile = sumDoWhile + 1;
      k++;
    } while ( k < 100 );
    System.out.println( "加算結果(do-while):" + sumDoWhile );
  }

}
