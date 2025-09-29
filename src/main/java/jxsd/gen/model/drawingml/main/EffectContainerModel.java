package jxsd.gen.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import jxsd.gen.builder.drawingml.main.EffectContainerBuilder;

/**
 * This is a generated sequence class.
 */
public class EffectContainerModel {
  private final EffectContainerTypeValueModel type;

  private final String name;

  private final List<EG_Effect> egEffect;

  public EffectContainerModel(EffectContainerTypeValueModel type, String name,
      List<EG_Effect> egEffect) {
    this.type = type;
    this.name = name;
    this.egEffect = egEffect;
  }

  public EffectContainerBuilder builder() {
    return new EffectContainerBuilder().from(this);
  }

  public EffectContainerTypeValueModel getType() {
    return this.type;
  }

  public String getName() {
    return this.name;
  }

  public List<EG_Effect> getEGEffect() {
    return this.egEffect;
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_Effect {
    private final int type;

    private final Object value;

    public EG_Effect() {
      this(-1, null);
    }

    private EG_Effect(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public EffectContainerBuilder.EG_Effect builder() {
      return new EffectContainerBuilder.EG_Effect().from(this);
    }

    public static EG_Effect newCont(EffectContainerModel value) {
      return new EG_Effect(0, value);
    }

    public boolean isCont() {
      return this.type == 0;
    }

    public EffectContainerModel getCont() {
      return (EffectContainerModel) this.value;
    }

    public static EG_Effect newEffect(EffectReferenceModel value) {
      return new EG_Effect(1, value);
    }

    public boolean isEffect() {
      return this.type == 1;
    }

    public EffectReferenceModel getEffect() {
      return (EffectReferenceModel) this.value;
    }

    public static EG_Effect newAlphaBiLevel(AlphaBiLevelEffectModel value) {
      return new EG_Effect(2, value);
    }

    public boolean isAlphaBiLevel() {
      return this.type == 2;
    }

    public AlphaBiLevelEffectModel getAlphaBiLevel() {
      return (AlphaBiLevelEffectModel) this.value;
    }

    public static EG_Effect newAlphaCeiling(AlphaCeilingEffectModel value) {
      return new EG_Effect(3, value);
    }

    public boolean isAlphaCeiling() {
      return this.type == 3;
    }

    public AlphaCeilingEffectModel getAlphaCeiling() {
      return (AlphaCeilingEffectModel) this.value;
    }

    public static EG_Effect newAlphaFloor(AlphaFloorEffectModel value) {
      return new EG_Effect(4, value);
    }

    public boolean isAlphaFloor() {
      return this.type == 4;
    }

    public AlphaFloorEffectModel getAlphaFloor() {
      return (AlphaFloorEffectModel) this.value;
    }

    public static EG_Effect newAlphaInv(AlphaInverseEffectModel value) {
      return new EG_Effect(5, value);
    }

    public boolean isAlphaInv() {
      return this.type == 5;
    }

    public AlphaInverseEffectModel getAlphaInv() {
      return (AlphaInverseEffectModel) this.value;
    }

    public static EG_Effect newAlphaMod(AlphaModulateEffectModel value) {
      return new EG_Effect(6, value);
    }

    public boolean isAlphaMod() {
      return this.type == 6;
    }

    public AlphaModulateEffectModel getAlphaMod() {
      return (AlphaModulateEffectModel) this.value;
    }

    public static EG_Effect newAlphaModFix(AlphaModulateFixedEffectModel value) {
      return new EG_Effect(7, value);
    }

    public boolean isAlphaModFix() {
      return this.type == 7;
    }

    public AlphaModulateFixedEffectModel getAlphaModFix() {
      return (AlphaModulateFixedEffectModel) this.value;
    }

    public static EG_Effect newAlphaOutset(AlphaOutsetEffectModel value) {
      return new EG_Effect(8, value);
    }

    public boolean isAlphaOutset() {
      return this.type == 8;
    }

    public AlphaOutsetEffectModel getAlphaOutset() {
      return (AlphaOutsetEffectModel) this.value;
    }

    public static EG_Effect newAlphaRepl(AlphaReplaceEffectModel value) {
      return new EG_Effect(9, value);
    }

    public boolean isAlphaRepl() {
      return this.type == 9;
    }

    public AlphaReplaceEffectModel getAlphaRepl() {
      return (AlphaReplaceEffectModel) this.value;
    }

    public static EG_Effect newBiLevel(BiLevelEffectModel value) {
      return new EG_Effect(10, value);
    }

    public boolean isBiLevel() {
      return this.type == 10;
    }

    public BiLevelEffectModel getBiLevel() {
      return (BiLevelEffectModel) this.value;
    }

    public static EG_Effect newBlend(BlendEffectModel value) {
      return new EG_Effect(11, value);
    }

    public boolean isBlend() {
      return this.type == 11;
    }

    public BlendEffectModel getBlend() {
      return (BlendEffectModel) this.value;
    }

    public static EG_Effect newBlur(BlurEffectModel value) {
      return new EG_Effect(12, value);
    }

    public boolean isBlur() {
      return this.type == 12;
    }

    public BlurEffectModel getBlur() {
      return (BlurEffectModel) this.value;
    }

    public static EG_Effect newClrChange(ColorChangeEffectModel value) {
      return new EG_Effect(13, value);
    }

    public boolean isClrChange() {
      return this.type == 13;
    }

    public ColorChangeEffectModel getClrChange() {
      return (ColorChangeEffectModel) this.value;
    }

    public static EG_Effect newClrRepl(ColorReplaceEffectModel value) {
      return new EG_Effect(14, value);
    }

    public boolean isClrRepl() {
      return this.type == 14;
    }

    public ColorReplaceEffectModel getClrRepl() {
      return (ColorReplaceEffectModel) this.value;
    }

    public static EG_Effect newDuotone(DuotoneEffectModel value) {
      return new EG_Effect(15, value);
    }

    public boolean isDuotone() {
      return this.type == 15;
    }

    public DuotoneEffectModel getDuotone() {
      return (DuotoneEffectModel) this.value;
    }

    public static EG_Effect newFill(FillEffectModel value) {
      return new EG_Effect(16, value);
    }

    public boolean isFill() {
      return this.type == 16;
    }

    public FillEffectModel getFill() {
      return (FillEffectModel) this.value;
    }

    public static EG_Effect newFillOverlay(FillOverlayEffectModel value) {
      return new EG_Effect(17, value);
    }

    public boolean isFillOverlay() {
      return this.type == 17;
    }

    public FillOverlayEffectModel getFillOverlay() {
      return (FillOverlayEffectModel) this.value;
    }

    public static EG_Effect newGlow(GlowEffectModel value) {
      return new EG_Effect(18, value);
    }

    public boolean isGlow() {
      return this.type == 18;
    }

    public GlowEffectModel getGlow() {
      return (GlowEffectModel) this.value;
    }

    public static EG_Effect newGrayscl(GrayscaleEffectModel value) {
      return new EG_Effect(19, value);
    }

    public boolean isGrayscl() {
      return this.type == 19;
    }

    public GrayscaleEffectModel getGrayscl() {
      return (GrayscaleEffectModel) this.value;
    }

    public static EG_Effect newHsl(HSLEffectModel value) {
      return new EG_Effect(20, value);
    }

    public boolean isHsl() {
      return this.type == 20;
    }

    public HSLEffectModel getHsl() {
      return (HSLEffectModel) this.value;
    }

    public static EG_Effect newInnerShdw(InnerShadowEffectModel value) {
      return new EG_Effect(21, value);
    }

    public boolean isInnerShdw() {
      return this.type == 21;
    }

    public InnerShadowEffectModel getInnerShdw() {
      return (InnerShadowEffectModel) this.value;
    }

    public static EG_Effect newLum(LuminanceEffectModel value) {
      return new EG_Effect(22, value);
    }

    public boolean isLum() {
      return this.type == 22;
    }

    public LuminanceEffectModel getLum() {
      return (LuminanceEffectModel) this.value;
    }

    public static EG_Effect newOuterShdw(OuterShadowEffectModel value) {
      return new EG_Effect(23, value);
    }

    public boolean isOuterShdw() {
      return this.type == 23;
    }

    public OuterShadowEffectModel getOuterShdw() {
      return (OuterShadowEffectModel) this.value;
    }

    public static EG_Effect newPrstShdw(PresetShadowEffectModel value) {
      return new EG_Effect(24, value);
    }

    public boolean isPrstShdw() {
      return this.type == 24;
    }

    public PresetShadowEffectModel getPrstShdw() {
      return (PresetShadowEffectModel) this.value;
    }

    public static EG_Effect newReflection(ReflectionEffectModel value) {
      return new EG_Effect(25, value);
    }

    public boolean isReflection() {
      return this.type == 25;
    }

    public ReflectionEffectModel getReflection() {
      return (ReflectionEffectModel) this.value;
    }

    public static EG_Effect newRelOff(RelativeOffsetEffectModel value) {
      return new EG_Effect(26, value);
    }

    public boolean isRelOff() {
      return this.type == 26;
    }

    public RelativeOffsetEffectModel getRelOff() {
      return (RelativeOffsetEffectModel) this.value;
    }

    public static EG_Effect newSoftEdge(SoftEdgesEffectModel value) {
      return new EG_Effect(27, value);
    }

    public boolean isSoftEdge() {
      return this.type == 27;
    }

    public SoftEdgesEffectModel getSoftEdge() {
      return (SoftEdgesEffectModel) this.value;
    }

    public static EG_Effect newTint(TintEffectModel value) {
      return new EG_Effect(28, value);
    }

    public boolean isTint() {
      return this.type == 28;
    }

    public TintEffectModel getTint() {
      return (TintEffectModel) this.value;
    }

    public static EG_Effect newXfrm(TransformEffectModel value) {
      return new EG_Effect(29, value);
    }

    public boolean isXfrm() {
      return this.type == 29;
    }

    public TransformEffectModel getXfrm() {
      return (TransformEffectModel) this.value;
    }
  }
}
