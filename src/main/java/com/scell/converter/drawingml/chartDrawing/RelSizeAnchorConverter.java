package com.scell.converter.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.RelSizeAnchorModel;
import org.docx4j.dml.chartDrawing.CTRelSizeAnchor;

public class RelSizeAnchorConverter {
  private RelSizeAnchorConverter() {
  }

  public static RelSizeAnchorModel fromDocx4J(CTRelSizeAnchor value) {
    if (value == null) return null;
    RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel spOrGrpSpOrGraphicFrame = new RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel();
    if (value.getSp() != null) spOrGrpSpOrGraphicFrame = RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newSp(ShapeConverter.fromDocx4J(value.getSp()));
    if (value.getGrpSp() != null) spOrGrpSpOrGraphicFrame = RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newGrpSp(GroupShapeConverter.fromDocx4J(value.getGrpSp()));
    if (value.getGraphicFrame() != null) spOrGrpSpOrGraphicFrame = RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newGraphicFrame(GraphicFrameConverter.fromDocx4J(value.getGraphicFrame()));
    if (value.getCxnSp() != null) spOrGrpSpOrGraphicFrame = RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newCxnSp(ConnectorConverter.fromDocx4J(value.getCxnSp()));
    if (value.getPic() != null) spOrGrpSpOrGraphicFrame = RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newPic(PictureConverter.fromDocx4J(value.getPic()));
    return new RelSizeAnchorModel(MarkerConverter.fromDocx4J(value.getFrom()), MarkerConverter.fromDocx4J(value.getTo()), spOrGrpSpOrGraphicFrame);
  }
}
