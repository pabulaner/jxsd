package com.scell.converter.drawingml.chart;

import com.scell.converter.officeDocument.relationships.RelationshipIdValueConverter;
import com.scell.model.drawingml.chart.RelIdModel;
import org.docx4j.dml.chart.CTRelId;

public class RelIdConverter {
  private RelIdConverter() {
  }

  public static RelIdModel fromDocx4J(CTRelId value) {
    if (value == null) return null;
    return new RelIdModel(RelationshipIdValueConverter.fromDocx4J(value.getId()));
  }
}
