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

  private final TileOrStretchModel tileOrStretch;

  public CT_BlipFillPropertiesModel(BooleanModel rotWithShape, UnsignedIntModel dpi,
      CT_BlipModel blip, CT_RelativeRectModel srcRect, TileOrStretchModel tileOrStretch) {
    this.rotWithShape = rotWithShape;
    this.dpi = dpi;
    this.blip = blip;
    this.srcRect = srcRect;
    this.tileOrStretch = tileOrStretch;
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

  public TileOrStretchModel getTileOrStretch() {
    return this.tileOrStretch;
  }

  public static class TileOrStretchModel {
    private final int type;

    private final Object value;

    public TileOrStretchModel() {
      this(-1, null);
    }

    private TileOrStretchModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static TileOrStretchModel newTile(CT_TileInfoPropertiesModel value) {
      return new TileOrStretchModel(0, value);
    }

    public boolean isTile() {
      return this.type == 0;
    }

    public CT_TileInfoPropertiesModel getTile() {
      return (CT_TileInfoPropertiesModel) this.value;
    }

    public static TileOrStretchModel newStretch(CT_StretchInfoPropertiesModel value) {
      return new TileOrStretchModel(1, value);
    }

    public boolean isStretch() {
      return this.type == 1;
    }

    public CT_StretchInfoPropertiesModel getStretch() {
      return (CT_StretchInfoPropertiesModel) this.value;
    }
  }
}
