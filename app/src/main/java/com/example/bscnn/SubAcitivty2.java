package com.example.bscnn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SubAcitivty2 extends AppCompatActivity {
private TextView BSCNN = null;
private TextView USCLN = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_acitivty2);
        mapCompSub();
        Bundle bundle = getIntent().getBundleExtra("numSet");
        int a = bundle.getInt("a");
        int b = bundle.getInt("b");
        if(a>=b){
            USCLN.setText("Ước số chung lớn nhất là: "+USCLN(a,b));
            BSCNN.setText("Bội số chung nhỏ nhất là:"+BSCNN(a,b));
        }
        else{
            USCLN.setText("Ước số chung lớn nhất là: "+USCLN(b,a));
            BSCNN.setText("Bội số chung nhỏ nhất là:"+BSCNN(b,a));
        }
    }
    private void mapCompSub(){
        if (BSCNN == null)
            BSCNN = findViewById(R.id.BSCNN);
        if(USCLN == null)
            USCLN = findViewById(R.id.USCLN);
    }
    private int USCLN (int a, int b){
        if (b==0) return a;
        return USCLN(b,a%b);
    }
    private int BSCNN(int a, int b){
        return (a*b)/USCLN(a,b);
    }
}
