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
import test.drawingml.main.CTTintEffectModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTTintEffectModel
{
	
	private final STPositiveFixedAngleModel hue;
	private final STFixedPercentageModel amt;
	
	public CTTintEffectModel(STPositiveFixedAngleModel hue, STFixedPercentageModel amt) {
		this.hue = hue;
		this.amt = amt;
	}
	
	public STPositiveFixedAngleModel getHue() {
		return this.hue;
	}
	public STFixedPercentageModel getAmt() {
		return this.amt;
	}
}
