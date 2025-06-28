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
import test.drawingml.main.CTPath2DLineToModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTPath2DLineToModel
{
	
	private final CTAdjPoint2DModel pt;
	
	public CTPath2DLineToModel(CTAdjPoint2DModel pt) {
		this.pt = pt;
	}
	
	public CTAdjPoint2DModel getPt() {
		return this.pt;
	}
}
