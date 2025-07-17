package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.NMTOKENModel;

public class NMTOKENConverter {
  private NMTOKENConverter() {
  }

  public static NMTOKENModel fromDocx4j(String value) {
    if (value == null) return null;
    return new NMTOKENModel(value);
  }

  public static String toDocx4j(NMTOKENModel value) {
    return null;
  }
}
