package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.TokenValueModel;
import com.scell.model.drawingml.main.AlphaBiLevelEffectModel;
import com.scell.model.drawingml.main.AlphaCeilingEffectModel;
import com.scell.model.drawingml.main.AlphaFloorEffectModel;
import com.scell.model.drawingml.main.AlphaInverseEffectModel;
import com.scell.model.drawingml.main.AlphaModulateEffectModel;
import com.scell.model.drawingml.main.AlphaModulateFixedEffectModel;
import com.scell.model.drawingml.main.AlphaOutsetEffectModel;
import com.scell.model.drawingml.main.AlphaReplaceEffectModel;
import com.scell.model.drawingml.main.BiLevelEffectModel;
import com.scell.model.drawingml.main.BlendEffectModel;
import com.scell.model.drawingml.main.BlurEffectModel;
import com.scell.model.drawingml.main.ColorChangeEffectModel;
import com.scell.model.drawingml.main.ColorReplaceEffectModel;
import com.scell.model.drawingml.main.DuotoneEffectModel;
import com.scell.model.drawingml.main.EffectContainerModel;
import com.scell.model.drawingml.main.EffectContainerTypeValueModel;
import com.scell.model.drawingml.main.EffectReferenceModel;
import com.scell.model.drawingml.main.FillEffectModel;
import com.scell.model.drawingml.main.FillOverlayEffectModel;
import com.scell.model.drawingml.main.GlowEffectModel;
import com.scell.model.drawingml.main.GrayscaleEffectModel;
import com.scell.model.drawingml.main.HSLEffectModel;
import com.scell.model.drawingml.main.InnerShadowEffectModel;
import com.scell.model.drawingml.main.LuminanceEffectModel;
import com.scell.model.drawingml.main.OuterShadowEffectModel;
import com.scell.model.drawingml.main.PresetShadowEffectModel;
import com.scell.model.drawingml.main.ReflectionEffectModel;
import com.scell.model.drawingml.main.RelativeOffsetEffectModel;
import com.scell.model.drawingml.main.SoftEdgesEffectModel;
import com.scell.model.drawingml.main.TintEffectModel;
import com.scell.model.drawingml.main.TransformEffectModel;
import java.lang.Object;
import java.util.List;

public class EffectContainerBuilder {
  private EffectContainerTypeValueModel type;

  private TokenValueModel name;

  private List<EffectContainerModel.EffectModel> egEffect;

  public EffectContainerBuilder() {
  }

  public EffectContainerBuilder setType(EffectContainerTypeValueModel type) {
    this.type = type;
    return this;
  }

  public EffectContainerBuilder setName(TokenValueModel name) {
    this.name = name;
    return this;
  }

  public EffectContainerBuilder setEGEffect(List<EffectContainerModel.EffectModel> egEffect) {
    this.egEffect = egEffect;
    return this;
  }

  public EffectContainerModel build() {
    return new EffectContainerModel(this.type, this.name, this.egEffect);
  }

  public EffectContainerBuilder from(EffectContainerModel value) {
    this.type = value.getType();
    this.name = value.getName();
    this.egEffect = value.getEGEffect();
    return this;
  }

  public static class EffectBuilder {
    private int type;

    private Object value;

    public EffectBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EffectBuilder setCont(EffectContainerModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EffectBuilder setEffect(EffectReferenceModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EffectBuilder setAlphaBiLevel(AlphaBiLevelEffectModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public EffectBuilder setAlphaCeiling(AlphaCeilingEffectModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public EffectBuilder setAlphaFloor(AlphaFloorEffectModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public EffectBuilder setAlphaInv(AlphaInverseEffectModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public EffectBuilder setAlphaMod(AlphaModulateEffectModel value) {
      this.type = 6;
      this.value = value;
      return this;
    }

    public EffectBuilder setAlphaModFix(AlphaModulateFixedEffectModel value) {
      this.type = 7;
      this.value = value;
      return this;
    }

    public EffectBuilder setAlphaOutset(AlphaOutsetEffectModel value) {
      this.type = 8;
      this.value = value;
      return this;
    }

    public EffectBuilder setAlphaRepl(AlphaReplaceEffectModel value) {
      this.type = 9;
      this.value = value;
      return this;
    }

    public EffectBuilder setBiLevel(BiLevelEffectModel value) {
      this.type = 10;
      this.value = value;
      return this;
    }

    public EffectBuilder setBlend(BlendEffectModel value) {
      this.type = 11;
      this.value = value;
      return this;
    }

    public EffectBuilder setBlur(BlurEffectModel value) {
      this.type = 12;
      this.value = value;
      return this;
    }

    public EffectBuilder setClrChange(ColorChangeEffectModel value) {
      this.type = 13;
      this.value = value;
      return this;
    }

    public EffectBuilder setClrRepl(ColorReplaceEffectModel value) {
      this.type = 14;
      this.value = value;
      return this;
    }

    public EffectBuilder setDuotone(DuotoneEffectModel value) {
      this.type = 15;
      this.value = value;
      return this;
    }

    public EffectBuilder setFill(FillEffectModel value) {
      this.type = 16;
      this.value = value;
      return this;
    }

    public EffectBuilder setFillOverlay(FillOverlayEffectModel value) {
      this.type = 17;
      this.value = value;
      return this;
    }

    public EffectBuilder setGlow(GlowEffectModel value) {
      this.type = 18;
      this.value = value;
      return this;
    }

    public EffectBuilder setGrayscl(GrayscaleEffectModel value) {
      this.type = 19;
      this.value = value;
      return this;
    }

    public EffectBuilder setHsl(HSLEffectModel value) {
      this.type = 20;
      this.value = value;
      return this;
    }

    public EffectBuilder setInnerShdw(InnerShadowEffectModel value) {
      this.type = 21;
      this.value = value;
      return this;
    }

    public EffectBuilder setLum(LuminanceEffectModel value) {
      this.type = 22;
      this.value = value;
      return this;
    }

    public EffectBuilder setOuterShdw(OuterShadowEffectModel value) {
      this.type = 23;
      this.value = value;
      return this;
    }

    public EffectBuilder setPrstShdw(PresetShadowEffectModel value) {
      this.type = 24;
      this.value = value;
      return this;
    }

    public EffectBuilder setReflection(ReflectionEffectModel value) {
      this.type = 25;
      this.value = value;
      return this;
    }

    public EffectBuilder setRelOff(RelativeOffsetEffectModel value) {
      this.type = 26;
      this.value = value;
      return this;
    }

    public EffectBuilder setSoftEdge(SoftEdgesEffectModel value) {
      this.type = 27;
      this.value = value;
      return this;
    }

    public EffectBuilder setTint(TintEffectModel value) {
      this.type = 28;
      this.value = value;
      return this;
    }

    public EffectBuilder setXfrm(TransformEffectModel value) {
      this.type = 29;
      this.value = value;
      return this;
    }

    public EffectContainerModel.EffectModel build() {
      if (this.type == -1) return new EffectContainerModel.EffectModel();
      if (this.type == 0) return EffectContainerModel.EffectModel.newCont((EffectContainerModel) this.value);
      if (this.type == 1) return EffectContainerModel.EffectModel.newEffect((EffectReferenceModel) this.value);
      if (this.type == 2) return EffectContainerModel.EffectModel.newAlphaBiLevel((AlphaBiLevelEffectModel) this.value);
      if (this.type == 3) return EffectContainerModel.EffectModel.newAlphaCeiling((AlphaCeilingEffectModel) this.value);
      if (this.type == 4) return EffectContainerModel.EffectModel.newAlphaFloor((AlphaFloorEffectModel) this.value);
      if (this.type == 5) return EffectContainerModel.EffectModel.newAlphaInv((AlphaInverseEffectModel) this.value);
      if (this.type == 6) return EffectContainerModel.EffectModel.newAlphaMod((AlphaModulateEffectModel) this.value);
      if (this.type == 7) return EffectContainerModel.EffectModel.newAlphaModFix((AlphaModulateFixedEffectModel) this.value);
      if (this.type == 8) return EffectContainerModel.EffectModel.newAlphaOutset((AlphaOutsetEffectModel) this.value);
      if (this.type == 9) return EffectContainerModel.EffectModel.newAlphaRepl((AlphaReplaceEffectModel) this.value);
      if (this.type == 10) return EffectContainerModel.EffectModel.newBiLevel((BiLevelEffectModel) this.value);
      if (this.type == 11) return EffectContainerModel.EffectModel.newBlend((BlendEffectModel) this.value);
      if (this.type == 12) return EffectContainerModel.EffectModel.newBlur((BlurEffectModel) this.value);
      if (this.type == 13) return EffectContainerModel.EffectModel.newClrChange((ColorChangeEffectModel) this.value);
      if (this.type == 14) return EffectContainerModel.EffectModel.newClrRepl((ColorReplaceEffectModel) this.value);
      if (this.type == 15) return EffectContainerModel.EffectModel.newDuotone((DuotoneEffectModel) this.value);
      if (this.type == 16) return EffectContainerModel.EffectModel.newFill((FillEffectModel) this.value);
      if (this.type == 17) return EffectContainerModel.EffectModel.newFillOverlay((FillOverlayEffectModel) this.value);
      if (this.type == 18) return EffectContainerModel.EffectModel.newGlow((GlowEffectModel) this.value);
      if (this.type == 19) return EffectContainerModel.EffectModel.newGrayscl((GrayscaleEffectModel) this.value);
      if (this.type == 20) return EffectContainerModel.EffectModel.newHsl((HSLEffectModel) this.value);
      if (this.type == 21) return EffectContainerModel.EffectModel.newInnerShdw((InnerShadowEffectModel) this.value);
      if (this.type == 22) return EffectContainerModel.EffectModel.newLum((LuminanceEffectModel) this.value);
      if (this.type == 23) return EffectContainerModel.EffectModel.newOuterShdw((OuterShadowEffectModel) this.value);
      if (this.type == 24) return EffectContainerModel.EffectModel.newPrstShdw((PresetShadowEffectModel) this.value);
      if (this.type == 25) return EffectContainerModel.EffectModel.newReflection((ReflectionEffectModel) this.value);
      if (this.type == 26) return EffectContainerModel.EffectModel.newRelOff((RelativeOffsetEffectModel) this.value);
      if (this.type == 27) return EffectContainerModel.EffectModel.newSoftEdge((SoftEdgesEffectModel) this.value);
      if (this.type == 28) return EffectContainerModel.EffectModel.newTint((TintEffectModel) this.value);
      if (this.type == 29) return EffectContainerModel.EffectModel.newXfrm((TransformEffectModel) this.value);
      return null;
    }

    public EffectBuilder from(EffectContainerModel.EffectModel value) {
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
  }
}
