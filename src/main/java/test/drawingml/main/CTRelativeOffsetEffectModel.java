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
import test.drawingml.main.CTRelativeOffsetEffectModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTRelativeOffsetEffectModel
{
	
	private final STPercentageModel ty;
	private final STPercentageModel tx;
	
	public CTRelativeOffsetEffectModel(STPercentageModel ty, STPercentageModel tx) {
		this.ty = ty;
		this.tx = tx;
	}
	
	public STPercentageModel getTy() {
		return this.ty;
	}
	public STPercentageModel getTx() {
		return this.tx;
	}
}
