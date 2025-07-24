package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.TokenConverter;
import com.scell.model.drawingml.main.EffectContainerModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.CTAlphaBiLevelEffect;
import org.docx4j.dml.CTAlphaCeilingEffect;
import org.docx4j.dml.CTAlphaFloorEffect;
import org.docx4j.dml.CTAlphaInverseEffect;
import org.docx4j.dml.CTAlphaModulateEffect;
import org.docx4j.dml.CTAlphaModulateFixedEffect;
import org.docx4j.dml.CTAlphaOutsetEffect;
import org.docx4j.dml.CTAlphaReplaceEffect;
import org.docx4j.dml.CTBiLevelEffect;
import org.docx4j.dml.CTBlendEffect;
import org.docx4j.dml.CTBlurEffect;
import org.docx4j.dml.CTColorChangeEffect;
import org.docx4j.dml.CTColorReplaceEffect;
import org.docx4j.dml.CTDuotoneEffect;
import org.docx4j.dml.CTEffectContainer;
import org.docx4j.dml.CTEffectReference;
import org.docx4j.dml.CTFillEffect;
import org.docx4j.dml.CTFillOverlayEffect;
import org.docx4j.dml.CTGlowEffect;
import org.docx4j.dml.CTGrayscaleEffect;
import org.docx4j.dml.CTHSLEffect;
import org.docx4j.dml.CTInnerShadowEffect;
import org.docx4j.dml.CTLuminanceEffect;
import org.docx4j.dml.CTOuterShadowEffect;
import org.docx4j.dml.CTPresetShadowEffect;
import org.docx4j.dml.CTReflectionEffect;
import org.docx4j.dml.CTRelativeOffsetEffect;
import org.docx4j.dml.CTSoftEdgesEffect;
import org.docx4j.dml.CTTintEffect;
import org.docx4j.dml.CTTransformEffect;

public class EffectContainerConverter {
  private EffectContainerConverter() {
  }

  public static EffectContainerModel fromDocx4J(CTEffectContainer value) {
    if (value == null) return null;
    List<EffectContainerModel.EffectModel> egEffect = value.getEGEffect().stream().map(val -> {
      if (val instanceof CTEffectContainer) return EffectContainerModel.EffectModel.newCont(EffectContainerConverter.fromDocx4J((CTEffectContainer) val));
      if (val instanceof CTEffectReference) return EffectContainerModel.EffectModel.newEffect(EffectReferenceConverter.fromDocx4J((CTEffectReference) val));
      if (val instanceof CTAlphaBiLevelEffect) return EffectContainerModel.EffectModel.newAlphaBiLevel(AlphaBiLevelEffectConverter.fromDocx4J((CTAlphaBiLevelEffect) val));
      if (val instanceof CTAlphaCeilingEffect) return EffectContainerModel.EffectModel.newAlphaCeiling(AlphaCeilingEffectConverter.fromDocx4J((CTAlphaCeilingEffect) val));
      if (val instanceof CTAlphaFloorEffect) return EffectContainerModel.EffectModel.newAlphaFloor(AlphaFloorEffectConverter.fromDocx4J((CTAlphaFloorEffect) val));
      if (val instanceof CTAlphaInverseEffect) return EffectContainerModel.EffectModel.newAlphaInv(AlphaInverseEffectConverter.fromDocx4J((CTAlphaInverseEffect) val));
      if (val instanceof CTAlphaModulateEffect) return EffectContainerModel.EffectModel.newAlphaMod(AlphaModulateEffectConverter.fromDocx4J((CTAlphaModulateEffect) val));
      if (val instanceof CTAlphaModulateFixedEffect) return EffectContainerModel.EffectModel.newAlphaModFix(AlphaModulateFixedEffectConverter.fromDocx4J((CTAlphaModulateFixedEffect) val));
      if (val instanceof CTAlphaOutsetEffect) return EffectContainerModel.EffectModel.newAlphaOutset(AlphaOutsetEffectConverter.fromDocx4J((CTAlphaOutsetEffect) val));
      if (val instanceof CTAlphaReplaceEffect) return EffectContainerModel.EffectModel.newAlphaRepl(AlphaReplaceEffectConverter.fromDocx4J((CTAlphaReplaceEffect) val));
      if (val instanceof CTBiLevelEffect) return EffectContainerModel.EffectModel.newBiLevel(BiLevelEffectConverter.fromDocx4J((CTBiLevelEffect) val));
      if (val instanceof CTBlendEffect) return EffectContainerModel.EffectModel.newBlend(BlendEffectConverter.fromDocx4J((CTBlendEffect) val));
      if (val instanceof CTBlurEffect) return EffectContainerModel.EffectModel.newBlur(BlurEffectConverter.fromDocx4J((CTBlurEffect) val));
      if (val instanceof CTColorChangeEffect) return EffectContainerModel.EffectModel.newClrChange(ColorChangeEffectConverter.fromDocx4J((CTColorChangeEffect) val));
      if (val instanceof CTColorReplaceEffect) return EffectContainerModel.EffectModel.newClrRepl(ColorReplaceEffectConverter.fromDocx4J((CTColorReplaceEffect) val));
      if (val instanceof CTDuotoneEffect) return EffectContainerModel.EffectModel.newDuotone(DuotoneEffectConverter.fromDocx4J((CTDuotoneEffect) val));
      if (val instanceof CTFillEffect) return EffectContainerModel.EffectModel.newFill(FillEffectConverter.fromDocx4J((CTFillEffect) val));
      if (val instanceof CTFillOverlayEffect) return EffectContainerModel.EffectModel.newFillOverlay(FillOverlayEffectConverter.fromDocx4J((CTFillOverlayEffect) val));
      if (val instanceof CTGlowEffect) return EffectContainerModel.EffectModel.newGlow(GlowEffectConverter.fromDocx4J((CTGlowEffect) val));
      if (val instanceof CTGrayscaleEffect) return EffectContainerModel.EffectModel.newGrayscl(GrayscaleEffectConverter.fromDocx4J((CTGrayscaleEffect) val));
      if (val instanceof CTHSLEffect) return EffectContainerModel.EffectModel.newHsl(HSLEffectConverter.fromDocx4J((CTHSLEffect) val));
      if (val instanceof CTInnerShadowEffect) return EffectContainerModel.EffectModel.newInnerShdw(InnerShadowEffectConverter.fromDocx4J((CTInnerShadowEffect) val));
      if (val instanceof CTLuminanceEffect) return EffectContainerModel.EffectModel.newLum(LuminanceEffectConverter.fromDocx4J((CTLuminanceEffect) val));
      if (val instanceof CTOuterShadowEffect) return EffectContainerModel.EffectModel.newOuterShdw(OuterShadowEffectConverter.fromDocx4J((CTOuterShadowEffect) val));
      if (val instanceof CTPresetShadowEffect) return EffectContainerModel.EffectModel.newPrstShdw(PresetShadowEffectConverter.fromDocx4J((CTPresetShadowEffect) val));
      if (val instanceof CTReflectionEffect) return EffectContainerModel.EffectModel.newReflection(ReflectionEffectConverter.fromDocx4J((CTReflectionEffect) val));
      if (val instanceof CTRelativeOffsetEffect) return EffectContainerModel.EffectModel.newRelOff(RelativeOffsetEffectConverter.fromDocx4J((CTRelativeOffsetEffect) val));
      if (val instanceof CTSoftEdgesEffect) return EffectContainerModel.EffectModel.newSoftEdge(SoftEdgesEffectConverter.fromDocx4J((CTSoftEdgesEffect) val));
      if (val instanceof CTTintEffect) return EffectContainerModel.EffectModel.newTint(TintEffectConverter.fromDocx4J((CTTintEffect) val));
      if (val instanceof CTTransformEffect) return EffectContainerModel.EffectModel.newXfrm(TransformEffectConverter.fromDocx4J((CTTransformEffect) val));
      return new EffectContainerModel.EffectModel();
    } ).collect(Collectors.toList());
    return new EffectContainerModel(EffectContainerTypeConverter.fromDocx4J(value.getType()), TokenConverter.fromDocx4J(value.getName()), egEffect);
  }
}
