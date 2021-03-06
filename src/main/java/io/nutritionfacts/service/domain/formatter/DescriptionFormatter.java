package io.nutritionfacts.api.domain.formatter;

import org.apache.commons.text.WordUtils;
import org.springframework.stereotype.Component;

@Component
public class DescriptionFormatter {
    public String formatDescription(String description) {
        if (description != null && description.length() > 0) {
            return WordUtils.capitalizeFully(description);
        }

        return "";
    }
}
