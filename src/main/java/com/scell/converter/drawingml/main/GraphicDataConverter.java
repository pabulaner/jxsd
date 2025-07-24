package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.TokenConverter;
import com.scell.model.drawingml.main.GraphicDataModel;
import org.docx4j.dml.GraphicData;

public class GraphicDataConverter {
  private GraphicDataConverter() {
  }

  public static GraphicDataModel fromDocx4J(GraphicData value) {
    if (value == null) return null;
    return new GraphicDataModel(TokenConverter.fromDocx4J(value.getUri()));
  }
}
