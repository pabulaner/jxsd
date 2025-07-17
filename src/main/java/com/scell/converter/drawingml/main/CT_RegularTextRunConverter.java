package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.CT_RegularTextRunModel;
import org.docx4j.dml.CTRegularTextRun;

public class CT_RegularTextRunConverter {
  private CT_RegularTextRunConverter() {
  }

  public static CT_RegularTextRunModel fromDocx4j(CTRegularTextRun value) {
    if (value == null) return null;
    return new CT_RegularTextRunModel(CT_TextCharacterPropertiesConverter.fromDocx4j(value.getRPr()), StringConverter.fromDocx4j(value.getT()));
  }

  public static CTRegularTextRun toDocx4j(CT_RegularTextRunModel value) {
    return null;
  }
}
