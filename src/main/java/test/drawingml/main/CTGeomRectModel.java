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
import test.drawingml.chartDrawing.*;
import test.drawingml.main.CTGeomRectModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTGeomRectModel
{
	
	private final STAdjCoordinateModel l;
	private final STAdjCoordinateModel t;
	private final STAdjCoordinateModel r;
	private final STAdjCoordinateModel b;
	
	public CTGeomRectModel(STAdjCoordinateModel l, STAdjCoordinateModel t, STAdjCoordinateModel r, STAdjCoordinateModel b) {
		this.l = l;
		this.t = t;
		this.r = r;
		this.b = b;
	}
	
	public STAdjCoordinateModel getL() {
		return this.l;
	}
	public STAdjCoordinateModel getT() {
		return this.t;
	}
	public STAdjCoordinateModel getR() {
		return this.r;
	}
	public STAdjCoordinateModel getB() {
		return this.b;
	}
}
