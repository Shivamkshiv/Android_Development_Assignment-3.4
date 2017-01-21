package mr_auspicious.shivam_kr_shiv.com.intents;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    TextView tx1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Bundle extras = getIntent().getExtras();

        if (extras.containsKey("username")) {
            String username = extras.getString("username");


            tx1 = (TextView) findViewById(R.id.t1);
            tx1.setText("Welcome " + username);
        }
    }


}
