package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.PositiveFixedPercentageModel;
import org.docx4j.dml.CTPositiveFixedPercentage;

/**
 * This is a generated sequence class.
 */
public class PositiveFixedPercentageConverter {
  private PositiveFixedPercentageConverter() {
  }

  public static PositiveFixedPercentageModel fromDocx4j(CTPositiveFixedPercentage value) {
    if (value == null) return null;
    return new PositiveFixedPercentageModel(PositiveFixedPercentageValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTPositiveFixedPercentage toDocx4j(PositiveFixedPercentageModel value) {
    if (value == null) return null;
    CTPositiveFixedPercentage result = new CTPositiveFixedPercentage();
    result.setVal(PositiveFixedPercentageValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
