package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.drawingml.chartDrawing.PictureModel;
import com.scell.model.drawingml.chartDrawing.PictureNonVisualModel;
import com.scell.model.drawingml.main.BlipFillPropertiesModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.ShapeStyleModel;

public class PictureBuilder {
  private BooleanValueModel fPublished;

  private StringValueModel macro;

  private PictureNonVisualModel nvPicPr;

  private BlipFillPropertiesModel blipFill;

  private ShapePropertiesModel spPr;

  private ShapeStyleModel style;

  public PictureBuilder() {
  }

  public PictureBuilder setFPublished(BooleanValueModel fPublished) {
    this.fPublished = fPublished;
    return this;
  }

  public PictureBuilder setMacro(StringValueModel macro) {
    this.macro = macro;
    return this;
  }

  public PictureBuilder setNvPicPr(PictureNonVisualModel nvPicPr) {
    this.nvPicPr = nvPicPr;
    return this;
  }

  public PictureBuilder setBlipFill(BlipFillPropertiesModel blipFill) {
    this.blipFill = blipFill;
    return this;
  }

  public PictureBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public PictureBuilder setStyle(ShapeStyleModel style) {
    this.style = style;
    return this;
  }

  public PictureModel build() {
    return new PictureModel(this.fPublished, this.macro, this.nvPicPr, this.blipFill, this.spPr, this.style);
  }

  public PictureBuilder from(PictureModel value) {
    this.fPublished = value.getFPublished();
    this.macro = value.getMacro();
    this.nvPicPr = value.getNvPicPr();
    this.blipFill = value.getBlipFill();
    this.spPr = value.getSpPr();
    this.style = value.getStyle();
    return this;
  }
}
