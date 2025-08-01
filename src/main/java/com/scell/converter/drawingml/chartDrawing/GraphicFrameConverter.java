package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.converter.XMLSchema.StringValueConverter;
import com.scell.converter.drawingml.main.GraphicValueConverter;
import com.scell.converter.drawingml.main.Transform2DConverter;
import com.scell.model.drawingml.chartDrawing.GraphicFrameModel;
import org.docx4j.dml.chartDrawing.CTGraphicFrame;

public class GraphicFrameConverter {
  private GraphicFrameConverter() {
  }

  public static GraphicFrameModel fromDocx4J(CTGraphicFrame value) {
    if (value == null) return null;
    return new GraphicFrameModel(BooleanValueConverter.fromDocx4J(value.isFPublished()), StringValueConverter.fromDocx4J(value.getMacro()), GraphicFrameNonVisualConverter.fromDocx4J(value.getNvGraphicFramePr()), Transform2DConverter.fromDocx4J(value.getXfrm()), GraphicValueConverter.fromDocx4J(value.getGraphic()));
  }
}
