package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_NonVisualConnectorPropertiesModel;
import org.docx4j.dml.CTNonVisualConnectorProperties;

public class CT_NonVisualConnectorPropertiesConverter {
  private CT_NonVisualConnectorPropertiesConverter() {
  }

  public static CT_NonVisualConnectorPropertiesModel fromDocx4J(
      CTNonVisualConnectorProperties value) {
    if (value == null) return null;
    return new CT_NonVisualConnectorPropertiesModel(CT_ConnectorLockingConverter.fromDocx4J(value.getCxnSpLocks()), CT_ConnectionConverter.fromDocx4J(value.getStCxn()), CT_ConnectionConverter.fromDocx4J(value.getEndCxn()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTNonVisualConnectorProperties toDocx4J(
      CT_NonVisualConnectorPropertiesModel value) {
    return null;
  }
}
