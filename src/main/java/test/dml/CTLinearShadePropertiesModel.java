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
import test.dml.CTLinearShadePropertiesModel.*;
import test.officeDocument.relationships.*;

public class CTLinearShadePropertiesModel
{
	
	private final BooleanModel scaled;
	private final STPositiveFixedAngleModel ang;
	
	public CTLinearShadePropertiesModel(BooleanModel scaled, STPositiveFixedAngleModel ang) {
		this.scaled = scaled;
		this.ang = ang;
	}
	
	public BooleanModel getScaled() {
		return this.scaled;
	}
	public STPositiveFixedAngleModel getAng() {
		return this.ang;
	}
}
