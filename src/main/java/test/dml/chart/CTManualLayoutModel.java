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
import test.dml.chart.CTManualLayoutModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTManualLayoutModel
{
	
	private final CTLayoutTargetModel layoutTarget;
	private final CTLayoutModeModel xMode;
	private final CTLayoutModeModel yMode;
	private final CTLayoutModeModel wMode;
	private final CTLayoutModeModel hMode;
	private final CTDoubleModel x;
	private final CTDoubleModel y;
	private final CTDoubleModel w;
	private final CTDoubleModel h;
	private final CTExtensionListModel extLst;
	
	public CTManualLayoutModel(CTLayoutTargetModel layoutTarget, CTLayoutModeModel xMode, CTLayoutModeModel yMode, CTLayoutModeModel wMode, CTLayoutModeModel hMode, CTDoubleModel x, CTDoubleModel y, CTDoubleModel w, CTDoubleModel h, CTExtensionListModel extLst) {
		this.layoutTarget = layoutTarget;
		this.xMode = xMode;
		this.yMode = yMode;
		this.wMode = wMode;
		this.hMode = hMode;
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.extLst = extLst;
	}
	
	public CTLayoutTargetModel getLayoutTarget() {
		return this.layoutTarget;
	}
	public CTLayoutModeModel getXMode() {
		return this.xMode;
	}
	public CTLayoutModeModel getYMode() {
		return this.yMode;
	}
	public CTLayoutModeModel getWMode() {
		return this.wMode;
	}
	public CTLayoutModeModel getHMode() {
		return this.hMode;
	}
	public CTDoubleModel getX() {
		return this.x;
	}
	public CTDoubleModel getY() {
		return this.y;
	}
	public CTDoubleModel getW() {
		return this.w;
	}
	public CTDoubleModel getH() {
		return this.h;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
