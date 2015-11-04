package My.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class MyDiagramUpdater {

	/**
	* @generated
	*/
	public static List<My.diagram.part.MyNodeDescriptor> getSemanticChildren(View view) {
		switch (My.diagram.part.MyVisualIDRegistry.getVisualID(view)) {
		case My.diagram.edit.parts.DomainEditPart.VISUAL_ID:
			return getDomain_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<My.diagram.part.MyNodeDescriptor> getDomain_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		My.Domain modelElement = (My.Domain) view.getElement();
		LinkedList<My.diagram.part.MyNodeDescriptor> result = new LinkedList<My.diagram.part.MyNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			My.Node childElement = (My.Node) it.next();
			int visualID = My.diagram.part.MyVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == My.diagram.edit.parts.NodeEditPart.VISUAL_ID) {
				result.add(new My.diagram.part.MyNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<My.diagram.part.MyLinkDescriptor> getContainedLinks(View view) {
		switch (My.diagram.part.MyVisualIDRegistry.getVisualID(view)) {
		case My.diagram.edit.parts.DomainEditPart.VISUAL_ID:
			return getDomain_1000ContainedLinks(view);
		case My.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2001ContainedLinks(view);
		case My.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getEdge_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<My.diagram.part.MyLinkDescriptor> getIncomingLinks(View view) {
		switch (My.diagram.part.MyVisualIDRegistry.getVisualID(view)) {
		case My.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2001IncomingLinks(view);
		case My.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getEdge_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<My.diagram.part.MyLinkDescriptor> getOutgoingLinks(View view) {
		switch (My.diagram.part.MyVisualIDRegistry.getVisualID(view)) {
		case My.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2001OutgoingLinks(view);
		case My.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getEdge_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<My.diagram.part.MyLinkDescriptor> getDomain_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<My.diagram.part.MyLinkDescriptor> getNode_2001ContainedLinks(View view) {
		My.Node modelElement = (My.Node) view.getElement();
		LinkedList<My.diagram.part.MyLinkDescriptor> result = new LinkedList<My.diagram.part.MyLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<My.diagram.part.MyLinkDescriptor> getEdge_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<My.diagram.part.MyLinkDescriptor> getNode_2001IncomingLinks(View view) {
		My.Node modelElement = (My.Node) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<My.diagram.part.MyLinkDescriptor> result = new LinkedList<My.diagram.part.MyLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<My.diagram.part.MyLinkDescriptor> getEdge_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<My.diagram.part.MyLinkDescriptor> getNode_2001OutgoingLinks(View view) {
		My.Node modelElement = (My.Node) view.getElement();
		LinkedList<My.diagram.part.MyLinkDescriptor> result = new LinkedList<My.diagram.part.MyLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<My.diagram.part.MyLinkDescriptor> getEdge_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<My.diagram.part.MyLinkDescriptor> getContainedTypeModelFacetLinks_Edge_4001(
			My.Node container) {
		LinkedList<My.diagram.part.MyLinkDescriptor> result = new LinkedList<My.diagram.part.MyLinkDescriptor>();
		for (Iterator<?> links = container.getRelations().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof My.Edge) {
				continue;
			}
			My.Edge link = (My.Edge) linkObject;
			if (My.diagram.edit.parts.EdgeEditPart.VISUAL_ID != My.diagram.part.MyVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			My.Node dst = link.getTarget();
			My.Node src = link.getSource();
			result.add(new My.diagram.part.MyLinkDescriptor(src, dst, link,
					My.diagram.providers.MyElementTypes.Edge_4001, My.diagram.edit.parts.EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<My.diagram.part.MyLinkDescriptor> getIncomingTypeModelFacetLinks_Edge_4001(My.Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<My.diagram.part.MyLinkDescriptor> result = new LinkedList<My.diagram.part.MyLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != My.MyPackage.eINSTANCE.getEdge_Target()
					|| false == setting.getEObject() instanceof My.Edge) {
				continue;
			}
			My.Edge link = (My.Edge) setting.getEObject();
			if (My.diagram.edit.parts.EdgeEditPart.VISUAL_ID != My.diagram.part.MyVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			My.Node src = link.getSource();
			result.add(new My.diagram.part.MyLinkDescriptor(src, target, link,
					My.diagram.providers.MyElementTypes.Edge_4001, My.diagram.edit.parts.EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<My.diagram.part.MyLinkDescriptor> getOutgoingTypeModelFacetLinks_Edge_4001(
			My.Node source) {
		My.Node container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof My.Node) {
				container = (My.Node) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<My.diagram.part.MyLinkDescriptor> result = new LinkedList<My.diagram.part.MyLinkDescriptor>();
		for (Iterator<?> links = container.getRelations().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof My.Edge) {
				continue;
			}
			My.Edge link = (My.Edge) linkObject;
			if (My.diagram.edit.parts.EdgeEditPart.VISUAL_ID != My.diagram.part.MyVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			My.Node dst = link.getTarget();
			My.Node src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new My.diagram.part.MyLinkDescriptor(src, dst, link,
					My.diagram.providers.MyElementTypes.Edge_4001, My.diagram.edit.parts.EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<My.diagram.part.MyNodeDescriptor> getSemanticChildren(View view) {
			return MyDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<My.diagram.part.MyLinkDescriptor> getContainedLinks(View view) {
			return MyDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<My.diagram.part.MyLinkDescriptor> getIncomingLinks(View view) {
			return MyDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<My.diagram.part.MyLinkDescriptor> getOutgoingLinks(View view) {
			return MyDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
