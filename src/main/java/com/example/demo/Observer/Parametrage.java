package com.example.demo.Observer;

import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.stereotype.Component;

import com.example.demo.Aspect.MyLog;
import com.example.demo.Aspect.SecuredByAspect;
import com.example.demo.Composite.Figgur;

import java.lang.reflect.Parameter;
import java.util.ArrayList;

@Component
@Data @AllArgsConstructor
public class Parametrage implements Observable{
    public  int colorC;
    public int colorS;
    public int epaisseurC;
    public ArrayList<Observer> figurs;

    public Parametrage(){
        figurs=new ArrayList<>();
    }

    @Override
    public void notif() {
        for(Observer o : figurs){
            o.update(this);
        }
    }
    @MyLog
    @SecuredByAspect(roles = {"ADMIN"})
    @Override
    public void remove(Figgur f) {
        figurs.remove(f);
    }

    @MyLog
    @SecuredByAspect(roles = {"ADMIN"})
    @Override
    public void add(Figgur f) {
        figurs.add(f);
    }
}
