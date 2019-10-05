package com.example.bscnn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText txtA = null;
private EditText txtB = null;
private Button btnGo = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapComp();
        SetOnClickListener();
    }
    private void mapComp(){
        if (txtA == null)
            txtA = findViewById(R.id.txtA);
        if (txtB == null)
            txtB = findViewById(R.id.txtB);
        if (btnGo == null)
            btnGo = findViewById(R.id.btnGo);
    }
    private void SetOnClickListener(){
        if (txtA == null)
            mapComp();
        if (txtB == null)
            mapComp();
        if (btnGo == null)
            mapComp();
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(txtA.getText().toString());
                int b = Integer.parseInt(txtB.getText().toString());
                Intent intent = new Intent(MainActivity.this,SubAcitivty2.class);
                Bundle bundle = new Bundle();
                bundle.putInt("a", a);
                bundle.putInt("b", b);
                intent.putExtra("numSet", bundle);
                startActivity(intent);
            }
        });
    }

}
