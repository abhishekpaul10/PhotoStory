package codesfrompaul.photostory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText password;
    private Button loginButton;
    private TextView attemptInfo;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        name = (EditText)findViewById(R.id.usernameBox);
        password = (EditText)findViewById(R.id.passwordBox);
        loginButton = (Button)findViewById(R.id.login);
        attemptInfo = (TextView)findViewById(R.id.attemptInfo);
        if(loginButton == null){
            Log.d("PHOTOAPP","Null name button");
        }
        else {
            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    validate(name.getText().toString(), password.getText().toString());
                }
            });
        }
        super.onCreate(savedInstanceState);

    }


    private void validate(String name, String password) {
        if((name.equals("Abhishek")) && (password.equals("12345"))) {
            Intent intent = new Intent(MainActivity.this, PhotoStory.class);
            startActivity(intent);
        }
        else {
            counter--;
            attemptInfo.setText("Attempts remaining: "+String.valueOf(counter));
            if(counter == 0) {
                loginButton.setEnabled(false);
            }
        }
    }
}
