package jxsd.gen.converter.drawingml.chartDrawing;

import java.util.List;
import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chartDrawing.DrawingModel;
import org.docx4j.dml.chartDrawing.CTAbsSizeAnchor;
import org.docx4j.dml.chartDrawing.CTDrawing;
import org.docx4j.dml.chartDrawing.CTRelSizeAnchor;

/**
 * This is a generated sequence class.
 */
public class DrawingConverter {
  private DrawingConverter() {
  }

  public static DrawingModel fromDocx4j(CTDrawing value) {
    if (value == null) return null;
    List<DrawingModel.EG_Anchor> egAnchor = value.getEGAnchor().stream().map(val -> {
      if (val instanceof CTRelSizeAnchor) return DrawingModel.EG_Anchor.newRelSizeAnchor(RelSizeAnchorConverter.fromDocx4j((CTRelSizeAnchor) val));
      if (val instanceof CTAbsSizeAnchor) return DrawingModel.EG_Anchor.newAbsSizeAnchor(AbsSizeAnchorConverter.fromDocx4j((CTAbsSizeAnchor) val));
      return null;
    } ).collect(Collectors.toList());
    return new DrawingModel(egAnchor);
  }

  public static CTDrawing toDocx4j(DrawingModel value) {
    if (value == null) return null;
    CTDrawing result = new CTDrawing();
    result.getEGAnchor().addAll(value.getEGAnchor().stream().map(val -> {
      if (val.isRelSizeAnchor()) return RelSizeAnchorConverter.toDocx4j(val.getRelSizeAnchor());
      if (val.isAbsSizeAnchor()) return AbsSizeAnchorConverter.toDocx4j(val.getAbsSizeAnchor());
      return null;
    } ).collect(Collectors.toList()));
    return result;
  }
}
