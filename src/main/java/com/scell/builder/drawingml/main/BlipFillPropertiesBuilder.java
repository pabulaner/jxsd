package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.XMLSchema.UnsignedIntValueModel;
import com.scell.model.drawingml.main.BlipFillPropertiesModel;
import com.scell.model.drawingml.main.BlipModel;
import com.scell.model.drawingml.main.RelativeRectModel;
import com.scell.model.drawingml.main.StretchInfoPropertiesModel;
import com.scell.model.drawingml.main.TileInfoPropertiesModel;
import java.lang.Object;

public class BlipFillPropertiesBuilder {
  private BooleanValueModel rotWithShape;

  private UnsignedIntValueModel dpi;

  private BlipModel blip;

  private RelativeRectModel srcRect;

  private BlipFillPropertiesModel.FillModePropertiesModel egFillModeProperties;

  public BlipFillPropertiesBuilder() {
  }

  public BlipFillPropertiesBuilder setRotWithShape(BooleanValueModel rotWithShape) {
    this.rotWithShape = rotWithShape;
    return this;
  }

  public BlipFillPropertiesBuilder setDpi(UnsignedIntValueModel dpi) {
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
      BlipFillPropertiesModel.FillModePropertiesModel egFillModeProperties) {
    this.egFillModeProperties = egFillModeProperties;
    return this;
  }

  public BlipFillPropertiesModel build() {
    return new BlipFillPropertiesModel(this.rotWithShape, this.dpi, this.blip, this.srcRect, this.egFillModeProperties);
  }

  public BlipFillPropertiesBuilder from(BlipFillPropertiesModel value) {
    this.rotWithShape = value.getRotWithShape();
    this.dpi = value.getDpi();
    this.blip = value.getBlip();
    this.srcRect = value.getSrcRect();
    this.egFillModeProperties = value.getEGFillModeProperties();
    return this;
  }

  public static class FillModePropertiesBuilder {
    private int type;

    private Object value;

    public FillModePropertiesBuilder() {
      this.type = -1;
      this.value = null;
    }

    public FillModePropertiesBuilder setTile(TileInfoPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public FillModePropertiesBuilder setStretch(StretchInfoPropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public BlipFillPropertiesModel.FillModePropertiesModel build() {
      if (this.type == -1) return new BlipFillPropertiesModel.FillModePropertiesModel();
      if (this.type == 0) return BlipFillPropertiesModel.FillModePropertiesModel.newTile((TileInfoPropertiesModel) this.value);
      if (this.type == 1) return BlipFillPropertiesModel.FillModePropertiesModel.newStretch((StretchInfoPropertiesModel) this.value);
      return null;
    }

    public FillModePropertiesBuilder from(BlipFillPropertiesModel.FillModePropertiesModel value) {
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
  }
}
