package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.LongConverter;
import com.scell.model.drawingml.main.CT_RatioModel;
import org.docx4j.dml.CTRatio;

public class CT_RatioConverter {
  private CT_RatioConverter() {
  }

  public static CT_RatioModel fromDocx4j(CTRatio value) {
    if (value == null) return null;
    return new CT_RatioModel(LongConverter.fromDocx4j(value.getN()), LongConverter.fromDocx4j(value.getD()));
  }

  public static CTRatio toDocx4j(CT_RatioModel value) {
    return null;
  }
}
