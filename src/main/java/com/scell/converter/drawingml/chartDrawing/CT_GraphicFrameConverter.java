package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.converter.XMLSchema.StringConverter;
import com.scell.converter.drawingml.main.CT_GraphicalObjectConverter;
import com.scell.converter.drawingml.main.CT_Transform2DConverter;
import com.scell.model.drawingml.chartDrawing.CT_GraphicFrameModel;
import org.docx4j.dml.chartDrawing.CTGraphicFrame;

public class CT_GraphicFrameConverter {
  private CT_GraphicFrameConverter() {
  }

  public static CT_GraphicFrameModel fromDocx4J(CTGraphicFrame value) {
    if (value == null) return null;
    return new CT_GraphicFrameModel(BooleanConverter.fromDocx4J(value.getFPublished()), StringConverter.fromDocx4J(value.getMacro()), CT_GraphicFrameNonVisualConverter.fromDocx4J(value.getNvGraphicFramePr()), CT_Transform2DConverter.fromDocx4J(value.getXfrm()), CT_GraphicalObjectConverter.fromDocx4J(value.getGraphic()));
  }

  public static CTGraphicFrame toDocx4J(CT_GraphicFrameModel value) {
    return null;
  }
}
