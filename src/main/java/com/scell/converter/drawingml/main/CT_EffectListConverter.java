package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_EffectListModel;
import org.docx4j.dml.CTEffectList;

public class CT_EffectListConverter {
  private CT_EffectListConverter() {
  }

  public static CT_EffectListModel fromDocx4J(CTEffectList value) {
    if (value == null) return null;
    return new CT_EffectListModel(CT_BlurEffectConverter.fromDocx4J(value.getBlur()), CT_FillOverlayEffectConverter.fromDocx4J(value.getFillOverlay()), CT_GlowEffectConverter.fromDocx4J(value.getGlow()), CT_InnerShadowEffectConverter.fromDocx4J(value.getInnerShdw()), CT_OuterShadowEffectConverter.fromDocx4J(value.getOuterShdw()), CT_PresetShadowEffectConverter.fromDocx4J(value.getPrstShdw()), CT_ReflectionEffectConverter.fromDocx4J(value.getReflection()), CT_SoftEdgesEffectConverter.fromDocx4J(value.getSoftEdge()));
  }

  public static CTEffectList toDocx4J(CT_EffectListModel value) {
    return null;
  }
}
