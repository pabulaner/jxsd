package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.CT_TextFieldModel;
import org.docx4j.dml.CTTextField;

public class CT_TextFieldConverter {
  private CT_TextFieldConverter() {
  }

  public static CT_TextFieldModel fromDocx4j(CTTextField value) {
    if (value == null) return null;
    return new CT_TextFieldModel(StringConverter.fromDocx4j(value.getType()), ST_GuidConverter.fromDocx4j(value.getId()), CT_TextCharacterPropertiesConverter.fromDocx4j(value.getRPr()), CT_TextParagraphPropertiesConverter.fromDocx4j(value.getPPr()), StringConverter.fromDocx4j(value.getT()));
  }

  public static CTTextField toDocx4j(CT_TextFieldModel value) {
    return null;
  }
}
