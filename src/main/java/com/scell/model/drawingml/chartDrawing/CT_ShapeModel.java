package com.scell.model.drawingml.chartDrawing;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_ShapeStyleModel;
import com.scell.model.drawingml.main.CT_TextBodyModel;

public class CT_ShapeModel {
  private final BooleanModel fPublished;

  private final StringModel macro;

  private final BooleanModel fLocksText;

  private final StringModel textlink;

  private final CT_ShapeNonVisualModel nvSpPr;

  private final CT_ShapePropertiesModel spPr;

  private final CT_ShapeStyleModel style;

  private final CT_TextBodyModel txBody;

  public CT_ShapeModel(BooleanModel fPublished, StringModel macro, BooleanModel fLocksText,
      StringModel textlink, CT_ShapeNonVisualModel nvSpPr, CT_ShapePropertiesModel spPr,
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

  public BooleanModel getFPublished() {
    return this.fPublished;
  }

  public StringModel getMacro() {
    return this.macro;
  }

  public BooleanModel getFLocksText() {
    return this.fLocksText;
  }

  public StringModel getTextlink() {
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
