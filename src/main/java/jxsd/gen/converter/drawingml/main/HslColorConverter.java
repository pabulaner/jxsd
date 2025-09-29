package jxsd.gen.converter.drawingml.main;

import java.util.List;
import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.HslColorModel;
import org.docx4j.dml.CTHslColor;

/**
 * This is a generated sequence class.
 */
public class HslColorConverter {
  private HslColorConverter() {
  }

  public static HslColorModel fromDocx4j(CTHslColor value) {
    if (value == null) return null;
    List<HslColorModel.EG_ColorTransform> egColorTransform = value.getEGColorTransform().stream().map(val -> {
      return new HslColorModel(PositiveFixedAngleValueConverter.fromDocx4j(value.getHue()), PercentageValueConverter.fromDocx4j(value.getLum()), PercentageValueConverter.fromDocx4j(value.getSat()), egColorTransform);
    }

    public static CTHslColor toDocx4j(HslColorModel value) {
      if (value == null) return null;
      CTHslColor result = new CTHslColor();
      result.setHue(PositiveFixedAngleValueConverter.toDocx4j(value.getHue()));
      result.setLum(PercentageValueConverter.toDocx4j(value.getLum()));
      result.setSat(PercentageValueConverter.toDocx4j(value.getSat()));
      result.getEGColorTransform().addAll(value.getEGColorTransform().stream().map(val -> {
        return null;
      } ).collect(Collectors.toList());
      return result;
    }
  }
