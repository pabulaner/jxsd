package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import jxsd.gen.model.drawingml.main.BlendModeValueModel;
import jxsd.gen.model.drawingml.main.BlipFillPropertiesModel;
import jxsd.gen.model.drawingml.main.FillOverlayEffectModel;
import jxsd.gen.model.drawingml.main.GradientFillPropertiesModel;
import jxsd.gen.model.drawingml.main.GroupFillPropertiesModel;
import jxsd.gen.model.drawingml.main.NoFillPropertiesModel;
import jxsd.gen.model.drawingml.main.PatternFillPropertiesModel;
import jxsd.gen.model.drawingml.main.SolidColorFillPropertiesModel;

/**
 * This is a generated sequence class.
 */
public class FillOverlayEffectBuilder {
  private BlendModeValueModel blend;

  private FillOverlayEffectModel.EG_FillProperties egFillProperties;

  public FillOverlayEffectBuilder() {
  }

  public FillOverlayEffectBuilder setBlend(BlendModeValueModel blend) {
    this.blend = blend;
    return this;
  }

  public FillOverlayEffectBuilder setEGFillProperties(
      FillOverlayEffectModel.EG_FillProperties egFillProperties) {
    this.egFillProperties = egFillProperties;
    return this;
  }

  public FillOverlayEffectBuilder from(FillOverlayEffectModel value) {
    this.blend = value.getBlend();
    this.egFillProperties = value.getEGFillProperties();
    return this;
  }

  public FillOverlayEffectModel build() {
    return new FillOverlayEffectModel(this.blend, this.egFillProperties);
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_FillProperties {
    private int type;

    private Object value;

    public EG_FillProperties() {
      this.type = -1;
      this.value = null;
    }

    public EG_FillProperties setNoFill(NoFillPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_FillProperties setSolidFill(SolidColorFillPropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_FillProperties setGradFill(GradientFillPropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public EG_FillProperties setBlipFill(BlipFillPropertiesModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public EG_FillProperties setPattFill(PatternFillPropertiesModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public EG_FillProperties setGrpFill(GroupFillPropertiesModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public EG_FillProperties from(FillOverlayEffectModel.EG_FillProperties value) {
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

    public FillOverlayEffectModel.EG_FillProperties build() {
      if (this.type == -1) return new FillOverlayEffectModel.EG_FillProperties();
      if (this.type == 0) return FillOverlayEffectModel.EG_FillProperties.newNoFill((NoFillPropertiesModel) this.value);
      if (this.type == 1) return FillOverlayEffectModel.EG_FillProperties.newSolidFill((SolidColorFillPropertiesModel) this.value);
      if (this.type == 2) return FillOverlayEffectModel.EG_FillProperties.newGradFill((GradientFillPropertiesModel) this.value);
      if (this.type == 3) return FillOverlayEffectModel.EG_FillProperties.newBlipFill((BlipFillPropertiesModel) this.value);
      if (this.type == 4) return FillOverlayEffectModel.EG_FillProperties.newPattFill((PatternFillPropertiesModel) this.value);
      if (this.type == 5) return FillOverlayEffectModel.EG_FillProperties.newGrpFill((GroupFillPropertiesModel) this.value);
      return null;
    }
  }
}
