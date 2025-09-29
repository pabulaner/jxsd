package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.DPtBuilder;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class DPtModel {
  private final UnsignedIntModel idx;

  private final BooleanModel invertIfNegative;

  private final MarkerModel marker;

  private final BooleanModel bubble3D;

  private final UnsignedIntModel explosion;

  private final ShapePropertiesModel spPr;

  private final PictureOptionsModel pictureOptions;

  private final ExtensionListModel extLst;

  public DPtModel(UnsignedIntModel idx, BooleanModel invertIfNegative, MarkerModel marker,
      BooleanModel bubble3D, UnsignedIntModel explosion, ShapePropertiesModel spPr,
      PictureOptionsModel pictureOptions, ExtensionListModel extLst) {
    this.idx = idx;
    this.invertIfNegative = invertIfNegative;
    this.marker = marker;
    this.bubble3D = bubble3D;
    this.explosion = explosion;
    this.spPr = spPr;
    this.pictureOptions = pictureOptions;
    this.extLst = extLst;
  }

  public DPtBuilder builder() {
    return new DPtBuilder().from(this);
  }

  public UnsignedIntModel getIdx() {
    return this.idx;
  }

  public BooleanModel getInvertIfNegative() {
    return this.invertIfNegative;
  }

  public MarkerModel getMarker() {
    return this.marker;
  }

  public BooleanModel getBubble3D() {
    return this.bubble3D;
  }

  public UnsignedIntModel getExplosion() {
    return this.explosion;
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public PictureOptionsModel getPictureOptions() {
    return this.pictureOptions;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
