package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.CT_GradientFillPropertiesModel;
import com.scell.model.drawingml.main.CT_GradientStopListModel;
import com.scell.model.drawingml.main.CT_LinearShadePropertiesModel;
import com.scell.model.drawingml.main.CT_PathShadePropertiesModel;
import com.scell.model.drawingml.main.CT_RelativeRectModel;
import com.scell.model.drawingml.main.ST_TileFlipModeModel;
import java.lang.Object;

public class CT_GradientFillPropertiesBuilder {
  private BooleanModel rotWithShape;

  private ST_TileFlipModeModel flip;

  private CT_GradientStopListModel gsLst;

  private CT_GradientFillPropertiesModel.LinOrPathModel linOrPath;

  private CT_RelativeRectModel tileRect;

  public CT_GradientFillPropertiesBuilder() {
  }

  public CT_GradientFillPropertiesBuilder setRotWithShape(BooleanModel rotWithShape) {
    this.rotWithShape = rotWithShape;
    return this;
  }

  public CT_GradientFillPropertiesBuilder setFlip(ST_TileFlipModeModel flip) {
    this.flip = flip;
    return this;
  }

  public CT_GradientFillPropertiesBuilder setGsLst(CT_GradientStopListModel gsLst) {
    this.gsLst = gsLst;
    return this;
  }

  public CT_GradientFillPropertiesBuilder setLinOrPath(
      CT_GradientFillPropertiesModel.LinOrPathModel linOrPath) {
    this.linOrPath = linOrPath;
    return this;
  }

  public CT_GradientFillPropertiesBuilder setTileRect(CT_RelativeRectModel tileRect) {
    this.tileRect = tileRect;
    return this;
  }

  public CT_GradientFillPropertiesModel build() {
    return new CT_GradientFillPropertiesModel(this.rotWithShape, this.flip, this.gsLst, this.linOrPath, this.tileRect);
  }

  public CT_GradientFillPropertiesBuilder from(CT_GradientFillPropertiesModel value) {
    this.rotWithShape = value.getRotWithShape();
    this.flip = value.getFlip();
    this.gsLst = value.getGsLst();
    this.linOrPath = value.getLinOrPath();
    this.tileRect = value.getTileRect();
    return this;
  }

  public static class LinOrPathBuilder {
    private int type;

    private Object value;

    public LinOrPathBuilder() {
      this.type = -1;
      this.value = null;
    }

    public LinOrPathBuilder setLin(CT_LinearShadePropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public LinOrPathBuilder setPath(CT_PathShadePropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CT_GradientFillPropertiesModel.LinOrPathModel build() {
      if (this.type == -1) return new CT_GradientFillPropertiesModel.LinOrPathModel();
      if (this.type == 0) return CT_GradientFillPropertiesModel.LinOrPathModel.newLin((CT_LinearShadePropertiesModel) this.value);
      if (this.type == 1) return CT_GradientFillPropertiesModel.LinOrPathModel.newPath((CT_PathShadePropertiesModel) this.value);
      return null;
    }

    public LinOrPathBuilder from(CT_GradientFillPropertiesModel.LinOrPathModel value) {
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
