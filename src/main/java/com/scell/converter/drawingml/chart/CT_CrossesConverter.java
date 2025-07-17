package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_CrossesModel;
import org.docx4j.dml.chart.CTCrosses;

public class CT_CrossesConverter {
  private CT_CrossesConverter() {
  }

  public static CT_CrossesModel fromDocx4j(CTCrosses value) {
    if (value == null) return null;
    return new CT_CrossesModel(ST_CrossesConverter.fromDocx4j(value.getVal()));
  }

  public static CTCrosses toDocx4j(CT_CrossesModel value) {
    return null;
  }
}
