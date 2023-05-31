/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_2do_parcial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Danchita45
 */
public class Archivo
{
        String nombre;

    public Archivo() {
    }

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<String> obtenerTexto() {
        LinkedList<String> lineas = null;
        try {
            File archivo = obtenerArchivo();
            if (archivo.exists()) {
                lineas = new LinkedList();
                BufferedReader br = new BufferedReader(new FileReader(archivo));
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                    lineas.add(linea);

                }
                br.close();

            } else {
                JOptionPane.showMessageDialog(null, "El archivo no Existe");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "se ha producido un error");

        }
        return lineas;
    }

    private File obtenerArchivo() {
        try {
            URL url = getClass().getClassLoader().getResource("archivos/" + nombre);
            return new File(url.toURI());
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
            return null;
        }

    }

    public boolean registrar(String linea) {
        File archivo = obtenerArchivo();
        try {
            if (archivo.exists()){
                FileWriter fw = new FileWriter(archivo, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                pw.println(linea);
                pw.flush();
                pw.close();

                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public void Limpiar() {
        File arc = obtenerArchivo();
        try {
            FileWriter esc = new FileWriter(arc);
            BufferedWriter bufferEscritor = new BufferedWriter(esc);
            bufferEscritor.close();
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
}
