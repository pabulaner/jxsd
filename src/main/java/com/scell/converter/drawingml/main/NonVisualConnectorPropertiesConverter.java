package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.NonVisualConnectorPropertiesModel;
import org.docx4j.dml.CTNonVisualConnectorProperties;

public class NonVisualConnectorPropertiesConverter {
  private NonVisualConnectorPropertiesConverter() {
  }

  public static NonVisualConnectorPropertiesModel fromDocx4J(CTNonVisualConnectorProperties value) {
    if (value == null) return null;
    return new NonVisualConnectorPropertiesModel(ConnectorLockingConverter.fromDocx4J(value.getCxnSpLocks()), ConnectionConverter.fromDocx4J(value.getStCxn()), ConnectionConverter.fromDocx4J(value.getEndCxn()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
