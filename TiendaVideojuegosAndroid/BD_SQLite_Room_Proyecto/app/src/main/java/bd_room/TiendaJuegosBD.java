package bd_room;

import android.content.Context;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import Controlador.DAO;
import Entidades.Juego;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Juego.class}, version = 1, exportSchema = false)
public abstract class TiendaJuegosBD extends RoomDatabase {
    public abstract DAO DAO();

    private static volatile TiendaJuegosBD INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    public static final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public static TiendaJuegosBD getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (TiendaJuegosBD.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), TiendaJuegosBD.class, "TiendaJuegos").build();
                }
            }
        }
        return INSTANCE;
    }


}
