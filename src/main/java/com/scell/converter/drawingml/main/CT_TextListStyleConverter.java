package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextListStyleModel;
import org.docx4j.dml.CTTextListStyle;

public class CT_TextListStyleConverter {
  private CT_TextListStyleConverter() {
  }

  public static CT_TextListStyleModel fromDocx4j(CTTextListStyle value) {
    if (value == null) return null;
    return new CT_TextListStyleModel(CT_TextParagraphPropertiesConverter.fromDocx4j(value.getDefPPr()), CT_TextParagraphPropertiesConverter.fromDocx4j(value.getLvl1pPr()), CT_TextParagraphPropertiesConverter.fromDocx4j(value.getLvl2pPr()), CT_TextParagraphPropertiesConverter.fromDocx4j(value.getLvl3pPr()), CT_TextParagraphPropertiesConverter.fromDocx4j(value.getLvl4pPr()), CT_TextParagraphPropertiesConverter.fromDocx4j(value.getLvl5pPr()), CT_TextParagraphPropertiesConverter.fromDocx4j(value.getLvl6pPr()), CT_TextParagraphPropertiesConverter.fromDocx4j(value.getLvl7pPr()), CT_TextParagraphPropertiesConverter.fromDocx4j(value.getLvl8pPr()), CT_TextParagraphPropertiesConverter.fromDocx4j(value.getLvl9pPr()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTTextListStyle toDocx4j(CT_TextListStyleModel value) {
    return null;
  }
}
