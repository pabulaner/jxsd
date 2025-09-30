package jxsd.gen.converter.drawingml.chartDrawing;

import java.util.List;
import java.util.stream.Collectors;
import jxsd.gen.converter.drawingml.main.GroupShapePropertiesConverter;
import jxsd.gen.model.drawingml.chartDrawing.GroupShapeModel;
import org.docx4j.dml.chartDrawing.CTConnector;
import org.docx4j.dml.chartDrawing.CTGraphicFrame;
import org.docx4j.dml.chartDrawing.CTGroupShape;
import org.docx4j.dml.chartDrawing.CTPicture;
import org.docx4j.dml.chartDrawing.CTShape;

/**
 * This is a generated sequence class.
 */
public class GroupShapeConverter {
  private GroupShapeConverter() {
  }

  public static GroupShapeModel fromDocx4j(CTGroupShape value) {
    if (value == null) return null;
    List<GroupShapeModel.SpOrGrpSpOrGraphicFrame> spOrGrpSpOrGraphicFrame = value.getSpOrGrpSpOrGraphicFrame().stream().map(val -> {
      if (val instanceof CTShape) return GroupShapeModel.SpOrGrpSpOrGraphicFrame.newSp(ShapeConverter.fromDocx4j((CTShape) val));
      if (val instanceof CTGroupShape) return GroupShapeModel.SpOrGrpSpOrGraphicFrame.newGrpSp(GroupShapeConverter.fromDocx4j((CTGroupShape) val));
      if (val instanceof CTGraphicFrame) return GroupShapeModel.SpOrGrpSpOrGraphicFrame.newGraphicFrame(GraphicFrameConverter.fromDocx4j((CTGraphicFrame) val));
      if (val instanceof CTConnector) return GroupShapeModel.SpOrGrpSpOrGraphicFrame.newCxnSp(ConnectorConverter.fromDocx4j((CTConnector) val));
      if (val instanceof CTPicture) return GroupShapeModel.SpOrGrpSpOrGraphicFrame.newPic(PictureConverter.fromDocx4j((CTPicture) val));
      return null;
    } ).collect(Collectors.toList());
    return new GroupShapeModel(GroupShapeNonVisualConverter.fromDocx4j(value.getNvGrpSpPr()), GroupShapePropertiesConverter.fromDocx4j(value.getGrpSpPr()), spOrGrpSpOrGraphicFrame);
  }

  public static CTGroupShape toDocx4j(GroupShapeModel value) {
    if (value == null) return null;
    CTGroupShape result = new CTGroupShape();
    result.setNvGrpSpPr(GroupShapeNonVisualConverter.toDocx4j(value.getNvGrpSpPr()));
    result.setGrpSpPr(GroupShapePropertiesConverter.toDocx4j(value.getGrpSpPr()));
    result.getSpOrGrpSpOrGraphicFrame().addAll(value.getSpOrGrpSpOrGraphicFrame().stream().map(val -> {
      if (val.isSp()) return ShapeConverter.toDocx4j(val.getSp());
      if (val.isGrpSp()) return GroupShapeConverter.toDocx4j(val.getGrpSp());
      if (val.isGraphicFrame()) return GraphicFrameConverter.toDocx4j(val.getGraphicFrame());
      if (val.isCxnSp()) return ConnectorConverter.toDocx4j(val.getCxnSp());
      if (val.isPic()) return PictureConverter.toDocx4j(val.getPic());
      return null;
    } ).collect(Collectors.toList()));
    return result;
  }
}
