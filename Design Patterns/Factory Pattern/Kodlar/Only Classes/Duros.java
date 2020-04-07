package com.company;

public class Duros implements Races {
    @Override
    public String getRace() {
        return "Duros";
    }

    @Override
    public String getName() {
        return "Baniss Keeg";
    }

    @Override
    public String getCharacteristicFeatures() {
        return "Bir Duros her zaman heyecan ve macera meraklısıdır. Her zaman bir sonraki “hiperuzay” atlayışında ne olacağını merak ederler.";
    }

    @Override
    public String getPersonality() {
        return "Onlar gururlu, kendi yağında kavrulan, sakin ve barışçıl bir ırk olarak bilinirler.";
    }

    @Override
    public String getPhysicalFeatures() {
        return "Duroslar genellikle 1.8 metreden uzundurlar. \nTüysüz vücutları, kocaman gözleri, geniş ve dudaksız bir ağızları vardır.\nDeri renkleri mavi-gri’den, derin gök mavisine kadar gider.";
    }

    @Override
    public String getHomeland() {
        return "Duro sistemindeki tüm gezegenler.";
    }

    @Override
    public String getLanguage() {
        return "Duroslar, Durese ve Basic dillerini okuyup, yazabilirler.";
    }

    @Override
    public String getSpecialSkills() {
        return "Duroslar ilk seviyede Spacer (uzaycı) featini (marifetini) bonus feat (marifet) olarak alır.";
    }
}
