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
    String login = "milho";
    String pass = "cozido";
    Button loginbt = (Button)findViewById(R.id.button2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void LoginBT(View w)
    {
        EditText lg = (EditText) findViewById(R.id.editText3);
        EditText pw = (EditText) findViewById(R.id.editText4);
        TextView tx= (TextView)findViewById(R.id.FeedBack);
        if (lg.getText().toString().equals( login) && pw.getText().toString().equals(pass))
        {
            tx.setText("Login com sucesso");
            //new AlertDialog.Builder(this).setTitle("Clicker").setMessage("Logar com "+lg.getText().toString()+" e senha "+ pw.getText().toString()).setNeutralButton("tudoerrado", null).show();
        }
        else
        {
            //new AlertDialog.Builder(this).setTitle("Erro").setMessage("Logar com "+lg.getText().toString()+" e senha "+ pw.getText().toString()).setNeutralButton("tudoerrado", null).show();
            tx.setText("Tente de novo");
        }
    }
}
