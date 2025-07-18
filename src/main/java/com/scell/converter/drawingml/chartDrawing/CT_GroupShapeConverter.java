package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.drawingml.main.CT_GroupShapePropertiesConverter;
import com.scell.model.drawingml.chartDrawing.CT_GroupShapeModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.chartDrawing.CTConnector;
import org.docx4j.dml.chartDrawing.CTGraphicFrame;
import org.docx4j.dml.chartDrawing.CTGroupShape;
import org.docx4j.dml.chartDrawing.CTPicture;
import org.docx4j.dml.chartDrawing.CTShape;

public class CT_GroupShapeConverter {
  private CT_GroupShapeConverter() {
  }

  public static CT_GroupShapeModel fromDocx4J(CTGroupShape value) {
    if (value == null) return null;
    // look here true;
    List<CT_GroupShapeModel.SpOrGrpSpOrGraphicFrameModel> spOrGrpSpOrGraphicFrame = value.getSpOrGrpSpOrGraphicFrame().stream().map(val -> {
      if (val instanceof CTShape) return CT_GroupShapeModel.SpOrGrpSpOrGraphicFrameModel.newSp(CT_ShapeConverter.fromDocx4J((CTShape) val));
      if (val instanceof CTGroupShape) return CT_GroupShapeModel.SpOrGrpSpOrGraphicFrameModel.newGrpSp(CT_GroupShapeConverter.fromDocx4J((CTGroupShape) val));
      if (val instanceof CTGraphicFrame) return CT_GroupShapeModel.SpOrGrpSpOrGraphicFrameModel.newGraphicFrame(CT_GraphicFrameConverter.fromDocx4J((CTGraphicFrame) val));
      if (val instanceof CTConnector) return CT_GroupShapeModel.SpOrGrpSpOrGraphicFrameModel.newCxnSp(CT_ConnectorConverter.fromDocx4J((CTConnector) val));
      if (val instanceof CTPicture) return CT_GroupShapeModel.SpOrGrpSpOrGraphicFrameModel.newPic(CT_PictureConverter.fromDocx4J((CTPicture) val));
      return null;
    } ).collect(Collectors.toList());
    return new CT_GroupShapeModel(CT_GroupShapeNonVisualConverter.fromDocx4J(value.getNvGrpSpPr()), CT_GroupShapePropertiesConverter.fromDocx4J(value.getGrpSpPr()), spOrGrpSpOrGraphicFrame);
  }

  public static CTGroupShape toDocx4J(CT_GroupShapeModel value) {
    return null;
  }
}
