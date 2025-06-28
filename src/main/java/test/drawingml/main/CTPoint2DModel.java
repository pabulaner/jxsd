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
import test.drawingml.main.CTPoint2DModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTPoint2DModel
{
	
	private final STCoordinateModel y;
	private final STCoordinateModel x;
	
	public CTPoint2DModel(STCoordinateModel y, STCoordinateModel x) {
		this.y = y;
		this.x = x;
	}
	
	public STCoordinateModel getY() {
		return this.y;
	}
	public STCoordinateModel getX() {
		return this.x;
	}
}
