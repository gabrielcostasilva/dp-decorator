package com.example.mip;

public class ChartDecoratorMIPOccurrence 
    extends BaseDecorator {

    public ChartDecoratorMIPOccurrence(IOccurrence reference) {
        super(reference);
    }
    
    public String getChartData() {
        return String.format("Data from %d entries", this.getOccurrences().size());
    }
}
