package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.SchemeColorModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.CTSchemeColor;

public class SchemeColorConverter {
  private SchemeColorConverter() {
  }

  public static SchemeColorModel fromDocx4J(CTSchemeColor value) {
    if (value == null) return null;
    List<SchemeColorModel.ColorTransformModel> egColorTransform = value.getEGColorTransform().stream().map(val -> {
      return new SchemeColorModel.ColorTransformModel();
    } ).collect(Collectors.toList());
    return new SchemeColorModel(SchemeColorValConverter.fromDocx4J(value.getVal()), egColorTransform);
  }
}
