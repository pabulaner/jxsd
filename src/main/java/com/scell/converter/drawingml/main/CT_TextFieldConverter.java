package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.CT_TextFieldModel;
import org.docx4j.dml.CTTextField;

public class CT_TextFieldConverter {
  private CT_TextFieldConverter() {
  }

  public static CT_TextFieldModel fromDocx4J(CTTextField value) {
    if (value == null) return null;
    return new CT_TextFieldModel(StringConverter.fromDocx4J(value.getType()), ST_GuidConverter.fromDocx4J(value.getId()), CT_TextCharacterPropertiesConverter.fromDocx4J(value.getRPr()), CT_TextParagraphPropertiesConverter.fromDocx4J(value.getPPr()), StringConverter.fromDocx4J(value.getT()));
  }

  public static CTTextField toDocx4J(CT_TextFieldModel value) {
    return null;
  }
}
