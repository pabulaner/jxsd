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
import test.drawingml.main.CTBevelModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTBevelModel
{
	
	private final STPositiveCoordinateModel h;
	private final STPositiveCoordinateModel w;
	private final STBevelPresetTypeModel prst;
	
	public CTBevelModel(STPositiveCoordinateModel h, STPositiveCoordinateModel w, STBevelPresetTypeModel prst) {
		this.h = h;
		this.w = w;
		this.prst = prst;
	}
	
	public STPositiveCoordinateModel getH() {
		return this.h;
	}
	public STPositiveCoordinateModel getW() {
		return this.w;
	}
	public STBevelPresetTypeModel getPrst() {
		return this.prst;
	}
}
