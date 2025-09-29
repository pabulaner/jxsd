package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.officeDocument.relationships.RelationshipIdValueConverter;
import jxsd.gen.model.drawingml.chart.RelIdModel;
import org.docx4j.dml.chart.CTRelId;

/**
 * This is a generated sequence class.
 */
public class RelIdConverter {
  private RelIdConverter() {
  }

  public static RelIdModel fromDocx4j(CTRelId value) {
    if (value == null) return null;
    return new RelIdModel(RelationshipIdValueConverter.fromDocx4j(value.getId()));
  }

  public static CTRelId toDocx4j(RelIdModel value) {
    if (value == null) return null;
    CTRelId result = new CTRelId();
    result.setId(RelationshipIdValueConverter.toDocx4j(value.getId()));
    return result;
  }
}
