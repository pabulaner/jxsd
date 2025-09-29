package jxsd.gen.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import jxsd.gen.builder.drawingml.main.GradientFillPropertiesBuilder;

/**
 * This is a generated sequence class.
 */
public class GradientFillPropertiesModel {
  private final boolean rotWithShape;

  private final TileFlipModeValueModel flip;

  private final GradientStopListModel gsLst;

  private final EG_ShadeProperties egShadeProperties;

  private final RelativeRectModel tileRect;

  public GradientFillPropertiesModel(boolean rotWithShape, TileFlipModeValueModel flip,
      GradientStopListModel gsLst, EG_ShadeProperties egShadeProperties,
      RelativeRectModel tileRect) {
    this.rotWithShape = rotWithShape;
    this.flip = flip;
    this.gsLst = gsLst;
    this.egShadeProperties = egShadeProperties;
    this.tileRect = tileRect;
  }

  public GradientFillPropertiesBuilder builder() {
    return new GradientFillPropertiesBuilder().from(this);
  }

  public boolean getRotWithShape() {
    return this.rotWithShape;
  }

  public TileFlipModeValueModel getFlip() {
    return this.flip;
  }

  public GradientStopListModel getGsLst() {
    return this.gsLst;
  }

  public EG_ShadeProperties getEGShadeProperties() {
    return this.egShadeProperties;
  }

  public RelativeRectModel getTileRect() {
    return this.tileRect;
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_ShadeProperties {
    private final int type;

    private final Object value;

    public EG_ShadeProperties() {
      this(-1, null);
    }

    private EG_ShadeProperties(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public GradientFillPropertiesBuilder.EG_ShadeProperties builder() {
      return new GradientFillPropertiesBuilder.EG_ShadeProperties().from(this);
    }

    public static EG_ShadeProperties newLin(LinearShadePropertiesModel value) {
      return new EG_ShadeProperties(0, value);
    }

    public boolean isLin() {
      return this.type == 0;
    }

    public LinearShadePropertiesModel getLin() {
      return (LinearShadePropertiesModel) this.value;
    }

    public static EG_ShadeProperties newPath(PathShadePropertiesModel value) {
      return new EG_ShadeProperties(1, value);
    }

    public boolean isPath() {
      return this.type == 1;
    }

    public PathShadePropertiesModel getPath() {
      return (PathShadePropertiesModel) this.value;
    }
  }
}
