package Controlador;

import java.util.List;

import Entidades.Juego;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;
@Dao
public interface DAO {


    @Query("SELECT * FROM Juego")
    List<Juego> getAll();

    @Query("SELECT * FROM Juego WHERE idJuego = :nc")
    Juego buscarJuego(String nc);

    @Query("SELECT * FROM Juego WHERE idJuego = :nc")
    List<Juego>  getAllbuscarJuego(String nc);

    @Query("SELECT * FROM Juego WHERE Plataforma = :nc")
    List<Juego>  getAllbuscarJuegoPlataforma(String nc);

    @Query("DELETE FROM Juego WHERE idJuego = :nc")
    int eliminarJuego(String nc);


    @Insert
    void insertAll(Juego... juegos);

    @Delete
    void delete(Juego juegos);

    @Update
    public abstract void update(Juego juegos);



}
