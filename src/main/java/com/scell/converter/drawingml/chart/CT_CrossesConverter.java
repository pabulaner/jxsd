package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_CrossesModel;
import org.docx4j.dml.chart.CTCrosses;

public class CT_CrossesConverter {
  private CT_CrossesConverter() {
  }

  public static CT_CrossesModel fromDocx4J(CTCrosses value) {
    if (value == null) return null;
    return new CT_CrossesModel(ST_CrossesConverter.fromDocx4J(value.getVal()));
  }

  public static CTCrosses toDocx4J(CT_CrossesModel value) {
    return null;
  }
}
