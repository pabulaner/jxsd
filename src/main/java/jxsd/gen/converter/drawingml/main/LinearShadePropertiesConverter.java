package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.model.drawingml.main.LinearShadePropertiesModel;
import org.docx4j.dml.CTLinearShadeProperties;

/**
 * This is a generated sequence class.
 */
public class LinearShadePropertiesConverter {
  private LinearShadePropertiesConverter() {
  }

  public static LinearShadePropertiesModel fromDocx4j(CTLinearShadeProperties value) {
    if (value == null) return null;
    return new LinearShadePropertiesModel(BooleanValueConverter.fromDocx4j(value.getScaled()), PositiveFixedAngleValueConverter.fromDocx4j(value.getAng()));
  }

  public static CTLinearShadeProperties toDocx4j(LinearShadePropertiesModel value) {
    if (value == null) return null;
    CTLinearShadeProperties result = new CTLinearShadeProperties();
    result.setScaled(BooleanValueConverter.toDocx4j(value.getScaled()));
    result.setAng(PositiveFixedAngleValueConverter.toDocx4j(value.getAng()));
    return result;
  }
}
