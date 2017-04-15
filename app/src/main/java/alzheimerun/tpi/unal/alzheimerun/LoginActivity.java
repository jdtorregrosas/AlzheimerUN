package alzheimerun.tpi.unal.alzheimerun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText mEditEmail;
    private EditText mEditPassword;
    private Button mBtnSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mEditEmail = (EditText) findViewById(R.id.edit_login_email);
        mEditPassword = (EditText) findViewById(R.id.edit_login_password);
        mBtnSignIn = (Button) findViewById(R.id.btn_login_signIn);
    }
    public void signIn(View view){
        Intent i = new Intent(this, MainMenuActivity.class);
        startActivity(i);
    }
}
