package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import test.XMLSchema.TokenModel;

public class CTEffectContainerModel {
  private final STEffectContainerTypeModel type;

  private final TokenModel name;

  private final ContOrEffectOrAlphaBiLevelModel contOrEffectOrAlphaBiLevel;

  public CTEffectContainerModel(STEffectContainerTypeModel type, TokenModel name,
      ContOrEffectOrAlphaBiLevelModel contOrEffectOrAlphaBiLevel) {
    this.type = type;
    this.name = name;
    this.contOrEffectOrAlphaBiLevel = contOrEffectOrAlphaBiLevel;
  }

  public STEffectContainerTypeModel getType() {
    return this.type;
  }

  public TokenModel getName() {
    return this.name;
  }

  public ContOrEffectOrAlphaBiLevelModel getContOrEffectOrAlphaBiLevel() {
    return this.contOrEffectOrAlphaBiLevel;
  }

  public static class ContOrEffectOrAlphaBiLevelModel {
    private final Integer type;

    private final Object value;

    public ContOrEffectOrAlphaBiLevelModel() {
      this(-1, null);
    }

    private ContOrEffectOrAlphaBiLevelModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newCont(CTEffectContainerModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(0, value);
    }

    public Boolean isCont() {
      return this.type == 0;
    }

    public CTEffectContainerModel getCont() {
      return (CTEffectContainerModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newEffect(CTEffectReferenceModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(1, value);
    }

    public Boolean isEffect() {
      return this.type == 1;
    }

    public CTEffectReferenceModel getEffect() {
      return (CTEffectReferenceModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newAlphaBiLevel(CTAlphaBiLevelEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(2, value);
    }

    public Boolean isAlphaBiLevel() {
      return this.type == 2;
    }

    public CTAlphaBiLevelEffectModel getAlphaBiLevel() {
      return (CTAlphaBiLevelEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newAlphaCeiling(CTAlphaCeilingEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(3, value);
    }

    public Boolean isAlphaCeiling() {
      return this.type == 3;
    }

    public CTAlphaCeilingEffectModel getAlphaCeiling() {
      return (CTAlphaCeilingEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newAlphaFloor(CTAlphaFloorEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(4, value);
    }

    public Boolean isAlphaFloor() {
      return this.type == 4;
    }

    public CTAlphaFloorEffectModel getAlphaFloor() {
      return (CTAlphaFloorEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newAlphaInv(CTAlphaInverseEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(5, value);
    }

    public Boolean isAlphaInv() {
      return this.type == 5;
    }

    public CTAlphaInverseEffectModel getAlphaInv() {
      return (CTAlphaInverseEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newAlphaMod(CTAlphaModulateEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(6, value);
    }

    public Boolean isAlphaMod() {
      return this.type == 6;
    }

    public CTAlphaModulateEffectModel getAlphaMod() {
      return (CTAlphaModulateEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newAlphaModFix(
        CTAlphaModulateFixedEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(7, value);
    }

    public Boolean isAlphaModFix() {
      return this.type == 7;
    }

    public CTAlphaModulateFixedEffectModel getAlphaModFix() {
      return (CTAlphaModulateFixedEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newAlphaOutset(CTAlphaOutsetEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(8, value);
    }

    public Boolean isAlphaOutset() {
      return this.type == 8;
    }

    public CTAlphaOutsetEffectModel getAlphaOutset() {
      return (CTAlphaOutsetEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newAlphaRepl(CTAlphaReplaceEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(9, value);
    }

    public Boolean isAlphaRepl() {
      return this.type == 9;
    }

    public CTAlphaReplaceEffectModel getAlphaRepl() {
      return (CTAlphaReplaceEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newBiLevel(CTBiLevelEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(10, value);
    }

    public Boolean isBiLevel() {
      return this.type == 10;
    }

    public CTBiLevelEffectModel getBiLevel() {
      return (CTBiLevelEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newBlend(CTBlendEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(11, value);
    }

    public Boolean isBlend() {
      return this.type == 11;
    }

    public CTBlendEffectModel getBlend() {
      return (CTBlendEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newBlur(CTBlurEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(12, value);
    }

    public Boolean isBlur() {
      return this.type == 12;
    }

    public CTBlurEffectModel getBlur() {
      return (CTBlurEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newClrChange(CTColorChangeEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(13, value);
    }

    public Boolean isClrChange() {
      return this.type == 13;
    }

    public CTColorChangeEffectModel getClrChange() {
      return (CTColorChangeEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newClrRepl(CTColorReplaceEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(14, value);
    }

    public Boolean isClrRepl() {
      return this.type == 14;
    }

    public CTColorReplaceEffectModel getClrRepl() {
      return (CTColorReplaceEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newDuotone(CTDuotoneEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(15, value);
    }

    public Boolean isDuotone() {
      return this.type == 15;
    }

    public CTDuotoneEffectModel getDuotone() {
      return (CTDuotoneEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newFill(CTFillEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(16, value);
    }

    public Boolean isFill() {
      return this.type == 16;
    }

    public CTFillEffectModel getFill() {
      return (CTFillEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newFillOverlay(CTFillOverlayEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(17, value);
    }

    public Boolean isFillOverlay() {
      return this.type == 17;
    }

    public CTFillOverlayEffectModel getFillOverlay() {
      return (CTFillOverlayEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newGlow(CTGlowEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(18, value);
    }

    public Boolean isGlow() {
      return this.type == 18;
    }

    public CTGlowEffectModel getGlow() {
      return (CTGlowEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newGrayscl(CTGrayscaleEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(19, value);
    }

    public Boolean isGrayscl() {
      return this.type == 19;
    }

    public CTGrayscaleEffectModel getGrayscl() {
      return (CTGrayscaleEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newHsl(CTHSLEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(20, value);
    }

    public Boolean isHsl() {
      return this.type == 20;
    }

    public CTHSLEffectModel getHsl() {
      return (CTHSLEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newInnerShdw(CTInnerShadowEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(21, value);
    }

    public Boolean isInnerShdw() {
      return this.type == 21;
    }

    public CTInnerShadowEffectModel getInnerShdw() {
      return (CTInnerShadowEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newLum(CTLuminanceEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(22, value);
    }

    public Boolean isLum() {
      return this.type == 22;
    }

    public CTLuminanceEffectModel getLum() {
      return (CTLuminanceEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newOuterShdw(CTOuterShadowEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(23, value);
    }

    public Boolean isOuterShdw() {
      return this.type == 23;
    }

    public CTOuterShadowEffectModel getOuterShdw() {
      return (CTOuterShadowEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newPrstShdw(CTPresetShadowEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(24, value);
    }

    public Boolean isPrstShdw() {
      return this.type == 24;
    }

    public CTPresetShadowEffectModel getPrstShdw() {
      return (CTPresetShadowEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newReflection(CTReflectionEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(25, value);
    }

    public Boolean isReflection() {
      return this.type == 25;
    }

    public CTReflectionEffectModel getReflection() {
      return (CTReflectionEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newRelOff(CTRelativeOffsetEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(26, value);
    }

    public Boolean isRelOff() {
      return this.type == 26;
    }

    public CTRelativeOffsetEffectModel getRelOff() {
      return (CTRelativeOffsetEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newSoftEdge(CTSoftEdgesEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(27, value);
    }

    public Boolean isSoftEdge() {
      return this.type == 27;
    }

    public CTSoftEdgesEffectModel getSoftEdge() {
      return (CTSoftEdgesEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newTint(CTTintEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(28, value);
    }

    public Boolean isTint() {
      return this.type == 28;
    }

    public CTTintEffectModel getTint() {
      return (CTTintEffectModel) this.value;
    }

    public static ContOrEffectOrAlphaBiLevelModel newXfrm(CTTransformEffectModel value) {
      return new ContOrEffectOrAlphaBiLevelModel(29, value);
    }

    public Boolean isXfrm() {
      return this.type == 29;
    }

    public CTTransformEffectModel getXfrm() {
      return (CTTransformEffectModel) this.value;
    }
  }
}
