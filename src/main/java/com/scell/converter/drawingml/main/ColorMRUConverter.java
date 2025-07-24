package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ColorMRUModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.CTColorMRU;
import org.docx4j.dml.CTHslColor;
import org.docx4j.dml.CTPresetColor;
import org.docx4j.dml.CTSRgbColor;
import org.docx4j.dml.CTScRgbColor;
import org.docx4j.dml.CTSchemeColor;
import org.docx4j.dml.CTSystemColor;

public class ColorMRUConverter {
  private ColorMRUConverter() {
  }

  public static ColorMRUModel fromDocx4J(CTColorMRU value) {
    if (value == null) return null;
    List<ColorMRUModel.ColorChoiceModel> egColorChoice = value.getEGColorChoice().stream().map(val -> {
      if (val instanceof CTScRgbColor) return ColorMRUModel.ColorChoiceModel.newScrgbClr(ScRgbColorConverter.fromDocx4J((CTScRgbColor) val));
      if (val instanceof CTSRgbColor) return ColorMRUModel.ColorChoiceModel.newSrgbClr(SRgbColorConverter.fromDocx4J((CTSRgbColor) val));
      if (val instanceof CTHslColor) return ColorMRUModel.ColorChoiceModel.newHslClr(HslColorConverter.fromDocx4J((CTHslColor) val));
      if (val instanceof CTSystemColor) return ColorMRUModel.ColorChoiceModel.newSysClr(SystemColorConverter.fromDocx4J((CTSystemColor) val));
      if (val instanceof CTSchemeColor) return ColorMRUModel.ColorChoiceModel.newSchemeClr(SchemeColorConverter.fromDocx4J((CTSchemeColor) val));
      if (val instanceof CTPresetColor) return ColorMRUModel.ColorChoiceModel.newPrstClr(PresetColorConverter.fromDocx4J((CTPresetColor) val));
      return new ColorMRUModel.ColorChoiceModel();
    } ).collect(Collectors.toList());
    return new ColorMRUModel(egColorChoice);
  }
}
