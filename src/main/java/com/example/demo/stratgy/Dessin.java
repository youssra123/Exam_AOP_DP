package com.example.demo.stratgy;

import com.example.demo.Composite.Figgur;
import com.sun.corba.se.impl.orbutil.ObjectWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Dessin {
    ArrayList<Figgur> figgurs;
    ITreter t;

    public Dessin(){
        figgurs=new ArrayList<>();
    }
    public void traier(){
        t.traiter();
    }


    public void add(Figgur f){
        figgurs.add(f);
    }

    public void remove(Figgur f){
        figgurs.remove(f);
    }

    public void afficherDessin(){
        for(Figgur f:figgurs){
            f.draw();
        }
    }
    public void serialiser() throws Exception {
        System.out.println("Donnee est serialisoble");
        File file=new File("Path");
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);

        for(Figgur f : figgurs){
            objectOutputStream.writeObject(f);
        }
    }


}
