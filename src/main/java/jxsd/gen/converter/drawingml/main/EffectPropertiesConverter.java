package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.EffectPropertiesModel;
import org.docx4j.dml.CTEffectProperties;

/**
 * This is a generated choice class.
 */
public class EffectPropertiesConverter {
  private EffectPropertiesConverter() {
  }

  public static EffectPropertiesModel fromDocx4j(CTEffectProperties value) {
    if (value == null) return null;
    if (value.getEffectLst() != null) return EffectPropertiesModel.newEffectLst(EffectListConverter.fromDocx4j(value.getEffectLst()));
    if (value.getEffectDag() != null) return EffectPropertiesModel.newEffectDag(EffectContainerConverter.fromDocx4j(value.getEffectDag()));
    return new EffectPropertiesModel();
  }

  public static CTEffectProperties toDocx4j(EffectPropertiesModel value) {
    if (value == null) return null;
    CTEffectProperties result = new CTEffectProperties();
    if (value.isEffectLst()) result.setEffectLst(EffectListConverter.toDocx4j(value.getEffectLst()));
    if (value.isEffectDag()) result.setEffectDag(EffectContainerConverter.toDocx4j(value.getEffectDag()));
    return result;
  }
}
