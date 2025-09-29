package jxsd.gen.model.drawingml.chartDrawing;

import jxsd.gen.builder.drawingml.chartDrawing.ConnectorBuilder;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.ShapeStyleModel;

/**
 * This is a generated sequence class.
 */
public class ConnectorModel {
  private final boolean fPublished;

  private final String macro;

  private final ConnectorNonVisualModel nvCxnSpPr;

  private final ShapePropertiesModel spPr;

  private final ShapeStyleModel style;

  public ConnectorModel(boolean fPublished, String macro, ConnectorNonVisualModel nvCxnSpPr,
      ShapePropertiesModel spPr, ShapeStyleModel style) {
    this.fPublished = fPublished;
    this.macro = macro;
    this.nvCxnSpPr = nvCxnSpPr;
    this.spPr = spPr;
    this.style = style;
  }

  public ConnectorBuilder builder() {
    return new ConnectorBuilder().from(this);
  }

  public boolean getFPublished() {
    return this.fPublished;
  }

  public String getMacro() {
    return this.macro;
  }

  public ConnectorNonVisualModel getNvCxnSpPr() {
    return this.nvCxnSpPr;
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public ShapeStyleModel getStyle() {
    return this.style;
  }
}
