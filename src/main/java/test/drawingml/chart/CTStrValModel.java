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
import test.drawingml.chart.CTStrValModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTStrValModel
{
	
	private final UnsignedIntModel idx;
	private final STXstringModel v;
	
	public CTStrValModel(UnsignedIntModel idx, STXstringModel v) {
		this.idx = idx;
		this.v = v;
	}
	
	public UnsignedIntModel getIdx() {
		return this.idx;
	}
	public STXstringModel getV() {
		return this.v;
	}
}
