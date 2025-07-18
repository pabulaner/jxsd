package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_NonVisualPicturePropertiesModel;
import org.docx4j.dml.CTNonVisualPictureProperties;

public class CT_NonVisualPicturePropertiesConverter {
  private CT_NonVisualPicturePropertiesConverter() {
  }

  public static CT_NonVisualPicturePropertiesModel fromDocx4J(CTNonVisualPictureProperties value) {
    if (value == null) return null;
    return new CT_NonVisualPicturePropertiesModel(BooleanConverter.fromDocx4J(value.getPreferRelativeResize()), CT_PictureLockingConverter.fromDocx4J(value.getPicLocks()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTNonVisualPictureProperties toDocx4J(CT_NonVisualPicturePropertiesModel value) {
    return null;
  }
}
