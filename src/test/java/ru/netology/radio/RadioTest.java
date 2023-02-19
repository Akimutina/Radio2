package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testNotParameter(){

        Radio radio = new Radio();

        Assertions.assertEquals(0, radio.getCurrentVolume());
        Assertions.assertEquals(0, radio.getMinCurrentVolume());
        Assertions.assertEquals(100, radio.getMaxCurrentVolume());
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(0, radio.getMinCurrentStation());
        Assertions.assertEquals(9, radio.getMaxCurrentStation());
    }

    @Test
    public void shouldAmountStationError(){
        Radio radio = new Radio(1);
    }

    Radio radio = new Radio(10);
    @Test
    public void testWithParameter(){
        Assertions.assertEquals(0, radio.getCurrentVolume());
        Assertions.assertEquals(0, radio.getMinCurrentVolume());
        Assertions.assertEquals(100, radio.getMaxCurrentVolume());
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(0, radio.getMinCurrentStation());
        Assertions.assertEquals(9, radio.getMaxCurrentStation());
    }

// ТЕСТЫ ПО ЗВУКУ
    @Test
    public void shouldSetVolume() {
        radio.setCurrentVolume(5);

        Assertions.assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        radio.setCurrentVolume(100);

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMinVolume() {
        radio.setCurrentVolume(0);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        radio.setCurrentVolume(150);

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeLessMin() {
        radio.setCurrentVolume(-10);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(0);
        radio.increaseVolume();

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(6);
        radio.decreaseVolume();

        Assertions.assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolumeAboveMax() {
        radio.setCurrentVolume(150);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolumeLessMin() {

        radio.setCurrentVolume(-10);
        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }


    // ТЕСТЫ ПО СТАНЦИЯМ
    @Test
    public void shouldSetStation() {
        radio.setCurrentStation(5);

        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMaxStation() {
        radio.setCurrentStation(9);

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMinStation() {
        radio.setCurrentStation(0);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        radio.setCurrentStation(30);

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationLessMin() {
        radio.setCurrentStation(-10);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStation() {
        radio.setCurrentStation(0);
        radio.nextStation();

        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldPreviousStation() {
        radio.setCurrentStation(8);
        radio.previousStation();

        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void shouldNotNextStationAboveMax() {
        radio.setCurrentStation(15);
        radio.nextStation();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotPreviousStationLessMin() {
        radio.setCurrentStation(0);
        radio.previousStation();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }
}
