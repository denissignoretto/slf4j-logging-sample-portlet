package it.dsigno.liferay.sb.service.impl;

import it.dsigno.liferay.sb.model.Logger;
import it.dsigno.liferay.sb.service.base.LoggerLocalServiceBaseImpl;

import java.util.Date;

import org.slf4j.LoggerFactory;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.persistence.UserUtil;

/**
 * The implementation of the logger local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link it.dsigno.liferay.sb.service.LoggerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author @denissignoretto
 * @see it.dsigno.liferay.sb.service.base.LoggerLocalServiceBaseImpl
 * @see it.dsigno.liferay.sb.service.LoggerLocalServiceUtil
 */
public class LoggerLocalServiceImpl extends LoggerLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link it.dsigno.liferay.sb.service.LoggerLocalServiceUtil} to access the logger local service.
     */
	
	private final org.slf4j.Logger _logger = LoggerFactory.getLogger(LoggerLocalServiceImpl.class);
	
	public Logger addLogMessage(long userId, String logMessage)
	        throws PortalException, SystemException {
		
	    User user = UserUtil.findByPrimaryKey(userId);
	    Date now = new Date();
	    long loggerId = CounterLocalServiceUtil.increment(Logger.class.getName());

	    Logger logger = loggerPersistence.create(loggerId);

	    logger.setLogMessage(logMessage);
	    logger.setCompanyId(user.getCompanyId());
	    logger.setUserId(user.getUserId());
	    logger.setUserName(user.getFullName());
	    logger.setCreateDate(now);
	    logger.setModifiedDate(now);
	    
	    if (_logger.isDebugEnabled()) {
	    	_logger.info("Adding Log Message: " + user.getUserId() + " " +logMessage);
	    	}
	    
	    return loggerPersistence.update(logger);
	}
}
