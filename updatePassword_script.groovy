import org.bonitasoft.engine.exception.UpdateException;
import org.bonitasoft.engine.identity.UserUpdater;
import java.util.logging.Logger;

Logger log = Logger.getLogger ("org.bonitasoft.fredk")
log.severe (" DEBUG - START setNewPassword " )

try{
	final UserUpdater updateDescriptor = new UserUpdater();
	updateDescriptor.setPassword(field_password);
	apiAccessor.getIdentityAPI().updateUser(loggedUserId, updateDescriptor)
	log.severe (" DEBUG - END setNewPassword " )
	return true
} catch ( UpdateException e){
	log.severe (" DEBUG - UpdateException : " + e.detailMessage )
	log.severe (" DEBUG - END setNewPassword " )
	return false
}



