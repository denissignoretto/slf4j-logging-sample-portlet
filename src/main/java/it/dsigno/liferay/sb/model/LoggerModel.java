package it.dsigno.liferay.sb.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Logger service. Represents a row in the &quot;IT_DSIGNO_Logger&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link it.dsigno.liferay.sb.model.impl.LoggerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link it.dsigno.liferay.sb.model.impl.LoggerImpl}.
 * </p>
 *
 * @author @denissignoretto
 * @see Logger
 * @see it.dsigno.liferay.sb.model.impl.LoggerImpl
 * @see it.dsigno.liferay.sb.model.impl.LoggerModelImpl
 * @generated
 */
public interface LoggerModel extends BaseModel<Logger>, GroupedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a logger model instance should use the {@link Logger} interface instead.
     */

    /**
     * Returns the primary key of this logger.
     *
     * @return the primary key of this logger
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this logger.
     *
     * @param primaryKey the primary key of this logger
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the logger ID of this logger.
     *
     * @return the logger ID of this logger
     */
    public long getLoggerId();

    /**
     * Sets the logger ID of this logger.
     *
     * @param loggerId the logger ID of this logger
     */
    public void setLoggerId(long loggerId);

    /**
     * Returns the group ID of this logger.
     *
     * @return the group ID of this logger
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this logger.
     *
     * @param groupId the group ID of this logger
     */
    @Override
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this logger.
     *
     * @return the company ID of this logger
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this logger.
     *
     * @param companyId the company ID of this logger
     */
    @Override
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this logger.
     *
     * @return the user ID of this logger
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this logger.
     *
     * @param userId the user ID of this logger
     */
    @Override
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this logger.
     *
     * @return the user uuid of this logger
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this logger.
     *
     * @param userUuid the user uuid of this logger
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this logger.
     *
     * @return the user name of this logger
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this logger.
     *
     * @param userName the user name of this logger
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this logger.
     *
     * @return the create date of this logger
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this logger.
     *
     * @param createDate the create date of this logger
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this logger.
     *
     * @return the modified date of this logger
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this logger.
     *
     * @param modifiedDate the modified date of this logger
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the log message of this logger.
     *
     * @return the log message of this logger
     */
    @AutoEscape
    public String getLogMessage();

    /**
     * Sets the log message of this logger.
     *
     * @param logMessage the log message of this logger
     */
    public void setLogMessage(String logMessage);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(Logger logger);

    @Override
    public int hashCode();

    @Override
    public CacheModel<Logger> toCacheModel();

    @Override
    public Logger toEscapedModel();

    @Override
    public Logger toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
