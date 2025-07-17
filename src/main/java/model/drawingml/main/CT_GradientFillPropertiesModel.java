package model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import model.XMLSchema.booleanModel;

public class CT_GradientFillPropertiesModel {
  private final booleanModel rotWithShape;

  private final ST_TileFlipModeModel flip;

  private final CT_GradientStopListModel gsLst;

  private final linOrPathModel linOrPath;

  private final CT_RelativeRectModel tileRect;

  public CT_GradientFillPropertiesModel(booleanModel rotWithShape, ST_TileFlipModeModel flip,
      CT_GradientStopListModel gsLst, linOrPathModel linOrPath, CT_RelativeRectModel tileRect) {
    this.rotWithShape = rotWithShape;
    this.flip = flip;
    this.gsLst = gsLst;
    this.linOrPath = linOrPath;
    this.tileRect = tileRect;
  }

  public booleanModel getRotWithShape() {
    return this.rotWithShape;
  }

  public ST_TileFlipModeModel getFlip() {
    return this.flip;
  }

  public CT_GradientStopListModel getGsLst() {
    return this.gsLst;
  }

  public linOrPathModel getLinOrPath() {
    return this.linOrPath;
  }

  public CT_RelativeRectModel getTileRect() {
    return this.tileRect;
  }

  public static class linOrPathModel {
    private final int type;

    private final Object value;

    public linOrPathModel() {
      this(-1, null);
    }

    private linOrPathModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static linOrPathModel newLin(CT_LinearShadePropertiesModel value) {
      return new linOrPathModel(0, value);
    }

    public boolean isLin() {
      return this.type == 0;
    }

    public CT_LinearShadePropertiesModel getLin() {
      return (CT_LinearShadePropertiesModel) this.value;
    }

    public static linOrPathModel newPath(CT_PathShadePropertiesModel value) {
      return new linOrPathModel(1, value);
    }

    public boolean isPath() {
      return this.type == 1;
    }

    public CT_PathShadePropertiesModel getPath() {
      return (CT_PathShadePropertiesModel) this.value;
    }
  }
}
