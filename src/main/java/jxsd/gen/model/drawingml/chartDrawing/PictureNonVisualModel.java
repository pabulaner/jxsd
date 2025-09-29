package jxsd.gen.model.drawingml.chartDrawing;

import jxsd.gen.builder.drawingml.chartDrawing.PictureNonVisualBuilder;
import jxsd.gen.model.drawingml.main.NonVisualDrawingPropsModel;
import jxsd.gen.model.drawingml.main.NonVisualPicturePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class PictureNonVisualModel {
  private final NonVisualDrawingPropsModel cNvPr;

  private final NonVisualPicturePropertiesModel cNvPicPr;

  public PictureNonVisualModel(NonVisualDrawingPropsModel cNvPr,
      NonVisualPicturePropertiesModel cNvPicPr) {
    this.cNvPr = cNvPr;
    this.cNvPicPr = cNvPicPr;
  }

  public PictureNonVisualBuilder builder() {
    return new PictureNonVisualBuilder().from(this);
  }

  public NonVisualDrawingPropsModel getCNvPr() {
    return this.cNvPr;
  }

  public NonVisualPicturePropertiesModel getCNvPicPr() {
    return this.cNvPicPr;
  }
}
