package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            currentVolume = 0;
        }
        if (newCurrentVolume > 10) {
            currentVolume = 10;
        }
        if (newCurrentVolume <= 10 & newCurrentVolume >= 0) {
            currentVolume = newCurrentVolume;
        }
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            currentStation = 0;
        }
        if (newCurrentStation > 9) {
            currentStation = 9;
        }
        if (newCurrentStation <= 9 & newCurrentStation >= 0) {
            currentStation = newCurrentStation;
        }
    }

    public void increaseVolume() {
        if (getCurrentVolume() >= 10) {
            currentVolume = 10;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (getCurrentVolume() <= 0) {
            currentVolume = 0;
        } else {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextStation() {
        if (getCurrentStation() >= 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void previousStation() {
        if (getCurrentStation() <= 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
    }
}
