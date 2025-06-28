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
import test.drawingml.main.CTConnectionModel.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTConnectionModel
{
	
	private final STDrawingElementIdModel id;
	private final UnsignedIntModel idx;
	
	public CTConnectionModel(STDrawingElementIdModel id, UnsignedIntModel idx) {
		this.id = id;
		this.idx = idx;
	}
	
	public STDrawingElementIdModel getId() {
		return this.id;
	}
	public UnsignedIntModel getIdx() {
		return this.idx;
	}
}
