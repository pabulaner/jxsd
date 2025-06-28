package test.drawingml.chart;

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
import test.drawingml.chart.CTBuiltInUnitModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTBuiltInUnitModel
{
	
	private final STBuiltInUnitModel val;
	
	public CTBuiltInUnitModel(STBuiltInUnitModel val) {
		this.val = val;
	}
	
	public STBuiltInUnitModel getVal() {
		return this.val;
	}
}
