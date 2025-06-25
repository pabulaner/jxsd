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
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.chart.CTStrValModel.*;
import test.officeDocument.relationships.*;

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
