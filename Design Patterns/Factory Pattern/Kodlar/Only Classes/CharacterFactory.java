package com.company;

public class CharacterFactory {

    public Races getRace(String race){

        if(race == null){
            return null;
        }
        if(race.equalsIgnoreCase("Bothan")){
            return new Bothan();

        } else if(race.equalsIgnoreCase("Cerean")){
            return new Cerean();

        } else if(race.equalsIgnoreCase("Duros")){
            return new Duros();

        } else if(race.equalsIgnoreCase("insan")){
            return new Insan();

        }

        return null;
    }
}
