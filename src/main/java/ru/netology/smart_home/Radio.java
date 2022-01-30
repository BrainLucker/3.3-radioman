package ru.netology.smart_home;

public class Radio {
    private int currentRadioStation;
    int currentVolume;

    public void nextStation() {
        if (currentRadioStation < 9) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
        }
    }

    public void setStation(int currentRadioStation) {
        if (currentRadioStation >= 0 && currentRadioStation <= 9) {
            this.currentRadioStation = currentRadioStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}