# Java Console Password Tutorial

このリポジトリでは、Javaでコンソールからパスワードを入力する方法について学べます。ここでは、`ConsolePassword`という名前のシンプルなJavaクラスを通じて、パスワードの取得方法を具体的に確認します。

## ConsolePassword.java

[`ConsolePassword.java`](src/main/java/ConsolePassword.java)は、Javaを用いてコンソールからパスワードを安全に取得するためのプログラムです。コンソールが利用可能な場合、このプログラムは`System.console()`メソッドを使用して`Console`オブジェクトを取得し、そのオブジェクトを通じてパスワードの入力を受け付けます。

しかし、JavaプログラムがIDEなどから起動された場合、コンソールが利用できず`System.console()`メソッドが`null`を返すことがあります。そのような状況に対応するため、`ConsolePassword`プログラムは適切なエラーメッセージを表示し、その後に終了します。

[Console \(Java SE 21 & JDK 21\)](https://docs.oracle.com/javase/jp/21/docs/api/java.base/java/io/Console.html)

## 利用方法

以下は`ConsolePassword.java`をコンパイルして実行する手順です：

```bash
javac ConsolePassword.java
java ConsolePassword
```

このコマンドを実行すると、コンソール上に`Enter password:`というメッセージが表示されます。そのプロンプトに対してパスワードを入力しますが、その入力内容はコンソール上には一切表示されません。

## 注意点

`ConsolePassword`クラスは教育目的で提供されていますので、そのまま実運用環境で使用することは推奨しません。実際のシステムでパスワードを取得するシーンでは、情報セキュリティを十分に配慮した手法を用いることが重要です。
