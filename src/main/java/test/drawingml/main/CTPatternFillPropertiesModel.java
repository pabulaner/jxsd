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
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.main.CTPatternFillPropertiesModel.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTPatternFillPropertiesModel
{
	
	private final STPresetPatternValModel prst;
	private final CTColorModel fgClr;
	private final CTColorModel bgClr;
	
	public CTPatternFillPropertiesModel(STPresetPatternValModel prst, CTColorModel fgClr, CTColorModel bgClr) {
		this.prst = prst;
		this.fgClr = fgClr;
		this.bgClr = bgClr;
	}
	
	public STPresetPatternValModel getPrst() {
		return this.prst;
	}
	public CTColorModel getFgClr() {
		return this.fgClr;
	}
	public CTColorModel getBgClr() {
		return this.bgClr;
	}
}
