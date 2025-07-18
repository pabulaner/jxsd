package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_EffectStyleItemModel;
import org.docx4j.dml.CTEffectStyleItem;

public class CT_EffectStyleItemConverter {
  private CT_EffectStyleItemConverter() {
  }

  public static CT_EffectStyleItemModel fromDocx4J(CTEffectStyleItem value) {
    if (value == null) return null;
    // look here false;
    CT_EffectStyleItemModel.EG_EffectPropertiesModel egEffectProperties = new CT_EffectStyleItemModel.EG_EffectPropertiesModel();
    if (value.getEffectLst() != null) egEffectProperties = CT_EffectStyleItemModel.EG_EffectPropertiesModel.newEffectLst(CT_EffectListConverter.fromDocx4J(value.getEffectLst()));
    if (value.getEffectDag() != null) egEffectProperties = CT_EffectStyleItemModel.EG_EffectPropertiesModel.newEffectDag(CT_EffectContainerConverter.fromDocx4J(value.getEffectDag()));
    return new CT_EffectStyleItemModel(egEffectProperties, CT_Scene3DConverter.fromDocx4J(value.getScene3D()), CT_Shape3DConverter.fromDocx4J(value.getSp3D()));
  }

  public static CTEffectStyleItem toDocx4J(CT_EffectStyleItemModel value) {
    return null;
  }
}
