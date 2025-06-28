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
import test.drawingml.main.CTPath2DArcToModel.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTPath2DArcToModel
{
	
	private final STAdjAngleModel stAng;
	private final STAdjAngleModel swAng;
	private final STAdjCoordinateModel wR;
	private final STAdjCoordinateModel hR;
	
	public CTPath2DArcToModel(STAdjAngleModel stAng, STAdjAngleModel swAng, STAdjCoordinateModel wR, STAdjCoordinateModel hR) {
		this.stAng = stAng;
		this.swAng = swAng;
		this.wR = wR;
		this.hR = hR;
	}
	
	public STAdjAngleModel getStAng() {
		return this.stAng;
	}
	public STAdjAngleModel getSwAng() {
		return this.swAng;
	}
	public STAdjCoordinateModel getWR() {
		return this.wR;
	}
	public STAdjCoordinateModel getHR() {
		return this.hR;
	}
}
