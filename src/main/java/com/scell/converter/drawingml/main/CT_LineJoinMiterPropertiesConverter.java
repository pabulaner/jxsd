package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_LineJoinMiterPropertiesModel;
import org.docx4j.dml.CTLineJoinMiterProperties;

public class CT_LineJoinMiterPropertiesConverter {
  private CT_LineJoinMiterPropertiesConverter() {
  }

  public static CT_LineJoinMiterPropertiesModel fromDocx4j(CTLineJoinMiterProperties value) {
    if (value == null) return null;
    return new CT_LineJoinMiterPropertiesModel(ST_PositivePercentageConverter.fromDocx4j(value.getLim()));
  }

  public static CTLineJoinMiterProperties toDocx4j(CT_LineJoinMiterPropertiesModel value) {
    return null;
  }
}
