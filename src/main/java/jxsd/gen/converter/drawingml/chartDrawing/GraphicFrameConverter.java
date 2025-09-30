package jxsd.gen.converter.drawingml.chartDrawing;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.converter.drawingml.main.GraphicValueConverter;
import jxsd.gen.converter.drawingml.main.Transform2DConverter;
import jxsd.gen.model.drawingml.chartDrawing.GraphicFrameModel;
import org.docx4j.dml.chartDrawing.CTGraphicFrame;

/**
 * This is a generated sequence class.
 */
public class GraphicFrameConverter {
  private GraphicFrameConverter() {
  }

  public static GraphicFrameModel fromDocx4j(CTGraphicFrame value) {
    if (value == null) return null;
    return new GraphicFrameModel(BooleanValueConverter.fromDocx4j(value.isFPublished()), StringValueConverter.fromDocx4j(value.getMacro()), GraphicFrameNonVisualConverter.fromDocx4j(value.getNvGraphicFramePr()), Transform2DConverter.fromDocx4j(value.getXfrm()), GraphicValueConverter.fromDocx4j(value.getGraphic()));
  }

  public static CTGraphicFrame toDocx4j(GraphicFrameModel value) {
    if (value == null) return null;
    CTGraphicFrame result = new CTGraphicFrame();
    result.setFPublished(BooleanValueConverter.toDocx4j(value.getFPublished()));
    result.setMacro(StringValueConverter.toDocx4j(value.getMacro()));
    result.setNvGraphicFramePr(GraphicFrameNonVisualConverter.toDocx4j(value.getNvGraphicFramePr()));
    result.setXfrm(Transform2DConverter.toDocx4j(value.getXfrm()));
    result.setGraphic(GraphicValueConverter.toDocx4j(value.getGraphic()));
    return result;
  }
}
