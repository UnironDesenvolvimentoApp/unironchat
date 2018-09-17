package com.uniron.unironzap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceptoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepto);

        Intent intent = getIntent();
        TextView textView = findViewById(R.id.txtReceptorMensagem);
        textView.setText(intent.getStringExtra("mensagem"));
    }
}
