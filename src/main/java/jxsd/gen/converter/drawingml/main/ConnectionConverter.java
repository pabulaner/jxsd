package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.UnsignedIntValueConverter;
import jxsd.gen.model.drawingml.main.ConnectionModel;
import org.docx4j.dml.CTConnection;

/**
 * This is a generated sequence class.
 */
public class ConnectionConverter {
  private ConnectionConverter() {
  }

  public static ConnectionModel fromDocx4j(CTConnection value) {
    if (value == null) return null;
    return new ConnectionModel(DrawingElementIdValueConverter.fromDocx4j(value.getId()), UnsignedIntValueConverter.fromDocx4j(value.getIdx()));
  }

  public static CTConnection toDocx4j(ConnectionModel value) {
    if (value == null) return null;
    CTConnection result = new CTConnection();
    result.setId(DrawingElementIdValueConverter.toDocx4j(value.getId()));
    result.setIdx(UnsignedIntValueConverter.toDocx4j(value.getIdx()));
    return result;
  }
}
