package My.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class MyNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4003;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof My.diagram.navigator.MyNavigatorItem) {
			My.diagram.navigator.MyNavigatorItem item = (My.diagram.navigator.MyNavigatorItem) element;
			return My.diagram.part.MyVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
