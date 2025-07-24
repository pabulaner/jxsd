package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.EffectListModel;
import org.docx4j.dml.CTEffectList;

public class EffectListConverter {
  private EffectListConverter() {
  }

  public static EffectListModel fromDocx4J(CTEffectList value) {
    if (value == null) return null;
    return new EffectListModel(BlurEffectConverter.fromDocx4J(value.getBlur()), FillOverlayEffectConverter.fromDocx4J(value.getFillOverlay()), GlowEffectConverter.fromDocx4J(value.getGlow()), InnerShadowEffectConverter.fromDocx4J(value.getInnerShdw()), OuterShadowEffectConverter.fromDocx4J(value.getOuterShdw()), PresetShadowEffectConverter.fromDocx4J(value.getPrstShdw()), ReflectionEffectConverter.fromDocx4J(value.getReflection()), SoftEdgesEffectConverter.fromDocx4J(value.getSoftEdge()));
  }
}
