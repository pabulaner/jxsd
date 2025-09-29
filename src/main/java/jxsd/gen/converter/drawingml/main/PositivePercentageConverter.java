package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.PositivePercentageModel;
import org.docx4j.dml.CTPositivePercentage;

/**
 * This is a generated sequence class.
 */
public class PositivePercentageConverter {
  private PositivePercentageConverter() {
  }

  public static PositivePercentageModel fromDocx4j(CTPositivePercentage value) {
    if (value == null) return null;
    return new PositivePercentageModel(PositivePercentageValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTPositivePercentage toDocx4j(PositivePercentageModel value) {
    if (value == null) return null;
    CTPositivePercentage result = new CTPositivePercentage();
    result.setVal(PositivePercentageValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
