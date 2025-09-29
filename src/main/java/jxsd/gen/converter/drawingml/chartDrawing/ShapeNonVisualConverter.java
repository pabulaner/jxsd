package jxsd.gen.converter.drawingml.chartDrawing;

import jxsd.gen.converter.drawingml.main.NonVisualDrawingPropsConverter;
import jxsd.gen.converter.drawingml.main.NonVisualDrawingShapePropsConverter;
import jxsd.gen.model.drawingml.chartDrawing.ShapeNonVisualModel;
import org.docx4j.dml.chartDrawing.CTShapeNonVisual;

/**
 * This is a generated sequence class.
 */
public class ShapeNonVisualConverter {
  private ShapeNonVisualConverter() {
  }

  public static ShapeNonVisualModel fromDocx4j(CTShapeNonVisual value) {
    if (value == null) return null;
    return new ShapeNonVisualModel(NonVisualDrawingPropsConverter.fromDocx4j(value.getCNvPr()), NonVisualDrawingShapePropsConverter.fromDocx4j(value.getCNvSpPr()));
  }

  public static CTShapeNonVisual toDocx4j(ShapeNonVisualModel value) {
    if (value == null) return null;
    CTShapeNonVisual result = new CTShapeNonVisual();
    result.setCNvPr(NonVisualDrawingPropsConverter.toDocx4j(value.getCNvPr()));
    result.setCNvSpPr(NonVisualDrawingShapePropsConverter.toDocx4j(value.getCNvSpPr()));
    return result;
  }
}
