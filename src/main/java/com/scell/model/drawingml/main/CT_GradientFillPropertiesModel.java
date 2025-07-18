package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import java.lang.Integer;
import java.lang.Object;

public class CT_GradientFillPropertiesModel {
  private final BooleanModel rotWithShape;

  private final ST_TileFlipModeModel flip;

  private final CT_GradientStopListModel gsLst;

  private final EG_ShadePropertiesModel egShadeProperties;

  private final CT_RelativeRectModel tileRect;

  public CT_GradientFillPropertiesModel(BooleanModel rotWithShape, ST_TileFlipModeModel flip,
      CT_GradientStopListModel gsLst, EG_ShadePropertiesModel egShadeProperties,
      CT_RelativeRectModel tileRect) {
    this.rotWithShape = rotWithShape;
    this.flip = flip;
    this.gsLst = gsLst;
    this.egShadeProperties = egShadeProperties;
    this.tileRect = tileRect;
  }

  public BooleanModel getRotWithShape() {
    return this.rotWithShape;
  }

  public ST_TileFlipModeModel getFlip() {
    return this.flip;
  }

  public CT_GradientStopListModel getGsLst() {
    return this.gsLst;
  }

  public EG_ShadePropertiesModel getEGShadeProperties() {
    return this.egShadeProperties;
  }

  public CT_RelativeRectModel getTileRect() {
    return this.tileRect;
  }

  public static class EG_ShadePropertiesModel {
    private final int type;

    private final Object value;

    public EG_ShadePropertiesModel() {
      this(-1, null);
    }

    private EG_ShadePropertiesModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EG_ShadePropertiesModel newLin(CT_LinearShadePropertiesModel value) {
      return new EG_ShadePropertiesModel(0, value);
    }

    public boolean isLin() {
      return this.type == 0;
    }

    public CT_LinearShadePropertiesModel getLin() {
      return (CT_LinearShadePropertiesModel) this.value;
    }

    public static EG_ShadePropertiesModel newPath(CT_PathShadePropertiesModel value) {
      return new EG_ShadePropertiesModel(1, value);
    }

    public boolean isPath() {
      return this.type == 1;
    }

    public CT_PathShadePropertiesModel getPath() {
      return (CT_PathShadePropertiesModel) this.value;
    }
  }
}
