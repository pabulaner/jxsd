package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.TokenModel;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class CT_EffectContainerModel {
  private final ST_EffectContainerTypeModel type;

  private final TokenModel name;

  private final List<ContOrEffectOrAlphaBiLevelModel> contOrEffectOrAlphaBiLevel;

  public CT_EffectContainerModel(ST_EffectContainerTypeModel type, TokenModel name,
      List<ContOrEffectOrAlphaBiLevelModel> contOrEffectOrAlphaBiLevel) {
    this.type = type;
    this.name = name;
    this.contOrEffectOrAlphaBiLevel = contOrEffectOrAlphaBiLevel;
  }

  public ST_EffectContainerTypeModel getType() {
    return this.type;
  }

  public TokenModel getName() {
    return this.name;
  }

  public List<ContOrEffectOrAlphaBiLevelModel> getContOrEffectOrAlphaBiLevel() {
    return this.contOrEffectOrAlphaBiLevel;
  }

  public static class ContOrEffectOrAlphaBiLevelModel {
    private final int type;

    private final Object value;

    public ContOrEffectOrAlphaBiLevelModel() {
      this(-1, null);
    }

    private ContOrEffectOrAlphaBiLevelModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newCont(CT_EffectContainerModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(0, value);
    }

    public boolean isCont() {
      return this.type == 0;
    }

    public CT_EffectContainerModel getCont() {
      return (CT_EffectContainerModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newEffect(CT_EffectReferenceModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(1, value);
    }

    public boolean isEffect() {
      return this.type == 1;
    }

    public CT_EffectReferenceModel getEffect() {
      return (CT_EffectReferenceModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newAlphaBiLevel(
        CT_AlphaBiLevelEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(2, value);
    }

    public boolean isAlphaBiLevel() {
      return this.type == 2;
    }

    public CT_AlphaBiLevelEffectModel getAlphaBiLevel() {
      return (CT_AlphaBiLevelEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newAlphaCeiling(
        CT_AlphaCeilingEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(3, value);
    }

    public boolean isAlphaCeiling() {
      return this.type == 3;
    }

    public CT_AlphaCeilingEffectModel getAlphaCeiling() {
      return (CT_AlphaCeilingEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newAlphaFloor(CT_AlphaFloorEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(4, value);
    }

    public boolean isAlphaFloor() {
      return this.type == 4;
    }

    public CT_AlphaFloorEffectModel getAlphaFloor() {
      return (CT_AlphaFloorEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newAlphaInv(CT_AlphaInverseEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(5, value);
    }

    public boolean isAlphaInv() {
      return this.type == 5;
    }

    public CT_AlphaInverseEffectModel getAlphaInv() {
      return (CT_AlphaInverseEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newAlphaMod(CT_AlphaModulateEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(6, value);
    }

    public boolean isAlphaMod() {
      return this.type == 6;
    }

    public CT_AlphaModulateEffectModel getAlphaMod() {
      return (CT_AlphaModulateEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newAlphaModFix(
        CT_AlphaModulateFixedEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(7, value);
    }

    public boolean isAlphaModFix() {
      return this.type == 7;
    }

    public CT_AlphaModulateFixedEffectModel getAlphaModFix() {
      return (CT_AlphaModulateFixedEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newAlphaOutset(CT_AlphaOutsetEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(8, value);
    }

    public boolean isAlphaOutset() {
      return this.type == 8;
    }

    public CT_AlphaOutsetEffectModel getAlphaOutset() {
      return (CT_AlphaOutsetEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newAlphaRepl(CT_AlphaReplaceEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(9, value);
    }

    public boolean isAlphaRepl() {
      return this.type == 9;
    }

    public CT_AlphaReplaceEffectModel getAlphaRepl() {
      return (CT_AlphaReplaceEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newBiLevel(CT_BiLevelEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(10, value);
    }

    public boolean isBiLevel() {
      return this.type == 10;
    }

    public CT_BiLevelEffectModel getBiLevel() {
      return (CT_BiLevelEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newBlend(CT_BlendEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(11, value);
    }

    public boolean isBlend() {
      return this.type == 11;
    }

    public CT_BlendEffectModel getBlend() {
      return (CT_BlendEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newBlur(CT_BlurEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(12, value);
    }

    public boolean isBlur() {
      return this.type == 12;
    }

    public CT_BlurEffectModel getBlur() {
      return (CT_BlurEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newClrChange(CT_ColorChangeEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(13, value);
    }

    public boolean isClrChange() {
      return this.type == 13;
    }

    public CT_ColorChangeEffectModel getClrChange() {
      return (CT_ColorChangeEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newClrRepl(CT_ColorReplaceEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(14, value);
    }

    public boolean isClrRepl() {
      return this.type == 14;
    }

    public CT_ColorReplaceEffectModel getClrRepl() {
      return (CT_ColorReplaceEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newDuotone(CT_DuotoneEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(15, value);
    }

    public boolean isDuotone() {
      return this.type == 15;
    }

    public CT_DuotoneEffectModel getDuotone() {
      return (CT_DuotoneEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newFill(CT_FillEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(16, value);
    }

    public boolean isFill() {
      return this.type == 16;
    }

    public CT_FillEffectModel getFill() {
      return (CT_FillEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newFillOverlay(CT_FillOverlayEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(17, value);
    }

    public boolean isFillOverlay() {
      return this.type == 17;
    }

    public CT_FillOverlayEffectModel getFillOverlay() {
      return (CT_FillOverlayEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newGlow(CT_GlowEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(18, value);
    }

    public boolean isGlow() {
      return this.type == 18;
    }

    public CT_GlowEffectModel getGlow() {
      return (CT_GlowEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newGrayscl(CT_GrayscaleEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(19, value);
    }

    public boolean isGrayscl() {
      return this.type == 19;
    }

    public CT_GrayscaleEffectModel getGrayscl() {
      return (CT_GrayscaleEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newHsl(CT_HSLEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(20, value);
    }

    public boolean isHsl() {
      return this.type == 20;
    }

    public CT_HSLEffectModel getHsl() {
      return (CT_HSLEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newInnerShdw(CT_InnerShadowEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(21, value);
    }

    public boolean isInnerShdw() {
      return this.type == 21;
    }

    public CT_InnerShadowEffectModel getInnerShdw() {
      return (CT_InnerShadowEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newLum(CT_LuminanceEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(22, value);
    }

    public boolean isLum() {
      return this.type == 22;
    }

    public CT_LuminanceEffectModel getLum() {
      return (CT_LuminanceEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newOuterShdw(CT_OuterShadowEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(23, value);
    }

    public boolean isOuterShdw() {
      return this.type == 23;
    }

    public CT_OuterShadowEffectModel getOuterShdw() {
      return (CT_OuterShadowEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newPrstShdw(CT_PresetShadowEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(24, value);
    }

    public boolean isPrstShdw() {
      return this.type == 24;
    }

    public CT_PresetShadowEffectModel getPrstShdw() {
      return (CT_PresetShadowEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newReflection(CT_ReflectionEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(25, value);
    }

    public boolean isReflection() {
      return this.type == 25;
    }

    public CT_ReflectionEffectModel getReflection() {
      return (CT_ReflectionEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newRelOff(CT_RelativeOffsetEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(26, value);
    }

    public boolean isRelOff() {
      return this.type == 26;
    }

    public CT_RelativeOffsetEffectModel getRelOff() {
      return (CT_RelativeOffsetEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newSoftEdge(CT_SoftEdgesEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(27, value);
    }

    public boolean isSoftEdge() {
      return this.type == 27;
    }

    public CT_SoftEdgesEffectModel getSoftEdge() {
      return (CT_SoftEdgesEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newTint(CT_TintEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(28, value);
    }

    public boolean isTint() {
      return this.type == 28;
    }

    public CT_TintEffectModel getTint() {
      return (CT_TintEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newXfrm(CT_TransformEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(29, value);
    }

    public boolean isXfrm() {
      return this.type == 29;
    }

    public CT_TransformEffectModel getXfrm() {
      return (CT_TransformEffectModel) this.value;
    }
  }
}
