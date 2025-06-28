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
import test.officeDocument.relationships.*;
import test.drawingml.main.CTConnectionSiteModel.*;

// SEQUENCE MODEL
public class CTConnectionSiteModel
{
	
	private final STAdjAngleModel ang;
	private final CTAdjPoint2DModel pos;
	
	public CTConnectionSiteModel(STAdjAngleModel ang, CTAdjPoint2DModel pos) {
		this.ang = ang;
		this.pos = pos;
	}
	
	public STAdjAngleModel getAng() {
		return this.ang;
	}
	public CTAdjPoint2DModel getPos() {
		return this.pos;
	}
}
