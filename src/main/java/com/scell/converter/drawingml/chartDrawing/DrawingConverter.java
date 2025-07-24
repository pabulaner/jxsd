package com.scell.converter.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.DrawingModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.chartDrawing.CTAbsSizeAnchor;
import org.docx4j.dml.chartDrawing.CTDrawing;
import org.docx4j.dml.chartDrawing.CTRelSizeAnchor;

public class DrawingConverter {
  private DrawingConverter() {
  }

  public static DrawingModel fromDocx4J(CTDrawing value) {
    if (value == null) return null;
    List<DrawingModel.AnchorModel> egAnchor = value.getEGAnchor().stream().map(val -> {
      if (val instanceof CTRelSizeAnchor) return DrawingModel.AnchorModel.newRelSizeAnchor(RelSizeAnchorConverter.fromDocx4J((CTRelSizeAnchor) val));
      if (val instanceof CTAbsSizeAnchor) return DrawingModel.AnchorModel.newAbsSizeAnchor(AbsSizeAnchorConverter.fromDocx4J((CTAbsSizeAnchor) val));
      return new DrawingModel.AnchorModel();
    } ).collect(Collectors.toList());
    return new DrawingModel(egAnchor);
  }
}
