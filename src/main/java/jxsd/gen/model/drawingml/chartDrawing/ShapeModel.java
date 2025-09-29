package jxsd.gen.model.drawingml.chartDrawing;

import jxsd.gen.builder.drawingml.chartDrawing.ShapeBuilder;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.ShapeStyleModel;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated sequence class.
 */
public class ShapeModel {
  private final boolean fPublished;

  private final String macro;

  private final boolean fLocksText;

  private final String textlink;

  private final ShapeNonVisualModel nvSpPr;

  private final ShapePropertiesModel spPr;

  private final ShapeStyleModel style;

  private final TextBodyModel txBody;

  public ShapeModel(boolean fPublished, String macro, boolean fLocksText, String textlink,
      ShapeNonVisualModel nvSpPr, ShapePropertiesModel spPr, ShapeStyleModel style,
      TextBodyModel txBody) {
    this.fPublished = fPublished;
    this.macro = macro;
    this.fLocksText = fLocksText;
    this.textlink = textlink;
    this.nvSpPr = nvSpPr;
    this.spPr = spPr;
    this.style = style;
    this.txBody = txBody;
  }

  public ShapeBuilder builder() {
    return new ShapeBuilder().from(this);
  }

  public boolean getFPublished() {
    return this.fPublished;
  }

  public String getMacro() {
    return this.macro;
  }

  public boolean getFLocksText() {
    return this.fLocksText;
  }

  public String getTextlink() {
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
