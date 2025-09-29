package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.EffectListModel;
import org.docx4j.dml.CTEffectList;

/**
 * This is a generated sequence class.
 */
public class EffectListConverter {
  private EffectListConverter() {
  }

  public static EffectListModel fromDocx4j(CTEffectList value) {
    if (value == null) return null;
    return new EffectListModel(BlurEffectConverter.fromDocx4j(value.getBlur()), FillOverlayEffectConverter.fromDocx4j(value.getFillOverlay()), GlowEffectConverter.fromDocx4j(value.getGlow()), InnerShadowEffectConverter.fromDocx4j(value.getInnerShdw()), OuterShadowEffectConverter.fromDocx4j(value.getOuterShdw()), PresetShadowEffectConverter.fromDocx4j(value.getPrstShdw()), ReflectionEffectConverter.fromDocx4j(value.getReflection()), SoftEdgesEffectConverter.fromDocx4j(value.getSoftEdge()));
  }

  public static CTEffectList toDocx4j(EffectListModel value) {
    if (value == null) return null;
    CTEffectList result = new CTEffectList();
    result.setBlur(BlurEffectConverter.toDocx4j(value.getBlur()));
    result.setFillOverlay(FillOverlayEffectConverter.toDocx4j(value.getFillOverlay()));
    result.setGlow(GlowEffectConverter.toDocx4j(value.getGlow()));
    result.setInnerShdw(InnerShadowEffectConverter.toDocx4j(value.getInnerShdw()));
    result.setOuterShdw(OuterShadowEffectConverter.toDocx4j(value.getOuterShdw()));
    result.setPrstShdw(PresetShadowEffectConverter.toDocx4j(value.getPrstShdw()));
    result.setReflection(ReflectionEffectConverter.toDocx4j(value.getReflection()));
    result.setSoftEdge(SoftEdgesEffectConverter.toDocx4j(value.getSoftEdge()));
    return result;
  }
}
