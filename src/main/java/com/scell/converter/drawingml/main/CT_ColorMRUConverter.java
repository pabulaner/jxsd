package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_ColorMRUModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.CTColorMRU;
import org.docx4j.dml.CTHslColor;
import org.docx4j.dml.CTPresetColor;
import org.docx4j.dml.CTSRgbColor;
import org.docx4j.dml.CTScRgbColor;
import org.docx4j.dml.CTSchemeColor;
import org.docx4j.dml.CTSystemColor;

public class CT_ColorMRUConverter {
  private CT_ColorMRUConverter() {
  }

  public static CT_ColorMRUModel fromDocx4J(CTColorMRU value) {
    if (value == null) return null;
    // look here true;
    List<CT_ColorMRUModel.EG_ColorChoiceModel> egColorChoice = value.getEGColorChoice().stream().map(val -> {
      if (val instanceof CTScRgbColor) return CT_ColorMRUModel.EG_ColorChoiceModel.newScrgbClr(CT_ScRgbColorConverter.fromDocx4J((CTScRgbColor) val));
      if (val instanceof CTSRgbColor) return CT_ColorMRUModel.EG_ColorChoiceModel.newSrgbClr(CT_SRgbColorConverter.fromDocx4J((CTSRgbColor) val));
      if (val instanceof CTHslColor) return CT_ColorMRUModel.EG_ColorChoiceModel.newHslClr(CT_HslColorConverter.fromDocx4J((CTHslColor) val));
      if (val instanceof CTSystemColor) return CT_ColorMRUModel.EG_ColorChoiceModel.newSysClr(CT_SystemColorConverter.fromDocx4J((CTSystemColor) val));
      if (val instanceof CTSchemeColor) return CT_ColorMRUModel.EG_ColorChoiceModel.newSchemeClr(CT_SchemeColorConverter.fromDocx4J((CTSchemeColor) val));
      if (val instanceof CTPresetColor) return CT_ColorMRUModel.EG_ColorChoiceModel.newPrstClr(CT_PresetColorConverter.fromDocx4J((CTPresetColor) val));
      return null;
    } ).collect(Collectors.toList());
    return new CT_ColorMRUModel(egColorChoice);
  }

  public static CTColorMRU toDocx4J(CT_ColorMRUModel value) {
    return null;
  }
}
