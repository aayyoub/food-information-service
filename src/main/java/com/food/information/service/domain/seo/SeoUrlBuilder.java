package com.food.information.service.domain.seo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SeoUrlBuilder {
    private static final String PATTERN = "%s/food/%s/%s";
    private final String domain;

    public SeoUrlBuilder(@Value("${domain}") String domain) {
        this.domain = domain;
    }

    public String buildUrl(String foodId, String description) {
        String descriptionCleaned = description
                .toLowerCase()
                .strip()
                .replaceAll("[ ,_+]", "-")
                .replaceAll("%", "-percent-")
                .replaceAll("&", "-and-")
                .replaceAll("[^a-z0-9_-]", "")
                .replaceAll("-+", "-");

        return String.format(PATTERN, domain, foodId, descriptionCleaned);
    }
}
