package vn.poly.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);


        Bundle bundle = getIntent().getBundleExtra("bun");

        int num = bundle.getInt("data", -1);
    }
}
