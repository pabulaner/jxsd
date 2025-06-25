package test.dml.chart;

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
import test.dml.chart.CTNumFmtModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

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
