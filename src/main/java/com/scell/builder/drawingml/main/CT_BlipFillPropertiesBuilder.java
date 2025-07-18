package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.UnsignedIntModel;
import com.scell.model.drawingml.main.CT_BlipFillPropertiesModel;
import com.scell.model.drawingml.main.CT_BlipModel;
import com.scell.model.drawingml.main.CT_RelativeRectModel;
import com.scell.model.drawingml.main.CT_StretchInfoPropertiesModel;
import com.scell.model.drawingml.main.CT_TileInfoPropertiesModel;
import java.lang.Object;

public class CT_BlipFillPropertiesBuilder {
  private BooleanModel rotWithShape;

  private UnsignedIntModel dpi;

  private CT_BlipModel blip;

  private CT_RelativeRectModel srcRect;

  private CT_BlipFillPropertiesModel.EG_FillModePropertiesModel egFillModeProperties;

  public CT_BlipFillPropertiesBuilder() {
  }

  public CT_BlipFillPropertiesBuilder setRotWithShape(BooleanModel rotWithShape) {
    this.rotWithShape = rotWithShape;
    return this;
  }

  public CT_BlipFillPropertiesBuilder setDpi(UnsignedIntModel dpi) {
    this.dpi = dpi;
    return this;
  }

  public CT_BlipFillPropertiesBuilder setBlip(CT_BlipModel blip) {
    this.blip = blip;
    return this;
  }

  public CT_BlipFillPropertiesBuilder setSrcRect(CT_RelativeRectModel srcRect) {
    this.srcRect = srcRect;
    return this;
  }

  public CT_BlipFillPropertiesBuilder setEGFillModeProperties(
      CT_BlipFillPropertiesModel.EG_FillModePropertiesModel egFillModeProperties) {
    this.egFillModeProperties = egFillModeProperties;
    return this;
  }

  public CT_BlipFillPropertiesModel build() {
    return new CT_BlipFillPropertiesModel(this.rotWithShape, this.dpi, this.blip, this.srcRect, this.egFillModeProperties);
  }

  public CT_BlipFillPropertiesBuilder from(CT_BlipFillPropertiesModel value) {
    this.rotWithShape = value.getRotWithShape();
    this.dpi = value.getDpi();
    this.blip = value.getBlip();
    this.srcRect = value.getSrcRect();
    this.egFillModeProperties = value.getEGFillModeProperties();
    return this;
  }

  public static class EG_FillModePropertiesBuilder {
    private int type;

    private Object value;

    public EG_FillModePropertiesBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EG_FillModePropertiesBuilder setTile(CT_TileInfoPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_FillModePropertiesBuilder setStretch(CT_StretchInfoPropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CT_BlipFillPropertiesModel.EG_FillModePropertiesModel build() {
      if (this.type == -1) return new CT_BlipFillPropertiesModel.EG_FillModePropertiesModel();
      if (this.type == 0) return CT_BlipFillPropertiesModel.EG_FillModePropertiesModel.newTile((CT_TileInfoPropertiesModel) this.value);
      if (this.type == 1) return CT_BlipFillPropertiesModel.EG_FillModePropertiesModel.newStretch((CT_StretchInfoPropertiesModel) this.value);
      return null;
    }

    public EG_FillModePropertiesBuilder from(
        CT_BlipFillPropertiesModel.EG_FillModePropertiesModel value) {
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
