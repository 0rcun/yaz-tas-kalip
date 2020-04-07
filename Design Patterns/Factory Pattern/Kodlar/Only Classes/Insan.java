package com.company;

public class Insan implements Races {
    @Override
    public String getRace() {
        return "Insan";
    }

    @Override
    public String getName() {
        return "Orçun";
    }

    @Override
    public String getCharacteristicFeatures() {
        return "İnsan kişiliği tek yönlü değildir.\n Her zaman değişkenlik gösterebilir. Bunun yanında her duruma kolayca adapte olabilmeleri, inatçı ve tuttuğunu koparan yapıları onları eşsiz kılar.";
    }

    @Override
    public String getPersonality() {
        return "Onlar esnek ve hırslıdırlar. Zevkleri, ahlakları, gelenek ve görenekleri farklı farklıdır.";
    }

    @Override
    public String getPhysicalFeatures() {
        return "İnsanlar ortalama 1,8 metreden uzundurlar.\n Derilerinin rengi siyaha yakın renklerden, solgun, açık renklere, saçlarının renkleri ise siyahtan, sarıya doğru değişir.\nErkekleri, kadınlarına göre daha boylu ve iridir. \nİnsanlar ergenliklerini 15 yaşında tamamlarlar ve nadiren 100 seneden fazla yaşayabilirler.";
    }

    @Override
    public String getHomeland() {
        return "Coruscant, Corulag, Naboo, Tatooine ve Alderean’ı insanların anavatanı olarak sayabiliriz.";
    }

    @Override
    public String getLanguage() {
        return "İnsanlar “Basic” (Temel Dil, galakside yaşayan çoğu ırkın konuşabildiği genel bir dildir.) dilini okuyabilir ve yazabilirler. \nDiğer dilleri de öğrenebilir, en gizli kalmış olanları da buna dahil.";
    }

    @Override
    public String getSpecialSkills() {
        return "İnsanlar çabuk öğrenip, çabuk ustalaşırlar. Birçok şeye yetenekleri vardır.";
    }
}
