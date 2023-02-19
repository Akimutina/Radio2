package ru.netology.radio;

public class Radio {

    private int minCurrentVolume = 0;
    private int maxCurrentVolume = 100;
    private int currentVolume = 0;
    private int minCurrentStation;
    private int maxCurrentStation;
    private int currentStation;

    public Radio() {
        this.minCurrentVolume = minCurrentVolume;
        this.maxCurrentVolume = maxCurrentVolume;
        this.currentVolume = currentVolume;
        minCurrentStation = 0;
        maxCurrentStation = 9;
        currentStation = 0;
    }
    public Radio(int amountStation) {
        maxCurrentStation = amountStation - 1;
        if (amountStation <= 1) {
            System.out.println("Количество станции должно быть больше 1");
        }
    }

    public int getMaxCurrentVolume() {
        return maxCurrentVolume;
    }

    public int getMinCurrentVolume() {
        return minCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxCurrentStation() {
        return maxCurrentStation;
    }

    public int getMinCurrentStation() {
        return minCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume < minCurrentVolume) {
            currentVolume = minCurrentVolume;
        }
        if (newCurrentVolume > maxCurrentVolume) {
            currentVolume = maxCurrentVolume;
        }
        if (newCurrentVolume <= maxCurrentVolume & newCurrentVolume >= minCurrentVolume) {
            currentVolume = newCurrentVolume;
        }
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minCurrentStation) {
            currentStation = minCurrentStation;
        }
        if (newCurrentStation > maxCurrentStation) {
            currentStation = maxCurrentStation;
        }
        if (newCurrentStation <= maxCurrentStation & newCurrentStation >= minCurrentStation) {
            currentStation = newCurrentStation;
        }
    }

    public void increaseVolume() {
        if (getCurrentVolume() < maxCurrentVolume) {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void decreaseVolume() {
        if (getCurrentVolume() > minCurrentVolume) {
            setCurrentVolume(currentVolume - 1);
        }
    }

    public void nextStation() {
        if (getCurrentStation() < maxCurrentStation) {
            setCurrentStation(currentStation + 1);
        }
        if (getCurrentStation() == maxCurrentStation) {
            setCurrentStation(minCurrentStation);
        }
    }

    public void previousStation() {
        if (getCurrentStation() > minCurrentStation) {
            setCurrentStation(currentStation - 1);
        }
        if (getCurrentStation() == minCurrentStation) {
            setCurrentStation(maxCurrentStation);
        }
    }
}
