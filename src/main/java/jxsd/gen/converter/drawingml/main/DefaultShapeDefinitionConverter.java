package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.DefaultShapeDefinitionModel;
import org.docx4j.dml.CTDefaultShapeDefinition;

/**
 * This is a generated sequence class.
 */
public class DefaultShapeDefinitionConverter {
  private DefaultShapeDefinitionConverter() {
  }

  public static DefaultShapeDefinitionModel fromDocx4j(CTDefaultShapeDefinition value) {
    if (value == null) return null;
    return new DefaultShapeDefinitionModel(ShapePropertiesConverter.fromDocx4j(value.getSpPr()), TextBodyPropertiesConverter.fromDocx4j(value.getBodyPr()), TextListStyleConverter.fromDocx4j(value.getLstStyle()), ShapeStyleConverter.fromDocx4j(value.getStyle()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTDefaultShapeDefinition toDocx4j(DefaultShapeDefinitionModel value) {
    if (value == null) return null;
    CTDefaultShapeDefinition result = new CTDefaultShapeDefinition();
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setBodyPr(TextBodyPropertiesConverter.toDocx4j(value.getBodyPr()));
    result.setLstStyle(TextListStyleConverter.toDocx4j(value.getLstStyle()));
    result.setStyle(ShapeStyleConverter.toDocx4j(value.getStyle()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
