package com.akhsanaf.uasakb4.presenter;
/* Tanggal Pengerjaan
 *  12 Agustus 2019
 *
 * Akhsan Andara F
 *  10116160
 *  IF-4
 *  */

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.akhsanaf.uasakb4.MainActivity;
import com.akhsanaf.uasakb4.R;
import com.akhsanaf.uasakb4.model.Preferences;


public class LoginActivity extends AppCompatActivity implements ILoginActivity {

    private EditText viewUsername, viewPassword;
     Button buttonLogin;
     TextView linkRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        viewUsername = findViewById(R.id.inputUsername);
        viewPassword = findViewById(R.id.inputPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        linkRegister = findViewById(R.id.linkRegister);

        viewPassword.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_NULL){
                    chekInputan();
                    return true;
                }
                return false;
            }
        });

        /* Menjalankan Method razia() jika merasakan tombol SignIn disentuh */
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chekInputan();
            }
        });

        /* Ke RegisterActivity jika merasakan tombol SignUp disentuh */
       linkRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), RegisterActivity.class));
            }
        });
    }

    /** ke MainActivity jika data Status Login dari Data Preferences bernilai true */
    @Override
    protected void onStart(){
        super.onStart();
        if (Preferences.getLoggedInStatus(getBaseContext())){
            startActivity(new Intent(getBaseContext(), MainActivity.class));
            finish();
        }
    }

    @Override
    public void chekInputan() {
        viewUsername.setError(null);
        viewPassword.setError(null);
        View fokus = null;
        boolean cancel = false;

        String Username = viewUsername.getText().toString();
        String Password = viewPassword.getText().toString();

        if(TextUtils.isEmpty(Username)){

            viewUsername.setError("This field is required");
            fokus = viewUsername;
            cancel = true;

        }else if (!cekUser(Username)){
            viewUsername.setError("This Username is not found");
            fokus = viewUsername;
            cancel = true;
        }

        if(TextUtils.isEmpty(Password)){

            viewPassword.setError("This field is required");
            fokus = viewPassword;
            cancel = true;

        }else if (!cekPassword(Password)){
            viewPassword.setError("This Password is incorrect");
            fokus = viewPassword;
            cancel = true;
        }

        if (cancel) fokus.requestFocus();
        else masuk();
    }

    @Override
    public void masuk() {
        Preferences.setLoggedInUser(getBaseContext(),Preferences.getRegisteredUser(getBaseContext()));
        Preferences.setLoggedInStatus(getBaseContext(),true);
        startActivity(new Intent(getBaseContext(),MainActivity.class));
        finish();
    }

    @Override
    public boolean cekPassword(String Password) {
        return Password.equals(Preferences.getRegisteredPass(getBaseContext()));
    }

    @Override
    public boolean cekUser(String Username) {
        return Username.equals(Preferences.getRegisteredUser(getBaseContext()));
    }
}
