package model.drawingml.chartDrawing;

import model.XMLSchema.booleanModel;
import model.XMLSchema.stringModel;
import model.drawingml.main.CT_ShapePropertiesModel;
import model.drawingml.main.CT_ShapeStyleModel;
import model.drawingml.main.CT_TextBodyModel;

public class CT_ShapeModel {
  private final booleanModel fPublished;

  private final stringModel macro;

  private final booleanModel fLocksText;

  private final stringModel textlink;

  private final CT_ShapeNonVisualModel nvSpPr;

  private final CT_ShapePropertiesModel spPr;

  private final CT_ShapeStyleModel style;

  private final CT_TextBodyModel txBody;

  public CT_ShapeModel(booleanModel fPublished, stringModel macro, booleanModel fLocksText,
      stringModel textlink, CT_ShapeNonVisualModel nvSpPr, CT_ShapePropertiesModel spPr,
      CT_ShapeStyleModel style, CT_TextBodyModel txBody) {
    this.fPublished = fPublished;
    this.macro = macro;
    this.fLocksText = fLocksText;
    this.textlink = textlink;
    this.nvSpPr = nvSpPr;
    this.spPr = spPr;
    this.style = style;
    this.txBody = txBody;
  }

  public booleanModel getFPublished() {
    return this.fPublished;
  }

  public stringModel getMacro() {
    return this.macro;
  }

  public booleanModel getFLocksText() {
    return this.fLocksText;
  }

  public stringModel getTextlink() {
    return this.textlink;
  }

  public CT_ShapeNonVisualModel getNvSpPr() {
    return this.nvSpPr;
  }

  public CT_ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CT_ShapeStyleModel getStyle() {
    return this.style;
  }

  public CT_TextBodyModel getTxBody() {
    return this.txBody;
  }
}
