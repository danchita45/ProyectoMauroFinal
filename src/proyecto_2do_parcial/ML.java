package proyecto_2do_parcial;

public class ML
{

    NodoLista<Object> r = null;

    //n= dato a agregar
    //r= lista anterior
    public NodoLista inserta(String[] s, int nivel, NodoLista n, NodoLista r)
    {
        ListaDoblementeLigada lista = new ListaDoblementeLigada();
        if (nivel == s.length - 1)
        {
            lista.setr(r);
            lista.inserta(n);
            return lista.getr();
        } else
        {
            lista.setr(r);
            NodoLista nodo = lista.buscar(s[nivel]);
            if (nodo == null)
            {
                System.out.println("Error");
            } else
            {
                nodo.setAbajo(inserta(s, nivel + 1, n, nodo.getAbajo()));
            }
            return r;
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

    public void borrar(NodoLista r, String s[], int nivel, NodoLista n[])
    {
        if (nivel == s.length - 1)
        {
            ListaDoblementeLigada lista = new ListaDoblementeLigada();
            lista.setr(r);
            n[1] = lista.eliminar(s[nivel]);
            n[0] = lista.getr();
        } else
        {
            ListaDoblementeLigada lista = new ListaDoblementeLigada();
            lista.setr(r);
            NodoLista aux = lista.buscar(s[nivel]);
            if (aux != null)
            {
                borrar(aux.getAbajo(), s, nivel + 1, n);
                aux.setAbajo(n[0]);
                n[0] = r;
            } else
            {
                n[0] = r;
            }
        }
    }

    public NodoLista<Object> getR()
    {
        return r;
    }

    public void setR(NodoLista<Object> r)
    {
        this.r = r;
    }
    
}
