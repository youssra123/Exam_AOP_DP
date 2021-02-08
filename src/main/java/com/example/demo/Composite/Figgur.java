package com.example.demo.Composite;


import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.stereotype.Component;

import com.example.demo.Aspect.MyLog;
import com.example.demo.Observer.Observable;
import com.example.demo.Observer.Observer;

import java.io.File;
import java.io.Serializable;

@Component
public abstract class Figgur implements Observer, Serializable {

    public Point p;

    public Figgur(Point p ){
        this.p=p;
    }
    @MyLog
    public abstract double surface();
    @MyLog
    public abstract double piremiter();
    @MyLog
    public abstract void draw();

}
