package model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import model.XMLSchema.tokenModel;

public class CT_EffectContainerModel {
  private final ST_EffectContainerTypeModel type;

  private final tokenModel name;

  private final List<contOrEffectOrAlphaBiLevelModel> contOrEffectOrAlphaBiLevel;

  public CT_EffectContainerModel(ST_EffectContainerTypeModel type, tokenModel name,
      List<contOrEffectOrAlphaBiLevelModel> contOrEffectOrAlphaBiLevel) {
    this.type = type;
    this.name = name;
    this.contOrEffectOrAlphaBiLevel = contOrEffectOrAlphaBiLevel;
  }

  public ST_EffectContainerTypeModel getType() {
    return this.type;
  }

  public tokenModel getName() {
    return this.name;
  }

  public List<contOrEffectOrAlphaBiLevelModel> getContOrEffectOrAlphaBiLevel() {
    return this.contOrEffectOrAlphaBiLevel;
  }

  public static class contOrEffectOrAlphaBiLevelModel {
    private final int type;

    private final Object value;

    public contOrEffectOrAlphaBiLevelModel() {
      this(-1, null);
    }

    private contOrEffectOrAlphaBiLevelModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static contOrEffectOrAlphaBiLevelModel newCont(CT_EffectContainerModel value) {
      return new contOrEffectOrAlphaBiLevelModel(0, value);
    }

    public boolean isCont() {
      return this.type == 0;
    }

    public CT_EffectContainerModel getCont() {
      return (CT_EffectContainerModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newEffect(CT_EffectReferenceModel value) {
      return new contOrEffectOrAlphaBiLevelModel(1, value);
    }

    public boolean isEffect() {
      return this.type == 1;
    }

    public CT_EffectReferenceModel getEffect() {
      return (CT_EffectReferenceModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newAlphaBiLevel(
        CT_AlphaBiLevelEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(2, value);
    }

    public boolean isAlphaBiLevel() {
      return this.type == 2;
    }

    public CT_AlphaBiLevelEffectModel getAlphaBiLevel() {
      return (CT_AlphaBiLevelEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newAlphaCeiling(
        CT_AlphaCeilingEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(3, value);
    }

    public boolean isAlphaCeiling() {
      return this.type == 3;
    }

    public CT_AlphaCeilingEffectModel getAlphaCeiling() {
      return (CT_AlphaCeilingEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newAlphaFloor(CT_AlphaFloorEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(4, value);
    }

    public boolean isAlphaFloor() {
      return this.type == 4;
    }

    public CT_AlphaFloorEffectModel getAlphaFloor() {
      return (CT_AlphaFloorEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newAlphaInv(CT_AlphaInverseEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(5, value);
    }

    public boolean isAlphaInv() {
      return this.type == 5;
    }

    public CT_AlphaInverseEffectModel getAlphaInv() {
      return (CT_AlphaInverseEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newAlphaMod(CT_AlphaModulateEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(6, value);
    }

    public boolean isAlphaMod() {
      return this.type == 6;
    }

    public CT_AlphaModulateEffectModel getAlphaMod() {
      return (CT_AlphaModulateEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newAlphaModFix(
        CT_AlphaModulateFixedEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(7, value);
    }

    public boolean isAlphaModFix() {
      return this.type == 7;
    }

    public CT_AlphaModulateFixedEffectModel getAlphaModFix() {
      return (CT_AlphaModulateFixedEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newAlphaOutset(CT_AlphaOutsetEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(8, value);
    }

    public boolean isAlphaOutset() {
      return this.type == 8;
    }

    public CT_AlphaOutsetEffectModel getAlphaOutset() {
      return (CT_AlphaOutsetEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newAlphaRepl(CT_AlphaReplaceEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(9, value);
    }

    public boolean isAlphaRepl() {
      return this.type == 9;
    }

    public CT_AlphaReplaceEffectModel getAlphaRepl() {
      return (CT_AlphaReplaceEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newBiLevel(CT_BiLevelEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(10, value);
    }

    public boolean isBiLevel() {
      return this.type == 10;
    }

    public CT_BiLevelEffectModel getBiLevel() {
      return (CT_BiLevelEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newBlend(CT_BlendEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(11, value);
    }

    public boolean isBlend() {
      return this.type == 11;
    }

    public CT_BlendEffectModel getBlend() {
      return (CT_BlendEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newBlur(CT_BlurEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(12, value);
    }

    public boolean isBlur() {
      return this.type == 12;
    }

    public CT_BlurEffectModel getBlur() {
      return (CT_BlurEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newClrChange(CT_ColorChangeEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(13, value);
    }

    public boolean isClrChange() {
      return this.type == 13;
    }

    public CT_ColorChangeEffectModel getClrChange() {
      return (CT_ColorChangeEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newClrRepl(CT_ColorReplaceEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(14, value);
    }

    public boolean isClrRepl() {
      return this.type == 14;
    }

    public CT_ColorReplaceEffectModel getClrRepl() {
      return (CT_ColorReplaceEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newDuotone(CT_DuotoneEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(15, value);
    }

    public boolean isDuotone() {
      return this.type == 15;
    }

    public CT_DuotoneEffectModel getDuotone() {
      return (CT_DuotoneEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newFill(CT_FillEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(16, value);
    }

    public boolean isFill() {
      return this.type == 16;
    }

    public CT_FillEffectModel getFill() {
      return (CT_FillEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newFillOverlay(CT_FillOverlayEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(17, value);
    }

    public boolean isFillOverlay() {
      return this.type == 17;
    }

    public CT_FillOverlayEffectModel getFillOverlay() {
      return (CT_FillOverlayEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newGlow(CT_GlowEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(18, value);
    }

    public boolean isGlow() {
      return this.type == 18;
    }

    public CT_GlowEffectModel getGlow() {
      return (CT_GlowEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newGrayscl(CT_GrayscaleEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(19, value);
    }

    public boolean isGrayscl() {
      return this.type == 19;
    }

    public CT_GrayscaleEffectModel getGrayscl() {
      return (CT_GrayscaleEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newHsl(CT_HSLEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(20, value);
    }

    public boolean isHsl() {
      return this.type == 20;
    }

    public CT_HSLEffectModel getHsl() {
      return (CT_HSLEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newInnerShdw(CT_InnerShadowEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(21, value);
    }

    public boolean isInnerShdw() {
      return this.type == 21;
    }

    public CT_InnerShadowEffectModel getInnerShdw() {
      return (CT_InnerShadowEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newLum(CT_LuminanceEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(22, value);
    }

    public boolean isLum() {
      return this.type == 22;
    }

    public CT_LuminanceEffectModel getLum() {
      return (CT_LuminanceEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newOuterShdw(CT_OuterShadowEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(23, value);
    }

    public boolean isOuterShdw() {
      return this.type == 23;
    }

    public CT_OuterShadowEffectModel getOuterShdw() {
      return (CT_OuterShadowEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newPrstShdw(CT_PresetShadowEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(24, value);
    }

    public boolean isPrstShdw() {
      return this.type == 24;
    }

    public CT_PresetShadowEffectModel getPrstShdw() {
      return (CT_PresetShadowEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newReflection(CT_ReflectionEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(25, value);
    }

    public boolean isReflection() {
      return this.type == 25;
    }

    public CT_ReflectionEffectModel getReflection() {
      return (CT_ReflectionEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newRelOff(CT_RelativeOffsetEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(26, value);
    }

    public boolean isRelOff() {
      return this.type == 26;
    }

    public CT_RelativeOffsetEffectModel getRelOff() {
      return (CT_RelativeOffsetEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newSoftEdge(CT_SoftEdgesEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(27, value);
    }

    public boolean isSoftEdge() {
      return this.type == 27;
    }

    public CT_SoftEdgesEffectModel getSoftEdge() {
      return (CT_SoftEdgesEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newTint(CT_TintEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(28, value);
    }

    public boolean isTint() {
      return this.type == 28;
    }

    public CT_TintEffectModel getTint() {
      return (CT_TintEffectModel) this.value;
    }

    public static contOrEffectOrAlphaBiLevelModel newXfrm(CT_TransformEffectModel value) {
      return new contOrEffectOrAlphaBiLevelModel(29, value);
    }

    public boolean isXfrm() {
      return this.type == 29;
    }

    public CT_TransformEffectModel getXfrm() {
      return (CT_TransformEffectModel) this.value;
    }
  }
}
