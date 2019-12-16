package itsj.e.bd_sqlite_room;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import Entidades.Juego;

public class adapter extends RecyclerView.Adapter {
    private Context contecto;
    private ArrayList<Juego> p;

    public adapter(Context contecto, ArrayList<Juego> p){
        this.p=p;
        this.contecto=contecto;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View contentView =LayoutInflater.from(contecto).inflate(R.layout.lay,null);
        return new Holder(contentView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            Juego pro = p.get(position);
            Holder h = (Holder) holder;
            System.out.println("Pro: "+pro.getIdJuego());
            h.IDlay.setText(pro.getIdJuego());
            h.nom.setText(pro.getTitulo());
            h.cantidadlay.setText(pro.getCantidad()+"");
            h.Tipolay.setText(pro.getPlataforma());
    }

    @Override
    public int getItemCount() {
        return p.size();
    }

    public static class Holder extends RecyclerView.ViewHolder{
        TextView IDlay;
        TextView nom;
        TextView Tipolay;
        TextView cantidadlay;
        public Holder(@NonNull View vista) {
            super(vista);
            IDlay = (TextView) vista.findViewById(R.id.IDlay);
            nom = (TextView) vista.findViewById(R.id.nom);
            Tipolay = (TextView) vista.findViewById(R.id.Tipolay);
            cantidadlay = (TextView) vista.findViewById(R.id.cantidadlay);
        }
    }

}