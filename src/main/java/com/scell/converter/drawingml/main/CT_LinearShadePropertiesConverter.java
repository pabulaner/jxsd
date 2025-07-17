package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_LinearShadePropertiesModel;
import org.docx4j.dml.CTLinearShadeProperties;

public class CT_LinearShadePropertiesConverter {
  private CT_LinearShadePropertiesConverter() {
  }

  public static CT_LinearShadePropertiesModel fromDocx4j(CTLinearShadeProperties value) {
    if (value == null) return null;
    return new CT_LinearShadePropertiesModel(BooleanConverter.fromDocx4j(value.getScaled()), ST_PositiveFixedAngleConverter.fromDocx4j(value.getAng()));
  }

  public static CTLinearShadeProperties toDocx4j(CT_LinearShadePropertiesModel value) {
    return null;
  }
}
