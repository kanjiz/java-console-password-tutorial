// "java.io.Console"ライブラリをインポートします。
import java.io.Console;

/**
 * 注意：このクラスは、コンソールから入力を受け取るサンプルです。
 * コンソールが利用できない環境下ではシステムが終了します。
 * また、入力されたパスワードはそのままコンソールに表示されるため、
 * 通常はこのようにパスワードを直接出力せず、適切な方法で保護してください。
 *
 */
public class Main {

  public static void main(String[] args) {

    // システムからコンソールインスタンスを取得します。このインスタンスによってコンソールに読み書きができます。
    Console console = System.console();

    // もしコンソールが利用できなければ、メッセージを出力し、プログラムが終了します。
    if (console == null) {
      System.out.println("Couldn't get Console instance");
      System.exit(0);
    }

    // ユーザーにパスワードの入力を求め、その入力を char の配列として取得します。
    char[] passwordArray = console.readPassword("Enter your password: ");

    // 入力されたパスワードをコンソールに出力します。セキュリティを考慮すれば、通常はこのようにパスワードを直接表示すべきではありません。
    System.out.println("Password entered was: " + new String(passwordArray));
  }
}
