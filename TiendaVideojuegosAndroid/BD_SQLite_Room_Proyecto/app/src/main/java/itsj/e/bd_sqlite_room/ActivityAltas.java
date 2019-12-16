package itsj.e.bd_sqlite_room;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import Entidades.Juego;
import androidx.room.Room;
import bd_room.TiendaJuegosBD;

public class ActivityAltas extends Activity {

    Spinner Plataforma;
    EditText txtIdJuego, txtTitulo, txtCantidad, txtPrecio;
    Button botonAñadir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altas);


        Plataforma = findViewById(R.id.spinnerPlataforma);
        ArrayAdapter<CharSequence> adapterEdad = ArrayAdapter.createFromResource(this, R.array.Plataformas, android.R.layout.simple_spinner_item);
        adapterEdad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Plataforma.setAdapter(adapterEdad);


        txtIdJuego = findViewById(R.id.txtIDJuego);
        txtTitulo = findViewById(R.id.txtTitulo);
        txtCantidad = findViewById(R.id.txt_cantidadP);
        txtPrecio = findViewById(R.id.txt_precioP);

        botonAñadir = findViewById(R.id.botonAñadir);


        botonAñadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtIdJuego.getText().equals("") || txtTitulo.getText().toString().equals("") || txtPrecio.getText().toString().equals("") || txtCantidad.getText().equals("") || Plataforma.getSelectedItemPosition()==0){
                    if (txtIdJuego.length()==0){ txtIdJuego.setError("Campo Vacio"); }
                    if (txtTitulo.length()==0){ txtTitulo.setError("Campo Vacio"); }
                    if (txtPrecio.length()==0){ txtPrecio.setError("Campo Vacio"); }
                    if (txtCantidad.length()==0){ txtCantidad.setError("Campo Vacio"); }
                    if (Plataforma.getSelectedItemPosition()==0){((TextView)Plataforma.getSelectedView()).setError("Plataforma de juego invalida");}
                }else {
                    TiendaJuegosBD bd = Room.databaseBuilder(getApplicationContext(), TiendaJuegosBD.class, "TiendaJuegos").allowMainThreadQueries().build();
                    Juego a = new Juego(txtIdJuego.getText().toString(), txtTitulo.getText().toString(), Plataforma.getSelectedItem().toString(), Integer.parseInt(txtCantidad.getText().toString()), txtPrecio.getText().toString());

                    try {
                        bd.DAO().insertAll(a);
                        List<Juego> listaProductos = bd.DAO().getAll();
                        for (Juego al : listaProductos) {
                            if (al.getIdJuego().equals(a.getIdJuego())) {

                                Toast.makeText(getApplicationContext(), "El juego ya esta a la venta", Toast.LENGTH_SHORT).show();
                                txtIdJuego.setText("");
                                txtTitulo.setText("");
                                Plataforma.setSelection(0);
                                txtCantidad.setText("");
                                txtPrecio.setText("");
                                Log.i("Juego -->", al.toString());
                            } else {
                                Toast.makeText(getApplicationContext(), "No se pudo añadir el juego", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }catch (Exception e){
                        Toast.makeText(getApplicationContext(), "Id ya existe", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }

}

