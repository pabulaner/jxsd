package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import java.lang.Integer;
import java.lang.Object;

public class GradientFillPropertiesModel {
  private final BooleanModel rotWithShape;

  private final TileFlipModeModel flip;

  private final GradientStopListModel gsLst;

  private final ShadePropertiesModel egShadeProperties;

  private final RelativeRectModel tileRect;

  public GradientFillPropertiesModel(BooleanModel rotWithShape, TileFlipModeModel flip,
      GradientStopListModel gsLst, ShadePropertiesModel egShadeProperties,
      RelativeRectModel tileRect) {
    this.rotWithShape = rotWithShape;
    this.flip = flip;
    this.gsLst = gsLst;
    this.egShadeProperties = egShadeProperties;
    this.tileRect = tileRect;
  }

  public BooleanModel getRotWithShape() {
    return this.rotWithShape;
  }

  public TileFlipModeModel getFlip() {
    return this.flip;
  }

  public GradientStopListModel getGsLst() {
    return this.gsLst;
  }

  public ShadePropertiesModel getEGShadeProperties() {
    return this.egShadeProperties;
  }

  public RelativeRectModel getTileRect() {
    return this.tileRect;
  }

  public static class ShadePropertiesModel {
    private final int type;

    private final Object value;

    public ShadePropertiesModel() {
      this(-1, null);
    }

    private ShadePropertiesModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static ShadePropertiesModel newLin(LinearShadePropertiesModel value) {
      return new ShadePropertiesModel(0, value);
    }

    public boolean isLin() {
      return this.type == 0;
    }

    public LinearShadePropertiesModel getLin() {
      return (LinearShadePropertiesModel) this.value;
    }

    public static ShadePropertiesModel newPath(PathShadePropertiesModel value) {
      return new ShadePropertiesModel(1, value);
    }

    public boolean isPath() {
      return this.type == 1;
    }

    public PathShadePropertiesModel getPath() {
      return (PathShadePropertiesModel) this.value;
    }
  }
}
