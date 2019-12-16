
package Conexiones;

import java.sql.CallableStatement;
import java.sql.SQLException;

public class Procedimientos {
    
    public static void entradaJuego(String a, String b, String c, String d,  int e, double f, int g, String h, int i)throws SQLException{
        CallableStatement entrada = Conexion.getConnection().prepareCall("{call InsertarJuego(?,?,?,?,?,?,?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setString(4, d);
        entrada.setInt(5, e);
        entrada.setDouble(6, f);
        entrada.setInt(7, g);
        entrada.setString(8, h);
        entrada.setInt(9, i);
        entrada.execute();
    }
    public static void modificarJuego(String a, String b, String c, String d,  int e, double f, String g)throws SQLException{
        CallableStatement entrada = Conexion.getConnection().prepareCall("{call modificarJuego(?,?,?,?,?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setString(4, d);
        entrada.setInt(5, e);
        entrada.setDouble(6, f);
        entrada.setString(7, g);
        entrada.execute();
    }
    
    public static void eliminarJuego(String a)throws SQLException{
        CallableStatement entrada = Conexion.getConnection().prepareCall("{call BorrarJuego(?)}");
        entrada.setString(1, a);
        entrada.execute();
    }
    
    public static void ventaJuego(int a, String b, String c, String d,  String e, String f, String g, String h, 
            String i, int j, String k, String l, int m, String n)throws SQLException{
        CallableStatement entrada = Conexion.getConnection().prepareCall("{call ListaJuegosComprados(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
        entrada.setInt(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setString(4, d);
        entrada.setString(5, e);
        entrada.setString(6, f);
        entrada.setString(7, g);
        entrada.setString(8, h);
        entrada.setString(9, i);
        entrada.setInt(10, j);
        entrada.setString(11, k);
        entrada.setString(12, l);
        entrada.setInt(13, m);
        entrada.setString(14, n);
        entrada.execute();
    }
}
