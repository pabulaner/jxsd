package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.EffectPropertiesModel;
import org.docx4j.dml.CTEffectProperties;

public class EffectPropertiesConverter {
  private EffectPropertiesConverter() {
  }

  public static EffectPropertiesModel fromDocx4J(CTEffectProperties value) {
    if (value == null) return null;
    if (value.getEffectLst() != null) return EffectPropertiesModel.newEffectLst(EffectListConverter.fromDocx4J(value.getEffectLst()));
    if (value.getEffectDag() != null) return EffectPropertiesModel.newEffectDag(EffectContainerConverter.fromDocx4J(value.getEffectDag()));
    return new EffectPropertiesModel();
  }
}
