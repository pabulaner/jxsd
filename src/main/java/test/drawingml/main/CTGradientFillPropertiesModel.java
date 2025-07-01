package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import test.XMLSchema.BooleanModel;

public class CTGradientFillPropertiesModel {
  private final BooleanModel rotWithShape;

  private final STTileFlipModeModel flip;

  private final CTGradientStopListModel gsLst;

  private final LinOrPathModel linOrPath;

  private final CTRelativeRectModel tileRect;

  public CTGradientFillPropertiesModel(BooleanModel rotWithShape, STTileFlipModeModel flip,
      CTGradientStopListModel gsLst, LinOrPathModel linOrPath, CTRelativeRectModel tileRect) {
    this.rotWithShape = rotWithShape;
    this.flip = flip;
    this.gsLst = gsLst;
    this.linOrPath = linOrPath;
    this.tileRect = tileRect;
  }

  public BooleanModel getRotWithShape() {
    return this.rotWithShape;
  }

  public STTileFlipModeModel getFlip() {
    return this.flip;
  }

  public CTGradientStopListModel getGsLst() {
    return this.gsLst;
  }

  public LinOrPathModel getLinOrPath() {
    return this.linOrPath;
  }

  public CTRelativeRectModel getTileRect() {
    return this.tileRect;
  }

  public static class LinOrPathModel {
    private final Integer type;

    private final Object value;

    public LinOrPathModel() {
      this(-1, null);
    }

    private LinOrPathModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static LinOrPathModel newLin(CTLinearShadePropertiesModel value) {
      return new LinOrPathModel(0, value);
    }

    public Boolean isLin() {
      return this.type == 0;
    }

    public CTLinearShadePropertiesModel getLin() {
      return (CTLinearShadePropertiesModel) this.value;
    }

    public static LinOrPathModel newPath(CTPathShadePropertiesModel value) {
      return new LinOrPathModel(1, value);
    }

    public Boolean isPath() {
      return this.type == 1;
    }

    public CTPathShadePropertiesModel getPath() {
      return (CTPathShadePropertiesModel) this.value;
    }
  }
}
