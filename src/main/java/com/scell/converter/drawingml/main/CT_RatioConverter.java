package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.LongConverter;
import com.scell.model.drawingml.main.CT_RatioModel;
import org.docx4j.dml.CTRatio;

public class CT_RatioConverter {
  private CT_RatioConverter() {
  }

  public static CT_RatioModel fromDocx4J(CTRatio value) {
    if (value == null) return null;
    return new CT_RatioModel(LongConverter.fromDocx4J(value.getN()), LongConverter.fromDocx4J(value.getD()));
  }

  public static CTRatio toDocx4J(CT_RatioModel value) {
    return null;
  }
}
