package it.dsigno.liferay.sb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Logger}.
 * </p>
 *
 * @author @denissignoretto
 * @see Logger
 * @generated
 */
public class LoggerWrapper implements Logger, ModelWrapper<Logger> {
    private Logger _logger;

    public LoggerWrapper(Logger logger) {
        _logger = logger;
    }

    @Override
    public Class<?> getModelClass() {
        return Logger.class;
    }

    @Override
    public String getModelClassName() {
        return Logger.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("loggerId", getLoggerId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("logMessage", getLogMessage());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long loggerId = (Long) attributes.get("loggerId");

        if (loggerId != null) {
            setLoggerId(loggerId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String logMessage = (String) attributes.get("logMessage");

        if (logMessage != null) {
            setLogMessage(logMessage);
        }
    }

    /**
    * Returns the primary key of this logger.
    *
    * @return the primary key of this logger
    */
    @Override
    public long getPrimaryKey() {
        return _logger.getPrimaryKey();
    }

    /**
    * Sets the primary key of this logger.
    *
    * @param primaryKey the primary key of this logger
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _logger.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the logger ID of this logger.
    *
    * @return the logger ID of this logger
    */
    @Override
    public long getLoggerId() {
        return _logger.getLoggerId();
    }

    /**
    * Sets the logger ID of this logger.
    *
    * @param loggerId the logger ID of this logger
    */
    @Override
    public void setLoggerId(long loggerId) {
        _logger.setLoggerId(loggerId);
    }

    /**
    * Returns the group ID of this logger.
    *
    * @return the group ID of this logger
    */
    @Override
    public long getGroupId() {
        return _logger.getGroupId();
    }

    /**
    * Sets the group ID of this logger.
    *
    * @param groupId the group ID of this logger
    */
    @Override
    public void setGroupId(long groupId) {
        _logger.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this logger.
    *
    * @return the company ID of this logger
    */
    @Override
    public long getCompanyId() {
        return _logger.getCompanyId();
    }

    /**
    * Sets the company ID of this logger.
    *
    * @param companyId the company ID of this logger
    */
    @Override
    public void setCompanyId(long companyId) {
        _logger.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this logger.
    *
    * @return the user ID of this logger
    */
    @Override
    public long getUserId() {
        return _logger.getUserId();
    }

    /**
    * Sets the user ID of this logger.
    *
    * @param userId the user ID of this logger
    */
    @Override
    public void setUserId(long userId) {
        _logger.setUserId(userId);
    }

    /**
    * Returns the user uuid of this logger.
    *
    * @return the user uuid of this logger
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _logger.getUserUuid();
    }

    /**
    * Sets the user uuid of this logger.
    *
    * @param userUuid the user uuid of this logger
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _logger.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this logger.
    *
    * @return the user name of this logger
    */
    @Override
    public java.lang.String getUserName() {
        return _logger.getUserName();
    }

    /**
    * Sets the user name of this logger.
    *
    * @param userName the user name of this logger
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _logger.setUserName(userName);
    }

    /**
    * Returns the create date of this logger.
    *
    * @return the create date of this logger
    */
    @Override
    public java.util.Date getCreateDate() {
        return _logger.getCreateDate();
    }

    /**
    * Sets the create date of this logger.
    *
    * @param createDate the create date of this logger
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _logger.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this logger.
    *
    * @return the modified date of this logger
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _logger.getModifiedDate();
    }

    /**
    * Sets the modified date of this logger.
    *
    * @param modifiedDate the modified date of this logger
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _logger.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the log message of this logger.
    *
    * @return the log message of this logger
    */
    @Override
    public java.lang.String getLogMessage() {
        return _logger.getLogMessage();
    }

    /**
    * Sets the log message of this logger.
    *
    * @param logMessage the log message of this logger
    */
    @Override
    public void setLogMessage(java.lang.String logMessage) {
        _logger.setLogMessage(logMessage);
    }

    @Override
    public boolean isNew() {
        return _logger.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _logger.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _logger.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _logger.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _logger.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _logger.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _logger.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _logger.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _logger.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _logger.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _logger.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new LoggerWrapper((Logger) _logger.clone());
    }

    @Override
    public int compareTo(it.dsigno.liferay.sb.model.Logger logger) {
        return _logger.compareTo(logger);
    }

    @Override
    public int hashCode() {
        return _logger.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<it.dsigno.liferay.sb.model.Logger> toCacheModel() {
        return _logger.toCacheModel();
    }

    @Override
    public it.dsigno.liferay.sb.model.Logger toEscapedModel() {
        return new LoggerWrapper(_logger.toEscapedModel());
    }

    @Override
    public it.dsigno.liferay.sb.model.Logger toUnescapedModel() {
        return new LoggerWrapper(_logger.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _logger.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _logger.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _logger.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LoggerWrapper)) {
            return false;
        }

        LoggerWrapper loggerWrapper = (LoggerWrapper) obj;

        if (Validator.equals(_logger, loggerWrapper._logger)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Logger getWrappedLogger() {
        return _logger;
    }

    @Override
    public Logger getWrappedModel() {
        return _logger;
    }

    @Override
    public void resetOriginalValues() {
        _logger.resetOriginalValues();
    }
}
