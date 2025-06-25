package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.CTXYAdjustHandleModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTXYAdjustHandleModel
{
	
	private final STAdjCoordinateModel maxX;
	private final STGeomGuideNameModel gdRefY;
	private final STGeomGuideNameModel gdRefX;
	private final STAdjCoordinateModel maxY;
	private final STAdjCoordinateModel minY;
	private final STAdjCoordinateModel minX;
	private final CTAdjPoint2DModel pos;
	
	public CTXYAdjustHandleModel(STAdjCoordinateModel maxX, STGeomGuideNameModel gdRefY, STGeomGuideNameModel gdRefX, STAdjCoordinateModel maxY, STAdjCoordinateModel minY, STAdjCoordinateModel minX, CTAdjPoint2DModel pos) {
		this.maxX = maxX;
		this.gdRefY = gdRefY;
		this.gdRefX = gdRefX;
		this.maxY = maxY;
		this.minY = minY;
		this.minX = minX;
		this.pos = pos;
	}
	
	public STAdjCoordinateModel getMaxX() {
		return this.maxX;
	}
	public STGeomGuideNameModel getGdRefY() {
		return this.gdRefY;
	}
	public STGeomGuideNameModel getGdRefX() {
		return this.gdRefX;
	}
	public STAdjCoordinateModel getMaxY() {
		return this.maxY;
	}
	public STAdjCoordinateModel getMinY() {
		return this.minY;
	}
	public STAdjCoordinateModel getMinX() {
		return this.minX;
	}
	public CTAdjPoint2DModel getPos() {
		return this.pos;
	}
}
