package My.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class MyNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		My.diagram.part.MyDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		My.diagram.part.MyDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof My.diagram.navigator.MyNavigatorItem
				&& !isOwnView(((My.diagram.navigator.MyNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof My.diagram.navigator.MyNavigatorGroup) {
			My.diagram.navigator.MyNavigatorGroup group = (My.diagram.navigator.MyNavigatorGroup) element;
			return My.diagram.part.MyDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof My.diagram.navigator.MyNavigatorItem) {
			My.diagram.navigator.MyNavigatorItem navigatorItem = (My.diagram.navigator.MyNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (My.diagram.part.MyVisualIDRegistry.getVisualID(view)) {
		case My.diagram.edit.parts.DomainEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?My?Domain", My.diagram.providers.MyElementTypes.Domain_1000); //$NON-NLS-1$
		case My.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?My?Node", My.diagram.providers.MyElementTypes.Node_2001); //$NON-NLS-1$
		case My.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getImage("Navigator?Link?My?Edge", My.diagram.providers.MyElementTypes.Edge_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = My.diagram.part.MyDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& My.diagram.providers.MyElementTypes.isKnownElementType(elementType)) {
			image = My.diagram.providers.MyElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof My.diagram.navigator.MyNavigatorGroup) {
			My.diagram.navigator.MyNavigatorGroup group = (My.diagram.navigator.MyNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof My.diagram.navigator.MyNavigatorItem) {
			My.diagram.navigator.MyNavigatorItem navigatorItem = (My.diagram.navigator.MyNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (My.diagram.part.MyVisualIDRegistry.getVisualID(view)) {
		case My.diagram.edit.parts.DomainEditPart.VISUAL_ID:
			return getDomain_1000Text(view);
		case My.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2001Text(view);
		case My.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getEdge_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getDomain_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getNode_2001Text(View view) {
		IParser parser = My.diagram.providers.MyParserProvider.getParser(My.diagram.providers.MyElementTypes.Node_2001,
				view.getElement() != null ? view.getElement() : view,
				My.diagram.part.MyVisualIDRegistry.getType(My.diagram.edit.parts.NodeLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			My.diagram.part.MyDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEdge_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return My.diagram.edit.parts.DomainEditPart.MODEL_ID
				.equals(My.diagram.part.MyVisualIDRegistry.getModelID(view));
	}

}
