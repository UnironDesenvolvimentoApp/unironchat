package com.uniron.unironzap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText edtMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtMensagem = findViewById(R.id.edtmessage);
        Log.i("Uniron", "________________________");
        Log.i("Uniron", "onCreate() chamado");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Uniron", "onStart() chamado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Uniron", "________________________");
        Log.i("Uniron", "onResume() chamado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Uniron", "onPause() chamado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Uniron", "onStop() chamado");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Uniron", "onRestart() chamado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Uniron", "________________________");
        Log.i("Uniron", "onDestroy() chamado");
    }

    public void onSendMessage(View view) {
        //INTENT EXPLÍCITA
        //        Intent intent = new Intent(thiIntent(this,ReceptoActivity.class);s,ReceptoActivity.class);

        //INTENT  IMPLÍCITA
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");

        intent.putExtra("mensagem", edtMensagem.getText().toString());

        intent.putExtra(Intent.EXTRA_SUBJECT, edtMensagem.getText().toString());
        
        intent.putExtra(Intent.EXTRA_TEXT, edtMensagem.getText().toString());

        Intent chooseIntent = Intent.createChooser(intent, "Escolha seu App UNIRON.");

        
          //startActivity(intent);
          startActivity(chooseIntent);


        
    }
}
