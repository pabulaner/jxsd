package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.drawingml.main.GroupShapePropertiesConverter;
import com.scell.model.drawingml.chartDrawing.GroupShapeModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.chartDrawing.CTConnector;
import org.docx4j.dml.chartDrawing.CTGraphicFrame;
import org.docx4j.dml.chartDrawing.CTGroupShape;
import org.docx4j.dml.chartDrawing.CTPicture;
import org.docx4j.dml.chartDrawing.CTShape;

public class GroupShapeConverter {
  private GroupShapeConverter() {
  }

  public static GroupShapeModel fromDocx4J(CTGroupShape value) {
    if (value == null) return null;
    List<GroupShapeModel.SpOrGrpSpOrGraphicFrameValueModel> spOrGrpSpOrGraphicFrame = value.getSpOrGrpSpOrGraphicFrame().stream().map(val -> {
      if (val instanceof CTShape) return GroupShapeModel.SpOrGrpSpOrGraphicFrameValueModel.newSp(ShapeConverter.fromDocx4J((CTShape) val));
      if (val instanceof CTGroupShape) return GroupShapeModel.SpOrGrpSpOrGraphicFrameValueModel.newGrpSp(GroupShapeConverter.fromDocx4J((CTGroupShape) val));
      if (val instanceof CTGraphicFrame) return GroupShapeModel.SpOrGrpSpOrGraphicFrameValueModel.newGraphicFrame(GraphicFrameConverter.fromDocx4J((CTGraphicFrame) val));
      if (val instanceof CTConnector) return GroupShapeModel.SpOrGrpSpOrGraphicFrameValueModel.newCxnSp(ConnectorConverter.fromDocx4J((CTConnector) val));
      if (val instanceof CTPicture) return GroupShapeModel.SpOrGrpSpOrGraphicFrameValueModel.newPic(PictureConverter.fromDocx4J((CTPicture) val));
      return new GroupShapeModel.SpOrGrpSpOrGraphicFrameValueModel();
    } ).collect(Collectors.toList());
    return new GroupShapeModel(GroupShapeNonVisualConverter.fromDocx4J(value.getNvGrpSpPr()), GroupShapePropertiesConverter.fromDocx4J(value.getGrpSpPr()), spOrGrpSpOrGraphicFrame);
  }
}
