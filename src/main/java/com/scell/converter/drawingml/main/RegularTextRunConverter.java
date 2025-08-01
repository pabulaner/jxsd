package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringValueConverter;
import com.scell.model.drawingml.main.RegularTextRunModel;
import org.docx4j.dml.CTRegularTextRun;

public class RegularTextRunConverter {
  private RegularTextRunConverter() {
  }

  public static RegularTextRunModel fromDocx4J(CTRegularTextRun value) {
    if (value == null) return null;
    return new RegularTextRunModel(TextCharacterPropertiesConverter.fromDocx4J(value.getRPr()), StringValueConverter.fromDocx4J(value.getT()));
  }
}
