package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextListStyleModel;
import org.docx4j.dml.CTTextListStyle;

/**
 * This is a generated sequence class.
 */
public class TextListStyleConverter {
  private TextListStyleConverter() {
  }

  public static TextListStyleModel fromDocx4j(CTTextListStyle value) {
    if (value == null) return null;
    return new TextListStyleModel(TextParagraphPropertiesConverter.fromDocx4j(value.getDefPPr()), TextParagraphPropertiesConverter.fromDocx4j(value.getLvl1PPr()), TextParagraphPropertiesConverter.fromDocx4j(value.getLvl2PPr()), TextParagraphPropertiesConverter.fromDocx4j(value.getLvl3PPr()), TextParagraphPropertiesConverter.fromDocx4j(value.getLvl4PPr()), TextParagraphPropertiesConverter.fromDocx4j(value.getLvl5PPr()), TextParagraphPropertiesConverter.fromDocx4j(value.getLvl6PPr()), TextParagraphPropertiesConverter.fromDocx4j(value.getLvl7PPr()), TextParagraphPropertiesConverter.fromDocx4j(value.getLvl8PPr()), TextParagraphPropertiesConverter.fromDocx4j(value.getLvl9PPr()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTTextListStyle toDocx4j(TextListStyleModel value) {
    if (value == null) return null;
    CTTextListStyle result = new CTTextListStyle();
    result.setDefPPr(TextParagraphPropertiesConverter.toDocx4j(value.getDefPPr()));
    result.setLvl1PPr(TextParagraphPropertiesConverter.toDocx4j(value.getLvl1PPr()));
    result.setLvl2PPr(TextParagraphPropertiesConverter.toDocx4j(value.getLvl2PPr()));
    result.setLvl3PPr(TextParagraphPropertiesConverter.toDocx4j(value.getLvl3PPr()));
    result.setLvl4PPr(TextParagraphPropertiesConverter.toDocx4j(value.getLvl4PPr()));
    result.setLvl5PPr(TextParagraphPropertiesConverter.toDocx4j(value.getLvl5PPr()));
    result.setLvl6PPr(TextParagraphPropertiesConverter.toDocx4j(value.getLvl6PPr()));
    result.setLvl7PPr(TextParagraphPropertiesConverter.toDocx4j(value.getLvl7PPr()));
    result.setLvl8PPr(TextParagraphPropertiesConverter.toDocx4j(value.getLvl8PPr()));
    result.setLvl9PPr(TextParagraphPropertiesConverter.toDocx4j(value.getLvl9PPr()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
