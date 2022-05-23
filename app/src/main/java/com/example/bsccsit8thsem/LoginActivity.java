package com.example.bsccsit8thsem;



import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Toolbar toolbar;
    private EditText edtUsername, edtPassword;
    private CheckBox chkFootball, chkVolleyball, chkCricket, chkRugby;
    private AppCompatButton btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        initToolbar();
        findViews();
    }

    private void findViews() {
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        chkFootball = findViewById(R.id.chkFootball);
        chkVolleyball = findViewById(R.id.chkVolleyball);
        chkCricket = findViewById(R.id.chkCricket);
        chkRugby = findViewById(R.id.chkRugby);
        chkFootball.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });
        btnLogin.setOnClickListener(this);
    }

    private void initToolbar() {
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("BSC CSIT");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        toolbar.setNavigationIcon(R.drawable.ic_user);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnLogin) {
            String username = edtUsername.getText().toString();
            String password = edtPassword.getText().toString();
            String hobbies = "";
            if (chkFootball.isChecked())
                hobbies = hobbies + " " + chkFootball.getText().toString();
            if (chkRugby.isChecked())
                hobbies = hobbies + " " + chkRugby.getText().toString();
            if (chkCricket.isChecked())
                hobbies = hobbies + " " + chkCricket.getText().toString();
            if (chkVolleyball.isChecked())
                hobbies = hobbies + " " + chkVolleyball.getText().toString();
            Log.d("Data", username + " " + password+" "+hobbies);
            if(!username.isEmpty() && !password.isEmpty()){
                Intent intent= new Intent(LoginActivity.this, ProductListActivity.class);
//                intent.putExtra("Username", username);
//                intent.putExtra("data", 5);
                startActivity(intent);
            }else{
                Toast.makeText(LoginActivity.this, "Username and password cannot be empty", Toast.LENGTH_SHORT).show();
            }
        }

    }
}