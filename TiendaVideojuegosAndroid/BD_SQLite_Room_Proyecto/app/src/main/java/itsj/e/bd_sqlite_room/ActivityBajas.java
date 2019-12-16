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

import Entidades.Juego;
import androidx.room.Room;

import bd_room.TiendaJuegosBD;

public class ActivityBajas extends Activity {

    Spinner SpinnerPlataforma;
    EditText txtIdJuego, txtTitulo, txtPrecio, txtcantidad, txtBuscar;
    Button botonEliminar, botonBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bajas);

        SpinnerPlataforma = findViewById(R.id.spinnerPlataforma);
        ArrayAdapter<CharSequence> adapterEdad = ArrayAdapter.createFromResource(this, R.array.Plataformas, android.R.layout.simple_spinner_item);
        adapterEdad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerPlataforma.setAdapter(adapterEdad);


        txtIdJuego = findViewById(R.id.txt_IdJuegoBajas);
        txtTitulo = findViewById(R.id.txt_TituloBajas);
        txtPrecio = findViewById(R.id.txt_Precio);
        txtcantidad = findViewById(R.id.txt_cantidad);
        txtBuscar = findViewById(R.id.txt_buscarConsultas);

        botonEliminar = findViewById(R.id.btn_eliminarB);
        botonBuscar = findViewById(R.id.btn_searchB);

        botonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TiendaJuegosBD bd = Room.databaseBuilder(getApplicationContext(), TiendaJuegosBD.class, "TiendaJuegos").allowMainThreadQueries().build();

                String buscar = txtBuscar.getText().toString();
                Juego al = bd.DAO().buscarJuego(buscar);

                if( al != null ) {
                    Log.i("Activity Bajas", "Se están llenando");
                    txtIdJuego.setText(al.getIdJuego());
                    txtTitulo.setText(al.getTitulo());
                    String p=al.getPrecio();
                    txtPrecio.setText(p, TextView.BufferType.EDITABLE);
                    p=al.getCantidad()+"";
                    txtcantidad.setText(p, TextView.BufferType.EDITABLE);

                    int posicion = 0;
                    for (int i = 0; i < SpinnerPlataforma.getCount(); i++) {
                        if (SpinnerPlataforma.getItemAtPosition(i).toString().equalsIgnoreCase(String.valueOf(al.getPlataforma())) ) {
                            posicion = i;
                        }
                    }
                    SpinnerPlataforma.setSelection(posicion);
                    Toast.makeText(ActivityBajas.this, "Datos cargados", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ActivityBajas.this, "No se encontraron resultados", Toast.LENGTH_SHORT).show();
                    Log.i("Activity Bajas", "No se encontró resultado");
                }

            }
        });
        
        botonEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TiendaJuegosBD bd = Room.databaseBuilder(getApplicationContext(), TiendaJuegosBD.class, "TiendaJuegos").allowMainThreadQueries().build();

                if(bd.DAO().eliminarJuego(txtIdJuego.getText().toString()) != 0 ) {
                    Log.i("ActivityBajas", "Conectado");
                    txtIdJuego.setText("");
                    txtBuscar.setText("");
                    txtTitulo.setText("");
                    txtPrecio.setText("");
                    txtcantidad.setText("");
                    SpinnerPlataforma.setSelection(0);
                    Toast.makeText(ActivityBajas.this, "Registro eliminado", Toast.LENGTH_SHORT).show();
                } else {
                    Log.i("Activity Bajas", "No se pudo");
                    Toast.makeText(ActivityBajas.this, "No se pudo eliminar el registro", Toast.LENGTH_SHORT).show();
                }
            }
        });
        
        
    }

}
