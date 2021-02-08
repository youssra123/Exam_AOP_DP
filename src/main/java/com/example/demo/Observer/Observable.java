package com.example.demo.Observer;

import com.example.demo.Composite.Figgur;

public interface Observable {

    void notif();
    void remove(Figgur f);
    void add(Figgur f);

}
