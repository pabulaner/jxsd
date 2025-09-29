package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.ObjectStyleDefaultsModel;
import org.docx4j.dml.CTObjectStyleDefaults;

/**
 * This is a generated sequence class.
 */
public class ObjectStyleDefaultsConverter {
  private ObjectStyleDefaultsConverter() {
  }

  public static ObjectStyleDefaultsModel fromDocx4j(CTObjectStyleDefaults value) {
    if (value == null) return null;
    return new ObjectStyleDefaultsModel(DefaultShapeDefinitionConverter.fromDocx4j(value.getSpDef()), DefaultShapeDefinitionConverter.fromDocx4j(value.getLnDef()), DefaultShapeDefinitionConverter.fromDocx4j(value.getTxDef()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTObjectStyleDefaults toDocx4j(ObjectStyleDefaultsModel value) {
    if (value == null) return null;
    CTObjectStyleDefaults result = new CTObjectStyleDefaults();
    result.setSpDef(DefaultShapeDefinitionConverter.toDocx4j(value.getSpDef()));
    result.setLnDef(DefaultShapeDefinitionConverter.toDocx4j(value.getLnDef()));
    result.setTxDef(DefaultShapeDefinitionConverter.toDocx4j(value.getTxDef()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
