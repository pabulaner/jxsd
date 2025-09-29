package jxsd.gen.converter.drawingml.main;

import java.util.List;
import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.PresetColorModel;
import org.docx4j.dml.CTPresetColor;

/**
 * This is a generated sequence class.
 */
public class PresetColorConverter {
  private PresetColorConverter() {
  }

  public static PresetColorModel fromDocx4j(CTPresetColor value) {
    if (value == null) return null;
    List<PresetColorModel.EG_ColorTransform> egColorTransform = value.getEGColorTransform().stream().map(val -> {
      return new PresetColorModel(PresetColorValValueConverter.fromDocx4j(value.getVal()), egColorTransform);
    }

    public static CTPresetColor toDocx4j(PresetColorModel value) {
      if (value == null) return null;
      CTPresetColor result = new CTPresetColor();
      result.setVal(PresetColorValValueConverter.toDocx4j(value.getVal()));
      result.getEGColorTransform().addAll(value.getEGColorTransform().stream().map(val -> {
        return null;
      } ).collect(Collectors.toList());
      return result;
    }
  }
