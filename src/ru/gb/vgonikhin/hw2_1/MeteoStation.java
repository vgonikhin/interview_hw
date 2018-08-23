package ru.gb.vgonikhin.hw2_1;

public class MeteoStation{
	public static void main(String[] args){
		MeteoStore meteoDb = new MeteoStore();
		
		MeteoSensor ms200_1 = new MS200(2);
		meteoDb.save(ms200_1);

		ST500Info st500_1 = new ST500Info();
		MeteoSensor ms_st500 = new SensorTemperatureAdapter(st500_1);
		meteoDb.save(ms_st500);
		// Здесь надо вызвать метод getData у класса ST500Info. Полученные данные отправить в метод save объекта meteoDb
	}
}