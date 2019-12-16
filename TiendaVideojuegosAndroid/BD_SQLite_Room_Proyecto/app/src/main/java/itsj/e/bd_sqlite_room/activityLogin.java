package itsj.e.bd_sqlite_room;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Locale;
import androidx.appcompat.app.AppCompatActivity;

public class activityLogin extends AppCompatActivity {
        EditText txtUsuario, txtContra;
        TextView txt;
        Button btnInicio;
        Switch sw;
        String PS="Ususario Incorecto";
        String Contr="Contraseña incorecta";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        sw =findViewById(R.id.switch1);
        btnInicio= findViewById(R.id.btn_login);
        txtContra= findViewById(R.id.txt_password);
        txtUsuario= findViewById(R.id.txt_usuario);
        txt=findViewById(R.id.tituloLogin2);


        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (sw.isChecked()){
                    String localeCode="eng";
                    Resources res = getResources();
                    DisplayMetrics dm = res.getDisplayMetrics();
                    Configuration conf = res.getConfiguration();
                    if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN_MR1){
                        conf.setLocale(new Locale(localeCode.toLowerCase()));
                    } else {
                        conf.locale = new Locale(localeCode.toLowerCase());
                    }
                    PS="Incorrect User";
                    Contr="Incorrect password";
                    txt.setText("Log in");
                    btnInicio.setText("Log in");
                    txtContra.setHint("Password");
                    txtUsuario.setHint("User");
                    sw.setText("change language to Spanish:");
                    res.updateConfiguration(conf, dm);
                }else{
                    String localeCode="es";
                    Resources res = getResources();
                    DisplayMetrics dm = res.getDisplayMetrics();
                    Configuration conf = res.getConfiguration();
                    if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN_MR1){
                        conf.setLocale(new Locale(localeCode.toLowerCase()));
                    } else {
                        conf.locale = new Locale(localeCode.toLowerCase());
                    }
                    PS="Ususario Incorecto";
                    Contr="Contraseña incorecta";
                    txt.setText("inicia sesión");
                    txtContra.setHint("Contraseña");
                    txtUsuario.setHint("Usuario");
                    btnInicio.setText("inicia sesión");
                    sw.setText("Cambiar idioma Ingles:");
                    res.updateConfiguration(conf, dm);

                }
            }
        });


        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtUsuario.getText().toString().equals("Mario") && txtContra.getText().toString().equals("1234")){
                    Toast.makeText(getApplicationContext(), "Redireccionando...", Toast.LENGTH_SHORT).show();
                    inicioSession();
                }else{
                    txtUsuario.setError(PS);
                    txtContra.setError(Contr);
                    Toast.makeText(getApplicationContext(), "Usuario o Contraseña Incorectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void inicioSession() {
        Intent a = new Intent(this, ActivityJuegos.class);
        startActivity(a);

    }
}
