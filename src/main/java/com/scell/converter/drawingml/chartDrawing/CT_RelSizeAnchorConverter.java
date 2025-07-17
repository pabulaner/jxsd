package com.scell.converter.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.CT_RelSizeAnchorModel;
import org.docx4j.dml.chartDrawing.CTRelSizeAnchor;

public class CT_RelSizeAnchorConverter {
  private CT_RelSizeAnchorConverter() {
  }

  public static CT_RelSizeAnchorModel fromDocx4j(CTRelSizeAnchor value) {
    if (value == null) return null;
    return new CT_RelSizeAnchorModel(CT_MarkerConverter.fromDocx4j(value.getFrom()), CT_MarkerConverter.fromDocx4j(value.getTo()), SpOrGrpSpOrGraphicFrameConverter.fromDocx4j(value.getSpOrGrpSpOrGraphicFrame()));
  }

  public static CTRelSizeAnchor toDocx4j(CT_RelSizeAnchorModel value) {
    return null;
  }

  public static class SpOrGrpSpOrGraphicFrameConverter {
    private SpOrGrpSpOrGraphicFrameConverter() {
    }

    public static CT_RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel fromDocx4j(
        CTRelSizeAnchor.SpOrGrpSpOrGraphicFrame value) {
      if (value == null) return null;
    }

    public static CTRelSizeAnchor.SpOrGrpSpOrGraphicFrame toDocx4j(
        CT_RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel value) {
      return null;
    }
  }
}
