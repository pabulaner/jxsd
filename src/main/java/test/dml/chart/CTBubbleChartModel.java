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
import test.dml.chart.CTBubbleChartModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTBubbleChartModel
{
	
	private final CTBooleanModel varyColors;
	private final List<CTBubbleSerModel> ser;
	private final CTDLblsModel dLbls;
	private final CTBooleanModel bubble3D;
	private final CTBubbleScaleModel bubbleScale;
	private final CTBooleanModel showNegBubbles;
	private final CTSizeRepresentsModel sizeRepresents;
	private final List<CTUnsignedIntModel> axId;
	private final CTExtensionListModel extLst;
	
	public CTBubbleChartModel(CTBooleanModel varyColors, List<CTBubbleSerModel> ser, CTDLblsModel dLbls, CTBooleanModel bubble3D, CTBubbleScaleModel bubbleScale, CTBooleanModel showNegBubbles, CTSizeRepresentsModel sizeRepresents, List<CTUnsignedIntModel> axId, CTExtensionListModel extLst) {
		this.varyColors = varyColors;
		this.ser = ser;
		this.dLbls = dLbls;
		this.bubble3D = bubble3D;
		this.bubbleScale = bubbleScale;
		this.showNegBubbles = showNegBubbles;
		this.sizeRepresents = sizeRepresents;
		this.axId = axId;
		this.extLst = extLst;
	}
	
	public CTBooleanModel getVaryColors() {
		return this.varyColors;
	}
	public List<CTBubbleSerModel> getSer() {
		return this.ser;
	}
	public CTDLblsModel getDLbls() {
		return this.dLbls;
	}
	public CTBooleanModel getBubble3D() {
		return this.bubble3D;
	}
	public CTBubbleScaleModel getBubbleScale() {
		return this.bubbleScale;
	}
	public CTBooleanModel getShowNegBubbles() {
		return this.showNegBubbles;
	}
	public CTSizeRepresentsModel getSizeRepresents() {
		return this.sizeRepresents;
	}
	public List<CTUnsignedIntModel> getAxId() {
		return this.axId;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
