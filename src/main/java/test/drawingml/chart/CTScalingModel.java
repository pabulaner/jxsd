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
import test.drawingml.chart.CTScalingModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTScalingModel
{
	
	private final CTLogBaseModel logBase;
	private final CTOrientationModel orientation;
	private final CTDoubleModel max;
	private final CTDoubleModel min;
	private final CTExtensionListModel extLst;
	
	public CTScalingModel(CTLogBaseModel logBase, CTOrientationModel orientation, CTDoubleModel max, CTDoubleModel min, CTExtensionListModel extLst) {
		this.logBase = logBase;
		this.orientation = orientation;
		this.max = max;
		this.min = min;
		this.extLst = extLst;
	}
	
	public CTLogBaseModel getLogBase() {
		return this.logBase;
	}
	public CTOrientationModel getOrientation() {
		return this.orientation;
	}
	public CTDoubleModel getMax() {
		return this.max;
	}
	public CTDoubleModel getMin() {
		return this.min;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
