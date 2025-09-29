package jxsd.gen.model.drawingml.chartDrawing;

import jxsd.gen.builder.drawingml.chartDrawing.PictureBuilder;
import jxsd.gen.model.drawingml.main.BlipFillPropertiesModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.ShapeStyleModel;

/**
 * This is a generated sequence class.
 */
public class PictureModel {
  private final boolean fPublished;

  private final String macro;

  private final PictureNonVisualModel nvPicPr;

  private final BlipFillPropertiesModel blipFill;

  private final ShapePropertiesModel spPr;

  private final ShapeStyleModel style;

  public PictureModel(boolean fPublished, String macro, PictureNonVisualModel nvPicPr,
      BlipFillPropertiesModel blipFill, ShapePropertiesModel spPr, ShapeStyleModel style) {
    this.fPublished = fPublished;
    this.macro = macro;
    this.nvPicPr = nvPicPr;
    this.blipFill = blipFill;
    this.spPr = spPr;
    this.style = style;
  }

  public PictureBuilder builder() {
    return new PictureBuilder().from(this);
  }

  public boolean getFPublished() {
    return this.fPublished;
  }

  public String getMacro() {
    return this.macro;
  }

  public PictureNonVisualModel getNvPicPr() {
    return this.nvPicPr;
  }

  public BlipFillPropertiesModel getBlipFill() {
    return this.blipFill;
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public ShapeStyleModel getStyle() {
    return this.style;
  }
}
