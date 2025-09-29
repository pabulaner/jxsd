package jxsd.gen.converter.drawingml.main;

import java.util.List;
import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.ScRgbColorModel;
import org.docx4j.dml.CTScRgbColor;

/**
 * This is a generated sequence class.
 */
public class ScRgbColorConverter {
  private ScRgbColorConverter() {
  }

  public static ScRgbColorModel fromDocx4j(CTScRgbColor value) {
    if (value == null) return null;
    List<ScRgbColorModel.EG_ColorTransform> egColorTransform = value.getEGColorTransform().stream().map(val -> {
      return new ScRgbColorModel(PercentageValueConverter.fromDocx4j(value.getG()), PercentageValueConverter.fromDocx4j(value.getR()), PercentageValueConverter.fromDocx4j(value.getB()), egColorTransform);
    }

    public static CTScRgbColor toDocx4j(ScRgbColorModel value) {
      if (value == null) return null;
      CTScRgbColor result = new CTScRgbColor();
      result.setG(PercentageValueConverter.toDocx4j(value.getG()));
      result.setR(PercentageValueConverter.toDocx4j(value.getR()));
      result.setB(PercentageValueConverter.toDocx4j(value.getB()));
      result.getEGColorTransform().addAll(value.getEGColorTransform().stream().map(val -> {
        return null;
      } ).collect(Collectors.toList());
      return result;
    }
  }
