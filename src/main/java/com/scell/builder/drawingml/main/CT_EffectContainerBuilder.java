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

  private List<CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel> contOrEffectOrAlphaBiLevel;

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

  public CT_EffectContainerBuilder setContOrEffectOrAlphaBiLevel(
      List<CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel> contOrEffectOrAlphaBiLevel) {
    this.contOrEffectOrAlphaBiLevel = contOrEffectOrAlphaBiLevel;
    return this;
  }

  public CT_EffectContainerModel build() {
    return new CT_EffectContainerModel(this.type, this.name, this.contOrEffectOrAlphaBiLevel);
  }

  public CT_EffectContainerBuilder from(CT_EffectContainerModel value) {
    this.type = value.getType();
    this.name = value.getName();
    this.contOrEffectOrAlphaBiLevel = value.getContOrEffectOrAlphaBiLevel();
    return this;
  }

  public static class ContOrEffectOrAlphaBiLevelBuilder {
    private int type;

    private Object value;

    public ContOrEffectOrAlphaBiLevelBuilder() {
      this.type = -1;
      this.value = null;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setCont(CT_EffectContainerModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setEffect(CT_EffectReferenceModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setAlphaBiLevel(CT_AlphaBiLevelEffectModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setAlphaCeiling(CT_AlphaCeilingEffectModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setAlphaFloor(CT_AlphaFloorEffectModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setAlphaInv(CT_AlphaInverseEffectModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setAlphaMod(CT_AlphaModulateEffectModel value) {
      this.type = 6;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setAlphaModFix(
        CT_AlphaModulateFixedEffectModel value) {
      this.type = 7;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setAlphaOutset(CT_AlphaOutsetEffectModel value) {
      this.type = 8;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setAlphaRepl(CT_AlphaReplaceEffectModel value) {
      this.type = 9;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setBiLevel(CT_BiLevelEffectModel value) {
      this.type = 10;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setBlend(CT_BlendEffectModel value) {
      this.type = 11;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setBlur(CT_BlurEffectModel value) {
      this.type = 12;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setClrChange(CT_ColorChangeEffectModel value) {
      this.type = 13;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setClrRepl(CT_ColorReplaceEffectModel value) {
      this.type = 14;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setDuotone(CT_DuotoneEffectModel value) {
      this.type = 15;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setFill(CT_FillEffectModel value) {
      this.type = 16;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setFillOverlay(CT_FillOverlayEffectModel value) {
      this.type = 17;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setGlow(CT_GlowEffectModel value) {
      this.type = 18;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setGrayscl(CT_GrayscaleEffectModel value) {
      this.type = 19;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setHsl(CT_HSLEffectModel value) {
      this.type = 20;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setInnerShdw(CT_InnerShadowEffectModel value) {
      this.type = 21;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setLum(CT_LuminanceEffectModel value) {
      this.type = 22;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setOuterShdw(CT_OuterShadowEffectModel value) {
      this.type = 23;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setPrstShdw(CT_PresetShadowEffectModel value) {
      this.type = 24;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setReflection(CT_ReflectionEffectModel value) {
      this.type = 25;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setRelOff(CT_RelativeOffsetEffectModel value) {
      this.type = 26;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setSoftEdge(CT_SoftEdgesEffectModel value) {
      this.type = 27;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setTint(CT_TintEffectModel value) {
      this.type = 28;
      this.value = value;
      return this;
    }

    public ContOrEffectOrAlphaBiLevelBuilder setXfrm(CT_TransformEffectModel value) {
      this.type = 29;
      this.value = value;
      return this;
    }

    public CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel build() {
      if (this.type == -1) return new CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel();
      if (this.type == 0) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newCont((CT_EffectContainerModel) this.value);
      if (this.type == 1) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newEffect((CT_EffectReferenceModel) this.value);
      if (this.type == 2) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newAlphaBiLevel((CT_AlphaBiLevelEffectModel) this.value);
      if (this.type == 3) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newAlphaCeiling((CT_AlphaCeilingEffectModel) this.value);
      if (this.type == 4) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newAlphaFloor((CT_AlphaFloorEffectModel) this.value);
      if (this.type == 5) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newAlphaInv((CT_AlphaInverseEffectModel) this.value);
      if (this.type == 6) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newAlphaMod((CT_AlphaModulateEffectModel) this.value);
      if (this.type == 7) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newAlphaModFix((CT_AlphaModulateFixedEffectModel) this.value);
      if (this.type == 8) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newAlphaOutset((CT_AlphaOutsetEffectModel) this.value);
      if (this.type == 9) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newAlphaRepl((CT_AlphaReplaceEffectModel) this.value);
      if (this.type == 10) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newBiLevel((CT_BiLevelEffectModel) this.value);
      if (this.type == 11) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newBlend((CT_BlendEffectModel) this.value);
      if (this.type == 12) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newBlur((CT_BlurEffectModel) this.value);
      if (this.type == 13) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newClrChange((CT_ColorChangeEffectModel) this.value);
      if (this.type == 14) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newClrRepl((CT_ColorReplaceEffectModel) this.value);
      if (this.type == 15) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newDuotone((CT_DuotoneEffectModel) this.value);
      if (this.type == 16) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newFill((CT_FillEffectModel) this.value);
      if (this.type == 17) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newFillOverlay((CT_FillOverlayEffectModel) this.value);
      if (this.type == 18) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newGlow((CT_GlowEffectModel) this.value);
      if (this.type == 19) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newGrayscl((CT_GrayscaleEffectModel) this.value);
      if (this.type == 20) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newHsl((CT_HSLEffectModel) this.value);
      if (this.type == 21) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newInnerShdw((CT_InnerShadowEffectModel) this.value);
      if (this.type == 22) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newLum((CT_LuminanceEffectModel) this.value);
      if (this.type == 23) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newOuterShdw((CT_OuterShadowEffectModel) this.value);
      if (this.type == 24) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newPrstShdw((CT_PresetShadowEffectModel) this.value);
      if (this.type == 25) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newReflection((CT_ReflectionEffectModel) this.value);
      if (this.type == 26) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newRelOff((CT_RelativeOffsetEffectModel) this.value);
      if (this.type == 27) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newSoftEdge((CT_SoftEdgesEffectModel) this.value);
      if (this.type == 28) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newTint((CT_TintEffectModel) this.value);
      if (this.type == 29) return CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel.newXfrm((CT_TransformEffectModel) this.value);
      return null;
    }

    public ContOrEffectOrAlphaBiLevelBuilder from(
        CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel value) {
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
