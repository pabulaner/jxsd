package model.drawingml.chartDrawing;

import model.XMLSchema.booleanModel;
import model.XMLSchema.stringModel;
import model.drawingml.main.CT_ShapePropertiesModel;
import model.drawingml.main.CT_ShapeStyleModel;

public class CT_ConnectorModel {
  private final booleanModel fPublished;

  private final stringModel macro;

  private final CT_ConnectorNonVisualModel nvCxnSpPr;

  private final CT_ShapePropertiesModel spPr;

  private final CT_ShapeStyleModel style;

  public CT_ConnectorModel(booleanModel fPublished, stringModel macro,
      CT_ConnectorNonVisualModel nvCxnSpPr, CT_ShapePropertiesModel spPr,
      CT_ShapeStyleModel style) {
    this.fPublished = fPublished;
    this.macro = macro;
    this.nvCxnSpPr = nvCxnSpPr;
    this.spPr = spPr;
    this.style = style;
  }

  public booleanModel getFPublished() {
    return this.fPublished;
  }

  public stringModel getMacro() {
    return this.macro;
  }

  public CT_ConnectorNonVisualModel getNvCxnSpPr() {
    return this.nvCxnSpPr;
  }

  public CT_ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CT_ShapeStyleModel getStyle() {
    return this.style;
  }
}
