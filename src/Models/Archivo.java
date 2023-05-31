package Models;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import proyecto_2do_parcial.ML;
import proyecto_2do_parcial.NodoLista;

public class Archivo
{

    private String destinoArchivo = "C:\\Program Files (x86)\\Temporal";

    public void guardarArchivo(ML multi) throws FileNotFoundException
    {

        try {
            File archivo = new File("datos.dat");
            FileOutputStream salida = new FileOutputStream(archivo);
            ObjectOutputStream escribir = new ObjectOutputStream(salida);

            //desarmar multilista
            escribir.writeObject(multi);
            escribir.close();
        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo. " + e.getMessage());
        }
    }

    public void leerArchivo()
    {
        File archivo = new File("datos.dat");
        try {
            FileInputStream entrada = new FileInputStream(archivo);
            ObjectInputStream leer;
            while (entrada.available() > 0) {
                leer = new ObjectInputStream(entrada);
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo. " + e.getMessage());
        }
    }

    public MULTIPART[] desarme(NodoLista r, MULTIPART arr[], int n)
    {

        if (r.getAbajo() != null) {
            r = r.getAbajo();
            n++;
            desarme(r, arr, n);
        }
        while (r != null) {
            r = r.getSig();
        }
        
        MULTIPART a[] = new MULTIPART[arr.length + 1];
        System.arraycopy(arr, 0, a, 0, arr.length);
        arr = a;
        MULTIPART s = new MULTIPART();
        s.arr = r.getEtiqueta();
        s.n = r;
        s.nivel = n;
        arr[n] = s;

        return arr;
    }

}
