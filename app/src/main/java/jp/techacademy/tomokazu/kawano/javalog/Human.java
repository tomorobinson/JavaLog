package jp.techacademy.tomokazu.kawano.javalog;

import android.util.Log;

public class Human extends Animal implements Thinkable {

    // メンバ変数
    String hobby;

    // コンストラクタ sayメソッド用
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // コンストラクタ thinkメソッド用
    public Human(String hobby) {
        this.hobby = hobby;
    }

    // メンバ関数
    @Override
    public void say(){
        Log.d("javatest", "私の名前は" + this.name + "です。" + "年は" + this.age + "です。");
    }

    // メンバ関数
    @Override
    public void think(){
        Log.d("javatest", "私は" + hobby + "について考える");
    }
}