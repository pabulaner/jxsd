package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.CT_PictureNonVisualModel;
import com.scell.model.drawingml.main.CT_NonVisualDrawingPropsModel;
import com.scell.model.drawingml.main.CT_NonVisualPicturePropertiesModel;

public class CT_PictureNonVisualBuilder {
  private CT_NonVisualDrawingPropsModel cNvPr;

  private CT_NonVisualPicturePropertiesModel cNvPicPr;

  public CT_PictureNonVisualBuilder() {
  }

  public CT_PictureNonVisualBuilder setCNvPr(CT_NonVisualDrawingPropsModel cNvPr) {
    this.cNvPr = cNvPr;
    return this;
  }

  public CT_PictureNonVisualBuilder setCNvPicPr(CT_NonVisualPicturePropertiesModel cNvPicPr) {
    this.cNvPicPr = cNvPicPr;
    return this;
  }

  public CT_PictureNonVisualModel build() {
    return new CT_PictureNonVisualModel(this.cNvPr, this.cNvPicPr);
  }

  public CT_PictureNonVisualBuilder from(CT_PictureNonVisualModel value) {
    this.cNvPr = value.getCNvPr();
    this.cNvPicPr = value.getCNvPicPr();
    return this;
  }
}
