package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.drawingml.main.CT_GroupShapePropertiesConverter;
import com.scell.model.drawingml.chartDrawing.CT_GroupShapeModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chartDrawing.CTGroupShape;

public class CT_GroupShapeConverter {
  private CT_GroupShapeConverter() {
  }

  public static CT_GroupShapeModel fromDocx4j(CTGroupShape value) {
    if (value == null) return null;
    return new CT_GroupShapeModel(CT_GroupShapeNonVisualConverter.fromDocx4j(value.getNvGrpSpPr()), CT_GroupShapePropertiesConverter.fromDocx4j(value.getGrpSpPr()), value.getSpOrGrpSpOrGraphicFrame().stream().map(SpOrGrpSpOrGraphicFrameConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTGroupShape toDocx4j(CT_GroupShapeModel value) {
    return null;
  }

  public static class SpOrGrpSpOrGraphicFrameConverter {
    private SpOrGrpSpOrGraphicFrameConverter() {
    }

    public static CT_GroupShapeModel.SpOrGrpSpOrGraphicFrameModel fromDocx4j(
        CTGroupShape.SpOrGrpSpOrGraphicFrame value) {
      if (value == null) return null;
    }

    public static CTGroupShape.SpOrGrpSpOrGraphicFrame toDocx4j(
        CT_GroupShapeModel.SpOrGrpSpOrGraphicFrameModel value) {
      return null;
    }
  }
}
