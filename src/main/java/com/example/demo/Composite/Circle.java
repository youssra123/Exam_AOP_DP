package com.example.demo.Composite;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.stereotype.Component;

import com.example.demo.Aspect.MyLog;
import com.example.demo.Aspect.SecuredByAspect;
import com.example.demo.Observer.Observable;
import com.example.demo.Observer.Parametrage;

import java.io.Serializable;

@Component
public class Circle extends Figgur implements Serializable {

    public double rayon;

    public Circle(double v, Point point) {
        super(point);
    }
    public Circle() {
        super(new Point(0,0));
    }

    @MyLog
    @Override
    public double surface() {
        return Math.PI * Math.pow(rayon,2);
    }

    @Override
    public double piremiter() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public void draw() {
        System.out.println("rayen :"+rayon + "Surface : "+surface()+"pirimetre :" +piremiter());
    }

    @Override
    @MyLog
    @SecuredByAspect(roles = {"ADMIN"})
    public void update(Observable o) {
        int cc=((Parametrage) o).getColorC();
        int cs=((Parametrage) o).getColorS();
        int ec=((Parametrage) o).getEpaisseurC();
        System.out.println("color conteur :"+cc+" colore surface :"+cs+"Epaisseur Color"+ec);
    }
}
