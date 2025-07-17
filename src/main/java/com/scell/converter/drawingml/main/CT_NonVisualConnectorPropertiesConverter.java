package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_NonVisualConnectorPropertiesModel;
import org.docx4j.dml.CTNonVisualConnectorProperties;

public class CT_NonVisualConnectorPropertiesConverter {
  private CT_NonVisualConnectorPropertiesConverter() {
  }

  public static CT_NonVisualConnectorPropertiesModel fromDocx4j(
      CTNonVisualConnectorProperties value) {
    if (value == null) return null;
    return new CT_NonVisualConnectorPropertiesModel(CT_ConnectorLockingConverter.fromDocx4j(value.getCxnSpLocks()), CT_ConnectionConverter.fromDocx4j(value.getStCxn()), CT_ConnectionConverter.fromDocx4j(value.getEndCxn()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTNonVisualConnectorProperties toDocx4j(
      CT_NonVisualConnectorPropertiesModel value) {
    return null;
  }
}
