package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_LinearShadePropertiesModel;
import org.docx4j.dml.CTLinearShadeProperties;

public class CT_LinearShadePropertiesConverter {
  private CT_LinearShadePropertiesConverter() {
  }

  public static CT_LinearShadePropertiesModel fromDocx4J(CTLinearShadeProperties value) {
    if (value == null) return null;
    return new CT_LinearShadePropertiesModel(BooleanConverter.fromDocx4J(value.getScaled()), ST_PositiveFixedAngleConverter.fromDocx4J(value.getAng()));
  }

  public static CTLinearShadeProperties toDocx4J(CT_LinearShadePropertiesModel value) {
    return null;
  }
}
