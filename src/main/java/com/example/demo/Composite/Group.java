package com.example.demo.Composite;

import lombok.Data;

import org.springframework.stereotype.Component;

import com.example.demo.Observer.Observable;

import java.io.Serializable;
import java.util.ArrayList;

@Component
public class Group extends Figgur implements Serializable {

    private ArrayList<Figgur> figgurs;

    public Group(Point p) {
        super(p);
        figgurs=new ArrayList<>();
    }
    public Group() {
        super(new Point(0,0));
    }


    @Override
    public double surface() {
        double ans=0;
        for(Figgur f:figgurs){
            ans+=f.surface();
        }
        return ans;
    }

    @Override
    public double piremiter() {
        double ans=0;
        for( Figgur f : figgurs){
            ans=f.piremiter();
        }

        return ans;
    }

    @Override
    public void draw() {
        for (Figgur f: figgurs){
            f.draw();
        }
    }

    public void addFigure(Figgur f){
        this.figgurs.add(f);
    }
    public void remove(Figgur f){
        figgurs.remove(f);
    }

    @Override
    public void update(Observable o) {
        for(Figgur f : figgurs){
            f.update(o);
        }
    }
}
