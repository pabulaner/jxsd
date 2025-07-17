package model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import model.XMLSchema.booleanModel;
import model.XMLSchema.unsignedIntModel;

public class CT_BlipFillPropertiesModel {
  private final booleanModel rotWithShape;

  private final unsignedIntModel dpi;

  private final CT_BlipModel blip;

  private final CT_RelativeRectModel srcRect;

  private final tileOrStretchModel tileOrStretch;

  public CT_BlipFillPropertiesModel(booleanModel rotWithShape, unsignedIntModel dpi,
      CT_BlipModel blip, CT_RelativeRectModel srcRect, tileOrStretchModel tileOrStretch) {
    this.rotWithShape = rotWithShape;
    this.dpi = dpi;
    this.blip = blip;
    this.srcRect = srcRect;
    this.tileOrStretch = tileOrStretch;
  }

  public booleanModel getRotWithShape() {
    return this.rotWithShape;
  }

  public unsignedIntModel getDpi() {
    return this.dpi;
  }

  public CT_BlipModel getBlip() {
    return this.blip;
  }

  public CT_RelativeRectModel getSrcRect() {
    return this.srcRect;
  }

  public tileOrStretchModel getTileOrStretch() {
    return this.tileOrStretch;
  }

  public static class tileOrStretchModel {
    private final int type;

    private final Object value;

    public tileOrStretchModel() {
      this(-1, null);
    }

    private tileOrStretchModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static tileOrStretchModel newTile(CT_TileInfoPropertiesModel value) {
      return new tileOrStretchModel(0, value);
    }

    public boolean isTile() {
      return this.type == 0;
    }

    public CT_TileInfoPropertiesModel getTile() {
      return (CT_TileInfoPropertiesModel) this.value;
    }

    public static tileOrStretchModel newStretch(CT_StretchInfoPropertiesModel value) {
      return new tileOrStretchModel(1, value);
    }

    public boolean isStretch() {
      return this.type == 1;
    }

    public CT_StretchInfoPropertiesModel getStretch() {
      return (CT_StretchInfoPropertiesModel) this.value;
    }
  }
}
