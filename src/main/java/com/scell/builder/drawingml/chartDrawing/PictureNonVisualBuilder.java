package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.PictureNonVisualModel;
import com.scell.model.drawingml.main.NonVisualDrawingPropsModel;
import com.scell.model.drawingml.main.NonVisualPicturePropertiesModel;

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

  public PictureNonVisualModel build() {
    return new PictureNonVisualModel(this.cNvPr, this.cNvPicPr);
  }

  public PictureNonVisualBuilder from(PictureNonVisualModel value) {
    this.cNvPr = value.getCNvPr();
    this.cNvPicPr = value.getCNvPicPr();
    return this;
  }
}
