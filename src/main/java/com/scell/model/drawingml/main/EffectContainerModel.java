package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.TokenValueModel;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class EffectContainerModel {
  private final EffectContainerTypeValueModel type;

  private final TokenValueModel name;

  private final List<EffectModel> egEffect;

  public EffectContainerModel(EffectContainerTypeValueModel type, TokenValueModel name,
      List<EffectModel> egEffect) {
    this.type = type;
    this.name = name;
    this.egEffect = egEffect;
  }

  public EffectContainerTypeValueModel getType() {
    return this.type;
  }

  public TokenValueModel getName() {
    return this.name;
  }

  public List<EffectModel> getEGEffect() {
    return this.egEffect;
  }

  public static class EffectModel {
    private final int type;

    private final Object value;

    public EffectModel() {
      this(-1, null);
    }

    private EffectModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EffectModel newCont(EffectContainerModel value) {
      return new EffectModel(0, value);
    }

    public boolean isCont() {
      return this.type == 0;
    }

    public EffectContainerModel getCont() {
      return (EffectContainerModel) this.value;
    }

    public static EffectModel newEffect(EffectReferenceModel value) {
      return new EffectModel(1, value);
    }

    public boolean isEffect() {
      return this.type == 1;
    }

    public EffectReferenceModel getEffect() {
      return (EffectReferenceModel) this.value;
    }

    public static EffectModel newAlphaBiLevel(AlphaBiLevelEffectModel value) {
      return new EffectModel(2, value);
    }

    public boolean isAlphaBiLevel() {
      return this.type == 2;
    }

    public AlphaBiLevelEffectModel getAlphaBiLevel() {
      return (AlphaBiLevelEffectModel) this.value;
    }

    public static EffectModel newAlphaCeiling(AlphaCeilingEffectModel value) {
      return new EffectModel(3, value);
    }

    public boolean isAlphaCeiling() {
      return this.type == 3;
    }

    public AlphaCeilingEffectModel getAlphaCeiling() {
      return (AlphaCeilingEffectModel) this.value;
    }

    public static EffectModel newAlphaFloor(AlphaFloorEffectModel value) {
      return new EffectModel(4, value);
    }

    public boolean isAlphaFloor() {
      return this.type == 4;
    }

    public AlphaFloorEffectModel getAlphaFloor() {
      return (AlphaFloorEffectModel) this.value;
    }

    public static EffectModel newAlphaInv(AlphaInverseEffectModel value) {
      return new EffectModel(5, value);
    }

    public boolean isAlphaInv() {
      return this.type == 5;
    }

    public AlphaInverseEffectModel getAlphaInv() {
      return (AlphaInverseEffectModel) this.value;
    }

    public static EffectModel newAlphaMod(AlphaModulateEffectModel value) {
      return new EffectModel(6, value);
    }

    public boolean isAlphaMod() {
      return this.type == 6;
    }

    public AlphaModulateEffectModel getAlphaMod() {
      return (AlphaModulateEffectModel) this.value;
    }

    public static EffectModel newAlphaModFix(AlphaModulateFixedEffectModel value) {
      return new EffectModel(7, value);
    }

    public boolean isAlphaModFix() {
      return this.type == 7;
    }

    public AlphaModulateFixedEffectModel getAlphaModFix() {
      return (AlphaModulateFixedEffectModel) this.value;
    }

    public static EffectModel newAlphaOutset(AlphaOutsetEffectModel value) {
      return new EffectModel(8, value);
    }

    public boolean isAlphaOutset() {
      return this.type == 8;
    }

    public AlphaOutsetEffectModel getAlphaOutset() {
      return (AlphaOutsetEffectModel) this.value;
    }

    public static EffectModel newAlphaRepl(AlphaReplaceEffectModel value) {
      return new EffectModel(9, value);
    }

    public boolean isAlphaRepl() {
      return this.type == 9;
    }

    public AlphaReplaceEffectModel getAlphaRepl() {
      return (AlphaReplaceEffectModel) this.value;
    }

    public static EffectModel newBiLevel(BiLevelEffectModel value) {
      return new EffectModel(10, value);
    }

    public boolean isBiLevel() {
      return this.type == 10;
    }

    public BiLevelEffectModel getBiLevel() {
      return (BiLevelEffectModel) this.value;
    }

    public static EffectModel newBlend(BlendEffectModel value) {
      return new EffectModel(11, value);
    }

    public boolean isBlend() {
      return this.type == 11;
    }

    public BlendEffectModel getBlend() {
      return (BlendEffectModel) this.value;
    }

    public static EffectModel newBlur(BlurEffectModel value) {
      return new EffectModel(12, value);
    }

    public boolean isBlur() {
      return this.type == 12;
    }

    public BlurEffectModel getBlur() {
      return (BlurEffectModel) this.value;
    }

    public static EffectModel newClrChange(ColorChangeEffectModel value) {
      return new EffectModel(13, value);
    }

    public boolean isClrChange() {
      return this.type == 13;
    }

    public ColorChangeEffectModel getClrChange() {
      return (ColorChangeEffectModel) this.value;
    }

    public static EffectModel newClrRepl(ColorReplaceEffectModel value) {
      return new EffectModel(14, value);
    }

    public boolean isClrRepl() {
      return this.type == 14;
    }

    public ColorReplaceEffectModel getClrRepl() {
      return (ColorReplaceEffectModel) this.value;
    }

    public static EffectModel newDuotone(DuotoneEffectModel value) {
      return new EffectModel(15, value);
    }

    public boolean isDuotone() {
      return this.type == 15;
    }

    public DuotoneEffectModel getDuotone() {
      return (DuotoneEffectModel) this.value;
    }

    public static EffectModel newFill(FillEffectModel value) {
      return new EffectModel(16, value);
    }

    public boolean isFill() {
      return this.type == 16;
    }

    public FillEffectModel getFill() {
      return (FillEffectModel) this.value;
    }

    public static EffectModel newFillOverlay(FillOverlayEffectModel value) {
      return new EffectModel(17, value);
    }

    public boolean isFillOverlay() {
      return this.type == 17;
    }

    public FillOverlayEffectModel getFillOverlay() {
      return (FillOverlayEffectModel) this.value;
    }

    public static EffectModel newGlow(GlowEffectModel value) {
      return new EffectModel(18, value);
    }

    public boolean isGlow() {
      return this.type == 18;
    }

    public GlowEffectModel getGlow() {
      return (GlowEffectModel) this.value;
    }

    public static EffectModel newGrayscl(GrayscaleEffectModel value) {
      return new EffectModel(19, value);
    }

    public boolean isGrayscl() {
      return this.type == 19;
    }

    public GrayscaleEffectModel getGrayscl() {
      return (GrayscaleEffectModel) this.value;
    }

    public static EffectModel newHsl(HSLEffectModel value) {
      return new EffectModel(20, value);
    }

    public boolean isHsl() {
      return this.type == 20;
    }

    public HSLEffectModel getHsl() {
      return (HSLEffectModel) this.value;
    }

    public static EffectModel newInnerShdw(InnerShadowEffectModel value) {
      return new EffectModel(21, value);
    }

    public boolean isInnerShdw() {
      return this.type == 21;
    }

    public InnerShadowEffectModel getInnerShdw() {
      return (InnerShadowEffectModel) this.value;
    }

    public static EffectModel newLum(LuminanceEffectModel value) {
      return new EffectModel(22, value);
    }

    public boolean isLum() {
      return this.type == 22;
    }

    public LuminanceEffectModel getLum() {
      return (LuminanceEffectModel) this.value;
    }

    public static EffectModel newOuterShdw(OuterShadowEffectModel value) {
      return new EffectModel(23, value);
    }

    public boolean isOuterShdw() {
      return this.type == 23;
    }

    public OuterShadowEffectModel getOuterShdw() {
      return (OuterShadowEffectModel) this.value;
    }

    public static EffectModel newPrstShdw(PresetShadowEffectModel value) {
      return new EffectModel(24, value);
    }

    public boolean isPrstShdw() {
      return this.type == 24;
    }

    public PresetShadowEffectModel getPrstShdw() {
      return (PresetShadowEffectModel) this.value;
    }

    public static EffectModel newReflection(ReflectionEffectModel value) {
      return new EffectModel(25, value);
    }

    public boolean isReflection() {
      return this.type == 25;
    }

    public ReflectionEffectModel getReflection() {
      return (ReflectionEffectModel) this.value;
    }

    public static EffectModel newRelOff(RelativeOffsetEffectModel value) {
      return new EffectModel(26, value);
    }

    public boolean isRelOff() {
      return this.type == 26;
    }

    public RelativeOffsetEffectModel getRelOff() {
      return (RelativeOffsetEffectModel) this.value;
    }

    public static EffectModel newSoftEdge(SoftEdgesEffectModel value) {
      return new EffectModel(27, value);
    }

    public boolean isSoftEdge() {
      return this.type == 27;
    }

    public SoftEdgesEffectModel getSoftEdge() {
      return (SoftEdgesEffectModel) this.value;
    }

    public static EffectModel newTint(TintEffectModel value) {
      return new EffectModel(28, value);
    }

    public boolean isTint() {
      return this.type == 28;
    }

    public TintEffectModel getTint() {
      return (TintEffectModel) this.value;
    }

    public static EffectModel newXfrm(TransformEffectModel value) {
      return new EffectModel(29, value);
    }

    public boolean isXfrm() {
      return this.type == 29;
    }

    public TransformEffectModel getXfrm() {
      return (TransformEffectModel) this.value;
    }
  }
}
