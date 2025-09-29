package jxsd.gen.builder.drawingml.chartDrawing;

import jxsd.gen.model.drawingml.chartDrawing.PictureModel;
import jxsd.gen.model.drawingml.chartDrawing.PictureNonVisualModel;
import jxsd.gen.model.drawingml.main.BlipFillPropertiesModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.ShapeStyleModel;

/**
 * This is a generated sequence class.
 */
public class PictureBuilder {
  private boolean fPublished;

  private String macro;

  private PictureNonVisualModel nvPicPr;

  private BlipFillPropertiesModel blipFill;

  private ShapePropertiesModel spPr;

  private ShapeStyleModel style;

  public PictureBuilder() {
  }

  public PictureBuilder setFPublished(boolean fPublished) {
    this.fPublished = fPublished;
    return this;
  }

  public PictureBuilder setMacro(String macro) {
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

  public PictureBuilder from(PictureModel value) {
    this.fPublished = value.getFPublished();
    this.macro = value.getMacro();
    this.nvPicPr = value.getNvPicPr();
    this.blipFill = value.getBlipFill();
    this.spPr = value.getSpPr();
    this.style = value.getStyle();
    return this;
  }

  public PictureModel build() {
    return new PictureModel(this.fPublished, this.macro, this.nvPicPr, this.blipFill, this.spPr, this.style);
  }
}
