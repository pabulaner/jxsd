package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.LinearShadePropertiesModel;
import org.docx4j.dml.CTLinearShadeProperties;

public class LinearShadePropertiesConverter {
  private LinearShadePropertiesConverter() {
  }

  public static LinearShadePropertiesModel fromDocx4J(CTLinearShadeProperties value) {
    if (value == null) return null;
    return new LinearShadePropertiesModel(BooleanConverter.fromDocx4J(value.isScaled()), PositiveFixedAngleConverter.fromDocx4J(value.getAng()));
  }
}
