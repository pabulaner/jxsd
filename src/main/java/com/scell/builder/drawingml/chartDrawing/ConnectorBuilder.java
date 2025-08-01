package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.drawingml.chartDrawing.ConnectorModel;
import com.scell.model.drawingml.chartDrawing.ConnectorNonVisualModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.ShapeStyleModel;

public class ConnectorBuilder {
  private BooleanValueModel fPublished;

  private StringValueModel macro;

  private ConnectorNonVisualModel nvCxnSpPr;

  private ShapePropertiesModel spPr;

  private ShapeStyleModel style;

  public ConnectorBuilder() {
  }

  public ConnectorBuilder setFPublished(BooleanValueModel fPublished) {
    this.fPublished = fPublished;
    return this;
  }

  public ConnectorBuilder setMacro(StringValueModel macro) {
    this.macro = macro;
    return this;
  }

  public ConnectorBuilder setNvCxnSpPr(ConnectorNonVisualModel nvCxnSpPr) {
    this.nvCxnSpPr = nvCxnSpPr;
    return this;
  }

  public ConnectorBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public ConnectorBuilder setStyle(ShapeStyleModel style) {
    this.style = style;
    return this;
  }

  public ConnectorModel build() {
    return new ConnectorModel(this.fPublished, this.macro, this.nvCxnSpPr, this.spPr, this.style);
  }

  public ConnectorBuilder from(ConnectorModel value) {
    this.fPublished = value.getFPublished();
    this.macro = value.getMacro();
    this.nvCxnSpPr = value.getNvCxnSpPr();
    this.spPr = value.getSpPr();
    this.style = value.getStyle();
    return this;
  }
}
