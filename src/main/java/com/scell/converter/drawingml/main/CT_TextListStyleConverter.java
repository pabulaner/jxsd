package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextListStyleModel;
import org.docx4j.dml.CTTextListStyle;

public class CT_TextListStyleConverter {
  private CT_TextListStyleConverter() {
  }

  public static CT_TextListStyleModel fromDocx4J(CTTextListStyle value) {
    if (value == null) return null;
    return new CT_TextListStyleModel(CT_TextParagraphPropertiesConverter.fromDocx4J(value.getDefPPr()), CT_TextParagraphPropertiesConverter.fromDocx4J(value.getLvl1PPr()), CT_TextParagraphPropertiesConverter.fromDocx4J(value.getLvl2PPr()), CT_TextParagraphPropertiesConverter.fromDocx4J(value.getLvl3PPr()), CT_TextParagraphPropertiesConverter.fromDocx4J(value.getLvl4PPr()), CT_TextParagraphPropertiesConverter.fromDocx4J(value.getLvl5PPr()), CT_TextParagraphPropertiesConverter.fromDocx4J(value.getLvl6PPr()), CT_TextParagraphPropertiesConverter.fromDocx4J(value.getLvl7PPr()), CT_TextParagraphPropertiesConverter.fromDocx4J(value.getLvl8PPr()), CT_TextParagraphPropertiesConverter.fromDocx4J(value.getLvl9PPr()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTTextListStyle toDocx4J(CT_TextListStyleModel value) {
    return null;
  }
}
