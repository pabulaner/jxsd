package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_LineJoinMiterPropertiesModel;
import org.docx4j.dml.CTLineJoinMiterProperties;

public class CT_LineJoinMiterPropertiesConverter {
  private CT_LineJoinMiterPropertiesConverter() {
  }

  public static CT_LineJoinMiterPropertiesModel fromDocx4J(CTLineJoinMiterProperties value) {
    if (value == null) return null;
    return new CT_LineJoinMiterPropertiesModel(ST_PositivePercentageConverter.fromDocx4J(value.getLim()));
  }

  public static CTLineJoinMiterProperties toDocx4J(CT_LineJoinMiterPropertiesModel value) {
    return null;
  }
}
