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
import test.drawingml.chart.CTNumFmtModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTNumFmtModel
{
	
	private final STXstringModel formatCode;
	private final BooleanModel sourceLinked;
	
	public CTNumFmtModel(STXstringModel formatCode, BooleanModel sourceLinked) {
		this.formatCode = formatCode;
		this.sourceLinked = sourceLinked;
	}
	
	public STXstringModel getFormatCode() {
		return this.formatCode;
	}
	public BooleanModel getSourceLinked() {
		return this.sourceLinked;
	}
}
