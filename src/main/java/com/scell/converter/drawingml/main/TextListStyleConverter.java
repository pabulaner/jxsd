package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextListStyleModel;
import org.docx4j.dml.CTTextListStyle;

public class TextListStyleConverter {
  private TextListStyleConverter() {
  }

  public static TextListStyleModel fromDocx4J(CTTextListStyle value) {
    if (value == null) return null;
    return new TextListStyleModel(TextParagraphPropertiesConverter.fromDocx4J(value.getDefPPr()), TextParagraphPropertiesConverter.fromDocx4J(value.getLvl1PPr()), TextParagraphPropertiesConverter.fromDocx4J(value.getLvl2PPr()), TextParagraphPropertiesConverter.fromDocx4J(value.getLvl3PPr()), TextParagraphPropertiesConverter.fromDocx4J(value.getLvl4PPr()), TextParagraphPropertiesConverter.fromDocx4J(value.getLvl5PPr()), TextParagraphPropertiesConverter.fromDocx4J(value.getLvl6PPr()), TextParagraphPropertiesConverter.fromDocx4J(value.getLvl7PPr()), TextParagraphPropertiesConverter.fromDocx4J(value.getLvl8PPr()), TextParagraphPropertiesConverter.fromDocx4J(value.getLvl9PPr()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
