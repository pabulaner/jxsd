package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.NonVisualConnectorPropertiesModel;
import org.docx4j.dml.CTNonVisualConnectorProperties;

/**
 * This is a generated sequence class.
 */
public class NonVisualConnectorPropertiesConverter {
  private NonVisualConnectorPropertiesConverter() {
  }

  public static NonVisualConnectorPropertiesModel fromDocx4j(CTNonVisualConnectorProperties value) {
    if (value == null) return null;
    return new NonVisualConnectorPropertiesModel(ConnectorLockingConverter.fromDocx4j(value.getCxnSpLocks()), ConnectionConverter.fromDocx4j(value.getStCxn()), ConnectionConverter.fromDocx4j(value.getEndCxn()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTNonVisualConnectorProperties toDocx4j(NonVisualConnectorPropertiesModel value) {
    if (value == null) return null;
    CTNonVisualConnectorProperties result = new CTNonVisualConnectorProperties();
    result.setCxnSpLocks(ConnectorLockingConverter.toDocx4j(value.getCxnSpLocks()));
    result.setStCxn(ConnectionConverter.toDocx4j(value.getStCxn()));
    result.setEndCxn(ConnectionConverter.toDocx4j(value.getEndCxn()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
