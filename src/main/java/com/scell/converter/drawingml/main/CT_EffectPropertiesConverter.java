package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_EffectPropertiesModel;
import org.docx4j.dml.CTEffectProperties;

public class CT_EffectPropertiesConverter {
  private CT_EffectPropertiesConverter() {
  }

  public static CT_EffectPropertiesModel fromDocx4J(CTEffectProperties value) {
    if (value == null) return null;
    if (value.getEffectLst() != null) return CT_EffectPropertiesModel.newEffectLst(CT_EffectListConverter.fromDocx4J(value.getEffectLst()));
    if (value.getEffectDag() != null) return CT_EffectPropertiesModel.newEffectDag(CT_EffectContainerConverter.fromDocx4J(value.getEffectDag()));
    return new CT_EffectPropertiesModel();
  }

  public static CTEffectProperties toDocx4J(CT_EffectPropertiesModel value) {
    return null;
  }
}
