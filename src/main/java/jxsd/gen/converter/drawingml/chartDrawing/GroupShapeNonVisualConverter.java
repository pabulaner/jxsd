package jxsd.gen.converter.drawingml.chartDrawing;

import jxsd.gen.converter.drawingml.main.NonVisualDrawingPropsConverter;
import jxsd.gen.converter.drawingml.main.NonVisualGroupDrawingShapePropsConverter;
import jxsd.gen.model.drawingml.chartDrawing.GroupShapeNonVisualModel;
import org.docx4j.dml.chartDrawing.CTGroupShapeNonVisual;

/**
 * This is a generated sequence class.
 */
public class GroupShapeNonVisualConverter {
  private GroupShapeNonVisualConverter() {
  }

  public static GroupShapeNonVisualModel fromDocx4j(CTGroupShapeNonVisual value) {
    if (value == null) return null;
    return new GroupShapeNonVisualModel(NonVisualDrawingPropsConverter.fromDocx4j(value.getCNvPr()), NonVisualGroupDrawingShapePropsConverter.fromDocx4j(value.getCNvGrpSpPr()));
  }

  public static CTGroupShapeNonVisual toDocx4j(GroupShapeNonVisualModel value) {
    if (value == null) return null;
    CTGroupShapeNonVisual result = new CTGroupShapeNonVisual();
    result.setCNvPr(NonVisualDrawingPropsConverter.toDocx4j(value.getCNvPr()));
    result.setCNvGrpSpPr(NonVisualGroupDrawingShapePropsConverter.toDocx4j(value.getCNvGrpSpPr()));
    return result;
  }
}
