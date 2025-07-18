package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.UnsignedIntModel;
import java.lang.Integer;
import java.lang.Object;

public class CT_BlipFillPropertiesModel {
  private final BooleanModel rotWithShape;

  private final UnsignedIntModel dpi;

  private final CT_BlipModel blip;

  private final CT_RelativeRectModel srcRect;

  private final EG_FillModePropertiesModel egFillModeProperties;

  public CT_BlipFillPropertiesModel(BooleanModel rotWithShape, UnsignedIntModel dpi,
      CT_BlipModel blip, CT_RelativeRectModel srcRect,
      EG_FillModePropertiesModel egFillModeProperties) {
    this.rotWithShape = rotWithShape;
    this.dpi = dpi;
    this.blip = blip;
    this.srcRect = srcRect;
    this.egFillModeProperties = egFillModeProperties;
  }

  public BooleanModel getRotWithShape() {
    return this.rotWithShape;
  }

  public UnsignedIntModel getDpi() {
    return this.dpi;
  }

  public CT_BlipModel getBlip() {
    return this.blip;
  }

  public CT_RelativeRectModel getSrcRect() {
    return this.srcRect;
  }

  public EG_FillModePropertiesModel getEGFillModeProperties() {
    return this.egFillModeProperties;
  }

  public static class EG_FillModePropertiesModel {
    private final int type;

    private final Object value;

    public EG_FillModePropertiesModel() {
      this(-1, null);
    }

    private EG_FillModePropertiesModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EG_FillModePropertiesModel newTile(CT_TileInfoPropertiesModel value) {
      return new EG_FillModePropertiesModel(0, value);
    }

    public boolean isTile() {
      return this.type == 0;
    }

    public CT_TileInfoPropertiesModel getTile() {
      return (CT_TileInfoPropertiesModel) this.value;
    }

    public static EG_FillModePropertiesModel newStretch(CT_StretchInfoPropertiesModel value) {
      return new EG_FillModePropertiesModel(1, value);
    }

    public boolean isStretch() {
      return this.type == 1;
    }

    public CT_StretchInfoPropertiesModel getStretch() {
      return (CT_StretchInfoPropertiesModel) this.value;
    }
  }
}
