package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.drawingml.main.PositiveSize2DConverter;
import com.scell.model.drawingml.chartDrawing.AbsSizeAnchorModel;
import org.docx4j.dml.chartDrawing.CTAbsSizeAnchor;

public class AbsSizeAnchorConverter {
  private AbsSizeAnchorConverter() {
  }

  public static AbsSizeAnchorModel fromDocx4J(CTAbsSizeAnchor value) {
    if (value == null) return null;
    AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel spOrGrpSpOrGraphicFrame = new AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel();
    if (value.getSp() != null) spOrGrpSpOrGraphicFrame = AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel.newSp(ShapeConverter.fromDocx4J(value.getSp()));
    if (value.getGrpSp() != null) spOrGrpSpOrGraphicFrame = AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel.newGrpSp(GroupShapeConverter.fromDocx4J(value.getGrpSp()));
    if (value.getGraphicFrame() != null) spOrGrpSpOrGraphicFrame = AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel.newGraphicFrame(GraphicFrameConverter.fromDocx4J(value.getGraphicFrame()));
    if (value.getCxnSp() != null) spOrGrpSpOrGraphicFrame = AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel.newCxnSp(ConnectorConverter.fromDocx4J(value.getCxnSp()));
    if (value.getPic() != null) spOrGrpSpOrGraphicFrame = AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel.newPic(PictureConverter.fromDocx4J(value.getPic()));
    return new AbsSizeAnchorModel(MarkerConverter.fromDocx4J(value.getFrom()), PositiveSize2DConverter.fromDocx4J(value.getExt()), spOrGrpSpOrGraphicFrame);
  }
}
