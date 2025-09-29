package jxsd.gen.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import jxsd.gen.builder.drawingml.main.BlipFillPropertiesBuilder;

/**
 * This is a generated sequence class.
 */
public class BlipFillPropertiesModel {
  private final boolean rotWithShape;

  private final long dpi;

  private final BlipModel blip;

  private final RelativeRectModel srcRect;

  private final EG_FillModeProperties egFillModeProperties;

  public BlipFillPropertiesModel(boolean rotWithShape, long dpi, BlipModel blip,
      RelativeRectModel srcRect, EG_FillModeProperties egFillModeProperties) {
    this.rotWithShape = rotWithShape;
    this.dpi = dpi;
    this.blip = blip;
    this.srcRect = srcRect;
    this.egFillModeProperties = egFillModeProperties;
  }

  public BlipFillPropertiesBuilder builder() {
    return new BlipFillPropertiesBuilder().from(this);
  }

  public boolean getRotWithShape() {
    return this.rotWithShape;
  }

  public long getDpi() {
    return this.dpi;
  }

  public BlipModel getBlip() {
    return this.blip;
  }

  public RelativeRectModel getSrcRect() {
    return this.srcRect;
  }

  public EG_FillModeProperties getEGFillModeProperties() {
    return this.egFillModeProperties;
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_FillModeProperties {
    private final int type;

    private final Object value;

    public EG_FillModeProperties() {
      this(-1, null);
    }

    private EG_FillModeProperties(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public BlipFillPropertiesBuilder.EG_FillModeProperties builder() {
      return new BlipFillPropertiesBuilder.EG_FillModeProperties().from(this);
    }

    public static EG_FillModeProperties newTile(TileInfoPropertiesModel value) {
      return new EG_FillModeProperties(0, value);
    }

    public boolean isTile() {
      return this.type == 0;
    }

    public TileInfoPropertiesModel getTile() {
      return (TileInfoPropertiesModel) this.value;
    }

    public static EG_FillModeProperties newStretch(StretchInfoPropertiesModel value) {
      return new EG_FillModeProperties(1, value);
    }

    public boolean isStretch() {
      return this.type == 1;
    }

    public StretchInfoPropertiesModel getStretch() {
      return (StretchInfoPropertiesModel) this.value;
    }
  }
}
