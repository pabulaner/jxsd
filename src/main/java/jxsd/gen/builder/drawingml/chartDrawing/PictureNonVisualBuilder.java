package jxsd.gen.builder.drawingml.chartDrawing;

import jxsd.gen.model.drawingml.chartDrawing.PictureNonVisualModel;
import jxsd.gen.model.drawingml.main.NonVisualDrawingPropsModel;
import jxsd.gen.model.drawingml.main.NonVisualPicturePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class PictureNonVisualBuilder {
  private NonVisualDrawingPropsModel cNvPr;

  private NonVisualPicturePropertiesModel cNvPicPr;

  public PictureNonVisualBuilder() {
  }

  public PictureNonVisualBuilder setCNvPr(NonVisualDrawingPropsModel cNvPr) {
    this.cNvPr = cNvPr;
    return this;
  }

  public PictureNonVisualBuilder setCNvPicPr(NonVisualPicturePropertiesModel cNvPicPr) {
    this.cNvPicPr = cNvPicPr;
    return this;
  }

  public PictureNonVisualBuilder from(PictureNonVisualModel value) {
    this.cNvPr = value.getCNvPr();
    this.cNvPicPr = value.getCNvPicPr();
    return this;
  }

  public PictureNonVisualModel build() {
    return new PictureNonVisualModel(this.cNvPr, this.cNvPicPr);
  }
}
