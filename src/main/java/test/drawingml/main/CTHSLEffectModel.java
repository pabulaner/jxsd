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
import test.drawingml.chart.*;
import test.XMLSchema.*;
import test.drawingml.main.CTHSLEffectModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTHSLEffectModel
{
	
	private final STPositiveFixedAngleModel hue;
	private final STFixedPercentageModel lum;
	private final STFixedPercentageModel sat;
	
	public CTHSLEffectModel(STPositiveFixedAngleModel hue, STFixedPercentageModel lum, STFixedPercentageModel sat) {
		this.hue = hue;
		this.lum = lum;
		this.sat = sat;
	}
	
	public STPositiveFixedAngleModel getHue() {
		return this.hue;
	}
	public STFixedPercentageModel getLum() {
		return this.lum;
	}
	public STFixedPercentageModel getSat() {
		return this.sat;
	}
}
