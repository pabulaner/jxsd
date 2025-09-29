package jxsd.gen.converter.drawingml.main;

import java.util.List;
import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.DuotoneEffectModel;
import org.docx4j.dml.CTDuotoneEffect;
import org.docx4j.dml.CTHslColor;
import org.docx4j.dml.CTPresetColor;
import org.docx4j.dml.CTSRgbColor;
import org.docx4j.dml.CTScRgbColor;
import org.docx4j.dml.CTSchemeColor;
import org.docx4j.dml.CTSystemColor;

/**
 * This is a generated sequence class.
 */
public class DuotoneEffectConverter {
  private DuotoneEffectConverter() {
  }

  public static DuotoneEffectModel fromDocx4j(CTDuotoneEffect value) {
    if (value == null) return null;
    List<DuotoneEffectModel.EG_ColorChoice> egColorChoice = value.getEGColorChoice().stream().map(val -> {
      if (val instanceof CTScRgbColor) return CTDuotoneEffect.EGColorChoice.newScrgbClr(ScRgbColorConverter.fromDocx4j((CTScRgbColor) val));
      if (val instanceof CTSRgbColor) return CTDuotoneEffect.EGColorChoice.newSrgbClr(SRgbColorConverter.fromDocx4j((CTSRgbColor) val));
      if (val instanceof CTHslColor) return CTDuotoneEffect.EGColorChoice.newHslClr(HslColorConverter.fromDocx4j((CTHslColor) val));
      if (val instanceof CTSystemColor) return CTDuotoneEffect.EGColorChoice.newSysClr(SystemColorConverter.fromDocx4j((CTSystemColor) val));
      if (val instanceof CTSchemeColor) return CTDuotoneEffect.EGColorChoice.newSchemeClr(SchemeColorConverter.fromDocx4j((CTSchemeColor) val));
      if (val instanceof CTPresetColor) return CTDuotoneEffect.EGColorChoice.newPrstClr(PresetColorConverter.fromDocx4j((CTPresetColor) val));
      return new DuotoneEffectModel(egColorChoice);
    }

    public static CTDuotoneEffect toDocx4j(DuotoneEffectModel value) {
      if (value == null) return null;
      CTDuotoneEffect result = new CTDuotoneEffect();
      result.getEGColorChoice().addAll(value.getEGColorChoice().stream().map(val -> {
        if (val.isScrgbClr()) return DuotoneEffectConverter.toDocx4j(val.getScrgbClr());
        if (val.isSrgbClr()) return DuotoneEffectConverter.toDocx4j(val.getSrgbClr());
        if (val.isHslClr()) return DuotoneEffectConverter.toDocx4j(val.getHslClr());
        if (val.isSysClr()) return DuotoneEffectConverter.toDocx4j(val.getSysClr());
        if (val.isSchemeClr()) return DuotoneEffectConverter.toDocx4j(val.getSchemeClr());
        if (val.isPrstClr()) return DuotoneEffectConverter.toDocx4j(val.getPrstClr());
        return null;
      } ).collect(Collectors.toList());
      return result;
    }
  }
