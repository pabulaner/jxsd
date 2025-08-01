package com.scell.converter.drawingml.chart;

import com.scell.converter.officeDocument.relationships.RelationshipIdValueConverter;
import com.scell.model.drawingml.chart.ExternalDataModel;
import org.docx4j.dml.chart.CTExternalData;

public class ExternalDataConverter {
  private ExternalDataConverter() {
  }

  public static ExternalDataModel fromDocx4J(CTExternalData value) {
    if (value == null) return null;
    return new ExternalDataModel(RelationshipIdValueConverter.fromDocx4J(value.getId()), BooleanConverter.fromDocx4J(value.getAutoUpdate()));
  }
}
