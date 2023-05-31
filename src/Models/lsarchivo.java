/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import proyecto_2do_parcial.ListaDobleCircular;
import proyecto_2do_parcial.Sucursal;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto_2do_parcial.NodoLista;
import proyecto_2do_parcial.multilista;

/**
 *
 * @author Danchita45
 */
public class lsarchivo {

    public boolean InsertarnuevaLista(Object lista) throws IOException {
        File arch = new File("listas.dat");
         RandomAccessFile archivorw = new RandomAccessFile(arch, "rw");
        archivorw.setLength(0);
        
        File archivo = new File("listas.dat");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(archivo, true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lsarchivo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(fos);
        } catch (IOException ex) {
            Logger.getLogger(lsarchivo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        oos.writeObject(lista);
        oos.close();
        fos.close();
        return true;
    }

    public multilista SacaDatos() {
        File archivo = new File("listas.dat");
        multilista np = null;
        NodoLista nld = new NodoLista();
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois;
            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                
                nld = (NodoLista) ois.readObject();
                
                
            }
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return np;
    }

}
