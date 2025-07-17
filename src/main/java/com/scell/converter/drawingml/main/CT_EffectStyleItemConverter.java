package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_EffectStyleItemModel;
import org.docx4j.dml.CTEffectStyleItem;

public class CT_EffectStyleItemConverter {
  private CT_EffectStyleItemConverter() {
  }

  public static CT_EffectStyleItemModel fromDocx4j(CTEffectStyleItem value) {
    if (value == null) return null;
    return new CT_EffectStyleItemModel(EffectLstOrEffectDagConverter.fromDocx4j(value.getEffectLstOrEffectDag()), CT_Scene3DConverter.fromDocx4j(value.getScene3d()), CT_Shape3DConverter.fromDocx4j(value.getSp3d()));
  }

  public static CTEffectStyleItem toDocx4j(CT_EffectStyleItemModel value) {
    return null;
  }

  public static class EffectLstOrEffectDagConverter {
    private EffectLstOrEffectDagConverter() {
    }

    public static CT_EffectStyleItemModel.EffectLstOrEffectDagModel fromDocx4j(
        CTEffectStyleItem.EffectLstOrEffectDag value) {
      if (value == null) return null;
    }

    public static CTEffectStyleItem.EffectLstOrEffectDag toDocx4j(
        CT_EffectStyleItemModel.EffectLstOrEffectDagModel value) {
      return null;
    }
  }
}
