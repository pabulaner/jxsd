package com.scell.converter.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.CT_RelSizeAnchorModel;
import org.docx4j.dml.chartDrawing.CTRelSizeAnchor;

public class CT_RelSizeAnchorConverter {
  private CT_RelSizeAnchorConverter() {
  }

  public static CT_RelSizeAnchorModel fromDocx4J(CTRelSizeAnchor value) {
    if (value == null) return null;
    // look here false;
    CT_RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel spOrGrpSpOrGraphicFrame = new CT_RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel();
    if (value.getSp() != null) spOrGrpSpOrGraphicFrame = CT_RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newSp(CT_ShapeConverter.fromDocx4J(value.getSp()));
    if (value.getGrpSp() != null) spOrGrpSpOrGraphicFrame = CT_RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newGrpSp(CT_GroupShapeConverter.fromDocx4J(value.getGrpSp()));
    if (value.getGraphicFrame() != null) spOrGrpSpOrGraphicFrame = CT_RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newGraphicFrame(CT_GraphicFrameConverter.fromDocx4J(value.getGraphicFrame()));
    if (value.getCxnSp() != null) spOrGrpSpOrGraphicFrame = CT_RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newCxnSp(CT_ConnectorConverter.fromDocx4J(value.getCxnSp()));
    if (value.getPic() != null) spOrGrpSpOrGraphicFrame = CT_RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newPic(CT_PictureConverter.fromDocx4J(value.getPic()));
    return new CT_RelSizeAnchorModel(CT_MarkerConverter.fromDocx4J(value.getFrom()), CT_MarkerConverter.fromDocx4J(value.getTo()), spOrGrpSpOrGraphicFrame);
  }

  public static CTRelSizeAnchor toDocx4J(CT_RelSizeAnchorModel value) {
    return null;
  }
}
