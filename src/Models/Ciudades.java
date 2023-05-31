/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Angeles
 */
public class Ciudades
{
    String Estado, Municipio, Ciudad;

    public Ciudades()
    {
    }

    public Ciudades(String Estado, String Municipio, String Ciudad)
    {
        this.Estado = Estado;
        this.Municipio = Municipio;
        this.Ciudad = Ciudad;
    }

    public String getEstado()
    {
        return Estado;
    }

    public void setEstado(String Estado)
    {
        this.Estado = Estado;
    }

    public String getMunicipio()
    {
        return Municipio;
    }

    public void setMunicipio(String Municipio)
    {
        this.Municipio = Municipio;
    }

    public String getCiudad()
    {
        return Ciudad;
    }

    public void setCiudad(String Ciudad)
    {
        this.Ciudad = Ciudad;
    }

    @Override
    public String toString()
    {
        return "Ciudades{" + "Estado=" + Estado + ", Municipio=" + Municipio + ", Ciudad=" + Ciudad + '}';
    }
    
}
