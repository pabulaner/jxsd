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
import test.drawingml.main.CTRelativeRectModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTRelativeRectModel
{
	
	private final STPercentageModel l;
	private final STPercentageModel t;
	private final STPercentageModel r;
	private final STPercentageModel b;
	
	public CTRelativeRectModel(STPercentageModel l, STPercentageModel t, STPercentageModel r, STPercentageModel b) {
		this.l = l;
		this.t = t;
		this.r = r;
		this.b = b;
	}
	
	public STPercentageModel getL() {
		return this.l;
	}
	public STPercentageModel getT() {
		return this.t;
	}
	public STPercentageModel getR() {
		return this.r;
	}
	public STPercentageModel getB() {
		return this.b;
	}
}
