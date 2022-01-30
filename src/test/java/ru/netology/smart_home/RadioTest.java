package ru.netology.smart_home;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldSetNextStation() {
    }

    @Test
    void shouldSetPrevStation() {
    }

    @Test
    void shouldSetStation() {
    }

    @ParameterizedTest()
    @CsvSource(
            value = {
                    "Normal volume, 5, 6",
                    "Maximum volume, 10, 10"
            }
    )
    void shouldIncreaseVolume(String name, int currentVolume, int expected) {
        radio.currentVolume = currentVolume; // Выставляем текущую громкость
        radio.increaseVolume(); // Прибавляем громкость
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @ParameterizedTest()
    @CsvSource(
            value = {
                    "Normal volume, 5, 6",
                    "Maximum volume, 10, 10"
            }
    )
    void shouldDecreaseVolume() {

    }
}