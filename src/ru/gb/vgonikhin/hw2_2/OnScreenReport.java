package ru.gb.vgonikhin.hw2_2;

public class OnScreenReport extends Report {
    @Override
    public void output() {
        System.out.println("Output to screen");
        for(ReportItem item : items){
            System.out.format("screen %s - %f \n\r", item.getDescription(), item.getAmount());
        }
        super.output();
    }
}
