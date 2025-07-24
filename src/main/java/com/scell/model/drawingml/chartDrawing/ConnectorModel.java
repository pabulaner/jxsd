package com.scell.model.drawingml.chartDrawing;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.ShapeStyleModel;

public class ConnectorModel {
  private final BooleanModel fPublished;

  private final StringModel macro;

  private final ConnectorNonVisualModel nvCxnSpPr;

  private final ShapePropertiesModel spPr;

  private final ShapeStyleModel style;

  public ConnectorModel(BooleanModel fPublished, StringModel macro,
      ConnectorNonVisualModel nvCxnSpPr, ShapePropertiesModel spPr, ShapeStyleModel style) {
    this.fPublished = fPublished;
    this.macro = macro;
    this.nvCxnSpPr = nvCxnSpPr;
    this.spPr = spPr;
    this.style = style;
  }

  public BooleanModel getFPublished() {
    return this.fPublished;
  }

  public StringModel getMacro() {
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
