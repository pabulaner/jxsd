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
import test.drawingml.main.CTTextTabStopModel.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTTextTabStopModel
{
	
	private final STCoordinate32Model pos;
	private final STTextTabAlignTypeModel algn;
	
	public CTTextTabStopModel(STCoordinate32Model pos, STTextTabAlignTypeModel algn) {
		this.pos = pos;
		this.algn = algn;
	}
	
	public STCoordinate32Model getPos() {
		return this.pos;
	}
	public STTextTabAlignTypeModel getAlgn() {
		return this.algn;
	}
}
