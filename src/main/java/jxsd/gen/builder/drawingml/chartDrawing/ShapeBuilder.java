package jxsd.gen.builder.drawingml.chartDrawing;

import jxsd.gen.model.drawingml.chartDrawing.ShapeModel;
import jxsd.gen.model.drawingml.chartDrawing.ShapeNonVisualModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.ShapeStyleModel;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated sequence class.
 */
public class ShapeBuilder {
  private boolean fPublished;

  private String macro;

  private boolean fLocksText;

  private String textlink;

  private ShapeNonVisualModel nvSpPr;

  private ShapePropertiesModel spPr;

  private ShapeStyleModel style;

  private TextBodyModel txBody;

  public ShapeBuilder() {
  }

  public ShapeBuilder setFPublished(boolean fPublished) {
    this.fPublished = fPublished;
    return this;
  }

  public ShapeBuilder setMacro(String macro) {
    this.macro = macro;
    return this;
  }

  public ShapeBuilder setFLocksText(boolean fLocksText) {
    this.fLocksText = fLocksText;
    return this;
  }

  public ShapeBuilder setTextlink(String textlink) {
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

  public ShapeModel build() {
    return new ShapeModel(this.fPublished, this.macro, this.fLocksText, this.textlink, this.nvSpPr, this.spPr, this.style, this.txBody);
  }
}
