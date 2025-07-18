package com.scell.converter.drawingml.chart;

import com.scell.converter.officeDocument.relationships.ST_RelationshipIdConverter;
import com.scell.model.drawingml.chart.CT_RelIdModel;
import org.docx4j.dml.chart.CTRelId;

public class CT_RelIdConverter {
  private CT_RelIdConverter() {
  }

  public static CT_RelIdModel fromDocx4J(CTRelId value) {
    if (value == null) return null;
    return new CT_RelIdModel(ST_RelationshipIdConverter.fromDocx4J(value.getId()));
  }

  public static CTRelId toDocx4J(CT_RelIdModel value) {
    return null;
  }
}
