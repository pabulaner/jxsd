package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.drawingml.main.GradientFillPropertiesModel;
import com.scell.model.drawingml.main.GradientStopListModel;
import com.scell.model.drawingml.main.LinearShadePropertiesModel;
import com.scell.model.drawingml.main.PathShadePropertiesModel;
import com.scell.model.drawingml.main.RelativeRectModel;
import com.scell.model.drawingml.main.TileFlipModeValueModel;
import java.lang.Object;

public class GradientFillPropertiesBuilder {
  private BooleanValueModel rotWithShape;

  private TileFlipModeValueModel flip;

  private GradientStopListModel gsLst;

  private GradientFillPropertiesModel.ShadePropertiesModel egShadeProperties;

  private RelativeRectModel tileRect;

  public GradientFillPropertiesBuilder() {
  }

  public GradientFillPropertiesBuilder setRotWithShape(BooleanValueModel rotWithShape) {
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
      GradientFillPropertiesModel.ShadePropertiesModel egShadeProperties) {
    this.egShadeProperties = egShadeProperties;
    return this;
  }

  public GradientFillPropertiesBuilder setTileRect(RelativeRectModel tileRect) {
    this.tileRect = tileRect;
    return this;
  }

  public GradientFillPropertiesModel build() {
    return new GradientFillPropertiesModel(this.rotWithShape, this.flip, this.gsLst, this.egShadeProperties, this.tileRect);
  }

  public GradientFillPropertiesBuilder from(GradientFillPropertiesModel value) {
    this.rotWithShape = value.getRotWithShape();
    this.flip = value.getFlip();
    this.gsLst = value.getGsLst();
    this.egShadeProperties = value.getEGShadeProperties();
    this.tileRect = value.getTileRect();
    return this;
  }

  public static class ShadePropertiesBuilder {
    private int type;

    private Object value;

    public ShadePropertiesBuilder() {
      this.type = -1;
      this.value = null;
    }

    public ShadePropertiesBuilder setLin(LinearShadePropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public ShadePropertiesBuilder setPath(PathShadePropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public GradientFillPropertiesModel.ShadePropertiesModel build() {
      if (this.type == -1) return new GradientFillPropertiesModel.ShadePropertiesModel();
      if (this.type == 0) return GradientFillPropertiesModel.ShadePropertiesModel.newLin((LinearShadePropertiesModel) this.value);
      if (this.type == 1) return GradientFillPropertiesModel.ShadePropertiesModel.newPath((PathShadePropertiesModel) this.value);
      return null;
    }

    public ShadePropertiesBuilder from(GradientFillPropertiesModel.ShadePropertiesModel value) {
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
  }
}
