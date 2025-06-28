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
import test.drawingml.main.CTGradientStopListModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTGradientStopListModel
{
	
	private final List<CTGradientStopModel> gs;
	
	public CTGradientStopListModel(List<CTGradientStopModel> gs) {
		this.gs = gs;
	}
	
	public List<CTGradientStopModel> getGs() {
		return this.gs;
	}
}
