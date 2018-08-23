package ru.gb.vgonikhin.hw2_2;

import java.util.*;

class PrintReport{
	public void output(List<ReportItem> items){
		System.out.println("Output to printer");
		for(ReportItem item : items){
			System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
		}
	}
}