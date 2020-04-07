package com.company;

public class Bothan implements Races {
    @Override
    public String getRace() {
        return "Bothan";
    }

    @Override
    public String getName() {
        return "Borsk Fey’lya";
    }

    @Override
    public String getCharacteristicFeatures() {
        return "Bothanlar doğaları gereği çıkarcı, kurnaz, şüpheci ve meraklı, biraz da paranoyaktırlar.";
    }

    @Override
    public String getPersonality() {
        return "Sinir bozucu olsalar da çoğu vefalı ve cesurdur.";
    }

    @Override
    public String getPhysicalFeatures() {
        return "Bothanlar, dalga dalga bir kürkle kaplıdır.\n Sivri uçlu, konik burunları ve hem kadınlarında, hem de erkeklerinde bulunan sakalları vardır.\n Boyları genellikle 1.6 metreden uzundur.\n İnsanlardan çok daha uzun zamanda ergen olur, çok daha uzun yaşarlar.";
    }

    @Override
    public String getHomeland() {
        return "Endüstri dünyası Bothawui ve onun orta halkadaki kolonileri, Kothlis ve Torolis gibi…";
    }

    @Override
    public String getLanguage() {
        return "Bothanlar, Bothese ve Basic dillerini okuyup, yazabilirler.";
    }

    @Override
    public String getSpecialSkills() {
        return "Bothanlar istihbaratçılığa doğuştan yeteneklidirler.";
    }
}
