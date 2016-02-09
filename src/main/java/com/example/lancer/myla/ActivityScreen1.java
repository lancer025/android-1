package com.example.lancer.myla;


/**
 * Created by lancer on 1/2/16.
 */
        import android.os.Bundle;
        import android.support.v7.app.ActionBarActivity;
        import android.app.Activity;
        import android.content.Intent;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class ActivityScreen1 extends Activity{

    EditText inputName;
    EditText inputEmail;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen1);

        inputName = (EditText) findViewById(R.id.name);
        inputEmail = (EditText) findViewById(R.id.email);
        Button btnNextScreen = (Button) findViewById(R.id.nxtScreen);

        btnNextScreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent nextScreen = new Intent(getApplicationContext(), ActivityScreen2.class);
                nextScreen.putExtra("name", inputName.getText().toString());
                nextScreen.putExtra("email", inputEmail.getText().toString());

                startActivity(nextScreen);
            }

        });
    }



    }
