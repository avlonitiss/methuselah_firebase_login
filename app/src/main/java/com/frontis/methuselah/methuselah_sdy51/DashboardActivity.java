package com.frontis.methuselah.methuselah_sdy51;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shiva.try1.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * Άρχικός κώδικας by shiva on 31-01-2018.
 * Τροποποιήθηκε από την ομάδα Αυλωνίτης - Ερενίδης Χαραλαμπόπουλος για την 5η ΓΕ της ΣΔΥ51
 */

public class DashboardActivity extends AppCompatActivity {

    String EmailHolder;
    TextView Email;
    Button LogOUT ;
    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListner;
    FirebaseUser mUser;


    public static final String TAG="LOGIN";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

       Email = (TextView)findViewById(R.id.textView1);
        LogOUT = (Button)findViewById(R.id.button1);

        Intent intent = getIntent();

        // Λήψη του απεσταλμένου email από MainActivity.
        EmailHolder = intent.getStringExtra(login.userEmail);


        Email.setText(Email.getText().toString()+ EmailHolder);



        LogOUT.setOnClickListener(new View.OnClickListener() {
           // @Override
            public void onClick(View v) {



               finish();

                Toast.makeText(DashboardActivity.this,"Επιτυχής αποσύνδεση", Toast.LENGTH_LONG).show();


            }
        });

    }


}