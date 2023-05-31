/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;

/**
 *
 * @author Angeles
 */
public class Farmacias implements Serializable
{
   public String Nombre,Clave,TDS,RFC;

    public Farmacias()
    {
    }

    public Farmacias(String Nombre, String Clave, String TDS, String RFC)
    {
        this.Nombre = Nombre;
        this.Clave = Clave;
        this.TDS = TDS;
        this.RFC = RFC;
    }

    public String getNombre()
    {
        return Nombre;
    }

    public void setNombre(String Nombre)
    {
        this.Nombre = Nombre;
    }

    public String getClave()
    {
        return Clave;
    }

    public void setClave(String Clave)
    {
        this.Clave = Clave;
    }

    public String getTDS()
    {
        return TDS;
    }

    public void setTDS(String TDS)
    {
        this.TDS = TDS;
    }

    public String getRFC()
    {
        return RFC;
    }

    public void setRFC(String RFC)
    {
        this.RFC = RFC;
    }

    @Override
    public String toString()
    {
        return "Farmacias{" + "Nombre=" + Nombre + ", Clave=" + Clave + ", TDS=" + TDS + ", RFC=" + RFC + '}';
    }
    
}
