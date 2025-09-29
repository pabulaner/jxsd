package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import jxsd.gen.model.drawingml.main.GradientFillPropertiesModel;
import jxsd.gen.model.drawingml.main.GradientStopListModel;
import jxsd.gen.model.drawingml.main.LinearShadePropertiesModel;
import jxsd.gen.model.drawingml.main.PathShadePropertiesModel;
import jxsd.gen.model.drawingml.main.RelativeRectModel;
import jxsd.gen.model.drawingml.main.TileFlipModeValueModel;

/**
 * This is a generated sequence class.
 */
public class GradientFillPropertiesBuilder {
  private boolean rotWithShape;

  private TileFlipModeValueModel flip;

  private GradientStopListModel gsLst;

  private GradientFillPropertiesModel.EG_ShadeProperties egShadeProperties;

  private RelativeRectModel tileRect;

  public GradientFillPropertiesBuilder() {
  }

  public GradientFillPropertiesBuilder setRotWithShape(boolean rotWithShape) {
    this.rotWithShape = rotWithShape;
    return this;
  }

  public GradientFillPropertiesBuilder setFlip(TileFlipModeValueModel flip) {
    this.flip = flip;
    return this;
  }

  public GradientFillPropertiesBuilder setGsLst(GradientStopListModel gsLst) {
    this.gsLst = gsLst;
    return this;
  }

  public GradientFillPropertiesBuilder setEGShadeProperties(
      GradientFillPropertiesModel.EG_ShadeProperties egShadeProperties) {
    this.egShadeProperties = egShadeProperties;
    return this;
  }

  public GradientFillPropertiesBuilder setTileRect(RelativeRectModel tileRect) {
    this.tileRect = tileRect;
    return this;
  }

  public GradientFillPropertiesBuilder from(GradientFillPropertiesModel value) {
    this.rotWithShape = value.getRotWithShape();
    this.flip = value.getFlip();
    this.gsLst = value.getGsLst();
    this.egShadeProperties = value.getEGShadeProperties();
    this.tileRect = value.getTileRect();
    return this;
  }

  public GradientFillPropertiesModel build() {
    return new GradientFillPropertiesModel(this.rotWithShape, this.flip, this.gsLst, this.egShadeProperties, this.tileRect);
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_ShadeProperties {
    private int type;

    private Object value;

    public EG_ShadeProperties() {
      this.type = -1;
      this.value = null;
    }

    public EG_ShadeProperties setLin(LinearShadePropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_ShadeProperties setPath(PathShadePropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_ShadeProperties from(GradientFillPropertiesModel.EG_ShadeProperties value) {
      this.type = -1;
      this.value = null;
      if (value.isLin()) {
        this.type = 0;
        this.value = value.getLin();
      }
      if (value.isPath()) {
        this.type = 1;
        this.value = value.getPath();
      }
      return this;
    }

    public GradientFillPropertiesModel.EG_ShadeProperties build() {
      if (this.type == -1) return new GradientFillPropertiesModel.EG_ShadeProperties();
      if (this.type == 0) return GradientFillPropertiesModel.EG_ShadeProperties.newLin((LinearShadePropertiesModel) this.value);
      if (this.type == 1) return GradientFillPropertiesModel.EG_ShadeProperties.newPath((PathShadePropertiesModel) this.value);
      return null;
    }
  }
}
