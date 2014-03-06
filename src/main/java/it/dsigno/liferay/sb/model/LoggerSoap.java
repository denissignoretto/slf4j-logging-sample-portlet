package it.dsigno.liferay.sb.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link it.dsigno.liferay.sb.service.http.LoggerServiceSoap}.
 *
 * @author @denissignoretto
 * @see it.dsigno.liferay.sb.service.http.LoggerServiceSoap
 * @generated
 */
public class LoggerSoap implements Serializable {
    private long _loggerId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _logMessage;

    public LoggerSoap() {
    }

    public static LoggerSoap toSoapModel(Logger model) {
        LoggerSoap soapModel = new LoggerSoap();

        soapModel.setLoggerId(model.getLoggerId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setLogMessage(model.getLogMessage());

        return soapModel;
    }

    public static LoggerSoap[] toSoapModels(Logger[] models) {
        LoggerSoap[] soapModels = new LoggerSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static LoggerSoap[][] toSoapModels(Logger[][] models) {
        LoggerSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new LoggerSoap[models.length][models[0].length];
        } else {
            soapModels = new LoggerSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static LoggerSoap[] toSoapModels(List<Logger> models) {
        List<LoggerSoap> soapModels = new ArrayList<LoggerSoap>(models.size());

        for (Logger model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new LoggerSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _loggerId;
    }

    public void setPrimaryKey(long pk) {
        setLoggerId(pk);
    }

    public long getLoggerId() {
        return _loggerId;
    }

    public void setLoggerId(long loggerId) {
        _loggerId = loggerId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getLogMessage() {
        return _logMessage;
    }

    public void setLogMessage(String logMessage) {
        _logMessage = logMessage;
    }
}
