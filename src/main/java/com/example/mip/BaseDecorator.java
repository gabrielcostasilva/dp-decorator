package com.example.mip;

import java.util.List;

public class BaseDecorator implements IOccurrence {

    private final IOccurrence reference;

    public BaseDecorator(IOccurrence reference) {
        this.reference = reference;
    }

    @Override
    public List<String> getOccurrences() {
        return this.reference.getOccurrences();
    }
    
}
