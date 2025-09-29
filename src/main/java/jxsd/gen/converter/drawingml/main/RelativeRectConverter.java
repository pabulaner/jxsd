package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.RelativeRectModel;
import org.docx4j.dml.CTRelativeRect;

/**
 * This is a generated sequence class.
 */
public class RelativeRectConverter {
  private RelativeRectConverter() {
  }

  public static RelativeRectModel fromDocx4j(CTRelativeRect value) {
    if (value == null) return null;
    return new RelativeRectModel(PercentageValueConverter.fromDocx4j(value.getL()), PercentageValueConverter.fromDocx4j(value.getT()), PercentageValueConverter.fromDocx4j(value.getR()), PercentageValueConverter.fromDocx4j(value.getB()));
  }

  public static CTRelativeRect toDocx4j(RelativeRectModel value) {
    if (value == null) return null;
    CTRelativeRect result = new CTRelativeRect();
    result.setL(PercentageValueConverter.toDocx4j(value.getL()));
    result.setT(PercentageValueConverter.toDocx4j(value.getT()));
    result.setR(PercentageValueConverter.toDocx4j(value.getR()));
    result.setB(PercentageValueConverter.toDocx4j(value.getB()));
    return result;
  }
}
