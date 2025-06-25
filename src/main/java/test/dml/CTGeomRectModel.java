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
import test.dml.CTGeomRectModel.*;
import test.officeDocument.relationships.*;

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
