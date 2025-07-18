package com.scell.converter.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.CT_DrawingModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.chartDrawing.CTAbsSizeAnchor;
import org.docx4j.dml.chartDrawing.CTDrawing;
import org.docx4j.dml.chartDrawing.CTRelSizeAnchor;

public class CT_DrawingConverter {
  private CT_DrawingConverter() {
  }

  public static CT_DrawingModel fromDocx4J(CTDrawing value) {
    if (value == null) return null;
    // look here true;
    List<CT_DrawingModel.EG_AnchorModel> egAnchor = value.getEGAnchor().stream().map(val -> {
      if (val instanceof CTRelSizeAnchor) return CT_DrawingModel.EG_AnchorModel.newRelSizeAnchor(CT_RelSizeAnchorConverter.fromDocx4J((CTRelSizeAnchor) val));
      if (val instanceof CTAbsSizeAnchor) return CT_DrawingModel.EG_AnchorModel.newAbsSizeAnchor(CT_AbsSizeAnchorConverter.fromDocx4J((CTAbsSizeAnchor) val));
      return null;
    } ).collect(Collectors.toList());
    return new CT_DrawingModel(egAnchor);
  }

  public static CTDrawing toDocx4J(CT_DrawingModel value) {
    return null;
  }
}
