package it.dsigno.liferay.sb.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import it.dsigno.liferay.sb.model.Logger;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Logger in entity cache.
 *
 * @author @denissignoretto
 * @see Logger
 * @generated
 */
public class LoggerCacheModel implements CacheModel<Logger>, Externalizable {
    public long loggerId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String logMessage;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{loggerId=");
        sb.append(loggerId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", logMessage=");
        sb.append(logMessage);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Logger toEntityModel() {
        LoggerImpl loggerImpl = new LoggerImpl();

        loggerImpl.setLoggerId(loggerId);
        loggerImpl.setGroupId(groupId);
        loggerImpl.setCompanyId(companyId);
        loggerImpl.setUserId(userId);

        if (userName == null) {
            loggerImpl.setUserName(StringPool.BLANK);
        } else {
            loggerImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            loggerImpl.setCreateDate(null);
        } else {
            loggerImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            loggerImpl.setModifiedDate(null);
        } else {
            loggerImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (logMessage == null) {
            loggerImpl.setLogMessage(StringPool.BLANK);
        } else {
            loggerImpl.setLogMessage(logMessage);
        }

        loggerImpl.resetOriginalValues();

        return loggerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        loggerId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        logMessage = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(loggerId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (logMessage == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(logMessage);
        }
    }
}
