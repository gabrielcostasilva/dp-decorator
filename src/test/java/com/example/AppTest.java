package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import com.example.mip.ChartDecoratorMIPOccurrence;
import com.example.mip.MIPOccurrence;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {

        var mipOccurrence = new MIPOccurrence();

        assertEquals(
            mipOccurrence.getOccurrences(), 
            List.of("SOYA 1", "SOYA 2", "SOYA 3"));

        var mipOccurrenceExtended = new ChartDecoratorMIPOccurrence(mipOccurrence);

        assertEquals(
            mipOccurrenceExtended.getChartData(), 
            "Data from 3 entries");
    }
}
