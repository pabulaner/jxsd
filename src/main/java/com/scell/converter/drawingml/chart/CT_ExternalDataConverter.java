package com.scell.converter.drawingml.chart;

import com.scell.converter.officeDocument.relationships.ST_RelationshipIdConverter;
import com.scell.model.drawingml.chart.CT_ExternalDataModel;
import org.docx4j.dml.chart.CTExternalData;

public class CT_ExternalDataConverter {
  private CT_ExternalDataConverter() {
  }

  public static CT_ExternalDataModel fromDocx4J(CTExternalData value) {
    if (value == null) return null;
    return new CT_ExternalDataModel(ST_RelationshipIdConverter.fromDocx4J(value.getId()), CT_BooleanConverter.fromDocx4J(value.getAutoUpdate()));
  }

  public static CTExternalData toDocx4J(CT_ExternalDataModel value) {
    return null;
  }
}
