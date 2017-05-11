package com.company;

import modules.Archangel;
import modules.Battle;
import modules.Demon;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Archangel archangel = new Archangel("Castiel",29,11);
        Demon demon = new Demon("Crowley",30,24);

        Battle battle = new Battle();
        battle.compare(archangel,demon);
        System.out.println( battle.pritnResult());




    }
}

