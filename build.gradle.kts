plugins {
  java
}

repositories {
  mavenCentral()
}

dependencies {
  testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
  testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

// テストタスクの設定を行います。
tasks.named<Test>("test") {
  useJUnitPlatform()

  // テストのログ設定を行います。ここでは、テストがパスした場合、スキップされた場合、失敗した場合のイベントをログに表示します。
  testLogging { events("passed", "skipped", "failed") }
}
