public class Test08 {

  public static void main( String[] args ) {

    // forを使用したループ
    int sum = 0;
    for ( int i = 0; i < 100; i++ ) {
      //奇数の場合のみ加算する。
      if ( i % 2 != 0 ) {
        sum = sum + 1;
      }
    }
    System.out.println( "加算結果(奇数の場合のみ)  ：" + sum );

  }

}
