package jxsd.gen.converter.drawingml.chartDrawing;

import jxsd.gen.converter.drawingml.main.PositiveSize2DConverter;
import jxsd.gen.model.drawingml.chartDrawing.AbsSizeAnchorModel;
import org.docx4j.dml.chartDrawing.CTAbsSizeAnchor;

/**
 * This is a generated sequence class.
 */
public class AbsSizeAnchorConverter {
  private AbsSizeAnchorConverter() {
  }

  public static AbsSizeAnchorModel fromDocx4j(CTAbsSizeAnchor value) {
    if (value == null) return null;
    AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrame spOrGrpSpOrGraphicFrame = new AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrame();
    if (value.getSp() != null) spOrGrpSpOrGraphicFrame = AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrame.newSp(ShapeConverter.fromDocx4j(value.getSp()));
    if (value.getGrpSp() != null) spOrGrpSpOrGraphicFrame = AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrame.newGrpSp(GroupShapeConverter.fromDocx4j(value.getGrpSp()));
    if (value.getGraphicFrame() != null) spOrGrpSpOrGraphicFrame = AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrame.newGraphicFrame(GraphicFrameConverter.fromDocx4j(value.getGraphicFrame()));
    if (value.getCxnSp() != null) spOrGrpSpOrGraphicFrame = AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrame.newCxnSp(ConnectorConverter.fromDocx4j(value.getCxnSp()));
    if (value.getPic() != null) spOrGrpSpOrGraphicFrame = AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrame.newPic(PictureConverter.fromDocx4j(value.getPic()));
    return new AbsSizeAnchorModel(MarkerConverter.fromDocx4j(value.getFrom()), PositiveSize2DConverter.fromDocx4j(value.getExt()), spOrGrpSpOrGraphicFrame);
  }

  public static CTAbsSizeAnchor toDocx4j(AbsSizeAnchorModel value) {
    if (value == null) return null;
    CTAbsSizeAnchor result = new CTAbsSizeAnchor();
    result.setFrom(MarkerConverter.toDocx4j(value.getFrom()));
    result.setExt(PositiveSize2DConverter.toDocx4j(value.getExt()));
    if (value.getSpOrGrpSpOrGraphicFrame().isSp()) result.setSp(ShapeConverter.toDocx4j(value.getSpOrGrpSpOrGraphicFrame().getSp()));
    if (value.getSpOrGrpSpOrGraphicFrame().isGrpSp()) result.setGrpSp(GroupShapeConverter.toDocx4j(value.getSpOrGrpSpOrGraphicFrame().getGrpSp()));
    if (value.getSpOrGrpSpOrGraphicFrame().isGraphicFrame()) result.setGraphicFrame(GraphicFrameConverter.toDocx4j(value.getSpOrGrpSpOrGraphicFrame().getGraphicFrame()));
    if (value.getSpOrGrpSpOrGraphicFrame().isCxnSp()) result.setCxnSp(ConnectorConverter.toDocx4j(value.getSpOrGrpSpOrGraphicFrame().getCxnSp()));
    if (value.getSpOrGrpSpOrGraphicFrame().isPic()) result.setPic(PictureConverter.toDocx4j(value.getSpOrGrpSpOrGraphicFrame().getPic()));
    return result;
  }
}
