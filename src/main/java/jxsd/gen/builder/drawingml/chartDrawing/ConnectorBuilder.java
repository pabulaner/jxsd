package jxsd.gen.builder.drawingml.chartDrawing;

import jxsd.gen.model.drawingml.chartDrawing.ConnectorModel;
import jxsd.gen.model.drawingml.chartDrawing.ConnectorNonVisualModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.ShapeStyleModel;

/**
 * This is a generated sequence class.
 */
public class ConnectorBuilder {
  private boolean fPublished;

  private String macro;

  private ConnectorNonVisualModel nvCxnSpPr;

  private ShapePropertiesModel spPr;

  private ShapeStyleModel style;

  public ConnectorBuilder() {
  }

  public ConnectorBuilder setFPublished(boolean fPublished) {
    this.fPublished = fPublished;
    return this;
  }

  public ConnectorBuilder setMacro(String macro) {
    this.macro = macro;
    return this;
  }

  public ConnectorBuilder setNvCxnSpPr(ConnectorNonVisualModel nvCxnSpPr) {
    this.nvCxnSpPr = nvCxnSpPr;
    return this;
  }

  public ConnectorBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public ConnectorBuilder setStyle(ShapeStyleModel style) {
    this.style = style;
    return this;
  }

  public ConnectorBuilder from(ConnectorModel value) {
    this.fPublished = value.getFPublished();
    this.macro = value.getMacro();
    this.nvCxnSpPr = value.getNvCxnSpPr();
    this.spPr = value.getSpPr();
    this.style = value.getStyle();
    return this;
  }

  public ConnectorModel build() {
    return new ConnectorModel(this.fPublished, this.macro, this.nvCxnSpPr, this.spPr, this.style);
  }
}
