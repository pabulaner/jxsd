package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.TokenModel;
import com.scell.model.drawingml.main.CT_AlphaBiLevelEffectModel;
import com.scell.model.drawingml.main.CT_AlphaCeilingEffectModel;
import com.scell.model.drawingml.main.CT_AlphaFloorEffectModel;
import com.scell.model.drawingml.main.CT_AlphaInverseEffectModel;
import com.scell.model.drawingml.main.CT_AlphaModulateEffectModel;
import com.scell.model.drawingml.main.CT_AlphaModulateFixedEffectModel;
import com.scell.model.drawingml.main.CT_AlphaOutsetEffectModel;
import com.scell.model.drawingml.main.CT_AlphaReplaceEffectModel;
import com.scell.model.drawingml.main.CT_BiLevelEffectModel;
import com.scell.model.drawingml.main.CT_BlendEffectModel;
import com.scell.model.drawingml.main.CT_BlurEffectModel;
import com.scell.model.drawingml.main.CT_ColorChangeEffectModel;
import com.scell.model.drawingml.main.CT_ColorReplaceEffectModel;
import com.scell.model.drawingml.main.CT_DuotoneEffectModel;
import com.scell.model.drawingml.main.CT_EffectContainerModel;
import com.scell.model.drawingml.main.CT_EffectReferenceModel;
import com.scell.model.drawingml.main.CT_FillEffectModel;
import com.scell.model.drawingml.main.CT_FillOverlayEffectModel;
import com.scell.model.drawingml.main.CT_GlowEffectModel;
import com.scell.model.drawingml.main.CT_GrayscaleEffectModel;
import com.scell.model.drawingml.main.CT_HSLEffectModel;
import com.scell.model.drawingml.main.CT_InnerShadowEffectModel;
import com.scell.model.drawingml.main.CT_LuminanceEffectModel;
import com.scell.model.drawingml.main.CT_OuterShadowEffectModel;
import com.scell.model.drawingml.main.CT_PresetShadowEffectModel;
import com.scell.model.drawingml.main.CT_ReflectionEffectModel;
import com.scell.model.drawingml.main.CT_RelativeOffsetEffectModel;
import com.scell.model.drawingml.main.CT_SoftEdgesEffectModel;
import com.scell.model.drawingml.main.CT_TintEffectModel;
import com.scell.model.drawingml.main.CT_TransformEffectModel;
import com.scell.model.drawingml.main.ST_EffectContainerTypeModel;
import java.lang.Object;
import java.util.List;

public class CT_EffectContainerBuilder {
  private ST_EffectContainerTypeModel type;

  private TokenModel name;

  private List<CT_EffectContainerModel.EG_EffectModel> egEffect;

  public CT_EffectContainerBuilder() {
  }

  public CT_EffectContainerBuilder setType(ST_EffectContainerTypeModel type) {
    this.type = type;
    return this;
  }

  public CT_EffectContainerBuilder setName(TokenModel name) {
    this.name = name;
    return this;
  }

  public CT_EffectContainerBuilder setEGEffect(
      List<CT_EffectContainerModel.EG_EffectModel> egEffect) {
    this.egEffect = egEffect;
    return this;
  }

  public CT_EffectContainerModel build() {
    return new CT_EffectContainerModel(this.type, this.name, this.egEffect);
  }

  public CT_EffectContainerBuilder from(CT_EffectContainerModel value) {
    this.type = value.getType();
    this.name = value.getName();
    this.egEffect = value.getEGEffect();
    return this;
  }

  public static class EG_EffectBuilder {
    private int type;

    private Object value;

    public EG_EffectBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EG_EffectBuilder setCont(CT_EffectContainerModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setEffect(CT_EffectReferenceModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setAlphaBiLevel(CT_AlphaBiLevelEffectModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setAlphaCeiling(CT_AlphaCeilingEffectModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setAlphaFloor(CT_AlphaFloorEffectModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setAlphaInv(CT_AlphaInverseEffectModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setAlphaMod(CT_AlphaModulateEffectModel value) {
      this.type = 6;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setAlphaModFix(CT_AlphaModulateFixedEffectModel value) {
      this.type = 7;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setAlphaOutset(CT_AlphaOutsetEffectModel value) {
      this.type = 8;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setAlphaRepl(CT_AlphaReplaceEffectModel value) {
      this.type = 9;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setBiLevel(CT_BiLevelEffectModel value) {
      this.type = 10;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setBlend(CT_BlendEffectModel value) {
      this.type = 11;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setBlur(CT_BlurEffectModel value) {
      this.type = 12;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setClrChange(CT_ColorChangeEffectModel value) {
      this.type = 13;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setClrRepl(CT_ColorReplaceEffectModel value) {
      this.type = 14;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setDuotone(CT_DuotoneEffectModel value) {
      this.type = 15;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setFill(CT_FillEffectModel value) {
      this.type = 16;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setFillOverlay(CT_FillOverlayEffectModel value) {
      this.type = 17;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setGlow(CT_GlowEffectModel value) {
      this.type = 18;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setGrayscl(CT_GrayscaleEffectModel value) {
      this.type = 19;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setHsl(CT_HSLEffectModel value) {
      this.type = 20;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setInnerShdw(CT_InnerShadowEffectModel value) {
      this.type = 21;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setLum(CT_LuminanceEffectModel value) {
      this.type = 22;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setOuterShdw(CT_OuterShadowEffectModel value) {
      this.type = 23;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setPrstShdw(CT_PresetShadowEffectModel value) {
      this.type = 24;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setReflection(CT_ReflectionEffectModel value) {
      this.type = 25;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setRelOff(CT_RelativeOffsetEffectModel value) {
      this.type = 26;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setSoftEdge(CT_SoftEdgesEffectModel value) {
      this.type = 27;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setTint(CT_TintEffectModel value) {
      this.type = 28;
      this.value = value;
      return this;
    }

    public EG_EffectBuilder setXfrm(CT_TransformEffectModel value) {
      this.type = 29;
      this.value = value;
      return this;
    }

    public CT_EffectContainerModel.EG_EffectModel build() {
      if (this.type == -1) return new CT_EffectContainerModel.EG_EffectModel();
      if (this.type == 0) return CT_EffectContainerModel.EG_EffectModel.newCont((CT_EffectContainerModel) this.value);
      if (this.type == 1) return CT_EffectContainerModel.EG_EffectModel.newEffect((CT_EffectReferenceModel) this.value);
      if (this.type == 2) return CT_EffectContainerModel.EG_EffectModel.newAlphaBiLevel((CT_AlphaBiLevelEffectModel) this.value);
      if (this.type == 3) return CT_EffectContainerModel.EG_EffectModel.newAlphaCeiling((CT_AlphaCeilingEffectModel) this.value);
      if (this.type == 4) return CT_EffectContainerModel.EG_EffectModel.newAlphaFloor((CT_AlphaFloorEffectModel) this.value);
      if (this.type == 5) return CT_EffectContainerModel.EG_EffectModel.newAlphaInv((CT_AlphaInverseEffectModel) this.value);
      if (this.type == 6) return CT_EffectContainerModel.EG_EffectModel.newAlphaMod((CT_AlphaModulateEffectModel) this.value);
      if (this.type == 7) return CT_EffectContainerModel.EG_EffectModel.newAlphaModFix((CT_AlphaModulateFixedEffectModel) this.value);
      if (this.type == 8) return CT_EffectContainerModel.EG_EffectModel.newAlphaOutset((CT_AlphaOutsetEffectModel) this.value);
      if (this.type == 9) return CT_EffectContainerModel.EG_EffectModel.newAlphaRepl((CT_AlphaReplaceEffectModel) this.value);
      if (this.type == 10) return CT_EffectContainerModel.EG_EffectModel.newBiLevel((CT_BiLevelEffectModel) this.value);
      if (this.type == 11) return CT_EffectContainerModel.EG_EffectModel.newBlend((CT_BlendEffectModel) this.value);
      if (this.type == 12) return CT_EffectContainerModel.EG_EffectModel.newBlur((CT_BlurEffectModel) this.value);
      if (this.type == 13) return CT_EffectContainerModel.EG_EffectModel.newClrChange((CT_ColorChangeEffectModel) this.value);
      if (this.type == 14) return CT_EffectContainerModel.EG_EffectModel.newClrRepl((CT_ColorReplaceEffectModel) this.value);
      if (this.type == 15) return CT_EffectContainerModel.EG_EffectModel.newDuotone((CT_DuotoneEffectModel) this.value);
      if (this.type == 16) return CT_EffectContainerModel.EG_EffectModel.newFill((CT_FillEffectModel) this.value);
      if (this.type == 17) return CT_EffectContainerModel.EG_EffectModel.newFillOverlay((CT_FillOverlayEffectModel) this.value);
      if (this.type == 18) return CT_EffectContainerModel.EG_EffectModel.newGlow((CT_GlowEffectModel) this.value);
      if (this.type == 19) return CT_EffectContainerModel.EG_EffectModel.newGrayscl((CT_GrayscaleEffectModel) this.value);
      if (this.type == 20) return CT_EffectContainerModel.EG_EffectModel.newHsl((CT_HSLEffectModel) this.value);
      if (this.type == 21) return CT_EffectContainerModel.EG_EffectModel.newInnerShdw((CT_InnerShadowEffectModel) this.value);
      if (this.type == 22) return CT_EffectContainerModel.EG_EffectModel.newLum((CT_LuminanceEffectModel) this.value);
      if (this.type == 23) return CT_EffectContainerModel.EG_EffectModel.newOuterShdw((CT_OuterShadowEffectModel) this.value);
      if (this.type == 24) return CT_EffectContainerModel.EG_EffectModel.newPrstShdw((CT_PresetShadowEffectModel) this.value);
      if (this.type == 25) return CT_EffectContainerModel.EG_EffectModel.newReflection((CT_ReflectionEffectModel) this.value);
      if (this.type == 26) return CT_EffectContainerModel.EG_EffectModel.newRelOff((CT_RelativeOffsetEffectModel) this.value);
      if (this.type == 27) return CT_EffectContainerModel.EG_EffectModel.newSoftEdge((CT_SoftEdgesEffectModel) this.value);
      if (this.type == 28) return CT_EffectContainerModel.EG_EffectModel.newTint((CT_TintEffectModel) this.value);
      if (this.type == 29) return CT_EffectContainerModel.EG_EffectModel.newXfrm((CT_TransformEffectModel) this.value);
      return null;
    }

    public EG_EffectBuilder from(CT_EffectContainerModel.EG_EffectModel value) {
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
