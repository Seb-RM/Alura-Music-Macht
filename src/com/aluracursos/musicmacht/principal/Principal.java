package com.aluracursos.musicmacht.principal;

import com.aluracursos.musicmacth.modelos.Cancion;
import com.aluracursos.musicmacth.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {

        Cancion miCancion = new Cancion();

        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();

        miPodcast.setPresentador("Gabriela Aguiar");
        miPodcast.setTitulo("Cafe.Tech");


        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 5000; i++) {
            miCancion.reproduce();
        }

        System.out.println("Total de reproducciones: "+miCancion.getTotalDeReproducciones());
        System.out.println("Total de Me Gusta: "+miCancion.getTotalDeMeGusta());
    }
}
