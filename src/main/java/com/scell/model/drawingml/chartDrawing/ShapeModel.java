package com.scell.model.drawingml.chartDrawing;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.ShapeStyleModel;
import com.scell.model.drawingml.main.TextBodyModel;

public class ShapeModel {
  private final BooleanValueModel fPublished;

  private final StringValueModel macro;

  private final BooleanValueModel fLocksText;

  private final StringValueModel textlink;

  private final ShapeNonVisualModel nvSpPr;

  private final ShapePropertiesModel spPr;

  private final ShapeStyleModel style;

  private final TextBodyModel txBody;

  public ShapeModel(BooleanValueModel fPublished, StringValueModel macro,
      BooleanValueModel fLocksText, StringValueModel textlink, ShapeNonVisualModel nvSpPr,
      ShapePropertiesModel spPr, ShapeStyleModel style, TextBodyModel txBody) {
    this.fPublished = fPublished;
    this.macro = macro;
    this.fLocksText = fLocksText;
    this.textlink = textlink;
    this.nvSpPr = nvSpPr;
    this.spPr = spPr;
    this.style = style;
    this.txBody = txBody;
  }

  public BooleanValueModel getFPublished() {
    return this.fPublished;
  }

  public StringValueModel getMacro() {
    return this.macro;
  }

  public BooleanValueModel getFLocksText() {
    return this.fLocksText;
  }

  public StringValueModel getTextlink() {
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
