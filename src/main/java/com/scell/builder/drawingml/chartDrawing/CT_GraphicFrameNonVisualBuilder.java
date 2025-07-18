package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.CT_GraphicFrameNonVisualModel;
import com.scell.model.drawingml.main.CT_NonVisualDrawingPropsModel;
import com.scell.model.drawingml.main.CT_NonVisualGraphicFramePropertiesModel;

public class CT_GraphicFrameNonVisualBuilder {
  private CT_NonVisualDrawingPropsModel cNvPr;

  private CT_NonVisualGraphicFramePropertiesModel cNvGraphicFramePr;

  public CT_GraphicFrameNonVisualBuilder() {
  }

  public CT_GraphicFrameNonVisualBuilder setCNvPr(CT_NonVisualDrawingPropsModel cNvPr) {
    this.cNvPr = cNvPr;
    return this;
  }

  public CT_GraphicFrameNonVisualBuilder setCNvGraphicFramePr(
      CT_NonVisualGraphicFramePropertiesModel cNvGraphicFramePr) {
    this.cNvGraphicFramePr = cNvGraphicFramePr;
    return this;
  }

  public CT_GraphicFrameNonVisualModel build() {
    return new CT_GraphicFrameNonVisualModel(this.cNvPr, this.cNvGraphicFramePr);
  }

  public CT_GraphicFrameNonVisualBuilder from(CT_GraphicFrameNonVisualModel value) {
    this.cNvPr = value.getCNvPr();
    this.cNvGraphicFramePr = value.getCNvGraphicFramePr();
    return this;
  }
}
