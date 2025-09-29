package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.model.drawingml.main.TextFieldModel;
import org.docx4j.dml.CTTextField;

/**
 * This is a generated sequence class.
 */
public class TextFieldConverter {
  private TextFieldConverter() {
  }

  public static TextFieldModel fromDocx4j(CTTextField value) {
    if (value == null) return null;
    return new TextFieldModel(StringValueConverter.fromDocx4j(value.getType()), GuidValueConverter.fromDocx4j(value.getId()), TextCharacterPropertiesConverter.fromDocx4j(value.getRPr()), TextParagraphPropertiesConverter.fromDocx4j(value.getPPr()), StringValueConverter.fromDocx4j(value.getT()));
  }

  public static CTTextField toDocx4j(TextFieldModel value) {
    if (value == null) return null;
    CTTextField result = new CTTextField();
    result.setType(StringValueConverter.toDocx4j(value.getType()));
    result.setId(GuidValueConverter.toDocx4j(value.getId()));
    result.setRPr(TextCharacterPropertiesConverter.toDocx4j(value.getRPr()));
    result.setPPr(TextParagraphPropertiesConverter.toDocx4j(value.getPPr()));
    result.setT(StringValueConverter.toDocx4j(value.getT()));
    return result;
  }
}
