package com.scell.model.drawingml.chartDrawing;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.ShapeStyleModel;
import com.scell.model.drawingml.main.TextBodyModel;

public class ShapeModel {
  private final BooleanModel fPublished;

  private final StringModel macro;

  private final BooleanModel fLocksText;

  private final StringModel textlink;

  private final ShapeNonVisualModel nvSpPr;

  private final ShapePropertiesModel spPr;

  private final ShapeStyleModel style;

  private final TextBodyModel txBody;

  public ShapeModel(BooleanModel fPublished, StringModel macro, BooleanModel fLocksText,
      StringModel textlink, ShapeNonVisualModel nvSpPr, ShapePropertiesModel spPr,
      ShapeStyleModel style, TextBodyModel txBody) {
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

  public ShapeNonVisualModel getNvSpPr() {
    return this.nvSpPr;
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public ShapeStyleModel getStyle() {
    return this.style;
  }

  public TextBodyModel getTxBody() {
    return this.txBody;
  }
}
