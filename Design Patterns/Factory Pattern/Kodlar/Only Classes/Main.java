package com.company;

public class Main {

    public static void main(String[] args) {

        CharacterFactory characterFactory = new CharacterFactory();

        Races bothan = characterFactory.getRace("Bothan");
        System.out.println(bothan.getRace());
        Races cerean = characterFactory.getRace("cerean");
        System.out.println(cerean.getRace());
        Races duros = characterFactory.getRace("duros");
        System.out.println(duros.getRace());
        Races insan = characterFactory.getRace("insan");
        System.out.println(insan.getRace());

    }
}

