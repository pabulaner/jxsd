package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringValueConverter;
import com.scell.model.drawingml.main.TextFieldModel;
import org.docx4j.dml.CTTextField;

public class TextFieldConverter {
  private TextFieldConverter() {
  }

  public static TextFieldModel fromDocx4J(CTTextField value) {
    if (value == null) return null;
    return new TextFieldModel(StringValueConverter.fromDocx4J(value.getType()), GuidValueConverter.fromDocx4J(value.getId()), TextCharacterPropertiesConverter.fromDocx4J(value.getRPr()), TextParagraphPropertiesConverter.fromDocx4J(value.getPPr()), StringValueConverter.fromDocx4J(value.getT()));
  }
}
