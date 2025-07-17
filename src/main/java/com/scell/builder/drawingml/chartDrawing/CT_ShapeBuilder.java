package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.chartDrawing.CT_ShapeModel;
import com.scell.model.drawingml.chartDrawing.CT_ShapeNonVisualModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_ShapeStyleModel;
import com.scell.model.drawingml.main.CT_TextBodyModel;

public class CT_ShapeBuilder {
  private BooleanModel fPublished;

  private StringModel macro;

  private BooleanModel fLocksText;

  private StringModel textlink;

  private CT_ShapeNonVisualModel nvSpPr;

  private CT_ShapePropertiesModel spPr;

  private CT_ShapeStyleModel style;

  private CT_TextBodyModel txBody;

  public CT_ShapeBuilder() {
  }

  public CT_ShapeBuilder setFPublished(BooleanModel fPublished) {
    this.fPublished = fPublished;
    return this;
  }

  public CT_ShapeBuilder setMacro(StringModel macro) {
    this.macro = macro;
    return this;
  }

  public CT_ShapeBuilder setFLocksText(BooleanModel fLocksText) {
    this.fLocksText = fLocksText;
    return this;
  }

  public CT_ShapeBuilder setTextlink(StringModel textlink) {
    this.textlink = textlink;
    return this;
  }

  public CT_ShapeBuilder setNvSpPr(CT_ShapeNonVisualModel nvSpPr) {
    this.nvSpPr = nvSpPr;
    return this;
  }

  public CT_ShapeBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_ShapeBuilder setStyle(CT_ShapeStyleModel style) {
    this.style = style;
    return this;
  }

  public CT_ShapeBuilder setTxBody(CT_TextBodyModel txBody) {
    this.txBody = txBody;
    return this;
  }

  public CT_ShapeModel build() {
    return new CT_ShapeModel(this.fPublished, this.macro, this.fLocksText, this.textlink, this.nvSpPr, this.spPr, this.style, this.txBody);
  }

  public CT_ShapeBuilder from(CT_ShapeModel value) {
    this.fPublished = value.getFPublished();
    this.macro = value.getMacro();
    this.fLocksText = value.getFLocksText();
    this.textlink = value.getTextlink();
    this.nvSpPr = value.getNvSpPr();
    this.spPr = value.getSpPr();
    this.style = value.getStyle();
    this.txBody = value.getTxBody();
    return this;
  }
}
