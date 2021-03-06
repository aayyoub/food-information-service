package io.nutritionfacts.api.domain.builder.nutrientgroup.grouper;

import io.nutritionfacts.api.domain.builder.nutrientgroup.AbstractNutrientGrouper;
import io.nutritionfacts.api.domain.util.NutrientId;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ProteinGrouper extends AbstractNutrientGrouper {
    private static final Integer RANK = 1;
    private static final String GROUP_NAME = "Protein and Amino Acids";

    @Override
    protected List<String> getRequiredNutrients() {
        return Arrays.asList(
                NutrientId.TOTAL_PROTEIN,
                NutrientId.ALANINE,
                NutrientId.ARGININE,
                NutrientId.ASPARTIC_ACID,
                NutrientId.CYSTINE,
                NutrientId.GLUTAMIC_ACID,
                NutrientId.GLYCINE,
                NutrientId.HISTIDINE,
                NutrientId.ISOLEUCINE,
                NutrientId.LEUCINE,
                NutrientId.LYSINE,
                NutrientId.METHIONINE,
                NutrientId.PHENYLALANINE,
                NutrientId.PROLINE,
                NutrientId.SERINE,
                NutrientId.THREONINE,
                NutrientId.TRYPTOPHAN,
                NutrientId.TYROSINE,
                NutrientId.VALINE,
                NutrientId.HYDROXYPROLINE);
    }

    @Override
    protected String getGroupName() {
        return GROUP_NAME;
    }

    protected Integer getRank() {
        return RANK;
    }
}
