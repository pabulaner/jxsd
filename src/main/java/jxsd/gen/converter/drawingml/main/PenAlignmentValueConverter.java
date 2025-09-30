package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.PenAlignmentValueModel;
import org.docx4j.dml.STPenAlignment;

/**
 * This is a generated enum class.
 */
public class PenAlignmentValueConverter {
  private PenAlignmentValueConverter() {
  }

  public static PenAlignmentValueModel fromDocx4j(STPenAlignment value) {
    if (value == null) return null;
    if (value == STPenAlignment.CTR) return PenAlignmentValueModel.CTR;
    if (value == STPenAlignment.IN) return PenAlignmentValueModel.IN;
    return null;
  }

  public static STPenAlignment toDocx4j(PenAlignmentValueModel value) {
    if (value == null) return null;
    if (value == PenAlignmentValueModel.CTR) return STPenAlignment.CTR;
    if (value == PenAlignmentValueModel.IN) return STPenAlignment.IN;
    return null;
  }
}
