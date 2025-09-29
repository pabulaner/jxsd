package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.SurfaceBuilder;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class SurfaceModel {
  private final UnsignedIntModel thickness;

  private final ShapePropertiesModel spPr;

  private final PictureOptionsModel pictureOptions;

  private final ExtensionListModel extLst;

  public SurfaceModel(UnsignedIntModel thickness, ShapePropertiesModel spPr,
      PictureOptionsModel pictureOptions, ExtensionListModel extLst) {
    this.thickness = thickness;
    this.spPr = spPr;
    this.pictureOptions = pictureOptions;
    this.extLst = extLst;
  }

  public SurfaceBuilder builder() {
    return new SurfaceBuilder().from(this);
  }

  public UnsignedIntModel getThickness() {
    return this.thickness;
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
