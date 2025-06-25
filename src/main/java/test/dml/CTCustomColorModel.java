package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.CTCustomColorModel.ScrgbClrOrSrgbClrOrHslClrModel.*;
import test.dml.CTCustomColorModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTCustomColorModel
{
	
	public static class ScrgbClrOrSrgbClrOrHslClrModel
	{
		
		private final CTScRgbColorModel scrgbClr;
		private final CTSRgbColorModel srgbClr;
		private final CTHslColorModel hslClr;
		private final CTSystemColorModel sysClr;
		private final CTSchemeColorModel schemeClr;
		private final CTPresetColorModel prstClr;
		
		public ScrgbClrOrSrgbClrOrHslClrModel(CTScRgbColorModel scrgbClr, CTSRgbColorModel srgbClr, CTHslColorModel hslClr, CTSystemColorModel sysClr, CTSchemeColorModel schemeClr, CTPresetColorModel prstClr) {
			this.scrgbClr = scrgbClr;
			this.srgbClr = srgbClr;
			this.hslClr = hslClr;
			this.sysClr = sysClr;
			this.schemeClr = schemeClr;
			this.prstClr = prstClr;
		}
		
		public CTScRgbColorModel getScrgbClr() {
			return this.scrgbClr;
		}
		public CTSRgbColorModel getSrgbClr() {
			return this.srgbClr;
		}
		public CTHslColorModel getHslClr() {
			return this.hslClr;
		}
		public CTSystemColorModel getSysClr() {
			return this.sysClr;
		}
		public CTSchemeColorModel getSchemeClr() {
			return this.schemeClr;
		}
		public CTPresetColorModel getPrstClr() {
			return this.prstClr;
		}
	}
	private final StringModel name;
	private final ScrgbClrOrSrgbClrOrHslClrModel scrgbClrOrSrgbClrOrHslClr;
	
	public CTCustomColorModel(StringModel name, ScrgbClrOrSrgbClrOrHslClrModel scrgbClrOrSrgbClrOrHslClr) {
		this.name = name;
		this.scrgbClrOrSrgbClrOrHslClr = scrgbClrOrSrgbClrOrHslClr;
	}
	
	public StringModel getName() {
		return this.name;
	}
	public ScrgbClrOrSrgbClrOrHslClrModel getScrgbClrOrSrgbClrOrHslClr() {
		return this.scrgbClrOrSrgbClrOrHslClr;
	}
}
