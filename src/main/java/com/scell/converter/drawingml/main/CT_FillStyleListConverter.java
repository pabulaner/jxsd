package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_FillStyleListModel;
import org.docx4j.dml.CTFillStyleList;

public class CT_FillStyleListConverter {
  private CT_FillStyleListConverter() {
  }

  public static CT_FillStyleListModel fromDocx4j(CTFillStyleList value) {
    if (value == null) return null;
  }

  public static CTFillStyleList toDocx4j(CT_FillStyleListModel value) {
    return null;
  }
}
