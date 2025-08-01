package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.GraphicValueModel;
import org.docx4j.dml.Graphic;

public class GraphicValueConverter {
  private GraphicValueConverter() {
  }

  public static GraphicValueModel fromDocx4J(Graphic value) {
    if (value == null) return null;
    return new GraphicValueModel(GraphicDataValueConverter.fromDocx4J(value.getGraphicData()));
  }
}
