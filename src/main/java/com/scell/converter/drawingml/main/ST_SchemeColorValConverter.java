package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_SchemeColorValModel;
import org.docx4j.dml.STSchemeColorVal;

public class ST_SchemeColorValConverter {
  private ST_SchemeColorValConverter() {
  }

  public static ST_SchemeColorValModel fromDocx4J(STSchemeColorVal value) {
    if (value == null) return null;
    if (value == STSchemeColorVal.BG_1) return ST_SchemeColorValModel.BG_1;
    if (value == STSchemeColorVal.TX_1) return ST_SchemeColorValModel.TX_1;
    if (value == STSchemeColorVal.BG_2) return ST_SchemeColorValModel.BG_2;
    if (value == STSchemeColorVal.TX_2) return ST_SchemeColorValModel.TX_2;
    if (value == STSchemeColorVal.ACCENT_1) return ST_SchemeColorValModel.ACCENT_1;
    if (value == STSchemeColorVal.ACCENT_2) return ST_SchemeColorValModel.ACCENT_2;
    if (value == STSchemeColorVal.ACCENT_3) return ST_SchemeColorValModel.ACCENT_3;
    if (value == STSchemeColorVal.ACCENT_4) return ST_SchemeColorValModel.ACCENT_4;
    if (value == STSchemeColorVal.ACCENT_5) return ST_SchemeColorValModel.ACCENT_5;
    if (value == STSchemeColorVal.ACCENT_6) return ST_SchemeColorValModel.ACCENT_6;
    if (value == STSchemeColorVal.HLINK) return ST_SchemeColorValModel.HLINK;
    if (value == STSchemeColorVal.FOL_HLINK) return ST_SchemeColorValModel.FOL_HLINK;
    if (value == STSchemeColorVal.PH_CLR) return ST_SchemeColorValModel.PH_CLR;
    if (value == STSchemeColorVal.DK_1) return ST_SchemeColorValModel.DK_1;
    if (value == STSchemeColorVal.LT_1) return ST_SchemeColorValModel.LT_1;
    if (value == STSchemeColorVal.DK_2) return ST_SchemeColorValModel.DK_2;
    if (value == STSchemeColorVal.LT_2) return ST_SchemeColorValModel.LT_2;
    return null;
  }

  public static STSchemeColorVal toDocx4J(ST_SchemeColorValModel value) {
    return null;
  }
}
