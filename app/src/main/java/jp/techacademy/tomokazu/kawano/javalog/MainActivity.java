package jp.techacademy.tomokazu.kawano.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dog dog = new Dog("ポチ", 3);

        dog.move();

        dog.say();
        Log.d("javatest", "犬の名前は" + dog.name + "です。");
        Log.d("javatest", "犬の年齢は" + dog.age + "です。");

        BigDog bigdog = new BigDog("ヨーゼフ", 15);

        bigdog.say();
        Log.d("javatest", "犬の名前は" + bigdog.name + "です。");
        Log.d("javatest", "犬の年齢は" + bigdog.age + "です。");

        Human human = new Human("田中", 39, "プログラミングの学習");
        human.say();

        Human human2 = new Human("山田", 24, "ウィンドウショッピング");
        human2.think();
    }
}
