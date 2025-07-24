package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.LongConverter;
import com.scell.model.drawingml.main.RatioModel;
import org.docx4j.dml.CTRatio;

public class RatioConverter {
  private RatioConverter() {
  }

  public static RatioModel fromDocx4J(CTRatio value) {
    if (value == null) return null;
    return new RatioModel(LongConverter.fromDocx4J(value.getN()), LongConverter.fromDocx4J(value.getD()));
  }
}
