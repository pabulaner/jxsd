package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.GroupFillPropertiesModel;
import org.docx4j.dml.CTGroupFillProperties;

/**
 * This is a generated sequence class.
 */
public class GroupFillPropertiesConverter {
  private GroupFillPropertiesConverter() {
  }

  public static GroupFillPropertiesModel fromDocx4j(CTGroupFillProperties value) {
    if (value == null) return null;
    return new GroupFillPropertiesModel();
  }

  public static CTGroupFillProperties toDocx4j(GroupFillPropertiesModel value) {
    if (value == null) return null;
    CTGroupFillProperties result = new CTGroupFillProperties();
    return result;
  }
}
