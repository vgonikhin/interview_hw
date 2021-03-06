package ru.gb.vgonikhin.hw2_2;

class Programm{
	public static void main(String[] args){
		Report report = new OnScreenReport();
		report.calculate();
		report.output();
	}

	//3* Основная идея синглтона - обеспечение наличия только одного объекта данноо класса в программе.
    // Его называют антипаттерном по нескольким причинам:
    // - его стандартная реализация нарушает принцип единственной ответственности,
    // т.к. помимо своих основных функций класс обязан "следить" за собственным состоянием;
    // - он осложняет тестирование, т.к. без него становится нельзя выполнять тесты,
    // а результаты тестов зависят от его состояния;
    // - есть возможности обойти единичность создания объекта (через сериализацию, многопоточность или рефлексию)
}