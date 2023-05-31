package proyecto_2do_parcial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angeles
 */
public class NodoLista<T>
{

    String etiqueta;
    T obj;
    NodoLista sig, ant, abajo;

    public NodoLista()
    {
    }
    
    
    public NodoLista(String etiqueta, T obj)
    {
        this.etiqueta = etiqueta;
        this.obj = obj;
        this.sig = null;
        this.ant = null;
        this.abajo = null;
    }

    public NodoLista getAbajo()
    {
        return abajo;
    }

    public void setAbajo(NodoLista abajo)
    {
        this.abajo = abajo;
    }

    public String getEtiqueta()
    {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta)
    {
        this.etiqueta = etiqueta;
    }

    public T getObj()
    {
        return obj;
    }

    public void setObj(T obj)
    {
        this.obj = obj;
    }

    public NodoLista getSig()
    {
        return sig;
    }

    public void setSig(NodoLista sig)
    {
        this.sig = sig;
    }

    public NodoLista getAnt()
    {
        return ant;
    }

    public void setAnt(NodoLista ant)
    {
        this.ant = ant;
    }

    @Override
    public String toString()
    {
        return "NodoLista{" + "etiqueta=" + etiqueta + ", obj=" + obj + ", sig=" + sig + ", ant=" + ant + '}';
    }

}
