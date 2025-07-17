package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.AnyTypeModel;
import org.docx4j.XMLSchema.AnyType;

public class AnyTypeConverter {
  private AnyTypeConverter() {
  }

  public static AnyTypeModel fromDocx4j(AnyType value) {
    if (value == null) return null;
    return new AnyTypeModel();
  }

  public static AnyType toDocx4j(AnyTypeModel value) {
    return null;
  }
}
