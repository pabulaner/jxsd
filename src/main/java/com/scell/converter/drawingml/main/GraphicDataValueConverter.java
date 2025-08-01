package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.TokenValueConverter;
import com.scell.model.drawingml.main.GraphicDataValueModel;
import org.docx4j.dml.GraphicData;

public class GraphicDataValueConverter {
  private GraphicDataValueConverter() {
  }

  public static GraphicDataValueModel fromDocx4J(GraphicData value) {
    if (value == null) return null;
    return new GraphicDataValueModel(TokenValueConverter.fromDocx4J(value.getUri()));
  }
}
