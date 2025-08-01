package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.XMLSchema.UnsignedIntValueModel;
import java.lang.Integer;
import java.lang.Object;

public class BlipFillPropertiesModel {
  private final BooleanValueModel rotWithShape;

  private final UnsignedIntValueModel dpi;

  private final BlipModel blip;

  private final RelativeRectModel srcRect;

  private final FillModePropertiesModel egFillModeProperties;

  public BlipFillPropertiesModel(BooleanValueModel rotWithShape, UnsignedIntValueModel dpi,
      BlipModel blip, RelativeRectModel srcRect, FillModePropertiesModel egFillModeProperties) {
    this.rotWithShape = rotWithShape;
    this.dpi = dpi;
    this.blip = blip;
    this.srcRect = srcRect;
    this.egFillModeProperties = egFillModeProperties;
  }

  public BooleanValueModel getRotWithShape() {
    return this.rotWithShape;
  }

  public UnsignedIntValueModel getDpi() {
    return this.dpi;
  }

  public BlipModel getBlip() {
    return this.blip;
  }

  public RelativeRectModel getSrcRect() {
    return this.srcRect;
  }

  public FillModePropertiesModel getEGFillModeProperties() {
    return this.egFillModeProperties;
  }

  public static class FillModePropertiesModel {
    private final int type;

    private final Object value;

    public FillModePropertiesModel() {
      this(-1, null);
    }

    private FillModePropertiesModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static FillModePropertiesModel newTile(TileInfoPropertiesModel value) {
      return new FillModePropertiesModel(0, value);
    }

    public boolean isTile() {
      return this.type == 0;
    }

    public TileInfoPropertiesModel getTile() {
      return (TileInfoPropertiesModel) this.value;
    }

    public static FillModePropertiesModel newStretch(StretchInfoPropertiesModel value) {
      return new FillModePropertiesModel(1, value);
    }

    public boolean isStretch() {
      return this.type == 1;
    }

    public StretchInfoPropertiesModel getStretch() {
      return (StretchInfoPropertiesModel) this.value;
    }
  }
}
