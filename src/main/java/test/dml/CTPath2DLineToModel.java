package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.CTPath2DLineToModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

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
