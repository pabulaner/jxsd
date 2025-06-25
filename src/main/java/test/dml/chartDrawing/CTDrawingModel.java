package test.dml.chartDrawing;

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
import test.dml.chartDrawing.CTDrawingModel.*;
import test.officeDocument.relationships.*;

public class CTDrawingModel
{
	
	private final Object value;
	
	public CTDrawingModel() {
		this.value = null;
	}
	
	public CTDrawingModel(CTRelSizeAnchorModel value) {
		this.value = value;
	}
	public CTDrawingModel(CTAbsSizeAnchorModel value) {
		this.value = value;
	}
	
	public Object getRaw() {
		return this.value;
	}
	
	public CTRelSizeAnchorModel getRelSizeAnchor() {
		return (CTRelSizeAnchorModel) value;
	}
	public CTAbsSizeAnchorModel getAbsSizeAnchor() {
		return (CTAbsSizeAnchorModel) value;
	}
}
