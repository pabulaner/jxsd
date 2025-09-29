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
      if (val instanceof CTEffectContainer) return CTEffectContainer.EGEffect.newCont(EffectContainerConverter.fromDocx4j((CTEffectContainer) val));
      if (val instanceof CTEffectReference) return CTEffectContainer.EGEffect.newEffect(EffectReferenceConverter.fromDocx4j((CTEffectReference) val));
      if (val instanceof CTAlphaBiLevelEffect) return CTEffectContainer.EGEffect.newAlphaBiLevel(AlphaBiLevelEffectConverter.fromDocx4j((CTAlphaBiLevelEffect) val));
      if (val instanceof CTAlphaCeilingEffect) return CTEffectContainer.EGEffect.newAlphaCeiling(AlphaCeilingEffectConverter.fromDocx4j((CTAlphaCeilingEffect) val));
      if (val instanceof CTAlphaFloorEffect) return CTEffectContainer.EGEffect.newAlphaFloor(AlphaFloorEffectConverter.fromDocx4j((CTAlphaFloorEffect) val));
      if (val instanceof CTAlphaInverseEffect) return CTEffectContainer.EGEffect.newAlphaInv(AlphaInverseEffectConverter.fromDocx4j((CTAlphaInverseEffect) val));
      if (val instanceof CTAlphaModulateEffect) return CTEffectContainer.EGEffect.newAlphaMod(AlphaModulateEffectConverter.fromDocx4j((CTAlphaModulateEffect) val));
      if (val instanceof CTAlphaModulateFixedEffect) return CTEffectContainer.EGEffect.newAlphaModFix(AlphaModulateFixedEffectConverter.fromDocx4j((CTAlphaModulateFixedEffect) val));
      if (val instanceof CTAlphaOutsetEffect) return CTEffectContainer.EGEffect.newAlphaOutset(AlphaOutsetEffectConverter.fromDocx4j((CTAlphaOutsetEffect) val));
      if (val instanceof CTAlphaReplaceEffect) return CTEffectContainer.EGEffect.newAlphaRepl(AlphaReplaceEffectConverter.fromDocx4j((CTAlphaReplaceEffect) val));
      if (val instanceof CTBiLevelEffect) return CTEffectContainer.EGEffect.newBiLevel(BiLevelEffectConverter.fromDocx4j((CTBiLevelEffect) val));
      if (val instanceof CTBlendEffect) return CTEffectContainer.EGEffect.newBlend(BlendEffectConverter.fromDocx4j((CTBlendEffect) val));
      if (val instanceof CTBlurEffect) return CTEffectContainer.EGEffect.newBlur(BlurEffectConverter.fromDocx4j((CTBlurEffect) val));
      if (val instanceof CTColorChangeEffect) return CTEffectContainer.EGEffect.newClrChange(ColorChangeEffectConverter.fromDocx4j((CTColorChangeEffect) val));
      if (val instanceof CTColorReplaceEffect) return CTEffectContainer.EGEffect.newClrRepl(ColorReplaceEffectConverter.fromDocx4j((CTColorReplaceEffect) val));
      if (val instanceof CTDuotoneEffect) return CTEffectContainer.EGEffect.newDuotone(DuotoneEffectConverter.fromDocx4j((CTDuotoneEffect) val));
      if (val instanceof CTFillEffect) return CTEffectContainer.EGEffect.newFill(FillEffectConverter.fromDocx4j((CTFillEffect) val));
      if (val instanceof CTFillOverlayEffect) return CTEffectContainer.EGEffect.newFillOverlay(FillOverlayEffectConverter.fromDocx4j((CTFillOverlayEffect) val));
      if (val instanceof CTGlowEffect) return CTEffectContainer.EGEffect.newGlow(GlowEffectConverter.fromDocx4j((CTGlowEffect) val));
      if (val instanceof CTGrayscaleEffect) return CTEffectContainer.EGEffect.newGrayscl(GrayscaleEffectConverter.fromDocx4j((CTGrayscaleEffect) val));
      if (val instanceof CTHSLEffect) return CTEffectContainer.EGEffect.newHsl(HSLEffectConverter.fromDocx4j((CTHSLEffect) val));
      if (val instanceof CTInnerShadowEffect) return CTEffectContainer.EGEffect.newInnerShdw(InnerShadowEffectConverter.fromDocx4j((CTInnerShadowEffect) val));
      if (val instanceof CTLuminanceEffect) return CTEffectContainer.EGEffect.newLum(LuminanceEffectConverter.fromDocx4j((CTLuminanceEffect) val));
      if (val instanceof CTOuterShadowEffect) return CTEffectContainer.EGEffect.newOuterShdw(OuterShadowEffectConverter.fromDocx4j((CTOuterShadowEffect) val));
      if (val instanceof CTPresetShadowEffect) return CTEffectContainer.EGEffect.newPrstShdw(PresetShadowEffectConverter.fromDocx4j((CTPresetShadowEffect) val));
      if (val instanceof CTReflectionEffect) return CTEffectContainer.EGEffect.newReflection(ReflectionEffectConverter.fromDocx4j((CTReflectionEffect) val));
      if (val instanceof CTRelativeOffsetEffect) return CTEffectContainer.EGEffect.newRelOff(RelativeOffsetEffectConverter.fromDocx4j((CTRelativeOffsetEffect) val));
      if (val instanceof CTSoftEdgesEffect) return CTEffectContainer.EGEffect.newSoftEdge(SoftEdgesEffectConverter.fromDocx4j((CTSoftEdgesEffect) val));
      if (val instanceof CTTintEffect) return CTEffectContainer.EGEffect.newTint(TintEffectConverter.fromDocx4j((CTTintEffect) val));
      if (val instanceof CTTransformEffect) return CTEffectContainer.EGEffect.newXfrm(TransformEffectConverter.fromDocx4j((CTTransformEffect) val));
      return new EffectContainerModel(EffectContainerTypeValueConverter.fromDocx4j(value.getType()), TokenValueConverter.fromDocx4j(value.getName()), egEffect);
    });
  }

    public static CTEffectContainer toDocx4j(EffectContainerModel value) {
      if (value == null) return null;
      CTEffectContainer result = new CTEffectContainer();
      result.setType(EffectContainerTypeValueConverter.toDocx4j(value.getType()));
      result.setName(TokenValueConverter.toDocx4j(value.getName()));
      result.getEGEffect().addAll(value.getEGEffect().stream().map(val -> {
        if (val.isCont()) return EffectContainerConverter.toDocx4j(val.getCont());
        if (val.isEffect()) return EffectContainerConverter.toDocx4j(val.getEffect());
        if (val.isAlphaBiLevel()) return EffectContainerConverter.toDocx4j(val.getAlphaBiLevel());
        if (val.isAlphaCeiling()) return EffectContainerConverter.toDocx4j(val.getAlphaCeiling());
        if (val.isAlphaFloor()) return EffectContainerConverter.toDocx4j(val.getAlphaFloor());
        if (val.isAlphaInv()) return EffectContainerConverter.toDocx4j(val.getAlphaInv());
        if (val.isAlphaMod()) return EffectContainerConverter.toDocx4j(val.getAlphaMod());
        if (val.isAlphaModFix()) return EffectContainerConverter.toDocx4j(val.getAlphaModFix());
        if (val.isAlphaOutset()) return EffectContainerConverter.toDocx4j(val.getAlphaOutset());
        if (val.isAlphaRepl()) return EffectContainerConverter.toDocx4j(val.getAlphaRepl());
        if (val.isBiLevel()) return EffectContainerConverter.toDocx4j(val.getBiLevel());
        if (val.isBlend()) return EffectContainerConverter.toDocx4j(val.getBlend());
        if (val.isBlur()) return EffectContainerConverter.toDocx4j(val.getBlur());
        if (val.isClrChange()) return EffectContainerConverter.toDocx4j(val.getClrChange());
        if (val.isClrRepl()) return EffectContainerConverter.toDocx4j(val.getClrRepl());
        if (val.isDuotone()) return EffectContainerConverter.toDocx4j(val.getDuotone());
        if (val.isFill()) return EffectContainerConverter.toDocx4j(val.getFill());
        if (val.isFillOverlay()) return EffectContainerConverter.toDocx4j(val.getFillOverlay());
        if (val.isGlow()) return EffectContainerConverter.toDocx4j(val.getGlow());
        if (val.isGrayscl()) return EffectContainerConverter.toDocx4j(val.getGrayscl());
        if (val.isHsl()) return EffectContainerConverter.toDocx4j(val.getHsl());
        if (val.isInnerShdw()) return EffectContainerConverter.toDocx4j(val.getInnerShdw());
        if (val.isLum()) return EffectContainerConverter.toDocx4j(val.getLum());
        if (val.isOuterShdw()) return EffectContainerConverter.toDocx4j(val.getOuterShdw());
        if (val.isPrstShdw()) return EffectContainerConverter.toDocx4j(val.getPrstShdw());
        if (val.isReflection()) return EffectContainerConverter.toDocx4j(val.getReflection());
        if (val.isRelOff()) return EffectContainerConverter.toDocx4j(val.getRelOff());
        if (val.isSoftEdge()) return EffectContainerConverter.toDocx4j(val.getSoftEdge());
        if (val.isTint()) return EffectContainerConverter.toDocx4j(val.getTint());
        if (val.isXfrm()) return EffectContainerConverter.toDocx4j(val.getXfrm());
        return null;
      } ).collect(Collectors.toList());
      return result;
    }
  }
