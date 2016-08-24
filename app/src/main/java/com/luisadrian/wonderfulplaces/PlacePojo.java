package com.luisadrian.wonderfulplaces;

/**
 * Created by luisadrian on 8/23/16.
 */
public class PlacePojo {

    //Atributos de un lugar de visita
    private int ImagenLugar;
    private String nombreLugar;
    private String ubicacionLugar;
    private String descripcionLugar;

    public PlacePojo(int imagenLugar, String nombreLugar, String ubicacionLugar, String descripcionLugar) {
        ImagenLugar = imagenLugar;
        this.nombreLugar = nombreLugar;
        this.ubicacionLugar = ubicacionLugar;
        this.descripcionLugar = descripcionLugar;
    }

    public int getImagenLugar() {
        return ImagenLugar;
    }

    public void setImagenLugar(int imagenLugar) {
        ImagenLugar = imagenLugar;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public String getUbicacionLugar() {
        return ubicacionLugar;
    }

    public void setUbicacionLugar(String ubicacionLugar) {
        this.ubicacionLugar = ubicacionLugar;
    }

    public String getDescripcionLugar() {
        return descripcionLugar;
    }

    public void setDescripcionLugar(String descripcionLugar) {
        this.descripcionLugar = descripcionLugar;
    }

}
