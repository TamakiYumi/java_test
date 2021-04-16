# 環境構築&実行
※Dockerが未インストールの場合は、[こちら](https://docs.docker.com/get-docker/)よりインストール

ターミナルから以下のコマンドを入力

```
//当リポジトリのクローン
$ git clone https://github.com/hash52/java_kadai.git

//ビルド
$ docker-compose build
//起動
$ docker-compose up -d

//インスペクション
$ docker-compose exec java bash

// コンパイル
root@hogehoge:/usr/src# javac Main.java
// 実行
root@hogehoge:/usr/src# java Main
```