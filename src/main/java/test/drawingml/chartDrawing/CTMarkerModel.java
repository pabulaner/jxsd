package test.drawingml.chartDrawing;

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
import test.drawingml.chartDrawing.CTMarkerModel.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTMarkerModel
{
	
	private final STMarkerCoordinateModel x;
	private final STMarkerCoordinateModel y;
	
	public CTMarkerModel(STMarkerCoordinateModel x, STMarkerCoordinateModel y) {
		this.x = x;
		this.y = y;
	}
	
	public STMarkerCoordinateModel getX() {
		return this.x;
	}
	public STMarkerCoordinateModel getY() {
		return this.y;
	}
}
