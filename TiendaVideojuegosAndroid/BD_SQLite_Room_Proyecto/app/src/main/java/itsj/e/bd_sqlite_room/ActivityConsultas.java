package itsj.e.bd_sqlite_room;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

import Entidades.Juego;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import bd_room.TiendaJuegosBD;

public class ActivityConsultas extends Activity {


    private EditText txtBuscar;
    private Button btnBuscar;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager manager;
    private Spinner sp;
    ArrayList<Juego> listaJuegos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultas);
        sp = findViewById(R.id.spnPlataformaConsultas);
        txtBuscar = findViewById(R.id.txt_buscarConsultas);
        btnBuscar = findViewById(R.id.btn_searchB);

        TiendaJuegosBD bd = Room.databaseBuilder(getApplicationContext(), TiendaJuegosBD.class, "TiendaJuegos").allowMainThreadQueries().build();
        listaJuegos = new ArrayList<Juego>(bd.DAO().getAll());


        recyclerView = (RecyclerView) findViewById(R.id.RV);
        manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        adapter = new adapter(this,listaJuegos);
        recyclerView.setAdapter(adapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView , int position, long id){
                //your code here
                TiendaJuegosBD bd2 = Room.databaseBuilder(getApplicationContext(), TiendaJuegosBD.class, "TiendaJuegos").allowMainThreadQueries().build();
                if (sp.getSelectedItemPosition()==0){
                    listaJuegos = new ArrayList<Juego>(bd2.DAO().getAll());
                    actualizar();
                }else {
                    listaJuegos = new ArrayList<Juego>(bd2.DAO().getAllbuscarJuegoPlataforma(sp.getSelectedItem().toString()));
                    actualizar();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?>parentView){

            }
        });

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TiendaJuegosBD bd2 = Room.databaseBuilder(getApplicationContext(), TiendaJuegosBD.class, "TiendaJuegos").allowMainThreadQueries().build();

                if (txtBuscar.getText().toString().equals("")){
                    listaJuegos = new ArrayList<Juego>(bd2.DAO().getAll());
                    actualizar();

                }else{
                    String s = txtBuscar.getText().toString();
                    listaJuegos = new ArrayList<Juego>(bd2.DAO().getAllbuscarJuego(txtBuscar.getText().toString()));
                    actualizar();

                }


            }
        });


    }

public void actualizar(){
    adapter = new adapter(this,listaJuegos);
    recyclerView.setAdapter(adapter);
}

}
