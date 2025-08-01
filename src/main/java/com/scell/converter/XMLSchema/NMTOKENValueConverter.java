package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.NMTOKENValueModel;

public class NMTOKENValueConverter {
  private NMTOKENValueConverter() {
  }

  public static NMTOKENValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new NMTOKENValueModel(value);
  }
}
