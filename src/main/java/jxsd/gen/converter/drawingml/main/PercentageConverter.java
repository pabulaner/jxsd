package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.PercentageModel;
import org.docx4j.dml.CTPercentage;

/**
 * This is a generated sequence class.
 */
public class PercentageConverter {
  private PercentageConverter() {
  }

  public static PercentageModel fromDocx4j(CTPercentage value) {
    if (value == null) return null;
    return new PercentageModel(PercentageValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTPercentage toDocx4j(PercentageModel value) {
    if (value == null) return null;
    CTPercentage result = new CTPercentage();
    result.setVal(PercentageValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
