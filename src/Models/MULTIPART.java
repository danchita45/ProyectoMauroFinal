/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import proyecto_2do_parcial.NodoLista;

/**
 *
 * @author Danchita45
 */
public class MULTIPART
{
    String arr;
    NodoLista n;
    int nivel;

    public MULTIPART()
    {
    }

    public MULTIPART(String arr, NodoLista n, int nivel)
    {
        this.arr = arr;
        this.n = n;
        this.nivel = nivel;
    }

    public String getArr()
    {
        return arr;
    }

    public void setArr(String arr)
    {
        this.arr = arr;
    }

    public NodoLista getN()
    {
        return n;
    }

    public void setN(NodoLista n)
    {
        this.n = n;
    }

    public int getNivel()
    {
        return nivel;
    }

    public void setNivel(int nivel)
    {
        this.nivel = nivel;
    }
}
