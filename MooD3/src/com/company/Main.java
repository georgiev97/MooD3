package com.company;

import modules.Archangel;
import modules.Battle;
import modules.Demon;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Archangel archangel = new Archangel("Valio",29,11);
        Demon demon = new Demon("Kolio",30,24);

        Battle battle = new Battle();
        battle.compare(archangel,demon);
        System.out.println( battle.pritnResult());




    }
}

