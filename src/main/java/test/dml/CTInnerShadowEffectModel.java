package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.CTInnerShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTInnerShadowEffectModel.*;
import test.officeDocument.relationships.*;

public class CTInnerShadowEffectModel
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
	private final STPositiveCoordinateModel blurRad;
	private final STPositiveCoordinateModel dist;
	private final STPositiveFixedAngleModel dir;
	private final ScrgbClrOrSrgbClrOrHslClrModel scrgbClrOrSrgbClrOrHslClr;
	
	public CTInnerShadowEffectModel(STPositiveCoordinateModel blurRad, STPositiveCoordinateModel dist, STPositiveFixedAngleModel dir, ScrgbClrOrSrgbClrOrHslClrModel scrgbClrOrSrgbClrOrHslClr) {
		this.blurRad = blurRad;
		this.dist = dist;
		this.dir = dir;
		this.scrgbClrOrSrgbClrOrHslClr = scrgbClrOrSrgbClrOrHslClr;
	}
	
	public STPositiveCoordinateModel getBlurRad() {
		return this.blurRad;
	}
	public STPositiveCoordinateModel getDist() {
		return this.dist;
	}
	public STPositiveFixedAngleModel getDir() {
		return this.dir;
	}
	public ScrgbClrOrSrgbClrOrHslClrModel getScrgbClrOrSrgbClrOrHslClr() {
		return this.scrgbClrOrSrgbClrOrHslClr;
	}
}
