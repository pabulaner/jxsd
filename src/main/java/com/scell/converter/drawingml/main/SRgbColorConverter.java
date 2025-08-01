package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.SRgbColorModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.CTSRgbColor;

public class SRgbColorConverter {
  private SRgbColorConverter() {
  }

  public static SRgbColorModel fromDocx4J(CTSRgbColor value) {
    if (value == null) return null;
    List<SRgbColorModel.ColorTransformModel> egColorTransform = value.getEGColorTransform().stream().map(val -> {
      return new SRgbColorModel.ColorTransformModel();
    } ).collect(Collectors.toList());
    return new SRgbColorModel(HexBinary3ValueConverter.fromDocx4J(value.getVal()), egColorTransform);
  }
}
