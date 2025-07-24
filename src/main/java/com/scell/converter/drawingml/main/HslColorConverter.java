package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.HslColorModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.CTHslColor;

public class HslColorConverter {
  private HslColorConverter() {
  }

  public static HslColorModel fromDocx4J(CTHslColor value) {
    if (value == null) return null;
    List<HslColorModel.ColorTransformModel> egColorTransform = value.getEGColorTransform().stream().map(val -> {
      return new HslColorModel.ColorTransformModel();
    } ).collect(Collectors.toList());
    return new HslColorModel(PositiveFixedAngleConverter.fromDocx4J(value.getHue()), PercentageConverter.fromDocx4J(value.getLum()), PercentageConverter.fromDocx4J(value.getSat()), egColorTransform);
  }
}
