package jxsd.gen.converter.drawingml.main;

import java.util.List;
import java.util.stream.Collectors;
import jxsd.gen.converter.XMLSchema.TokenValueConverter;
import jxsd.gen.model.drawingml.main.EffectContainerModel;
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

/**
 * This is a generated sequence class.
 */
public class EffectContainerConverter {
  private EffectContainerConverter() {
  }

  public static EffectContainerModel fromDocx4j(CTEffectContainer value) {
    if (value == null) return null;
    List<EffectContainerModel.EG_Effect> egEffect = value.getEGEffect().stream().map(val -> {
      if (val instanceof CTEffectContainer) return EffectContainerModel.EG_Effect.newCont(EffectContainerConverter.fromDocx4j((CTEffectContainer) val));
      if (val instanceof CTEffectReference) return EffectContainerModel.EG_Effect.newEffect(EffectReferenceConverter.fromDocx4j((CTEffectReference) val));
      if (val instanceof CTAlphaBiLevelEffect) return EffectContainerModel.EG_Effect.newAlphaBiLevel(AlphaBiLevelEffectConverter.fromDocx4j((CTAlphaBiLevelEffect) val));
      if (val instanceof CTAlphaCeilingEffect) return EffectContainerModel.EG_Effect.newAlphaCeiling(AlphaCeilingEffectConverter.fromDocx4j((CTAlphaCeilingEffect) val));
      if (val instanceof CTAlphaFloorEffect) return EffectContainerModel.EG_Effect.newAlphaFloor(AlphaFloorEffectConverter.fromDocx4j((CTAlphaFloorEffect) val));
      if (val instanceof CTAlphaInverseEffect) return EffectContainerModel.EG_Effect.newAlphaInv(AlphaInverseEffectConverter.fromDocx4j((CTAlphaInverseEffect) val));
      if (val instanceof CTAlphaModulateEffect) return EffectContainerModel.EG_Effect.newAlphaMod(AlphaModulateEffectConverter.fromDocx4j((CTAlphaModulateEffect) val));
      if (val instanceof CTAlphaModulateFixedEffect) return EffectContainerModel.EG_Effect.newAlphaModFix(AlphaModulateFixedEffectConverter.fromDocx4j((CTAlphaModulateFixedEffect) val));
      if (val instanceof CTAlphaOutsetEffect) return EffectContainerModel.EG_Effect.newAlphaOutset(AlphaOutsetEffectConverter.fromDocx4j((CTAlphaOutsetEffect) val));
      if (val instanceof CTAlphaReplaceEffect) return EffectContainerModel.EG_Effect.newAlphaRepl(AlphaReplaceEffectConverter.fromDocx4j((CTAlphaReplaceEffect) val));
      if (val instanceof CTBiLevelEffect) return EffectContainerModel.EG_Effect.newBiLevel(BiLevelEffectConverter.fromDocx4j((CTBiLevelEffect) val));
      if (val instanceof CTBlendEffect) return EffectContainerModel.EG_Effect.newBlend(BlendEffectConverter.fromDocx4j((CTBlendEffect) val));
      if (val instanceof CTBlurEffect) return EffectContainerModel.EG_Effect.newBlur(BlurEffectConverter.fromDocx4j((CTBlurEffect) val));
      if (val instanceof CTColorChangeEffect) return EffectContainerModel.EG_Effect.newClrChange(ColorChangeEffectConverter.fromDocx4j((CTColorChangeEffect) val));
      if (val instanceof CTColorReplaceEffect) return EffectContainerModel.EG_Effect.newClrRepl(ColorReplaceEffectConverter.fromDocx4j((CTColorReplaceEffect) val));
      if (val instanceof CTDuotoneEffect) return EffectContainerModel.EG_Effect.newDuotone(DuotoneEffectConverter.fromDocx4j((CTDuotoneEffect) val));
      if (val instanceof CTFillEffect) return EffectContainerModel.EG_Effect.newFill(FillEffectConverter.fromDocx4j((CTFillEffect) val));
      if (val instanceof CTFillOverlayEffect) return EffectContainerModel.EG_Effect.newFillOverlay(FillOverlayEffectConverter.fromDocx4j((CTFillOverlayEffect) val));
      if (val instanceof CTGlowEffect) return EffectContainerModel.EG_Effect.newGlow(GlowEffectConverter.fromDocx4j((CTGlowEffect) val));
      if (val instanceof CTGrayscaleEffect) return EffectContainerModel.EG_Effect.newGrayscl(GrayscaleEffectConverter.fromDocx4j((CTGrayscaleEffect) val));
      if (val instanceof CTHSLEffect) return EffectContainerModel.EG_Effect.newHsl(HSLEffectConverter.fromDocx4j((CTHSLEffect) val));
      if (val instanceof CTInnerShadowEffect) return EffectContainerModel.EG_Effect.newInnerShdw(InnerShadowEffectConverter.fromDocx4j((CTInnerShadowEffect) val));
      if (val instanceof CTLuminanceEffect) return EffectContainerModel.EG_Effect.newLum(LuminanceEffectConverter.fromDocx4j((CTLuminanceEffect) val));
      if (val instanceof CTOuterShadowEffect) return EffectContainerModel.EG_Effect.newOuterShdw(OuterShadowEffectConverter.fromDocx4j((CTOuterShadowEffect) val));
      if (val instanceof CTPresetShadowEffect) return EffectContainerModel.EG_Effect.newPrstShdw(PresetShadowEffectConverter.fromDocx4j((CTPresetShadowEffect) val));
      if (val instanceof CTReflectionEffect) return EffectContainerModel.EG_Effect.newReflection(ReflectionEffectConverter.fromDocx4j((CTReflectionEffect) val));
      if (val instanceof CTRelativeOffsetEffect) return EffectContainerModel.EG_Effect.newRelOff(RelativeOffsetEffectConverter.fromDocx4j((CTRelativeOffsetEffect) val));
      if (val instanceof CTSoftEdgesEffect) return EffectContainerModel.EG_Effect.newSoftEdge(SoftEdgesEffectConverter.fromDocx4j((CTSoftEdgesEffect) val));
      if (val instanceof CTTintEffect) return EffectContainerModel.EG_Effect.newTint(TintEffectConverter.fromDocx4j((CTTintEffect) val));
      if (val instanceof CTTransformEffect) return EffectContainerModel.EG_Effect.newXfrm(TransformEffectConverter.fromDocx4j((CTTransformEffect) val));
      return null;
    } ).collect(Collectors.toList());
    return new EffectContainerModel(EffectContainerTypeValueConverter.fromDocx4j(value.getType()), TokenValueConverter.fromDocx4j(value.getName()), egEffect);
  }

  public static CTEffectContainer toDocx4j(EffectContainerModel value) {
    if (value == null) return null;
    CTEffectContainer result = new CTEffectContainer();
    result.setType(EffectContainerTypeValueConverter.toDocx4j(value.getType()));
    result.setName(TokenValueConverter.toDocx4j(value.getName()));
    result.getEGEffect().addAll(value.getEGEffect().stream().map(val -> {
      if (val.isCont()) return EffectContainerConverter.toDocx4j(val.getCont());
      if (val.isEffect()) return EffectReferenceConverter.toDocx4j(val.getEffect());
      if (val.isAlphaBiLevel()) return AlphaBiLevelEffectConverter.toDocx4j(val.getAlphaBiLevel());
      if (val.isAlphaCeiling()) return AlphaCeilingEffectConverter.toDocx4j(val.getAlphaCeiling());
      if (val.isAlphaFloor()) return AlphaFloorEffectConverter.toDocx4j(val.getAlphaFloor());
      if (val.isAlphaInv()) return AlphaInverseEffectConverter.toDocx4j(val.getAlphaInv());
      if (val.isAlphaMod()) return AlphaModulateEffectConverter.toDocx4j(val.getAlphaMod());
      if (val.isAlphaModFix()) return AlphaModulateFixedEffectConverter.toDocx4j(val.getAlphaModFix());
      if (val.isAlphaOutset()) return AlphaOutsetEffectConverter.toDocx4j(val.getAlphaOutset());
      if (val.isAlphaRepl()) return AlphaReplaceEffectConverter.toDocx4j(val.getAlphaRepl());
      if (val.isBiLevel()) return BiLevelEffectConverter.toDocx4j(val.getBiLevel());
      if (val.isBlend()) return BlendEffectConverter.toDocx4j(val.getBlend());
      if (val.isBlur()) return BlurEffectConverter.toDocx4j(val.getBlur());
      if (val.isClrChange()) return ColorChangeEffectConverter.toDocx4j(val.getClrChange());
      if (val.isClrRepl()) return ColorReplaceEffectConverter.toDocx4j(val.getClrRepl());
      if (val.isDuotone()) return DuotoneEffectConverter.toDocx4j(val.getDuotone());
      if (val.isFill()) return FillEffectConverter.toDocx4j(val.getFill());
      if (val.isFillOverlay()) return FillOverlayEffectConverter.toDocx4j(val.getFillOverlay());
      if (val.isGlow()) return GlowEffectConverter.toDocx4j(val.getGlow());
      if (val.isGrayscl()) return GrayscaleEffectConverter.toDocx4j(val.getGrayscl());
      if (val.isHsl()) return HSLEffectConverter.toDocx4j(val.getHsl());
      if (val.isInnerShdw()) return InnerShadowEffectConverter.toDocx4j(val.getInnerShdw());
      if (val.isLum()) return LuminanceEffectConverter.toDocx4j(val.getLum());
      if (val.isOuterShdw()) return OuterShadowEffectConverter.toDocx4j(val.getOuterShdw());
      if (val.isPrstShdw()) return PresetShadowEffectConverter.toDocx4j(val.getPrstShdw());
      if (val.isReflection()) return ReflectionEffectConverter.toDocx4j(val.getReflection());
      if (val.isRelOff()) return RelativeOffsetEffectConverter.toDocx4j(val.getRelOff());
      if (val.isSoftEdge()) return SoftEdgesEffectConverter.toDocx4j(val.getSoftEdge());
      if (val.isTint()) return TintEffectConverter.toDocx4j(val.getTint());
      if (val.isXfrm()) return TransformEffectConverter.toDocx4j(val.getXfrm());
      return null;
    } ).collect(Collectors.toList()));
    return result;
  }
}
