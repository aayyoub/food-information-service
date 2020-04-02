package com.food.information.service.domain.formatter;

import org.springframework.stereotype.Component;

@Component
public class ValueFormatter {
    private static final String VALUE_FORMATTED = "%.0f %s";
    private static final String VALUE_FORMATTED_WITHOUT_SPACE = "%.0f%s";

    public String formatValue(Double value, String unit) {
        return String.format(VALUE_FORMATTED, value, unit);
    }

    public String formatValueWithoutSpace(Double value, String unit) {
        return String.format(VALUE_FORMATTED, value, unit);
    }
}
