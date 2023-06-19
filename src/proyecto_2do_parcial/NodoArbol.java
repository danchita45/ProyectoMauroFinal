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
public class NodoArbol
{
    NodoArbol Izq, Der;
    String Etq;
    Object obj;

    public NodoArbol(String Etq, Object obj)
    {
        this.Etq = Etq;
        this.obj = obj;
        this.Der = null;
        this.Izq = null;
    }

    public String getEtq()
    {
        return Etq;
    }

    public void setEtq(String Etq)
    {
        this.Etq = Etq;
    }

    public Object getObj()
    {
        return obj;
    }

    public void setObj(Object obj)
    {
        this.obj = obj;
    }
    
    public void setObj(NodoArbol obj)
    {
        this.obj = obj;
    }
    
    public NodoArbol getIzq()
    {
        return Izq;
    }

    public void setIzq(NodoArbol Izq)
    {
        this.Izq = Izq;
    }

    public NodoArbol getDer()
    {
        return Der;
    }

    public void setDer(NodoArbol Der)
    {
        this.Der = Der;
    }
    
}
