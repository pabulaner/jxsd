package jxsd.gen.converter.drawingml.chartDrawing;

import jxsd.gen.model.drawingml.chartDrawing.RelSizeAnchorModel;
import org.docx4j.dml.chartDrawing.CTRelSizeAnchor;

/**
 * This is a generated sequence class.
 */
public class RelSizeAnchorConverter {
  private RelSizeAnchorConverter() {
  }

  public static RelSizeAnchorModel fromDocx4j(CTRelSizeAnchor value) {
    if (value == null) return null;
    RelSizeAnchorModel.SpOrGrpSpOrGraphicFrame spOrGrpSpOrGraphicFrame = new RelSizeAnchorModel.SpOrGrpSpOrGraphicFrame();
    if (value.getSp() != null) spOrGrpSpOrGraphicFrame = RelSizeAnchorConverter.newSpOrGrpSpOrGraphicFrame(RelSizeAnchorConverter.fromDocx4j(value.getSp()));
    if (value.getGrpSp() != null) spOrGrpSpOrGraphicFrame = RelSizeAnchorConverter.newSpOrGrpSpOrGraphicFrame(RelSizeAnchorConverter.fromDocx4j(value.getGrpSp()));
    if (value.getGraphicFrame() != null) spOrGrpSpOrGraphicFrame = RelSizeAnchorConverter.newSpOrGrpSpOrGraphicFrame(RelSizeAnchorConverter.fromDocx4j(value.getGraphicFrame()));
    if (value.getCxnSp() != null) spOrGrpSpOrGraphicFrame = RelSizeAnchorConverter.newSpOrGrpSpOrGraphicFrame(RelSizeAnchorConverter.fromDocx4j(value.getCxnSp()));
    if (value.getPic() != null) spOrGrpSpOrGraphicFrame = RelSizeAnchorConverter.newSpOrGrpSpOrGraphicFrame(RelSizeAnchorConverter.fromDocx4j(value.getPic()));
    return new RelSizeAnchorModel(MarkerConverter.fromDocx4j(value.getFrom()), MarkerConverter.fromDocx4j(value.getTo()), spOrGrpSpOrGraphicFrame);
  }

  public static CTRelSizeAnchor toDocx4j(RelSizeAnchorModel value) {
    if (value == null) return null;
    CTRelSizeAnchor result = new CTRelSizeAnchor();
    result.setFrom(MarkerConverter.toDocx4j(value.getFrom()));
    result.setTo(MarkerConverter.toDocx4j(value.getTo()));
    if (value.getSpOrGrpSpOrGraphicFrame().isSp()) result.setSp(ShapeConverter.toDocx4j(value.getSpOrGrpSpOrGraphicFrame().getSp()));
    if (value.getSpOrGrpSpOrGraphicFrame().isGrpSp()) result.setGrpSp(GroupShapeConverter.toDocx4j(value.getSpOrGrpSpOrGraphicFrame().getGrpSp()));
    if (value.getSpOrGrpSpOrGraphicFrame().isGraphicFrame()) result.setGraphicFrame(GraphicFrameConverter.toDocx4j(value.getSpOrGrpSpOrGraphicFrame().getGraphicFrame()));
    if (value.getSpOrGrpSpOrGraphicFrame().isCxnSp()) result.setCxnSp(ConnectorConverter.toDocx4j(value.getSpOrGrpSpOrGraphicFrame().getCxnSp()));
    if (value.getSpOrGrpSpOrGraphicFrame().isPic()) result.setPic(PictureConverter.toDocx4j(value.getSpOrGrpSpOrGraphicFrame().getPic()));
    return result;
  }
}
