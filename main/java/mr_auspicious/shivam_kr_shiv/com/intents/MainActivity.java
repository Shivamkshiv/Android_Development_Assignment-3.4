package mr_auspicious.shivam_kr_shiv.com.intents;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {



    public Button b1;
    EditText et6;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et6 = (EditText) findViewById(R.id.et11);
                String username = et6.getText().toString();

                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("username", username);
                startActivity(i);

            }
        });


    }
}