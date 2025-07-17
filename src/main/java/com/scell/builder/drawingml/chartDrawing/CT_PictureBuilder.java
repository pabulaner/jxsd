package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.chartDrawing.CT_PictureModel;
import com.scell.model.drawingml.chartDrawing.CT_PictureNonVisualModel;
import com.scell.model.drawingml.main.CT_BlipFillPropertiesModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_ShapeStyleModel;

public class CT_PictureBuilder {
  private BooleanModel fPublished;

  private StringModel macro;

  private CT_PictureNonVisualModel nvPicPr;

  private CT_BlipFillPropertiesModel blipFill;

  private CT_ShapePropertiesModel spPr;

  private CT_ShapeStyleModel style;

  public CT_PictureBuilder() {
  }

  public CT_PictureBuilder setFPublished(BooleanModel fPublished) {
    this.fPublished = fPublished;
    return this;
  }

  public CT_PictureBuilder setMacro(StringModel macro) {
    this.macro = macro;
    return this;
  }

  public CT_PictureBuilder setNvPicPr(CT_PictureNonVisualModel nvPicPr) {
    this.nvPicPr = nvPicPr;
    return this;
  }

  public CT_PictureBuilder setBlipFill(CT_BlipFillPropertiesModel blipFill) {
    this.blipFill = blipFill;
    return this;
  }

  public CT_PictureBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_PictureBuilder setStyle(CT_ShapeStyleModel style) {
    this.style = style;
    return this;
  }

  public CT_PictureModel build() {
    return new CT_PictureModel(this.fPublished, this.macro, this.nvPicPr, this.blipFill, this.spPr, this.style);
  }

  public CT_PictureBuilder from(CT_PictureModel value) {
    this.fPublished = value.getFPublished();
    this.macro = value.getMacro();
    this.nvPicPr = value.getNvPicPr();
    this.blipFill = value.getBlipFill();
    this.spPr = value.getSpPr();
    this.style = value.getStyle();
    return this;
  }
}
