package com.jcodee.sosmap.model;

/**
 * Created by any on 18/02/2017.
 */

public class Elemento {
    public int imagen;
    public String texto;
    public long id;

    //constructor 2
    public Elemento(int img, String text) {
        this.imagen = img;
        this.texto = text;
    }

    //contructor 1
    public Elemento(int imagen, String texto, long id) {
        this.imagen = imagen;
        this.texto = texto;
        this.id = id;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
