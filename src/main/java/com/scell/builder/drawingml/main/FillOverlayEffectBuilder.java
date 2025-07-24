package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BlendModeModel;
import com.scell.model.drawingml.main.BlipFillPropertiesModel;
import com.scell.model.drawingml.main.FillOverlayEffectModel;
import com.scell.model.drawingml.main.GradientFillPropertiesModel;
import com.scell.model.drawingml.main.GroupFillPropertiesModel;
import com.scell.model.drawingml.main.NoFillPropertiesModel;
import com.scell.model.drawingml.main.PatternFillPropertiesModel;
import com.scell.model.drawingml.main.SolidColorFillPropertiesModel;
import java.lang.Object;

public class FillOverlayEffectBuilder {
  private BlendModeModel blend;

  private FillOverlayEffectModel.FillPropertiesModel egFillProperties;

  public FillOverlayEffectBuilder() {
  }

  public FillOverlayEffectBuilder setBlend(BlendModeModel blend) {
    this.blend = blend;
    return this;
  }

  public FillOverlayEffectBuilder setEGFillProperties(
      FillOverlayEffectModel.FillPropertiesModel egFillProperties) {
    this.egFillProperties = egFillProperties;
    return this;
  }

  public FillOverlayEffectModel build() {
    return new FillOverlayEffectModel(this.blend, this.egFillProperties);
  }

  public FillOverlayEffectBuilder from(FillOverlayEffectModel value) {
    this.blend = value.getBlend();
    this.egFillProperties = value.getEGFillProperties();
    return this;
  }

  public static class FillPropertiesBuilder {
    private int type;

    private Object value;

    public FillPropertiesBuilder() {
      this.type = -1;
      this.value = null;
    }

    public FillPropertiesBuilder setNoFill(NoFillPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setSolidFill(SolidColorFillPropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setGradFill(GradientFillPropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setBlipFill(BlipFillPropertiesModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setPattFill(PatternFillPropertiesModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setGrpFill(GroupFillPropertiesModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public FillOverlayEffectModel.FillPropertiesModel build() {
      if (this.type == -1) return new FillOverlayEffectModel.FillPropertiesModel();
      if (this.type == 0) return FillOverlayEffectModel.FillPropertiesModel.newNoFill((NoFillPropertiesModel) this.value);
      if (this.type == 1) return FillOverlayEffectModel.FillPropertiesModel.newSolidFill((SolidColorFillPropertiesModel) this.value);
      if (this.type == 2) return FillOverlayEffectModel.FillPropertiesModel.newGradFill((GradientFillPropertiesModel) this.value);
      if (this.type == 3) return FillOverlayEffectModel.FillPropertiesModel.newBlipFill((BlipFillPropertiesModel) this.value);
      if (this.type == 4) return FillOverlayEffectModel.FillPropertiesModel.newPattFill((PatternFillPropertiesModel) this.value);
      if (this.type == 5) return FillOverlayEffectModel.FillPropertiesModel.newGrpFill((GroupFillPropertiesModel) this.value);
      return null;
    }

    public FillPropertiesBuilder from(FillOverlayEffectModel.FillPropertiesModel value) {
      this.type = -1;
      this.value = null;
      if (value.isNoFill()) {
        this.type = 0;
        this.value = value.getNoFill();
      }
      if (value.isSolidFill()) {
        this.type = 1;
        this.value = value.getSolidFill();
      }
      if (value.isGradFill()) {
        this.type = 2;
        this.value = value.getGradFill();
      }
      if (value.isBlipFill()) {
        this.type = 3;
        this.value = value.getBlipFill();
      }
      if (value.isPattFill()) {
        this.type = 4;
        this.value = value.getPattFill();
      }
      if (value.isGrpFill()) {
        this.type = 5;
        this.value = value.getGrpFill();
      }
      return this;
    }
  }
}
