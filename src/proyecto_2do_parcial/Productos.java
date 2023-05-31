/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2do_parcial;

/**
 *
 * @author Angeles
 */
public class Productos
{
    String Clave, nombre;
    double precio;
    int existencia;

    public Productos()
    {
    }

    public Productos(String Clave, String nombre, double precio, int existencia)
    {
        this.Clave = Clave;
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
    }

    public String getClave()
    {
        return Clave;
    }

    public void setClave(String Clave)
    {
        this.Clave = Clave;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public int getExistencia()
    {
        return existencia;
    }

    public void setExistencia(int existencia)
    {
        this.existencia = existencia;
    }

    @Override
    public String toString()
    {
        return "Productos{" + "Clave=" + Clave + ", nombre=" + nombre + ", precio=" + precio + ", existencia=" + existencia + '}';
    }
    
}
