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
      if (val instanceof CTScRgbColor) return ColorMRUModel.EG_ColorChoice.newScrgbClr(ScRgbColorConverter.fromDocx4j((CTScRgbColor) val));
      if (val instanceof CTSRgbColor) return ColorMRUModel.EG_ColorChoice.newSrgbClr(SRgbColorConverter.fromDocx4j((CTSRgbColor) val));
      if (val instanceof CTHslColor) return ColorMRUModel.EG_ColorChoice.newHslClr(HslColorConverter.fromDocx4j((CTHslColor) val));
      if (val instanceof CTSystemColor) return ColorMRUModel.EG_ColorChoice.newSysClr(SystemColorConverter.fromDocx4j((CTSystemColor) val));
      if (val instanceof CTSchemeColor) return ColorMRUModel.EG_ColorChoice.newSchemeClr(SchemeColorConverter.fromDocx4j((CTSchemeColor) val));
      if (val instanceof CTPresetColor) return ColorMRUModel.EG_ColorChoice.newPrstClr(PresetColorConverter.fromDocx4j((CTPresetColor) val));
      return null;
    } ).collect(Collectors.toList());
    return new ColorMRUModel(egColorChoice);
  }

  public static CTColorMRU toDocx4j(ColorMRUModel value) {
    if (value == null) return null;
    CTColorMRU result = new CTColorMRU();
    result.getEGColorChoice().addAll(value.getEGColorChoice().stream().map(val -> {
      if (val.isScrgbClr()) return ScRgbColorConverter.toDocx4j(val.getScrgbClr());
      if (val.isSrgbClr()) return SRgbColorConverter.toDocx4j(val.getSrgbClr());
      if (val.isHslClr()) return HslColorConverter.toDocx4j(val.getHslClr());
      if (val.isSysClr()) return SystemColorConverter.toDocx4j(val.getSysClr());
      if (val.isSchemeClr()) return SchemeColorConverter.toDocx4j(val.getSchemeClr());
      if (val.isPrstClr()) return PresetColorConverter.toDocx4j(val.getPrstClr());
      return null;
    } ).collect(Collectors.toList()));
    return result;
  }
}
