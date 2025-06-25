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
import test.dml.chart.CTPageMarginsModel.*;
import test.officeDocument.relationships.*;

public class CTPageMarginsModel
{
	
	private final DoubleModel footer;
	private final DoubleModel l;
	private final DoubleModel t;
	private final DoubleModel header;
	private final DoubleModel r;
	private final DoubleModel b;
	
	public CTPageMarginsModel(DoubleModel footer, DoubleModel l, DoubleModel t, DoubleModel header, DoubleModel r, DoubleModel b) {
		this.footer = footer;
		this.l = l;
		this.t = t;
		this.header = header;
		this.r = r;
		this.b = b;
	}
	
	public DoubleModel getFooter() {
		return this.footer;
	}
	public DoubleModel getL() {
		return this.l;
	}
	public DoubleModel getT() {
		return this.t;
	}
	public DoubleModel getHeader() {
		return this.header;
	}
	public DoubleModel getR() {
		return this.r;
	}
	public DoubleModel getB() {
		return this.b;
	}
}
