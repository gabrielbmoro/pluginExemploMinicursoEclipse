package My.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class EdgeReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public EdgeReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof My.Edge) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof My.Node && newEnd instanceof My.Node)) {
			return false;
		}
		My.Node target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof My.Node)) {
			return false;
		}
		My.Node container = (My.Node) getLink().eContainer();
		return My.diagram.edit.policies.MyBaseItemSemanticEditPolicy.getLinkConstraints().canExistEdge_4001(container,
				getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof My.Node && newEnd instanceof My.Node)) {
			return false;
		}
		My.Node source = getLink().getSource();
		if (!(getLink().eContainer() instanceof My.Node)) {
			return false;
		}
		My.Node container = (My.Node) getLink().eContainer();
		return My.diagram.edit.policies.MyBaseItemSemanticEditPolicy.getLinkConstraints().canExistEdge_4001(container,
				getLink(), source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected My.Edge getLink() {
		return (My.Edge) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected My.Node getOldSource() {
		return (My.Node) oldEnd;
	}

	/**
	* @generated
	*/
	protected My.Node getNewSource() {
		return (My.Node) newEnd;
	}

	/**
	* @generated
	*/
	protected My.Node getOldTarget() {
		return (My.Node) oldEnd;
	}

	/**
	* @generated
	*/
	protected My.Node getNewTarget() {
		return (My.Node) newEnd;
	}
}
