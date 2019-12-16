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

public class ActivityCambios extends Activity {

    Spinner spinnerPlataforma;
    EditText txtIdJuego, txtTitulo, txtPrecio, txtcantidad, txtBuscar;
    Button botonModificar, botonBuscar;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambios);

        spinnerPlataforma = findViewById(R.id.spnPlataformaCambios);
        ArrayAdapter<CharSequence> adapterEdad = ArrayAdapter.createFromResource(this, R.array.Plataformas, android.R.layout.simple_spinner_item);
        adapterEdad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPlataforma.setAdapter(adapterEdad);


        txtIdJuego = findViewById(R.id.txt_idJuegoCambios);
        txtTitulo = findViewById(R.id.txt_TituloCambios);
        txtPrecio = findViewById(R.id.txt_precioCam);
        txtcantidad = findViewById(R.id.txtcantidadca);
        txtBuscar = findViewById(R.id.txt_buscarConsultas);

        botonModificar = findViewById(R.id.btn_modificar2);
        botonBuscar = findViewById(R.id.btn_searchB);

        botonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    TiendaJuegosBD bd = Room.databaseBuilder(getApplicationContext(), TiendaJuegosBD.class, "TiendaJuegos").allowMainThreadQueries().build();

                    String buscar = txtBuscar.getText().toString();
                    Juego al = bd.DAO().buscarJuego(buscar);

                    if (al != null) {
                        Log.i("Activity Cambios", "Llenando...");
                        txtIdJuego.setText(al.getIdJuego());
                        txtTitulo.setText(al.getTitulo());
                        String p = al.getPrecio();
                        txtPrecio.setText(p, TextView.BufferType.EDITABLE);
                        p = al.getCantidad() + "";
                        txtcantidad.setText(p, TextView.BufferType.EDITABLE);

                        int posicion = 0;
                        for (int i = 0; i < spinnerPlataforma.getCount(); i++) {
                            if (spinnerPlataforma.getItemAtPosition(i).toString().equalsIgnoreCase(String.valueOf(al.getPlataforma()))) {
                                posicion = i;
                            }
                        }
                        spinnerPlataforma.setSelection(posicion);
                        Toast.makeText(ActivityCambios.this, "Datos cargados", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(ActivityCambios.this, "No se encontraron resultados", Toast.LENGTH_SHORT).show();
                        Log.i("Activity Cambios", "No se encontró resultado");
                    }

                }

        });
    }

    public void Modificar(View v) {
        if (txtIdJuego.getText().equals("") || txtTitulo.getText().toString().equals("") || txtPrecio.getText().toString().equals("") || txtcantidad.getText().equals("") || spinnerPlataforma.getSelectedItemPosition() == 0) {
            if (txtIdJuego.length() == 0) {
                txtIdJuego.setError("Campo Vacio");
            }
            if (txtTitulo.length() == 0) {
                txtTitulo.setError("Campo Vacio");
            }
            if (txtPrecio.length() == 0) {
                txtPrecio.setError("Campo Vacio");
            }
            if (txtcantidad.length() == 0) {
                txtcantidad.setError("Campo Vacio");
            }
            if (spinnerPlataforma.getSelectedItemPosition() == 0) {
                ((TextView) spinnerPlataforma.getSelectedView()).setError("Tipo Producto Invalido");
            }
        } else {
            TiendaJuegosBD bd = Room.databaseBuilder(getApplicationContext(), TiendaJuegosBD.class, "TiendaJuegos").allowMainThreadQueries().build();
            Juego a = new Juego(txtIdJuego.getText().toString(), txtTitulo.getText().toString(), spinnerPlataforma.getSelectedItem().toString(), Integer.parseInt(txtcantidad.getText().toString()), txtPrecio.getText().toString());

            bd.DAO().update(a);
            Toast.makeText(ActivityCambios.this, "Registro Modificado", Toast.LENGTH_SHORT).show();
            txtIdJuego.setText("");
            txtBuscar.setText("");
            txtTitulo.setText("");
            txtPrecio.setText("");
            txtcantidad.setText("");
            spinnerPlataforma.setSelection(0);

        }
    }
}
