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
import test.drawingml.main.CTAdjPoint2DModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTAdjPoint2DModel
{
	
	private final STAdjCoordinateModel y;
	private final STAdjCoordinateModel x;
	
	public CTAdjPoint2DModel(STAdjCoordinateModel y, STAdjCoordinateModel x) {
		this.y = y;
		this.x = x;
	}
	
	public STAdjCoordinateModel getY() {
		return this.y;
	}
	public STAdjCoordinateModel getX() {
		return this.x;
	}
}
