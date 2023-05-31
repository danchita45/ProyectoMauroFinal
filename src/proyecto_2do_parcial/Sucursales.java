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
public class Sucursales
{
    String Clave,Nombre,CodigoPostal;

    public Sucursales()
    {
    }

    public Sucursales(String Clave, String Nombre, String CodigoPostal)
    {
        this.Clave = Clave;
        this.Nombre = Nombre;
        this.CodigoPostal = CodigoPostal;
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
        return Nombre;
    }

    public void setNombre(String Nombre)
    {
        this.Nombre = Nombre;
    }

    public String getCodigoPostal()
    {
        return CodigoPostal;
    }

    public void setCodigoPostal(String CodigoPostal)
    {
        this.CodigoPostal = CodigoPostal;
    }

    @Override
    public String toString()
    {
        return "Sucursales{" + "Clave=" + Clave + ", Nombre=" + Nombre + ", CodigoPostal=" + CodigoPostal + '}';
    }
    
    
}
