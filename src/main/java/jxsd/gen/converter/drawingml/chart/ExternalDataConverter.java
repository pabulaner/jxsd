package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.officeDocument.relationships.RelationshipIdValueConverter;
import jxsd.gen.model.drawingml.chart.ExternalDataModel;
import org.docx4j.dml.chart.CTExternalData;

/**
 * This is a generated sequence class.
 */
public class ExternalDataConverter {
  private ExternalDataConverter() {
  }

  public static ExternalDataModel fromDocx4j(CTExternalData value) {
    if (value == null) return null;
    return new ExternalDataModel(RelationshipIdValueConverter.fromDocx4j(value.getId()), BooleanConverter.fromDocx4j(value.getAutoUpdate()));
  }

  public static CTExternalData toDocx4j(ExternalDataModel value) {
    if (value == null) return null;
    CTExternalData result = new CTExternalData();
    result.setId(RelationshipIdValueConverter.toDocx4j(value.getId()));
    result.setAutoUpdate(BooleanConverter.toDocx4j(value.getAutoUpdate()));
    return result;
  }
}
