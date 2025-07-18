package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.NMTOKENModel;

public class NMTOKENConverter {
  private NMTOKENConverter() {
  }

  public static NMTOKENModel fromDocx4J(String value) {
    if (value == null) return null;
    return new NMTOKENModel(value);
  }

  public static String toDocx4J(NMTOKENModel value) {
    return null;
  }
}
