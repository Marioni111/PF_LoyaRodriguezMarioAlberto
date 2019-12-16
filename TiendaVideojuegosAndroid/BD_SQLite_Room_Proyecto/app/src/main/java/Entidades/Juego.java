package Entidades;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Juego {

        @NonNull
        @PrimaryKey
        private String idJuego;
        @NonNull
        @ColumnInfo(name = "Titulo")
        private String titulo;
        @NonNull
        @ColumnInfo(name = "Plataforma")
        private String plataforma;
        @NonNull
        @ColumnInfo(name = "Cantidad")
        private int cantidad;
        @NonNull
        @ColumnInfo(name = "Precio")
        private String precio;


        public Juego() {

        }

        public Juego(@NonNull String idJuego, @NonNull String titulo, @NonNull String plataforma, int cantidad, @NonNull String precio) {
                this.idJuego = idJuego;
                this.titulo = titulo;
                this.plataforma = plataforma;
                this.cantidad = cantidad;
                this.precio = precio;
        }

        @NonNull
        public String getIdJuego() {
                return idJuego;
        }

        public void setIdJuego(@NonNull String idJuego) {
                this.idJuego = idJuego;
        }

        @NonNull
        public String getTitulo() {
                return titulo;
        }

        public void setTitulo(@NonNull String titulo) {
                this.titulo = titulo;
        }

        @NonNull
        public String getPlataforma() {
                return plataforma;
        }

        public void setPlataforma(@NonNull String plataforma) {
                this.plataforma = plataforma;
        }

        public int getCantidad() {
                return cantidad;
        }

        public void setCantidad(int cantidad) {
                this.cantidad = cantidad;
        }

        @NonNull
        public String getPrecio() {
                return precio;
        }

        public void setPrecio(@NonNull String precio) {
                this.precio = precio;
        }

        @Override
        public String toString() {
                return "=======/= JUEGOS =/=======\n" +
                        "ID Juego: "+ idJuego +"\n"+
                        "Titulo: "+titulo+"\n"+
                        "Plataforma: "+ plataforma +"\n"+
                        "Cantidad: "+cantidad+"\n"+
                        "Precio: "+ precio +"\n";
        }
}
