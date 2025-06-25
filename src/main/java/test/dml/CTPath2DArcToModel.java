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
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTPath2DArcToModel.*;
import test.officeDocument.relationships.*;

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
