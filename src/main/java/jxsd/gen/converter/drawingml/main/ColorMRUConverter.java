package jxsd.gen.converter.drawingml.main;

import java.util.List;
import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.ColorMRUModel;
import org.docx4j.dml.CTColorMRU;
import org.docx4j.dml.CTHslColor;
import org.docx4j.dml.CTPresetColor;
import org.docx4j.dml.CTSRgbColor;
import org.docx4j.dml.CTScRgbColor;
import org.docx4j.dml.CTSchemeColor;
import org.docx4j.dml.CTSystemColor;

/**
 * This is a generated sequence class.
 */
public class ColorMRUConverter {
  private ColorMRUConverter() {
  }

  public static ColorMRUModel fromDocx4j(CTColorMRU value) {
    if (value == null) return null;
    List<ColorMRUModel.EG_ColorChoice> egColorChoice = value.getEGColorChoice().stream().map(val -> {
      if (val instanceof CTScRgbColor) return CTColorMRU.EGColorChoice.newScrgbClr(ScRgbColorConverter.fromDocx4j((CTScRgbColor) val));
      if (val instanceof CTSRgbColor) return CTColorMRU.EGColorChoice.newSrgbClr(SRgbColorConverter.fromDocx4j((CTSRgbColor) val));
      if (val instanceof CTHslColor) return CTColorMRU.EGColorChoice.newHslClr(HslColorConverter.fromDocx4j((CTHslColor) val));
      if (val instanceof CTSystemColor) return CTColorMRU.EGColorChoice.newSysClr(SystemColorConverter.fromDocx4j((CTSystemColor) val));
      if (val instanceof CTSchemeColor) return CTColorMRU.EGColorChoice.newSchemeClr(SchemeColorConverter.fromDocx4j((CTSchemeColor) val));
      if (val instanceof CTPresetColor) return CTColorMRU.EGColorChoice.newPrstClr(PresetColorConverter.fromDocx4j((CTPresetColor) val));
      return new ColorMRUModel(egColorChoice);
    }

    public static CTColorMRU toDocx4j(ColorMRUModel value) {
      if (value == null) return null;
      CTColorMRU result = new CTColorMRU();
      result.getEGColorChoice().addAll(value.getEGColorChoice().stream().map(val -> {
        if (val.isScrgbClr()) return ColorMRUConverter.toDocx4j(val.getScrgbClr());
        if (val.isSrgbClr()) return ColorMRUConverter.toDocx4j(val.getSrgbClr());
        if (val.isHslClr()) return ColorMRUConverter.toDocx4j(val.getHslClr());
        if (val.isSysClr()) return ColorMRUConverter.toDocx4j(val.getSysClr());
        if (val.isSchemeClr()) return ColorMRUConverter.toDocx4j(val.getSchemeClr());
        if (val.isPrstClr()) return ColorMRUConverter.toDocx4j(val.getPrstClr());
        return null;
      } ).collect(Collectors.toList());
      return result;
    }
  }
