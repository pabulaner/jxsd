package com.scell.model.drawingml.chartDrawing;

import com.scell.model.drawingml.main.NonVisualDrawingPropsModel;
import com.scell.model.drawingml.main.NonVisualPicturePropertiesModel;

public class PictureNonVisualModel {
  private final NonVisualDrawingPropsModel cNvPr;

  private final NonVisualPicturePropertiesModel cNvPicPr;

  public PictureNonVisualModel(NonVisualDrawingPropsModel cNvPr,
      NonVisualPicturePropertiesModel cNvPicPr) {
    this.cNvPr = cNvPr;
    this.cNvPicPr = cNvPicPr;
  }

  public NonVisualDrawingPropsModel getCNvPr() {
    return this.cNvPr;
  }

  public NonVisualPicturePropertiesModel getCNvPicPr() {
    return this.cNvPicPr;
  }
}
