package nathanepotengy.com.feicibuki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.EditText;
import android.widget.TextView;
import nathanepotengy.feicibuki.R;
import  android.app.AlertDialog;

public class MainActivity extends AppCompatActivity {
    String login;
    String pass;
    Button loginbt;
    EditText lg;
    EditText pw;
    TextView tx ;
    TextView register;
    EditText RegLogin;
    EditText RegPass;
    EditText RegRepass;
    Button regButton;
    TextView Help;
    Button BackLogin;
    TextView feedback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            loginbt = (Button)findViewById(R.id.button2);
            login = "milho";
            pass = "cozido";
            lg = (EditText) findViewById(R.id.editText3);
            pw = (EditText) findViewById(R.id.editText4);
            tx = (TextView) findViewById(R.id.FeedBack);
            register = (TextView) findViewById(R.id.Register);
             RegLogin= (EditText)findViewById(R.id.Login) ;
             RegPass= (EditText)findViewById(R.id.Pass);
             RegRepass= (EditText)findViewById(R.id.Repass);
            regButton= (Button) findViewById(R.id.RegButton);
            Help = (TextView) findViewById(R.id.Help);
            BackLogin= (Button)findViewById(R.id.BackLogin);
        feedback=(TextView)findViewById(R.id.FeedbackReg);
            loginbt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v1) {

                    if (lg.getText().toString().equals(login) && pw.getText().toString().equals(pass)) {
                        tx.setText("Login com sucesso");
                        //new AlertDialog.Builder(this).setTitle("Clicker").setMessage("Logar com "+lg.getText().toString()+" e senha "+ pw.getText().toString()).setNeutralButton("tudoerrado", null).show();
                    } else {
                        //new AlertDialog.Builder(this).setTitle("Erro").setMessage("Logar com "+lg.getText().toString()+" e senha "+ pw.getText().toString()).setNeutralButton("tudoerrado", null).show();
                        tx.setText("Tente de novo");
                    }
                }
            });
            BackLogin.setOnClickListener(new View.OnClickListener(){
                @Override
             public void onClick(View v2) {
            BackLogin();
             }}
            );
            regButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v2) {
                    if( RegLogin.getText().toString().equals("")){
                        feedback.setText("Nome não pode ser em branco");
                    }
                else if (RegPass.getText().toString().equals(RegRepass.getText().toString()))
                {
                    feedback.setText("Registrado Com Suscesso");
                }
                    else  feedback.setText("As senhas não coonferem");
                }


            });
            register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v3) {
                OpenReg();
            }
            });

                }
    void OpenReg ()
    {
        loginbt.setVisibility(View.INVISIBLE);
        lg.setVisibility(View.INVISIBLE);
        pw.setVisibility(View.INVISIBLE);
        tx.setVisibility(View.INVISIBLE);
        register.setVisibility(View.INVISIBLE);
        RegLogin.setVisibility(View.VISIBLE);
        RegPass.setVisibility(View.VISIBLE);
        RegRepass.setVisibility(View.VISIBLE);
        regButton.setVisibility(View.VISIBLE);
        Help.setVisibility(View.VISIBLE);
        BackLogin.setVisibility(View.VISIBLE);
        feedback.setVisibility(View.VISIBLE);
    }
    void BackLogin ()
    {
        loginbt.setVisibility(View.VISIBLE);
        lg.setVisibility(View.VISIBLE);
        pw.setVisibility(View.VISIBLE);
        tx.setVisibility(View.VISIBLE);
        register.setVisibility(View.VISIBLE);
        RegLogin.setVisibility(View.INVISIBLE);
        RegPass.setVisibility(View.INVISIBLE);
        RegRepass.setVisibility(View.INVISIBLE);
        regButton.setVisibility(View.INVISIBLE);
        Help.setVisibility(View.INVISIBLE);
        BackLogin.setVisibility(View.INVISIBLE);
        feedback.setVisibility(View.INVISIBLE);
    }
    }




