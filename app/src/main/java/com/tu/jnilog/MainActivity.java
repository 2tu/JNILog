package com.tu.jnilog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.tu.jnilog.clog.CLog;

public class MainActivity extends AppCompatActivity {

  private EditText logEditText;
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    CLog.i();
  }
}
