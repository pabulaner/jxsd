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

  public static CT_GraphicFrameModel fromDocx4j(CTGraphicFrame value) {
    if (value == null) return null;
    return new CT_GraphicFrameModel(BooleanConverter.fromDocx4j(value.getFPublished()), StringConverter.fromDocx4j(value.getMacro()), CT_GraphicFrameNonVisualConverter.fromDocx4j(value.getNvGraphicFramePr()), CT_Transform2DConverter.fromDocx4j(value.getXfrm()), CT_GraphicalObjectConverter.fromDocx4j(value.getGraphic()));
  }

  public static CTGraphicFrame toDocx4j(CT_GraphicFrameModel value) {
    return null;
  }
}
