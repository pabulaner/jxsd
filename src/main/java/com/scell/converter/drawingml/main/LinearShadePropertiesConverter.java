package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.model.drawingml.main.LinearShadePropertiesModel;
import org.docx4j.dml.CTLinearShadeProperties;

public class LinearShadePropertiesConverter {
  private LinearShadePropertiesConverter() {
  }

  public static LinearShadePropertiesModel fromDocx4J(CTLinearShadeProperties value) {
    if (value == null) return null;
    return new LinearShadePropertiesModel(BooleanValueConverter.fromDocx4J(value.isScaled()), PositiveFixedAngleValueConverter.fromDocx4J(value.getAng()));
  }
}
