package com.scell.converter.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.RelSizeAnchorModel;
import org.docx4j.dml.chartDrawing.CTRelSizeAnchor;

public class RelSizeAnchorConverter {
  private RelSizeAnchorConverter() {
  }

  public static RelSizeAnchorModel fromDocx4J(CTRelSizeAnchor value) {
    if (value == null) return null;
    RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel spOrGrpSpOrGraphicFrame = new RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel();
    if (value.getSp() != null) spOrGrpSpOrGraphicFrame = RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel.newSp(ShapeConverter.fromDocx4J(value.getSp()));
    if (value.getGrpSp() != null) spOrGrpSpOrGraphicFrame = RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel.newGrpSp(GroupShapeConverter.fromDocx4J(value.getGrpSp()));
    if (value.getGraphicFrame() != null) spOrGrpSpOrGraphicFrame = RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel.newGraphicFrame(GraphicFrameConverter.fromDocx4J(value.getGraphicFrame()));
    if (value.getCxnSp() != null) spOrGrpSpOrGraphicFrame = RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel.newCxnSp(ConnectorConverter.fromDocx4J(value.getCxnSp()));
    if (value.getPic() != null) spOrGrpSpOrGraphicFrame = RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel.newPic(PictureConverter.fromDocx4J(value.getPic()));
    return new RelSizeAnchorModel(MarkerConverter.fromDocx4J(value.getFrom()), MarkerConverter.fromDocx4J(value.getTo()), spOrGrpSpOrGraphicFrame);
  }
}
