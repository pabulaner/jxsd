package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.drawingml.main.CT_PositiveSize2DConverter;
import com.scell.model.drawingml.chartDrawing.CT_AbsSizeAnchorModel;
import org.docx4j.dml.chartDrawing.CTAbsSizeAnchor;

public class CT_AbsSizeAnchorConverter {
  private CT_AbsSizeAnchorConverter() {
  }

  public static CT_AbsSizeAnchorModel fromDocx4J(CTAbsSizeAnchor value) {
    if (value == null) return null;
    // look here false;
    CT_AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel spOrGrpSpOrGraphicFrame = new CT_AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel();
    if (value.getSp() != null) spOrGrpSpOrGraphicFrame = CT_AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newSp(CT_ShapeConverter.fromDocx4J(value.getSp()));
    if (value.getGrpSp() != null) spOrGrpSpOrGraphicFrame = CT_AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newGrpSp(CT_GroupShapeConverter.fromDocx4J(value.getGrpSp()));
    if (value.getGraphicFrame() != null) spOrGrpSpOrGraphicFrame = CT_AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newGraphicFrame(CT_GraphicFrameConverter.fromDocx4J(value.getGraphicFrame()));
    if (value.getCxnSp() != null) spOrGrpSpOrGraphicFrame = CT_AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newCxnSp(CT_ConnectorConverter.fromDocx4J(value.getCxnSp()));
    if (value.getPic() != null) spOrGrpSpOrGraphicFrame = CT_AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newPic(CT_PictureConverter.fromDocx4J(value.getPic()));
    return new CT_AbsSizeAnchorModel(CT_MarkerConverter.fromDocx4J(value.getFrom()), CT_PositiveSize2DConverter.fromDocx4J(value.getExt()), spOrGrpSpOrGraphicFrame);
  }

  public static CTAbsSizeAnchor toDocx4J(CT_AbsSizeAnchorModel value) {
    return null;
  }
}
