package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import jxsd.gen.model.drawingml.main.BlipFillPropertiesModel;
import jxsd.gen.model.drawingml.main.BlipModel;
import jxsd.gen.model.drawingml.main.RelativeRectModel;
import jxsd.gen.model.drawingml.main.StretchInfoPropertiesModel;
import jxsd.gen.model.drawingml.main.TileInfoPropertiesModel;

/**
 * This is a generated sequence class.
 */
public class BlipFillPropertiesBuilder {
  private boolean rotWithShape;

  private long dpi;

  private BlipModel blip;

  private RelativeRectModel srcRect;

  private BlipFillPropertiesModel.EG_FillModeProperties egFillModeProperties;

  public BlipFillPropertiesBuilder() {
  }

  public BlipFillPropertiesBuilder setRotWithShape(boolean rotWithShape) {
    this.rotWithShape = rotWithShape;
    return this;
  }

  public BlipFillPropertiesBuilder setDpi(long dpi) {
    this.dpi = dpi;
    return this;
  }

  public BlipFillPropertiesBuilder setBlip(BlipModel blip) {
    this.blip = blip;
    return this;
  }

  public BlipFillPropertiesBuilder setSrcRect(RelativeRectModel srcRect) {
    this.srcRect = srcRect;
    return this;
  }

  public BlipFillPropertiesBuilder setEGFillModeProperties(
      BlipFillPropertiesModel.EG_FillModeProperties egFillModeProperties) {
    this.egFillModeProperties = egFillModeProperties;
    return this;
  }

  public BlipFillPropertiesBuilder from(BlipFillPropertiesModel value) {
    this.rotWithShape = value.getRotWithShape();
    this.dpi = value.getDpi();
    this.blip = value.getBlip();
    this.srcRect = value.getSrcRect();
    this.egFillModeProperties = value.getEGFillModeProperties();
    return this;
  }

  public BlipFillPropertiesModel build() {
    return new BlipFillPropertiesModel(this.rotWithShape, this.dpi, this.blip, this.srcRect, this.egFillModeProperties);
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_FillModeProperties {
    private int type;

    private Object value;

    public EG_FillModeProperties() {
      this.type = -1;
      this.value = null;
    }

    public EG_FillModeProperties setTile(TileInfoPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_FillModeProperties setStretch(StretchInfoPropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_FillModeProperties from(BlipFillPropertiesModel.EG_FillModeProperties value) {
      this.type = -1;
      this.value = null;
      if (value.isTile()) {
        this.type = 0;
        this.value = value.getTile();
      }
      if (value.isStretch()) {
        this.type = 1;
        this.value = value.getStretch();
      }
      return this;
    }

    public BlipFillPropertiesModel.EG_FillModeProperties build() {
      if (this.type == -1) return new BlipFillPropertiesModel.EG_FillModeProperties();
      if (this.type == 0) return BlipFillPropertiesModel.EG_FillModeProperties.newTile((TileInfoPropertiesModel) this.value);
      if (this.type == 1) return BlipFillPropertiesModel.EG_FillModeProperties.newStretch((StretchInfoPropertiesModel) this.value);
      return null;
    }
  }
}
