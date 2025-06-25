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
import test.dml.CTAdjPoint2DModel.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

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
