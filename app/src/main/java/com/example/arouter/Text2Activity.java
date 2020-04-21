package com.example.arouter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/main/Text2Activity")
public class Text2Activity extends BaseActivity {

    // 传递的参数
    @Autowired(name = "from")
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text2);
        TextView textview = findViewById(R.id.textView2);
        textview.setText(textview.getText() + name);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
