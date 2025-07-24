package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.DuotoneEffectModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.CTDuotoneEffect;
import org.docx4j.dml.CTHslColor;
import org.docx4j.dml.CTPresetColor;
import org.docx4j.dml.CTSRgbColor;
import org.docx4j.dml.CTScRgbColor;
import org.docx4j.dml.CTSchemeColor;
import org.docx4j.dml.CTSystemColor;

public class DuotoneEffectConverter {
  private DuotoneEffectConverter() {
  }

  public static DuotoneEffectModel fromDocx4J(CTDuotoneEffect value) {
    if (value == null) return null;
    List<DuotoneEffectModel.ColorChoiceModel> egColorChoice = value.getEGColorChoice().stream().map(val -> {
      if (val instanceof CTScRgbColor) return DuotoneEffectModel.ColorChoiceModel.newScrgbClr(ScRgbColorConverter.fromDocx4J((CTScRgbColor) val));
      if (val instanceof CTSRgbColor) return DuotoneEffectModel.ColorChoiceModel.newSrgbClr(SRgbColorConverter.fromDocx4J((CTSRgbColor) val));
      if (val instanceof CTHslColor) return DuotoneEffectModel.ColorChoiceModel.newHslClr(HslColorConverter.fromDocx4J((CTHslColor) val));
      if (val instanceof CTSystemColor) return DuotoneEffectModel.ColorChoiceModel.newSysClr(SystemColorConverter.fromDocx4J((CTSystemColor) val));
      if (val instanceof CTSchemeColor) return DuotoneEffectModel.ColorChoiceModel.newSchemeClr(SchemeColorConverter.fromDocx4J((CTSchemeColor) val));
      if (val instanceof CTPresetColor) return DuotoneEffectModel.ColorChoiceModel.newPrstClr(PresetColorConverter.fromDocx4J((CTPresetColor) val));
      return new DuotoneEffectModel.ColorChoiceModel();
    } ).collect(Collectors.toList());
    return new DuotoneEffectModel(egColorChoice);
  }
}
