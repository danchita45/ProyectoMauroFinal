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
public class ListaDobleCircular
{

    NodoLista r = null;

    public NodoLista getR()
    {
        return r;
    }

    public void setR(NodoLista r)
    {
        this.r = r;
    }

    public boolean inserta(NodoLista n)
    {
        if (n == null)//Cuando no se puede insertar
        {
            System.out.println("No se puede insertar.");
            return false;
        } else
        {
            if (r == null)//Cuando es el primero
            {
                r = n;
                r.setSig(n);
                r.setAnt(n);
            } else
            {
                if (r.getEtiqueta().compareTo(n.getEtiqueta()) < 0 || r.getSig().getEtiqueta().compareTo(n.getEtiqueta()) > 0)//Cuando es menor
                {
                    n.setSig(r.getSig());
                    n.setAnt(r);
                    r.getSig().setAnt(n);
                    r.setSig(n);
                    if (r.getEtiqueta().compareTo(n.getEtiqueta()) < 0)
                    {
                        r = n;
                    }
                } else
                {
                    boolean b = true;
                    NodoLista aux = r.getSig(); //primer elemento de la lista
                    while (b)
                    {
                        if (aux.getSig().getEtiqueta().compareTo(n.getEtiqueta()) > 0)//Cuando es mayor 
                        {
                            n.setSig(aux.getSig());
                            n.setAnt(aux);
                            aux.setSig(n);
                            aux.getSig().getSig().setAnt(n);
                            b = false;
                        } else
                        {
                            aux = aux.getSig();
                        }
                    }
                }
            }
            return true;
        }
    }

    public NodoLista elimina(String s)
    {
        NodoLista aux, nodoEliminado = null;
        if (r == null)//Cuando la lista esta vacia
        {
            System.out.println("Lista vacia");
            return null;
        } else
        {
            if (r.getEtiqueta().compareTo(s) < 0 || r.getSig().getEtiqueta().compareTo(s) > 0)// dato a eliminar es mayor que el ultimo elemento de la lista o es menor al primer elemento de la lista
            {
                System.out.println("Dato no encontrado desde el inicio de la lista.");
            } else
            {
                if (r.getSig().getEtiqueta().equals(s))//Cuando eliminas al unico que hay o el primero
                {
                    nodoEliminado = r.getSig();
                    r.setSig(nodoEliminado.getSig());
                    r.getSig().setAnt(r);
                    if (r == nodoEliminado)
                    {
                        r = null;
                    }
                    nodoEliminado.setSig(null);
                    nodoEliminado.setAnt(null);
                } else
                {
                    boolean b = true;
                    aux = r.getSig(); // el primero de la lista
                    while (aux != r && b)
                    {
                        if (aux.getSig().getEtiqueta().equals(s))//Cuando se va a eliminar a uno de enmedio
                        {
                            nodoEliminado = aux.getSig();
                            aux.setSig(nodoEliminado.getSig());
                            aux.getSig().setAnt(aux);
                            if (nodoEliminado == r)
                            {
                                r = aux;
                            }
                            nodoEliminado.setSig(null);
                            nodoEliminado.setAnt(null);
                            b = false;
                        } else
                        {
                            if (aux.getSig().getEtiqueta().compareTo(s) > 0)
                            {
                                break;
                            } else
                            {
                                aux = aux.getSig();
                            }
                        }
                    }
                    if (b)//Cuando no encuentra el dato a eliminar 
                    {
                        System.out.println("Dato no encontrado en la lista");
                    }
                }
            }
            return nodoEliminado;
        }
    }

    public void recorrido()
    {
        if (r != null)
        {
            NodoLista aux = r.getSig();
            do
            {
                System.out.println(aux.getEtiqueta());
                aux = aux.getSig();
            } while (aux != r.getSig());
        } else
        {
            System.out.println("No hay datos en la lista.");
        }

    }

    public void recorridoInv()
    {
        if (r != null)
        {
            NodoLista aux = r;
            do
            {
                System.out.println(aux.getEtiqueta());
                aux = aux.getAnt();
            } while (aux != r);
        } else
        {
            System.out.println("No hay datos en la lista.");
        }
    }

    public NodoLista busca(String s)
    {
        if (r.getAnt().getEtiqueta().compareTo(s) < 0 || r.getEtiqueta().compareTo(s) > 0)
        {
            return null;
        }
        if (r != null)
        {
            NodoLista aux = r.getSig();
            do
            {
                if (aux.getEtiqueta().equals(s))
                {
                    return aux;
                }
                if (aux.getEtiqueta().compareTo(s) > 0)
                {
                    return null;
                }
                aux = aux.getSig();
            } while (aux != r.getSig());
        }
        return null;
    }
}
