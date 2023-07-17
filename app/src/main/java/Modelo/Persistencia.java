package Modelo;

import android.database.Cursor;

import com.example.examencorte02.Ventas;
//Persistencia
public interface Persistencia {
    public void openDataBase();
    public void closeDataBase();
    public long insertVentas(Ventas ventas);

}
