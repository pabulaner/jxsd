package com.scell.model.drawingml.chartDrawing;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.ShapeStyleModel;

public class ConnectorModel {
  private final BooleanValueModel fPublished;

  private final StringValueModel macro;

  private final ConnectorNonVisualModel nvCxnSpPr;

  private final ShapePropertiesModel spPr;

  private final ShapeStyleModel style;

  public ConnectorModel(BooleanValueModel fPublished, StringValueModel macro,
      ConnectorNonVisualModel nvCxnSpPr, ShapePropertiesModel spPr, ShapeStyleModel style) {
    this.fPublished = fPublished;
    this.macro = macro;
    this.nvCxnSpPr = nvCxnSpPr;
    this.spPr = spPr;
    this.style = style;
  }

  public BooleanValueModel getFPublished() {
    return this.fPublished;
  }

  public StringValueModel getMacro() {
    return this.macro;
  }

  public ConnectorNonVisualModel getNvCxnSpPr() {
    return this.nvCxnSpPr;
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public ShapeStyleModel getStyle() {
    return this.style;
  }
}
