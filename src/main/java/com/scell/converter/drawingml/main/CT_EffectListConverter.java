package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_EffectListModel;
import org.docx4j.dml.CTEffectList;

public class CT_EffectListConverter {
  private CT_EffectListConverter() {
  }

  public static CT_EffectListModel fromDocx4j(CTEffectList value) {
    if (value == null) return null;
    return new CT_EffectListModel(CT_BlurEffectConverter.fromDocx4j(value.getBlur()), CT_FillOverlayEffectConverter.fromDocx4j(value.getFillOverlay()), CT_GlowEffectConverter.fromDocx4j(value.getGlow()), CT_InnerShadowEffectConverter.fromDocx4j(value.getInnerShdw()), CT_OuterShadowEffectConverter.fromDocx4j(value.getOuterShdw()), CT_PresetShadowEffectConverter.fromDocx4j(value.getPrstShdw()), CT_ReflectionEffectConverter.fromDocx4j(value.getReflection()), CT_SoftEdgesEffectConverter.fromDocx4j(value.getSoftEdge()));
  }

  public static CTEffectList toDocx4j(CT_EffectListModel value) {
    return null;
  }
}
