package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PresetColorModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.CTPresetColor;

public class PresetColorConverter {
  private PresetColorConverter() {
  }

  public static PresetColorModel fromDocx4J(CTPresetColor value) {
    if (value == null) return null;
    List<PresetColorModel.ColorTransformModel> egColorTransform = value.getEGColorTransform().stream().map(val -> {
      return new PresetColorModel.ColorTransformModel();
    } ).collect(Collectors.toList());
    return new PresetColorModel(PresetColorValValueConverter.fromDocx4J(value.getVal()), egColorTransform);
  }
}
