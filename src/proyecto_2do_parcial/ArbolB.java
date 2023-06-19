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
public class ArbolB
{

    NodoArbol r = null;

    public NodoArbol getR()
    {
        return r;
    }

    public void setR(NodoArbol r)
    {
        this.r = r;
    }

    public NodoArbol inserta(NodoArbol r, NodoArbol n)
    {
        if (r == null) //Esto es para romper recursividad
        {
            return n;
        } else
        {
            if (r.getEtq().compareTo(n.getEtq()) < 0)
            {
                r.setDer(inserta(r.getDer(), n));
            } else
            {
                r.setIzq(inserta(r.getIzq(), n));
            }
            return r;
        }
    }

    public void elimina(NodoArbol r, String dato, NodoArbol[] arr) //Se necesita un arreglpo para identificar el dato eliminado y la nueva r
    {
        if (r != null)
        {
            if (r.getEtq().equals(dato))
            {
                arr[1] = r;
                if (r.getIzq() == null && r.getDer() == null)
                {
                    arr[0] = null;
                } else
                {
                    if (!(r.getDer() != null && r.getIzq() != null))
                    {
                        if (r.getIzq() != null)
                        {
                            arr[0] = r.getIzq();
                            r.setIzq(null);
                        } else
                        {
                            arr[0] = r.getDer();
                            r.setDer(null);
                        }
                    } else
                    {
                        if (r.getDer().getIzq() == null)
                        {
                            arr[0] = r.getDer();
                            r.getDer().setIzq(r.getIzq());
                        } else
                        {
                            NodoArbol seo = SucesorEnOrden(r.getDer());
                            arr[0] = seo.getIzq();
                            seo.setIzq(seo.getIzq().getDer());
                            arr[0].setDer(r.getDer());
                            arr[0].setIzq(r.getIzq());
                            r.setDer(null);
                            r.setIzq(null);
                        }
                    }
                }
            } else
            {
                if (r.getEtq().compareTo(dato) > 0)
                {
                    elimina(r.getIzq(), dato, arr);
                    r.setIzq(arr[0]);
                } else
                {
                    elimina(r.getDer(), dato, arr);
                    r.setDer(arr[0]);
                }
                arr[0] = r;
            }
        } else
        {
            arr[0] = r;
        }
    }

    public void EnOrden(NodoArbol r)
    {
        if (r != null)
        {
            EnOrden(r.getIzq());
            System.out.print(r.getEtq());
            EnOrden(r.getDer());
        }
    }

    public void PreOrden(NodoArbol r)
    {
        if (r != null)
        {
            System.out.print(r.getEtq());
            PreOrden(r.getIzq());
            PreOrden(r.getDer());
        }
    }

    public void PosOrden(NodoArbol r)
    {
        if (r != null)
        {
            PosOrden(r.getIzq());
            PosOrden(r.getDer());
            System.out.print(r.getEtq());
        }
    }

    public NodoArbol SucesorEnOrden(NodoArbol r)
    {
        if (r.getIzq().getIzq() != null)
        {
            return SucesorEnOrden(r.getIzq());
        } else
        {
            return r;
        }
    }
}
