package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.STAdjAngleModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class STAdjAngleModel
{
	
	private final Object value;
	
	public STAdjAngleModel() {
		this.value = null;
	}
	
	public STAdjAngleModel(STAngleModel value) {
		this.value = value;
	}
	public STAdjAngleModel(STGeomGuideNameModel value) {
		this.value = value;
	}
	
	public Object getRaw() {
		return this.value;
	}
	
	public STAngleModel getST_Angle() {
		return (STAngleModel) this.value;
	}
	public STGeomGuideNameModel getST_GeomGuideName() {
		return (STGeomGuideNameModel) this.value;
	}
}
