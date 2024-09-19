package com.aluracursos.musicmacth.modelos;

public class MisFavoritos {

    public void adicione(Audio audio){
        if(audio.getClasificacion()>=8){
            System.out.println(audio.getTitulo()+ " Es un de los favoritos");
        } else{
            System.out.println(audio.getTitulo()+" También es uno de los más populares");
        }
    }
}
