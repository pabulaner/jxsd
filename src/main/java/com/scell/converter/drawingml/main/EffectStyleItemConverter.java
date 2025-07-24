package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.EffectStyleItemModel;
import org.docx4j.dml.CTEffectStyleItem;

public class EffectStyleItemConverter {
  private EffectStyleItemConverter() {
  }

  public static EffectStyleItemModel fromDocx4J(CTEffectStyleItem value) {
    if (value == null) return null;
    EffectStyleItemModel.EffectPropertiesModel egEffectProperties = new EffectStyleItemModel.EffectPropertiesModel();
    if (value.getEffectLst() != null) egEffectProperties = EffectStyleItemModel.EffectPropertiesModel.newEffectLst(EffectListConverter.fromDocx4J(value.getEffectLst()));
    if (value.getEffectDag() != null) egEffectProperties = EffectStyleItemModel.EffectPropertiesModel.newEffectDag(EffectContainerConverter.fromDocx4J(value.getEffectDag()));
    return new EffectStyleItemModel(egEffectProperties, Scene3DConverter.fromDocx4J(value.getScene3D()), Shape3DConverter.fromDocx4J(value.getSp3D()));
  }
}
