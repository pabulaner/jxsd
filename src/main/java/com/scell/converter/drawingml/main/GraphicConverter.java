package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.GraphicModel;
import org.docx4j.dml.Graphic;

public class GraphicConverter {
  private GraphicConverter() {
  }

  public static GraphicModel fromDocx4J(Graphic value) {
    if (value == null) return null;
    return new GraphicModel(GraphicDataConverter.fromDocx4J(value.getGraphicData()));
  }
}
