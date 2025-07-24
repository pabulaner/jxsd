package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ScRgbColorModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.CTScRgbColor;

public class ScRgbColorConverter {
  private ScRgbColorConverter() {
  }

  public static ScRgbColorModel fromDocx4J(CTScRgbColor value) {
    if (value == null) return null;
    List<ScRgbColorModel.ColorTransformModel> egColorTransform = value.getEGColorTransform().stream().map(val -> {
      return new ScRgbColorModel.ColorTransformModel();
    } ).collect(Collectors.toList());
    return new ScRgbColorModel(PercentageConverter.fromDocx4J(value.getG()), PercentageConverter.fromDocx4J(value.getR()), PercentageConverter.fromDocx4J(value.getB()), egColorTransform);
  }
}
