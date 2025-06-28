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
import test.drawingml.main.STAdjCoordinateModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// UNION MODEL
public class STAdjCoordinateModel
{
	
	private final Object value;
	
	public STAdjCoordinateModel() {
		this.value = null;
	}
	
	public STAdjCoordinateModel(STCoordinateModel value) {
		this.value = value;
	}
	public STAdjCoordinateModel(STGeomGuideNameModel value) {
		this.value = value;
	}
	
	public Object getRaw() {
		return this.value;
	}
	
	public STCoordinateModel getST_Coordinate() {
		return (STCoordinateModel) this.value;
	}
	public STGeomGuideNameModel getST_GeomGuideName() {
		return (STGeomGuideNameModel) this.value;
	}
}
