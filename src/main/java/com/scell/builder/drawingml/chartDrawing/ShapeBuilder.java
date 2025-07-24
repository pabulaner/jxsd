package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.chartDrawing.ShapeModel;
import com.scell.model.drawingml.chartDrawing.ShapeNonVisualModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.ShapeStyleModel;
import com.scell.model.drawingml.main.TextBodyModel;

public class ShapeBuilder {
  private BooleanModel fPublished;

  private StringModel macro;

  private BooleanModel fLocksText;

  private StringModel textlink;

  private ShapeNonVisualModel nvSpPr;

  private ShapePropertiesModel spPr;

  private ShapeStyleModel style;

  private TextBodyModel txBody;

  public ShapeBuilder() {
  }

  public ShapeBuilder setFPublished(BooleanModel fPublished) {
    this.fPublished = fPublished;
    return this;
  }

  public ShapeBuilder setMacro(StringModel macro) {
    this.macro = macro;
    return this;
  }

  public ShapeBuilder setFLocksText(BooleanModel fLocksText) {
    this.fLocksText = fLocksText;
    return this;
  }

  public ShapeBuilder setTextlink(StringModel textlink) {
    this.textlink = textlink;
    return this;
  }

  public ShapeBuilder setNvSpPr(ShapeNonVisualModel nvSpPr) {
    this.nvSpPr = nvSpPr;
    return this;
  }

  public ShapeBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public ShapeBuilder setStyle(ShapeStyleModel style) {
    this.style = style;
    return this;
  }

  public ShapeBuilder setTxBody(TextBodyModel txBody) {
    this.txBody = txBody;
    return this;
  }

  public ShapeModel build() {
    return new ShapeModel(this.fPublished, this.macro, this.fLocksText, this.textlink, this.nvSpPr, this.spPr, this.style, this.txBody);
  }

  public ShapeBuilder from(ShapeModel value) {
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
