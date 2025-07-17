package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.chartDrawing.CT_ConnectorModel;
import com.scell.model.drawingml.chartDrawing.CT_ConnectorNonVisualModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_ShapeStyleModel;

public class CT_ConnectorBuilder {
  private BooleanModel fPublished;

  private StringModel macro;

  private CT_ConnectorNonVisualModel nvCxnSpPr;

  private CT_ShapePropertiesModel spPr;

  private CT_ShapeStyleModel style;

  public CT_ConnectorBuilder() {
  }

  public CT_ConnectorBuilder setFPublished(BooleanModel fPublished) {
    this.fPublished = fPublished;
    return this;
  }

  public CT_ConnectorBuilder setMacro(StringModel macro) {
    this.macro = macro;
    return this;
  }

  public CT_ConnectorBuilder setNvCxnSpPr(CT_ConnectorNonVisualModel nvCxnSpPr) {
    this.nvCxnSpPr = nvCxnSpPr;
    return this;
  }

  public CT_ConnectorBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_ConnectorBuilder setStyle(CT_ShapeStyleModel style) {
    this.style = style;
    return this;
  }

  public CT_ConnectorModel build() {
    return new CT_ConnectorModel(this.fPublished, this.macro, this.nvCxnSpPr, this.spPr, this.style);
  }

  public CT_ConnectorBuilder from(CT_ConnectorModel value) {
    this.fPublished = value.getFPublished();
    this.macro = value.getMacro();
    this.nvCxnSpPr = value.getNvCxnSpPr();
    this.spPr = value.getSpPr();
    this.style = value.getStyle();
    return this;
  }
}
