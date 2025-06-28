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
import test.drawingml.main.CTSphereCoordsModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTSphereCoordsModel
{
	
	private final STPositiveFixedAngleModel lat;
	private final STPositiveFixedAngleModel rev;
	private final STPositiveFixedAngleModel lon;
	
	public CTSphereCoordsModel(STPositiveFixedAngleModel lat, STPositiveFixedAngleModel rev, STPositiveFixedAngleModel lon) {
		this.lat = lat;
		this.rev = rev;
		this.lon = lon;
	}
	
	public STPositiveFixedAngleModel getLat() {
		return this.lat;
	}
	public STPositiveFixedAngleModel getRev() {
		return this.rev;
	}
	public STPositiveFixedAngleModel getLon() {
		return this.lon;
	}
}
