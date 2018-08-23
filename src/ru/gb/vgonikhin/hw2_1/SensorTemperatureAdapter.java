package ru.gb.vgonikhin.hw2_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class SensorTemperatureAdapter implements MeteoSensor {
    SensorTemperature st;

    public SensorTemperatureAdapter(ST500Info st500){
        st = st500.getData();
    }


    @Override
    public int getId() {
        return st.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) st.temperature();
    }

    @Override
    public Float getHumidity() {
        return 0f;
    }

    @Override
    public Float getPressure() {
        return 0f;
    }

    @Override
    public LocalDateTime getDateTime() {
        int year = st.year();
        int dayofyear = st.day();
        int second = st.second();
        return LocalDateTime.of(LocalDate.ofYearDay(year,dayofyear),LocalTime.of(second/3600, (second%3600)/60, second%60));
    }
}
