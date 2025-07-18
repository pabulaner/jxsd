package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.TokenConverter;
import com.scell.model.drawingml.main.CT_EffectContainerModel;
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

public class CT_EffectContainerConverter {
  private CT_EffectContainerConverter() {
  }

  public static CT_EffectContainerModel fromDocx4J(CTEffectContainer value) {
    if (value == null) return null;
    // look here true;
    List<CT_EffectContainerModel.EG_EffectModel> egEffect = value.getEGEffect().stream().map(val -> {
      if (val instanceof CTEffectContainer) return CT_EffectContainerModel.EG_EffectModel.newCont(CT_EffectContainerConverter.fromDocx4J((CTEffectContainer) val));
      if (val instanceof CTEffectReference) return CT_EffectContainerModel.EG_EffectModel.newEffect(CT_EffectReferenceConverter.fromDocx4J((CTEffectReference) val));
      if (val instanceof CTAlphaBiLevelEffect) return CT_EffectContainerModel.EG_EffectModel.newAlphaBiLevel(CT_AlphaBiLevelEffectConverter.fromDocx4J((CTAlphaBiLevelEffect) val));
      if (val instanceof CTAlphaCeilingEffect) return CT_EffectContainerModel.EG_EffectModel.newAlphaCeiling(CT_AlphaCeilingEffectConverter.fromDocx4J((CTAlphaCeilingEffect) val));
      if (val instanceof CTAlphaFloorEffect) return CT_EffectContainerModel.EG_EffectModel.newAlphaFloor(CT_AlphaFloorEffectConverter.fromDocx4J((CTAlphaFloorEffect) val));
      if (val instanceof CTAlphaInverseEffect) return CT_EffectContainerModel.EG_EffectModel.newAlphaInv(CT_AlphaInverseEffectConverter.fromDocx4J((CTAlphaInverseEffect) val));
      if (val instanceof CTAlphaModulateEffect) return CT_EffectContainerModel.EG_EffectModel.newAlphaMod(CT_AlphaModulateEffectConverter.fromDocx4J((CTAlphaModulateEffect) val));
      if (val instanceof CTAlphaModulateFixedEffect) return CT_EffectContainerModel.EG_EffectModel.newAlphaModFix(CT_AlphaModulateFixedEffectConverter.fromDocx4J((CTAlphaModulateFixedEffect) val));
      if (val instanceof CTAlphaOutsetEffect) return CT_EffectContainerModel.EG_EffectModel.newAlphaOutset(CT_AlphaOutsetEffectConverter.fromDocx4J((CTAlphaOutsetEffect) val));
      if (val instanceof CTAlphaReplaceEffect) return CT_EffectContainerModel.EG_EffectModel.newAlphaRepl(CT_AlphaReplaceEffectConverter.fromDocx4J((CTAlphaReplaceEffect) val));
      if (val instanceof CTBiLevelEffect) return CT_EffectContainerModel.EG_EffectModel.newBiLevel(CT_BiLevelEffectConverter.fromDocx4J((CTBiLevelEffect) val));
      if (val instanceof CTBlendEffect) return CT_EffectContainerModel.EG_EffectModel.newBlend(CT_BlendEffectConverter.fromDocx4J((CTBlendEffect) val));
      if (val instanceof CTBlurEffect) return CT_EffectContainerModel.EG_EffectModel.newBlur(CT_BlurEffectConverter.fromDocx4J((CTBlurEffect) val));
      if (val instanceof CTColorChangeEffect) return CT_EffectContainerModel.EG_EffectModel.newClrChange(CT_ColorChangeEffectConverter.fromDocx4J((CTColorChangeEffect) val));
      if (val instanceof CTColorReplaceEffect) return CT_EffectContainerModel.EG_EffectModel.newClrRepl(CT_ColorReplaceEffectConverter.fromDocx4J((CTColorReplaceEffect) val));
      if (val instanceof CTDuotoneEffect) return CT_EffectContainerModel.EG_EffectModel.newDuotone(CT_DuotoneEffectConverter.fromDocx4J((CTDuotoneEffect) val));
      if (val instanceof CTFillEffect) return CT_EffectContainerModel.EG_EffectModel.newFill(CT_FillEffectConverter.fromDocx4J((CTFillEffect) val));
      if (val instanceof CTFillOverlayEffect) return CT_EffectContainerModel.EG_EffectModel.newFillOverlay(CT_FillOverlayEffectConverter.fromDocx4J((CTFillOverlayEffect) val));
      if (val instanceof CTGlowEffect) return CT_EffectContainerModel.EG_EffectModel.newGlow(CT_GlowEffectConverter.fromDocx4J((CTGlowEffect) val));
      if (val instanceof CTGrayscaleEffect) return CT_EffectContainerModel.EG_EffectModel.newGrayscl(CT_GrayscaleEffectConverter.fromDocx4J((CTGrayscaleEffect) val));
      if (val instanceof CTHSLEffect) return CT_EffectContainerModel.EG_EffectModel.newHsl(CT_HSLEffectConverter.fromDocx4J((CTHSLEffect) val));
      if (val instanceof CTInnerShadowEffect) return CT_EffectContainerModel.EG_EffectModel.newInnerShdw(CT_InnerShadowEffectConverter.fromDocx4J((CTInnerShadowEffect) val));
      if (val instanceof CTLuminanceEffect) return CT_EffectContainerModel.EG_EffectModel.newLum(CT_LuminanceEffectConverter.fromDocx4J((CTLuminanceEffect) val));
      if (val instanceof CTOuterShadowEffect) return CT_EffectContainerModel.EG_EffectModel.newOuterShdw(CT_OuterShadowEffectConverter.fromDocx4J((CTOuterShadowEffect) val));
      if (val instanceof CTPresetShadowEffect) return CT_EffectContainerModel.EG_EffectModel.newPrstShdw(CT_PresetShadowEffectConverter.fromDocx4J((CTPresetShadowEffect) val));
      if (val instanceof CTReflectionEffect) return CT_EffectContainerModel.EG_EffectModel.newReflection(CT_ReflectionEffectConverter.fromDocx4J((CTReflectionEffect) val));
      if (val instanceof CTRelativeOffsetEffect) return CT_EffectContainerModel.EG_EffectModel.newRelOff(CT_RelativeOffsetEffectConverter.fromDocx4J((CTRelativeOffsetEffect) val));
      if (val instanceof CTSoftEdgesEffect) return CT_EffectContainerModel.EG_EffectModel.newSoftEdge(CT_SoftEdgesEffectConverter.fromDocx4J((CTSoftEdgesEffect) val));
      if (val instanceof CTTintEffect) return CT_EffectContainerModel.EG_EffectModel.newTint(CT_TintEffectConverter.fromDocx4J((CTTintEffect) val));
      if (val instanceof CTTransformEffect) return CT_EffectContainerModel.EG_EffectModel.newXfrm(CT_TransformEffectConverter.fromDocx4J((CTTransformEffect) val));
      return null;
    } ).collect(Collectors.toList());
    return new CT_EffectContainerModel(ST_EffectContainerTypeConverter.fromDocx4J(value.getType()), TokenConverter.fromDocx4J(value.getName()), egEffect);
  }

  public static CTEffectContainer toDocx4J(CT_EffectContainerModel value) {
    return null;
  }
}
