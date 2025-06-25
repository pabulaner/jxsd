package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.CTPolarAdjustHandleModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTPolarAdjustHandleModel
{
	
	private final STGeomGuideNameModel gdRefAng;
	private final STGeomGuideNameModel gdRefR;
	private final STAdjAngleModel maxAng;
	private final STAdjAngleModel minAng;
	private final STAdjCoordinateModel maxR;
	private final STAdjCoordinateModel minR;
	private final CTAdjPoint2DModel pos;
	
	public CTPolarAdjustHandleModel(STGeomGuideNameModel gdRefAng, STGeomGuideNameModel gdRefR, STAdjAngleModel maxAng, STAdjAngleModel minAng, STAdjCoordinateModel maxR, STAdjCoordinateModel minR, CTAdjPoint2DModel pos) {
		this.gdRefAng = gdRefAng;
		this.gdRefR = gdRefR;
		this.maxAng = maxAng;
		this.minAng = minAng;
		this.maxR = maxR;
		this.minR = minR;
		this.pos = pos;
	}
	
	public STGeomGuideNameModel getGdRefAng() {
		return this.gdRefAng;
	}
	public STGeomGuideNameModel getGdRefR() {
		return this.gdRefR;
	}
	public STAdjAngleModel getMaxAng() {
		return this.maxAng;
	}
	public STAdjAngleModel getMinAng() {
		return this.minAng;
	}
	public STAdjCoordinateModel getMaxR() {
		return this.maxR;
	}
	public STAdjCoordinateModel getMinR() {
		return this.minR;
	}
	public CTAdjPoint2DModel getPos() {
		return this.pos;
	}
}
