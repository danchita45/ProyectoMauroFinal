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
public class multilista
{

   public static NodoLista r = null;

    public NodoLista getR()
    {
        return r;
    }

    public void setR(NodoLista r)
    {
        this.r = r;
    }

    public  NodoLista inserta(NodoLista r, NodoLista n, String[] s, int nivel)
    {

        if (nivel == s.length)
        {
            ListaDoblementeLigada l = new ListaDoblementeLigada();
            l.setr(r);
            l.inserta(n);
            return l.getr();
        } else
        {
            
            ListaDoblementeLigada li = new ListaDoblementeLigada();

            li.setr(r);
            NodoLista aux = li.buscar(s[nivel]);
            if (aux == null)
            {
                aux=r;
                aux.setAbajo(inserta(aux, n, s, nivel + 1));
            }
            return r;
        }
    }

    public void elimina(NodoLista r, String[] s, NodoLista[] arr, int nivel)
    {
        if (nivel == s.length - 1)
        {
            ListaDobleCircular lista = new ListaDobleCircular();
            lista.setR(r);
            arr[1] = lista.elimina(s[nivel]);
            arr[0] = lista.getR();
        } else
        {
            ListaDobleCircular lista = new ListaDobleCircular();
            lista.setR(r);
            NodoLista aux = lista.busca(s[nivel]);
            if (aux != null)
            {
                elimina(aux.getAbajo(), s, arr, nivel + 1);
                aux.setAbajo(arr[0]);
                arr[0] = r;
            } else
            {
                arr[0] = r;
            }
        }
    }

    public void muestra(NodoLista r, String s)
    {
        while (r != null)
        {
            System.out.println(s + r.getEtiqueta());
            muestra(r.getAbajo(), s + "\t");
            r = r.getSig();
        }
    }
}
