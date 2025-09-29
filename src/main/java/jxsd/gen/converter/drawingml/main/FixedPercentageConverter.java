package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.FixedPercentageModel;
import org.docx4j.dml.CTFixedPercentage;

/**
 * This is a generated sequence class.
 */
public class FixedPercentageConverter {
  private FixedPercentageConverter() {
  }

  public static FixedPercentageModel fromDocx4j(CTFixedPercentage value) {
    if (value == null) return null;
    return new FixedPercentageModel(FixedPercentageValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTFixedPercentage toDocx4j(FixedPercentageModel value) {
    if (value == null) return null;
    CTFixedPercentage result = new CTFixedPercentage();
    result.setVal(FixedPercentageValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
