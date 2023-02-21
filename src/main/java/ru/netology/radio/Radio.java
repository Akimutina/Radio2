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
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void increaseVolume() {
        if (getCurrentVolume() < 10) {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void decreaseVolume() {
        if (getCurrentVolume() > 0) {
            setCurrentVolume(currentVolume - 1);
        }
    }

    public void nextStation() {
        if (getCurrentStation() < 9) {
            setCurrentStation(currentStation + 1);
        }
        if (getCurrentStation() == 9) {
            setCurrentStation(0);
        }
    }

    public void previousStation() {
        if (getCurrentStation() > 0) {
            setCurrentStation(currentStation - 1);
        }
        if (getCurrentStation() == 0) {
            setCurrentStation(currentStation = 9);
        }
    }
}
