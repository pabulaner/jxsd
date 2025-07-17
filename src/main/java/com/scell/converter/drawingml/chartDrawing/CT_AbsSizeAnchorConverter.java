package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.drawingml.main.CT_PositiveSize2DConverter;
import com.scell.model.drawingml.chartDrawing.CT_AbsSizeAnchorModel;
import org.docx4j.dml.chartDrawing.CTAbsSizeAnchor;

public class CT_AbsSizeAnchorConverter {
  private CT_AbsSizeAnchorConverter() {
  }

  public static CT_AbsSizeAnchorModel fromDocx4j(CTAbsSizeAnchor value) {
    if (value == null) return null;
    return new CT_AbsSizeAnchorModel(CT_MarkerConverter.fromDocx4j(value.getFrom()), CT_PositiveSize2DConverter.fromDocx4j(value.getExt()), SpOrGrpSpOrGraphicFrameConverter.fromDocx4j(value.getSpOrGrpSpOrGraphicFrame()));
  }

  public static CTAbsSizeAnchor toDocx4j(CT_AbsSizeAnchorModel value) {
    return null;
  }

  public static class SpOrGrpSpOrGraphicFrameConverter {
    private SpOrGrpSpOrGraphicFrameConverter() {
    }

    public static CT_AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel fromDocx4j(
        CTAbsSizeAnchor.SpOrGrpSpOrGraphicFrame value) {
      if (value == null) return null;
    }

    public static CTAbsSizeAnchor.SpOrGrpSpOrGraphicFrame toDocx4j(
        CT_AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel value) {
      return null;
    }
  }
}
