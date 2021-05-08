package com.example.mip;

import java.util.List;

public class MIPOccurrence implements IOccurrence {

    @Override
    public List<String> getOccurrences() {
        return List.of("SOYA 1", "SOYA 2", "SOYA 3");
    }
    
}
