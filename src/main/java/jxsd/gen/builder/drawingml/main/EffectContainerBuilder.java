package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import java.util.List;
import jxsd.gen.model.drawingml.main.AlphaBiLevelEffectModel;
import jxsd.gen.model.drawingml.main.AlphaCeilingEffectModel;
import jxsd.gen.model.drawingml.main.AlphaFloorEffectModel;
import jxsd.gen.model.drawingml.main.AlphaInverseEffectModel;
import jxsd.gen.model.drawingml.main.AlphaModulateEffectModel;
import jxsd.gen.model.drawingml.main.AlphaModulateFixedEffectModel;
import jxsd.gen.model.drawingml.main.AlphaOutsetEffectModel;
import jxsd.gen.model.drawingml.main.AlphaReplaceEffectModel;
import jxsd.gen.model.drawingml.main.BiLevelEffectModel;
import jxsd.gen.model.drawingml.main.BlendEffectModel;
import jxsd.gen.model.drawingml.main.BlurEffectModel;
import jxsd.gen.model.drawingml.main.ColorChangeEffectModel;
import jxsd.gen.model.drawingml.main.ColorReplaceEffectModel;
import jxsd.gen.model.drawingml.main.DuotoneEffectModel;
import jxsd.gen.model.drawingml.main.EffectContainerModel;
import jxsd.gen.model.drawingml.main.EffectContainerTypeValueModel;
import jxsd.gen.model.drawingml.main.EffectReferenceModel;
import jxsd.gen.model.drawingml.main.FillEffectModel;
import jxsd.gen.model.drawingml.main.FillOverlayEffectModel;
import jxsd.gen.model.drawingml.main.GlowEffectModel;
import jxsd.gen.model.drawingml.main.GrayscaleEffectModel;
import jxsd.gen.model.drawingml.main.HSLEffectModel;
import jxsd.gen.model.drawingml.main.InnerShadowEffectModel;
import jxsd.gen.model.drawingml.main.LuminanceEffectModel;
import jxsd.gen.model.drawingml.main.OuterShadowEffectModel;
import jxsd.gen.model.drawingml.main.PresetShadowEffectModel;
import jxsd.gen.model.drawingml.main.ReflectionEffectModel;
import jxsd.gen.model.drawingml.main.RelativeOffsetEffectModel;
import jxsd.gen.model.drawingml.main.SoftEdgesEffectModel;
import jxsd.gen.model.drawingml.main.TintEffectModel;
import jxsd.gen.model.drawingml.main.TransformEffectModel;

/**
 * This is a generated sequence class.
 */
public class EffectContainerBuilder {
  private EffectContainerTypeValueModel type;

  private String name;

  private List<EffectContainerModel.EG_Effect> egEffect;

  public EffectContainerBuilder() {
  }

  public EffectContainerBuilder setType(EffectContainerTypeValueModel type) {
    this.type = type;
    return this;
  }

  public EffectContainerBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public EffectContainerBuilder setEGEffect(List<EffectContainerModel.EG_Effect> egEffect) {
    this.egEffect = egEffect;
    return this;
  }

  public EffectContainerBuilder from(EffectContainerModel value) {
    this.type = value.getType();
    this.name = value.getName();
    this.egEffect = value.getEGEffect();
    return this;
  }

  public EffectContainerModel build() {
    return new EffectContainerModel(this.type, this.name, this.egEffect);
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_Effect {
    private int type;

    private Object value;

    public EG_Effect() {
      this.type = -1;
      this.value = null;
    }

    public EG_Effect setCont(EffectContainerModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_Effect setEffect(EffectReferenceModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_Effect setAlphaBiLevel(AlphaBiLevelEffectModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public EG_Effect setAlphaCeiling(AlphaCeilingEffectModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public EG_Effect setAlphaFloor(AlphaFloorEffectModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public EG_Effect setAlphaInv(AlphaInverseEffectModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public EG_Effect setAlphaMod(AlphaModulateEffectModel value) {
      this.type = 6;
      this.value = value;
      return this;
    }

    public EG_Effect setAlphaModFix(AlphaModulateFixedEffectModel value) {
      this.type = 7;
      this.value = value;
      return this;
    }

    public EG_Effect setAlphaOutset(AlphaOutsetEffectModel value) {
      this.type = 8;
      this.value = value;
      return this;
    }

    public EG_Effect setAlphaRepl(AlphaReplaceEffectModel value) {
      this.type = 9;
      this.value = value;
      return this;
    }

    public EG_Effect setBiLevel(BiLevelEffectModel value) {
      this.type = 10;
      this.value = value;
      return this;
    }

    public EG_Effect setBlend(BlendEffectModel value) {
      this.type = 11;
      this.value = value;
      return this;
    }

    public EG_Effect setBlur(BlurEffectModel value) {
      this.type = 12;
      this.value = value;
      return this;
    }

    public EG_Effect setClrChange(ColorChangeEffectModel value) {
      this.type = 13;
      this.value = value;
      return this;
    }

    public EG_Effect setClrRepl(ColorReplaceEffectModel value) {
      this.type = 14;
      this.value = value;
      return this;
    }

    public EG_Effect setDuotone(DuotoneEffectModel value) {
      this.type = 15;
      this.value = value;
      return this;
    }

    public EG_Effect setFill(FillEffectModel value) {
      this.type = 16;
      this.value = value;
      return this;
    }

    public EG_Effect setFillOverlay(FillOverlayEffectModel value) {
      this.type = 17;
      this.value = value;
      return this;
    }

    public EG_Effect setGlow(GlowEffectModel value) {
      this.type = 18;
      this.value = value;
      return this;
    }

    public EG_Effect setGrayscl(GrayscaleEffectModel value) {
      this.type = 19;
      this.value = value;
      return this;
    }

    public EG_Effect setHsl(HSLEffectModel value) {
      this.type = 20;
      this.value = value;
      return this;
    }

    public EG_Effect setInnerShdw(InnerShadowEffectModel value) {
      this.type = 21;
      this.value = value;
      return this;
    }

    public EG_Effect setLum(LuminanceEffectModel value) {
      this.type = 22;
      this.value = value;
      return this;
    }

    public EG_Effect setOuterShdw(OuterShadowEffectModel value) {
      this.type = 23;
      this.value = value;
      return this;
    }

    public EG_Effect setPrstShdw(PresetShadowEffectModel value) {
      this.type = 24;
      this.value = value;
      return this;
    }

    public EG_Effect setReflection(ReflectionEffectModel value) {
      this.type = 25;
      this.value = value;
      return this;
    }

    public EG_Effect setRelOff(RelativeOffsetEffectModel value) {
      this.type = 26;
      this.value = value;
      return this;
    }

    public EG_Effect setSoftEdge(SoftEdgesEffectModel value) {
      this.type = 27;
      this.value = value;
      return this;
    }

    public EG_Effect setTint(TintEffectModel value) {
      this.type = 28;
      this.value = value;
      return this;
    }

    public EG_Effect setXfrm(TransformEffectModel value) {
      this.type = 29;
      this.value = value;
      return this;
    }

    public EG_Effect from(EffectContainerModel.EG_Effect value) {
      this.type = -1;
      this.value = null;
      if (value.isCont()) {
        this.type = 0;
        this.value = value.getCont();
      }
      if (value.isEffect()) {
        this.type = 1;
        this.value = value.getEffect();
      }
      if (value.isAlphaBiLevel()) {
        this.type = 2;
        this.value = value.getAlphaBiLevel();
      }
      if (value.isAlphaCeiling()) {
        this.type = 3;
        this.value = value.getAlphaCeiling();
      }
      if (value.isAlphaFloor()) {
        this.type = 4;
        this.value = value.getAlphaFloor();
      }
      if (value.isAlphaInv()) {
        this.type = 5;
        this.value = value.getAlphaInv();
      }
      if (value.isAlphaMod()) {
        this.type = 6;
        this.value = value.getAlphaMod();
      }
      if (value.isAlphaModFix()) {
        this.type = 7;
        this.value = value.getAlphaModFix();
      }
      if (value.isAlphaOutset()) {
        this.type = 8;
        this.value = value.getAlphaOutset();
      }
      if (value.isAlphaRepl()) {
        this.type = 9;
        this.value = value.getAlphaRepl();
      }
      if (value.isBiLevel()) {
        this.type = 10;
        this.value = value.getBiLevel();
      }
      if (value.isBlend()) {
        this.type = 11;
        this.value = value.getBlend();
      }
      if (value.isBlur()) {
        this.type = 12;
        this.value = value.getBlur();
      }
      if (value.isClrChange()) {
        this.type = 13;
        this.value = value.getClrChange();
      }
      if (value.isClrRepl()) {
        this.type = 14;
        this.value = value.getClrRepl();
      }
      if (value.isDuotone()) {
        this.type = 15;
        this.value = value.getDuotone();
      }
      if (value.isFill()) {
        this.type = 16;
        this.value = value.getFill();
      }
      if (value.isFillOverlay()) {
        this.type = 17;
        this.value = value.getFillOverlay();
      }
      if (value.isGlow()) {
        this.type = 18;
        this.value = value.getGlow();
      }
      if (value.isGrayscl()) {
        this.type = 19;
        this.value = value.getGrayscl();
      }
      if (value.isHsl()) {
        this.type = 20;
        this.value = value.getHsl();
      }
      if (value.isInnerShdw()) {
        this.type = 21;
        this.value = value.getInnerShdw();
      }
      if (value.isLum()) {
        this.type = 22;
        this.value = value.getLum();
      }
      if (value.isOuterShdw()) {
        this.type = 23;
        this.value = value.getOuterShdw();
      }
      if (value.isPrstShdw()) {
        this.type = 24;
        this.value = value.getPrstShdw();
      }
      if (value.isReflection()) {
        this.type = 25;
        this.value = value.getReflection();
      }
      if (value.isRelOff()) {
        this.type = 26;
        this.value = value.getRelOff();
      }
      if (value.isSoftEdge()) {
        this.type = 27;
        this.value = value.getSoftEdge();
      }
      if (value.isTint()) {
        this.type = 28;
        this.value = value.getTint();
      }
      if (value.isXfrm()) {
        this.type = 29;
        this.value = value.getXfrm();
      }
      return this;
    }

    public EffectContainerModel.EG_Effect build() {
      if (this.type == -1) return new EffectContainerModel.EG_Effect();
      if (this.type == 0) return EffectContainerModel.EG_Effect.newCont((EffectContainerModel) this.value);
      if (this.type == 1) return EffectContainerModel.EG_Effect.newEffect((EffectReferenceModel) this.value);
      if (this.type == 2) return EffectContainerModel.EG_Effect.newAlphaBiLevel((AlphaBiLevelEffectModel) this.value);
      if (this.type == 3) return EffectContainerModel.EG_Effect.newAlphaCeiling((AlphaCeilingEffectModel) this.value);
      if (this.type == 4) return EffectContainerModel.EG_Effect.newAlphaFloor((AlphaFloorEffectModel) this.value);
      if (this.type == 5) return EffectContainerModel.EG_Effect.newAlphaInv((AlphaInverseEffectModel) this.value);
      if (this.type == 6) return EffectContainerModel.EG_Effect.newAlphaMod((AlphaModulateEffectModel) this.value);
      if (this.type == 7) return EffectContainerModel.EG_Effect.newAlphaModFix((AlphaModulateFixedEffectModel) this.value);
      if (this.type == 8) return EffectContainerModel.EG_Effect.newAlphaOutset((AlphaOutsetEffectModel) this.value);
      if (this.type == 9) return EffectContainerModel.EG_Effect.newAlphaRepl((AlphaReplaceEffectModel) this.value);
      if (this.type == 10) return EffectContainerModel.EG_Effect.newBiLevel((BiLevelEffectModel) this.value);
      if (this.type == 11) return EffectContainerModel.EG_Effect.newBlend((BlendEffectModel) this.value);
      if (this.type == 12) return EffectContainerModel.EG_Effect.newBlur((BlurEffectModel) this.value);
      if (this.type == 13) return EffectContainerModel.EG_Effect.newClrChange((ColorChangeEffectModel) this.value);
      if (this.type == 14) return EffectContainerModel.EG_Effect.newClrRepl((ColorReplaceEffectModel) this.value);
      if (this.type == 15) return EffectContainerModel.EG_Effect.newDuotone((DuotoneEffectModel) this.value);
      if (this.type == 16) return EffectContainerModel.EG_Effect.newFill((FillEffectModel) this.value);
      if (this.type == 17) return EffectContainerModel.EG_Effect.newFillOverlay((FillOverlayEffectModel) this.value);
      if (this.type == 18) return EffectContainerModel.EG_Effect.newGlow((GlowEffectModel) this.value);
      if (this.type == 19) return EffectContainerModel.EG_Effect.newGrayscl((GrayscaleEffectModel) this.value);
      if (this.type == 20) return EffectContainerModel.EG_Effect.newHsl((HSLEffectModel) this.value);
      if (this.type == 21) return EffectContainerModel.EG_Effect.newInnerShdw((InnerShadowEffectModel) this.value);
      if (this.type == 22) return EffectContainerModel.EG_Effect.newLum((LuminanceEffectModel) this.value);
      if (this.type == 23) return EffectContainerModel.EG_Effect.newOuterShdw((OuterShadowEffectModel) this.value);
      if (this.type == 24) return EffectContainerModel.EG_Effect.newPrstShdw((PresetShadowEffectModel) this.value);
      if (this.type == 25) return EffectContainerModel.EG_Effect.newReflection((ReflectionEffectModel) this.value);
      if (this.type == 26) return EffectContainerModel.EG_Effect.newRelOff((RelativeOffsetEffectModel) this.value);
      if (this.type == 27) return EffectContainerModel.EG_Effect.newSoftEdge((SoftEdgesEffectModel) this.value);
      if (this.type == 28) return EffectContainerModel.EG_Effect.newTint((TintEffectModel) this.value);
      if (this.type == 29) return EffectContainerModel.EG_Effect.newXfrm((TransformEffectModel) this.value);
      return null;
    }
  }
}
