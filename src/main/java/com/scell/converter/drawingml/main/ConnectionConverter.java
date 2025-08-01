package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.UnsignedIntValueConverter;
import com.scell.model.drawingml.main.ConnectionModel;
import org.docx4j.dml.CTConnection;

public class ConnectionConverter {
  private ConnectionConverter() {
  }

  public static ConnectionModel fromDocx4J(CTConnection value) {
    if (value == null) return null;
    return new ConnectionModel(DrawingElementIdValueConverter.fromDocx4J(value.getId()), UnsignedIntValueConverter.fromDocx4J(value.getIdx()));
  }
}
