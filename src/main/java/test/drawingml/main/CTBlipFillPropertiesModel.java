package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import test.XMLSchema.BooleanModel;
import test.XMLSchema.UnsignedIntModel;

public class CTBlipFillPropertiesModel {
  private final BooleanModel rotWithShape;

  private final UnsignedIntModel dpi;

  private final CTBlipModel blip;

  private final CTRelativeRectModel srcRect;

  private final TileOrStretchModel tileOrStretch;

  public CTBlipFillPropertiesModel(BooleanModel rotWithShape, UnsignedIntModel dpi,
      CTBlipModel blip, CTRelativeRectModel srcRect, TileOrStretchModel tileOrStretch) {
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

  public CTBlipModel getBlip() {
    return this.blip;
  }

  public CTRelativeRectModel getSrcRect() {
    return this.srcRect;
  }

  public TileOrStretchModel getTileOrStretch() {
    return this.tileOrStretch;
  }

  public static class TileOrStretchModel {
    private final Integer type;

    private final Object value;

    public TileOrStretchModel() {
      this(-1, null);
    }

    private TileOrStretchModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static TileOrStretchModel newTile(CTTileInfoPropertiesModel value) {
      return new TileOrStretchModel(0, value);
    }

    public Boolean isTile() {
      return this.type == 0;
    }

    public CTTileInfoPropertiesModel getTile() {
      return (CTTileInfoPropertiesModel) this.value;
    }

    public static TileOrStretchModel newStretch(CTStretchInfoPropertiesModel value) {
      return new TileOrStretchModel(1, value);
    }

    public Boolean isStretch() {
      return this.type == 1;
    }

    public CTStretchInfoPropertiesModel getStretch() {
      return (CTStretchInfoPropertiesModel) this.value;
    }
  }
}
