package test.drawingml.chartDrawing;

import test.drawingml.main.CTNonVisualDrawingPropsModel;
import test.drawingml.main.CTNonVisualPicturePropertiesModel;

public class CTPictureNonVisualModel {
  private final CTNonVisualDrawingPropsModel cNvPr;

  private final CTNonVisualPicturePropertiesModel cNvPicPr;

  public CTPictureNonVisualModel(CTNonVisualDrawingPropsModel cNvPr,
      CTNonVisualPicturePropertiesModel cNvPicPr) {
    this.cNvPr = cNvPr;
    this.cNvPicPr = cNvPicPr;
  }

  public CTNonVisualDrawingPropsModel getCNvPr() {
    return this.cNvPr;
  }

  public CTNonVisualPicturePropertiesModel getCNvPicPr() {
    return this.cNvPicPr;
  }
}
