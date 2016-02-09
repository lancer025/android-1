package com.example.lancer.myla;

/**
 * Created by lancer on 1/2/16.
 */
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ActivityScreen2 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);

        TextView txtName = (TextView)findViewById(R.id.id_name);
        TextView txtEmail = (TextView)findViewById(R.id.id_email);
        Button btnClose = (Button)findViewById(R.id.btnClose);

        Intent i=getIntent();
        String name=i.getStringExtra("name");
        String email = i.getStringExtra("email");

        txtName.setText(name);
        txtEmail.setText(email);

        btnClose.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(ActivityScreen2.this);
                alertDialog.setTitle("confirm Finish");
                alertDialog.setMessage("are u sure u want to finsih");
                alertDialog.setIcon(R.drawable.tick);

                alertDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ActivityScreen2.this, "clicked Yes", Toast.LENGTH_SHORT).show();
                        finish();
                    }

                });
                alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User pressed No button. Write Logic Here
                        Toast.makeText(getApplicationContext(), "You clicked on NO", Toast.LENGTH_SHORT).show();
                    }
                });

                // Setting Netural "Cancel" Button
                alertDialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User pressed Cancel button. Write Logic Here
                        Toast.makeText(getApplicationContext(), "You clicked on Cancel",
                                Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.show();
            }
        });

    }


}
