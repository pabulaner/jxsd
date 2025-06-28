package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.docx4j.dml.chart.*;
import test.drawingml.main.CTInnerShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel.*;
import test.drawingml.main.CTInnerShadowEffectModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTInnerShadowEffectModel
{
	
	// CHOICE MODEL
	public static class ScrgbClrOrSrgbClrOrHslClrModel
	{
		
		private final int type;
		
		private final Object value;
		
		public ScrgbClrOrSrgbClrOrHslClrModel() {
			this(-1, null);
		}
		
		private ScrgbClrOrSrgbClrOrHslClrModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static ScrgbClrOrSrgbClrOrHslClrModel createScrgbClr(CTScRgbColorModel value) {
			return new ScrgbClrOrSrgbClrOrHslClrModel(0, value);
		}
		public static ScrgbClrOrSrgbClrOrHslClrModel createSrgbClr(CTSRgbColorModel value) {
			return new ScrgbClrOrSrgbClrOrHslClrModel(1, value);
		}
		public static ScrgbClrOrSrgbClrOrHslClrModel createHslClr(CTHslColorModel value) {
			return new ScrgbClrOrSrgbClrOrHslClrModel(2, value);
		}
		public static ScrgbClrOrSrgbClrOrHslClrModel createSysClr(CTSystemColorModel value) {
			return new ScrgbClrOrSrgbClrOrHslClrModel(3, value);
		}
		public static ScrgbClrOrSrgbClrOrHslClrModel createSchemeClr(CTSchemeColorModel value) {
			return new ScrgbClrOrSrgbClrOrHslClrModel(4, value);
		}
		public static ScrgbClrOrSrgbClrOrHslClrModel createPrstClr(CTPresetColorModel value) {
			return new ScrgbClrOrSrgbClrOrHslClrModel(5, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isScrgbClr() {
			return this.type == 0;
		}
		
		public CTScRgbColorModel getScrgbClr() {
			if (this.type != 0) throw new ClassCastException();
			return (CTScRgbColorModel) value;
		}
		public boolean isSrgbClr() {
			return this.type == 1;
		}
		
		public CTSRgbColorModel getSrgbClr() {
			if (this.type != 1) throw new ClassCastException();
			return (CTSRgbColorModel) value;
		}
		public boolean isHslClr() {
			return this.type == 2;
		}
		
		public CTHslColorModel getHslClr() {
			if (this.type != 2) throw new ClassCastException();
			return (CTHslColorModel) value;
		}
		public boolean isSysClr() {
			return this.type == 3;
		}
		
		public CTSystemColorModel getSysClr() {
			if (this.type != 3) throw new ClassCastException();
			return (CTSystemColorModel) value;
		}
		public boolean isSchemeClr() {
			return this.type == 4;
		}
		
		public CTSchemeColorModel getSchemeClr() {
			if (this.type != 4) throw new ClassCastException();
			return (CTSchemeColorModel) value;
		}
		public boolean isPrstClr() {
			return this.type == 5;
		}
		
		public CTPresetColorModel getPrstClr() {
			if (this.type != 5) throw new ClassCastException();
			return (CTPresetColorModel) value;
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
